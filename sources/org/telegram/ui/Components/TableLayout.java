package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.TextSelectionHelper;

public class TableLayout extends View {
    public static final int ALIGN_BOUNDS = 0;
    public static final int ALIGN_MARGINS = 1;
    public static final Alignment BASELINE;
    public static final Alignment BOTTOM;
    private static final int CAN_STRETCH = 2;
    public static final Alignment CENTER;
    private static final int DEFAULT_ALIGNMENT_MODE = 1;
    private static final int DEFAULT_COUNT = Integer.MIN_VALUE;
    private static final boolean DEFAULT_ORDER_PRESERVED = true;
    private static final int DEFAULT_ORIENTATION = 0;
    private static final boolean DEFAULT_USE_DEFAULT_MARGINS = false;
    public static final Alignment END;
    public static final Alignment FILL;
    public static final int HORIZONTAL = 0;
    private static final int INFLEXIBLE = 0;
    private static final Alignment LEADING;
    public static final Alignment LEFT;
    static final int MAX_SIZE = 100000;
    public static final Alignment RIGHT;
    public static final Alignment START;
    public static final Alignment TOP;
    private static final Alignment TRAILING;
    public static final int UNDEFINED = Integer.MIN_VALUE;
    static final Alignment UNDEFINED_ALIGNMENT = new Alignment() {
        @Override
        public int getAlignmentValue(Child child, int i) {
            return Integer.MIN_VALUE;
        }

        @Override
        public int getGravityOffset(Child child, int i) {
            return Integer.MIN_VALUE;
        }
    };
    static final int UNINITIALIZED_HASH = 0;
    public static final int VERTICAL = 1;
    private TableA11yHelper accessibilityHelper;
    private Path backgroundPath;
    private ArrayList<Child> cellsToFixHeight;
    private ArrayList<Child> childrens;
    private int colCount;
    private TableLayoutDelegate delegate;
    private boolean drawLines;
    private int drawingHeight;
    private int drawingWidth;
    private boolean fillWidth;
    private boolean isRtl;
    private boolean isStriped;
    private int itemPaddingBottom;
    private int itemPaddingLeft;
    private int itemPaddingTop;
    private Path linePath;
    private int mAlignmentMode;
    private int mDefaultGap;
    private final Axis mHorizontalAxis;
    private int mLastLayoutParamsHashCode;
    private int mOrientation;
    private boolean mUseDefaultMargins;
    private final Axis mVerticalAxis;
    private int minimumCellHeight;
    private int[] naturalRowLocations;
    private float[] radii;
    private RectF rect;
    private ArrayList<PointF> rowSpans;
    private TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;

    public static abstract class Alignment {
        public abstract int getAlignmentValue(Child child, int i);

        public Bounds getBounds() {
            return new Bounds();
        }

        public abstract int getGravityOffset(Child child, int i);

        public int getSizeInCell(Child child, int i, int i2) {
            return i;
        }
    }

    public static final class Arc {
        public final Interval span;
        public boolean valid = true;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }
    }

    public static final class Assoc<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<K> keyType;
        private final Class<V> valueType;

        private Assoc(Class<K> cls, Class<V> cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public static <K, V> Assoc<K, V> of(Class<K> cls, Class<V> cls2) {
            return new Assoc<>(cls, cls2);
        }

        public PackedMap<K, V> pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new PackedMap<>(objArr, objArr2);
        }

        public void put(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    public final class Axis {
        private static final int COMPLETE = 2;
        private static final int NEW = 0;
        private static final int PENDING = 1;
        public Arc[] arcs;
        public boolean arcsValid;
        PackedMap<Interval, MutableInt> backwardLinks;
        public boolean backwardLinksValid;
        public int definedCount;
        public int[] deltas;
        PackedMap<Interval, MutableInt> forwardLinks;
        public boolean forwardLinksValid;
        PackedMap<Spec, Bounds> groupBounds;
        public boolean groupBoundsValid;
        public boolean hasWeights;
        public boolean hasWeightsValid;
        public final boolean horizontal;
        public int[] leadingMargins;
        public boolean leadingMarginsValid;
        public int[] locations;
        public boolean locationsValid;
        private int maxIndex;
        boolean orderPreserved;
        private MutableInt parentMax;
        private MutableInt parentMin;
        public int[] trailingMargins;
        public boolean trailingMarginsValid;

        private void addComponentSizes(List<Arc> list, PackedMap<Interval, MutableInt> packedMap) {
            int i = 0;
            while (true) {
                Interval[] intervalArr = packedMap.keys;
                if (i >= intervalArr.length) {
                    return;
                }
                include(list, intervalArr[i], packedMap.values[i], false);
                i++;
            }
        }

        private int calculateMaxIndex() {
            int childCount = TableLayout.this.getChildCount();
            int iMax = -1;
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                iMax = Math.max(Math.max(Math.max(iMax, interval.min), interval.max), interval.size());
            }
            if (iMax == -1) {
                return Integer.MIN_VALUE;
            }
            return iMax;
        }

        private float calculateTotalWeight() {
            int childCount = TableLayout.this.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                f += (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
            }
            return f;
        }

        private void computeArcs() {
            getForwardLinks();
            getBackwardLinks();
        }

        private void computeGroupBounds() {
            for (Bounds bounds : this.groupBounds.values) {
                bounds.reset();
            }
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z = this.horizontal;
                Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                this.groupBounds.getValue(i).include(TableLayout.this, childAt, spec, this, TableLayout.this.getMeasurementIncludingMargin(childAt, z) + (spec.weight == 0.0f ? 0 : this.deltas[i]));
            }
        }

        private boolean computeHasWeights() {
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                if ((this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight != 0.0f) {
                    return true;
                }
            }
            return false;
        }

        private void computeLinks(PackedMap<Interval, MutableInt> packedMap, boolean z) {
            for (MutableInt mutableInt : packedMap.values) {
                mutableInt.reset();
            }
            Bounds[] boundsArr = getGroupBounds().values;
            for (int i = 0; i < boundsArr.length; i++) {
                int size = boundsArr[i].size(z);
                MutableInt value = packedMap.getValue(i);
                int i2 = value.value;
                if (!z) {
                    size = -size;
                }
                value.value = Math.max(i2, size);
            }
        }

        private void computeLocations(int[] iArr) {
            if (hasWeights()) {
                solveAndDistributeSpace(iArr);
            } else {
                solve(iArr);
            }
            if (this.orderPreserved) {
                return;
            }
            int i = iArr[0];
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = iArr[i2] - i;
            }
        }

        private void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                LayoutParams layoutParams = childAt.getLayoutParams();
                boolean z2 = this.horizontal;
                Interval interval = (z2 ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                int i2 = z ? interval.min : interval.max;
                iArr[i2] = Math.max(iArr[i2], TableLayout.this.getMargin1(childAt, z2, z));
            }
        }

        private Arc[] createArcs() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            addComponentSizes(arrayList, getForwardLinks());
            addComponentSizes(arrayList2, getBackwardLinks());
            if (this.orderPreserved) {
                int i = 0;
                while (i < getCount()) {
                    int i2 = i + 1;
                    include(arrayList, new Interval(i, i2), new MutableInt(0));
                    i = i2;
                }
            }
            int count = getCount();
            include(arrayList, new Interval(0, count), this.parentMin, false);
            include(arrayList2, new Interval(count, 0), this.parentMax, false);
            return (Arc[]) TableLayout.append(topologicalSort(arrayList), topologicalSort(arrayList2));
        }

        private PackedMap<Spec, Bounds> createGroupBounds() {
            Assoc assocOf = Assoc.of(Spec.class, Bounds.class);
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i).getLayoutParams();
                boolean z = this.horizontal;
                Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                assocOf.put(spec, spec.getAbsoluteAlignment(z).getBounds());
            }
            return assocOf.pack();
        }

        private PackedMap<Interval, MutableInt> createLinks(boolean z) {
            Assoc assocOf = Assoc.of(Interval.class, MutableInt.class);
            Spec[] specArr = getGroupBounds().keys;
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                assocOf.put(z ? specArr[i].span : specArr[i].span.inverse(), new MutableInt());
            }
            return assocOf.pack();
        }

        private PackedMap<Interval, MutableInt> getBackwardLinks() {
            if (this.backwardLinks == null) {
                this.backwardLinks = createLinks(false);
            }
            if (!this.backwardLinksValid) {
                computeLinks(this.backwardLinks, false);
                this.backwardLinksValid = true;
            }
            return this.backwardLinks;
        }

        private PackedMap<Interval, MutableInt> getForwardLinks() {
            if (this.forwardLinks == null) {
                this.forwardLinks = createLinks(true);
            }
            if (!this.forwardLinksValid) {
                computeLinks(this.forwardLinks, true);
                this.forwardLinksValid = true;
            }
            return this.forwardLinks;
        }

        private int getMaxIndex() {
            if (this.maxIndex == Integer.MIN_VALUE) {
                this.maxIndex = Math.max(0, calculateMaxIndex());
            }
            return this.maxIndex;
        }

        private int getMeasure(int i, int i2) {
            setParentConstraints(i, i2);
            return size(getLocations());
        }

        private boolean hasWeights() {
            if (!this.hasWeightsValid) {
                this.hasWeights = computeHasWeights();
                this.hasWeightsValid = true;
            }
            return this.hasWeights;
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.size() == 0) {
                return;
            }
            if (z) {
                Iterator<Arc> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().span.equals(interval)) {
                        return;
                    }
                }
            }
            list.add(new Arc(interval, mutableInt));
        }

        private void init(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private boolean relax(int[] iArr, Arc arc) {
            if (!arc.valid) {
                return false;
            }
            Interval interval = arc.span;
            int i = interval.min;
            int i2 = interval.max;
            int i3 = iArr[i] + arc.value.value;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        private void setParentConstraints(int i, int i2) {
            this.parentMin.value = i;
            this.parentMax.value = -i2;
            this.locationsValid = false;
        }

        private void shareOutDelta(int i, float f) {
            Arrays.fill(this.deltas, 0);
            int childCount = TableLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = TableLayout.this.getChildAt(i2).getLayoutParams();
                float f2 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
                if (f2 != 0.0f) {
                    int iRound = Math.round((i * f2) / f);
                    this.deltas[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }

        private int size(int[] iArr) {
            return iArr[getCount()];
        }

        private boolean solve(Arc[] arcArr, int[] iArr) {
            return solve(arcArr, iArr, true);
        }

        private void solveAndDistributeSpace(int[] iArr) {
            Arrays.fill(getDeltas(), 0);
            solve(iArr);
            int childCount = TableLayout.this.getChildCount() * this.parentMin.value;
            boolean z = true;
            int i = childCount + 1;
            if (i < 2) {
                return;
            }
            float fCalculateTotalWeight = calculateTotalWeight();
            int i2 = -1;
            int i3 = 0;
            while (i3 < i) {
                int i4 = (int) ((((long) i3) + ((long) i)) / 2);
                invalidateValues();
                shareOutDelta(i4, fCalculateTotalWeight);
                boolean zSolve = solve(getArcs(), iArr, false);
                if (zSolve) {
                    i3 = i4 + 1;
                    i2 = i4;
                } else {
                    i = i4;
                }
                z = zSolve;
            }
            if (i2 <= 0 || z) {
                return;
            }
            invalidateValues();
            shareOutDelta(i2, fCalculateTotalWeight);
            solve(iArr);
        }

        private Arc[] topologicalSort(Arc[] arcArr) {
            return new Object(arcArr) {
                Arc[][] arcsByVertex;
                int cursor;
                Arc[] result;
                final Arc[] val$arcs;
                int[] visited;

                {
                    this.val$arcs = arcArr;
                    int length = arcArr.length;
                    this.result = new Arc[length];
                    this.cursor = length - 1;
                    this.arcsByVertex = Axis.this.groupArcsByFirstVertex(arcArr);
                    this.visited = new int[Axis.this.getCount() + 1];
                }

                public Arc[] sort() {
                    int length = this.arcsByVertex.length;
                    for (int i = 0; i < length; i++) {
                        walk(i);
                    }
                    return this.result;
                }

                public void walk(int i) {
                    int[] iArr = this.visited;
                    if (iArr[i] != 0) {
                        return;
                    }
                    iArr[i] = 1;
                    for (Arc arc : this.arcsByVertex[i]) {
                        walk(arc.span.max);
                        Arc[] arcArr2 = this.result;
                        int i2 = this.cursor;
                        this.cursor = i2 - 1;
                        arcArr2[i2] = arc;
                    }
                    this.visited[i] = 2;
                }
            }.sort();
        }

        public Arc[] getArcs() {
            if (this.arcs == null) {
                this.arcs = createArcs();
            }
            if (!this.arcsValid) {
                computeArcs();
                this.arcsValid = true;
            }
            return this.arcs;
        }

        public int getCount() {
            return Math.max(this.definedCount, getMaxIndex());
        }

        public int[] getDeltas() {
            if (this.deltas == null) {
                this.deltas = new int[TableLayout.this.getChildCount()];
            }
            return this.deltas;
        }

        public PackedMap<Spec, Bounds> getGroupBounds() {
            if (this.groupBounds == null) {
                this.groupBounds = createGroupBounds();
            }
            if (!this.groupBoundsValid) {
                computeGroupBounds();
                this.groupBoundsValid = true;
            }
            return this.groupBounds;
        }

        public int[] getLeadingMargins() {
            if (this.leadingMargins == null) {
                this.leadingMargins = new int[getCount() + 1];
            }
            if (!this.leadingMarginsValid) {
                computeMargins(true);
                this.leadingMarginsValid = true;
            }
            return this.leadingMargins;
        }

        public int[] getLocations() {
            if (this.locations == null) {
                this.locations = new int[getCount() + 1];
            }
            if (!this.locationsValid) {
                computeLocations(this.locations);
                this.locationsValid = true;
            }
            return this.locations;
        }

        public int[] getTrailingMargins() {
            if (this.trailingMargins == null) {
                this.trailingMargins = new int[getCount() + 1];
            }
            if (!this.trailingMarginsValid) {
                computeMargins(false);
                this.trailingMarginsValid = true;
            }
            return this.trailingMargins;
        }

        public Arc[][] groupArcsByFirstVertex(Arc[] arcArr) {
            int count = getCount() + 1;
            Arc[][] arcArr2 = new Arc[count][];
            int[] iArr = new int[count];
            for (Arc arc : arcArr) {
                int i = arc.span.min;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < count; i2++) {
                arcArr2[i2] = new Arc[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (Arc arc2 : arcArr) {
                int i3 = arc2.span.min;
                Arc[] arcArr3 = arcArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                arcArr3[i4] = arc2;
            }
            return arcArr2;
        }

        public void invalidateStructure() {
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBounds = null;
            this.forwardLinks = null;
            this.backwardLinks = null;
            this.leadingMargins = null;
            this.trailingMargins = null;
            this.arcs = null;
            this.locations = null;
            this.deltas = null;
            this.hasWeightsValid = false;
            invalidateValues();
        }

        public void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }

        public boolean isOrderPreserved() {
            return this.orderPreserved;
        }

        public void layout(int i) {
            setParentConstraints(i, i);
            getLocations();
        }

        public void setCount(int i) {
            if (i != Integer.MIN_VALUE && i < getMaxIndex()) {
                TableLayout.handleInvalidParams((this.horizontal ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"));
            }
            this.definedCount = i;
        }

        public void setOrderPreserved(boolean z) {
            this.orderPreserved = z;
            invalidateStructure();
        }

        private Axis(boolean z) {
            this.definedCount = Integer.MIN_VALUE;
            this.maxIndex = Integer.MIN_VALUE;
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
            this.hasWeightsValid = false;
            this.orderPreserved = true;
            this.parentMin = new MutableInt(0);
            this.parentMax = new MutableInt(-100000);
            this.horizontal = z;
        }

        private boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            int count = getCount() + 1;
            for (int i = 0; i < arcArr.length; i++) {
                init(iArr);
                for (int i2 = 0; i2 < count; i2++) {
                    boolean zRelax = false;
                    for (Arc arc : arcArr) {
                        zRelax |= relax(iArr, arc);
                    }
                    if (!zRelax) {
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr = new boolean[arcArr.length];
                for (int i3 = 0; i3 < count; i3++) {
                    int length = arcArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr[i4] = zArr[i4] | relax(iArr, arcArr[i4]);
                    }
                }
                for (int i5 = 0; i5 < arcArr.length; i5++) {
                    if (zArr[i5]) {
                        Arc arc2 = arcArr[i5];
                        Interval interval = arc2.span;
                        if (interval.min >= interval.max) {
                            arc2.valid = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }

        private Arc[] topologicalSort(List<Arc> list) {
            return topologicalSort((Arc[]) list.toArray(new Arc[0]));
        }

        public int getMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return getMeasure(0, size);
            }
            if (mode == 0) {
                return getMeasure(0, 100000);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return getMeasure(size, size);
        }

        private void include(List<Arc> list, Interval interval, MutableInt mutableInt) {
            include(list, interval, mutableInt, true);
        }

        private boolean solve(int[] iArr) {
            return solve(getArcs(), iArr);
        }
    }

    public static class Bounds {
        public int after;
        public int before;
        public int flexibility;

        public int getOffset(TableLayout tableLayout, Child child, Alignment alignment, int i, boolean z) {
            return this.before - alignment.getAlignmentValue(child, i);
        }

        public void include(int i, int i2) {
            this.before = Math.max(this.before, i);
            this.after = Math.max(this.after, i2);
        }

        public void reset() {
            this.before = Integer.MIN_VALUE;
            this.after = Integer.MIN_VALUE;
            this.flexibility = 2;
        }

        public int size(boolean z) {
            if (z || !TableLayout.canStretch(this.flexibility)) {
                return this.before + this.after;
            }
            return 100000;
        }

        private Bounds() {
            reset();
        }

        public final void include(TableLayout tableLayout, Child child, Spec spec, Axis axis, int i) {
            this.flexibility &= spec.getFlexibility();
            int alignmentValue = spec.getAbsoluteAlignment(axis.horizontal).getAlignmentValue(child, i);
            include(alignmentValue, i - alignmentValue);
        }
    }

    public interface CellText extends TextSelectionHelper.TextLayoutBlock {

        public abstract class CC {
            public static int $default$getEmojiOnlyCount(CellText cellText) {
                return 0;
            }

            public static CharSequence $default$getPrefix(CellText cellText) {
                return null;
            }

            public static Rect $default$getSelectionBounds(CellText cellText) {
                return null;
            }

            public static CharSequence $default$getText(CellText cellText) {
                if (cellText.getLayout() == null) {
                    return null;
                }
                return cellText.getLayout().getText();
            }
        }

        void attach(View view);

        void detach(View view);

        void draw(Canvas canvas, View view);

        int getEmojiOnlyCount();

        @Override
        Layout getLayout();

        @Override
        CharSequence getPrefix();

        @Override
        int getRow();

        @Override
        Rect getSelectionBounds();

        @Override
        CharSequence getText();

        @Override
        int getX();

        @Override
        int getY();

        void setRow(int i);

        void setX(int i);

        void setY(int i);
    }

    public class Child {
        private TL_iv.pageTableCell cell;
        private int fixedHeight;
        private int index;
        private LayoutParams layoutParams;
        private int measuredHeight;
        private int measuredWidth;
        private int naturalWidth;
        private int naturalX;
        public int rowspan;
        private int selectionIndex = -1;
        public int textHeight;
        public CellText textLayout;
        public int textLeft;
        public int textWidth;
        public int textX;
        public int textY;
        public int x;
        public int y;

        public Child(int i) {
            this.index = i;
        }

        public static int access$2120(Child child, int i) {
            int i2 = child.measuredHeight - i;
            child.measuredHeight = i2;
            return i2;
        }

        public void captureNaturalHorizontalGeometry() {
            this.naturalX = this.x;
            this.naturalWidth = this.measuredWidth;
        }

        public void setRenderHorizontalGeometry(int i, int i2) {
            this.x = i;
            this.measuredWidth = Math.max(0, i2 - i);
            if (this.cell == null || this.textLayout == null) {
                return;
            }
            updateTextX();
        }

        public void setRenderVerticalGeometry(int i, int i2) {
            this.y = i;
            this.measuredHeight = Math.max(0, i2 - i);
            if (this.cell != null) {
                updateTextY();
            }
        }

        private void updateTextX() {
            int i = -this.textLeft;
            this.textX = i;
            TL_iv.pageTableCell pagetablecell = this.cell;
            if (pagetablecell.align_right) {
                this.textX = ((this.measuredWidth - this.textWidth) - TableLayout.this.itemPaddingLeft) + i;
            } else if (pagetablecell.align_center) {
                this.textX = Math.round((this.measuredWidth - this.textWidth) / 2.0f) + i;
            } else {
                this.textX = TableLayout.this.itemPaddingLeft + i;
            }
        }

        private void updateTextY() {
            TL_iv.pageTableCell pagetablecell = this.cell;
            if (pagetablecell.valign_middle) {
                this.textY = (this.measuredHeight - this.textHeight) / 2;
            } else if (pagetablecell.valign_bottom) {
                this.textY = (this.measuredHeight - this.textHeight) - TableLayout.this.itemPaddingBottom;
            } else {
                this.textY = TableLayout.this.itemPaddingTop;
            }
        }

        public void draw(Canvas canvas, View view) {
            draw(canvas, view, true);
        }

        public LayoutParams getLayoutParams() {
            return this.layoutParams;
        }

        public int getMeasuredHeight() {
            return this.measuredHeight;
        }

        public int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public int getRow() {
            return this.rowspan + 10;
        }

        public int getTextX() {
            return this.x + this.textX;
        }

        public int getTextY() {
            return this.y + this.textY;
        }

        public void layout(int i, int i2, int i3, int i4) {
            this.x = i;
            this.y = i2;
        }

        public void measure(int i, int i2, boolean z) {
            this.measuredWidth = i;
            this.measuredHeight = i2;
            if (z) {
                this.fixedHeight = i2;
            }
            if (this.cell != null) {
                CellText cellText = this.textLayout;
                if (cellText != null) {
                    Layout layout = cellText.getLayout();
                    int lineCount = layout != null ? layout.getLineCount() : 0;
                    if (!z) {
                        if (lineCount > 1) {
                            setTextLayout(TableLayout.this.delegate.createTextLayout(this.cell, this.measuredWidth - (TableLayout.this.itemPaddingLeft * 2)));
                            this.fixedHeight = TableLayout.this.itemPaddingBottom + TableLayout.this.itemPaddingTop + this.textHeight;
                        } else if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.cell;
                            if (pagetablecell.align_center || pagetablecell.align_right) {
                                setTextLayout(TableLayout.this.delegate.createTextLayout(this.cell, this.measuredWidth - (TableLayout.this.itemPaddingLeft * 2)));
                                this.fixedHeight = TableLayout.this.itemPaddingBottom + TableLayout.this.itemPaddingTop + this.textHeight;
                            }
                        }
                    }
                    updateTextX();
                }
                updateTextY();
            }
        }

        public void setFixedHeight(int i) {
            this.measuredHeight = this.fixedHeight;
            updateTextY();
        }

        public void setSelectionIndex(int i) {
            this.selectionIndex = i;
        }

        public void setTextLayout(CellText cellText) {
            this.textLayout = cellText;
            Layout layout = cellText != null ? cellText.getLayout() : null;
            int i = 0;
            if (layout == null) {
                this.textLeft = 0;
                this.textWidth = 0;
                this.textHeight = 0;
                return;
            }
            this.textWidth = 0;
            this.textLeft = 0;
            int lineCount = layout.getLineCount();
            while (i < lineCount) {
                float lineLeft = layout.getLineLeft(i);
                this.textLeft = i == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.textLeft, (int) Math.ceil(lineLeft));
                this.textWidth = (int) Math.ceil(Math.max(layout.getLineWidth(i), this.textWidth));
                i++;
            }
            this.textHeight = layout.getHeight();
        }

        public void draw(Canvas canvas, View view, boolean z) {
            Paint paint;
            int i;
            Canvas canvas2 = canvas;
            if (this.cell == null) {
                return;
            }
            boolean z2 = false;
            boolean z3 = true;
            boolean z4 = this.x + this.measuredWidth == TableLayout.this.drawingWidth;
            boolean z5 = this.y + this.measuredHeight == TableLayout.this.drawingHeight;
            int iDp = AndroidUtilities.dp(8.0f);
            if (this.cell.header || (TableLayout.this.isStriped && this.layoutParams.rowSpec.span.min % 2 == 0)) {
                if (this.x == 0 && this.y == 0) {
                    float[] fArr = TableLayout.this.radii;
                    float f = iDp;
                    TableLayout.this.radii[1] = f;
                    fArr[0] = f;
                    z2 = true;
                } else {
                    float[] fArr2 = TableLayout.this.radii;
                    TableLayout.this.radii[1] = 0.0f;
                    fArr2[0] = 0.0f;
                }
                if (z4 && this.y == 0) {
                    float[] fArr3 = TableLayout.this.radii;
                    float f2 = iDp;
                    TableLayout.this.radii[3] = f2;
                    fArr3[2] = f2;
                    z2 = true;
                } else {
                    float[] fArr4 = TableLayout.this.radii;
                    TableLayout.this.radii[3] = 0.0f;
                    fArr4[2] = 0.0f;
                }
                if (z4 && z5) {
                    float[] fArr5 = TableLayout.this.radii;
                    float f3 = iDp;
                    TableLayout.this.radii[5] = f3;
                    fArr5[4] = f3;
                    z2 = true;
                } else {
                    float[] fArr6 = TableLayout.this.radii;
                    TableLayout.this.radii[5] = 0.0f;
                    fArr6[4] = 0.0f;
                }
                if (this.x == 0 && z5) {
                    float[] fArr7 = TableLayout.this.radii;
                    float f4 = iDp;
                    TableLayout.this.radii[7] = f4;
                    fArr7[6] = f4;
                } else {
                    float[] fArr8 = TableLayout.this.radii;
                    TableLayout.this.radii[7] = 0.0f;
                    fArr8[6] = 0.0f;
                    z3 = z2;
                }
                if (z3) {
                    RectF rectF = TableLayout.this.rect;
                    int i2 = this.x;
                    int i3 = this.y;
                    rectF.set(i2, i3, i2 + this.measuredWidth, i3 + this.measuredHeight);
                    TableLayout.this.backgroundPath.reset();
                    TableLayout.this.backgroundPath.addRoundRect(TableLayout.this.rect, TableLayout.this.radii, Path.Direction.CW);
                    if (this.cell.header) {
                        canvas2.drawPath(TableLayout.this.backgroundPath, TableLayout.this.delegate.getHeaderPaint());
                    } else {
                        canvas2.drawPath(TableLayout.this.backgroundPath, TableLayout.this.delegate.getStripPaint());
                    }
                } else if (this.cell.header) {
                    int i4 = this.x;
                    int i5 = this.y;
                    canvas2.drawRect(i4, i5, i4 + this.measuredWidth, i5 + this.measuredHeight, TableLayout.this.delegate.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    int i6 = this.x;
                    int i7 = this.y;
                    canvas2 = canvas;
                    canvas2.drawRect(i6, i7, i6 + this.measuredWidth, i7 + this.measuredHeight, TableLayout.this.delegate.getStripPaint());
                }
            }
            if (z && this.textLayout != null) {
                canvas2.save();
                canvas2.translate(getTextX(), getTextY());
                if (this.selectionIndex >= 0 && TableLayout.this.textSelectionHelper != null) {
                    TableLayout.this.textSelectionHelper.draw(canvas2, (TextSelectionHelper.ArticleSelectableView) TableLayout.this.getParent().getParent(), this.selectionIndex);
                }
                this.textLayout.draw(canvas2, view);
                canvas2.restore();
            }
            if (TableLayout.this.drawLines) {
                Paint linePaint = TableLayout.this.delegate.getLinePaint();
                Paint linePaint2 = TableLayout.this.delegate.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i8 = this.x;
                if (i8 == 0) {
                    int i9 = this.y;
                    float f5 = i9;
                    float f6 = this.measuredHeight + i9;
                    if (i9 == 0) {
                        f5 += iDp;
                    }
                    if (f6 == TableLayout.this.drawingHeight) {
                        f6 -= iDp;
                    }
                    float f7 = this.x + strokeWidth;
                    canvas2.drawLine(f7, f5, f7, f6, linePaint);
                    paint = linePaint2;
                } else {
                    float f8 = i8 - strokeWidth2;
                    int i10 = this.y;
                    paint = linePaint2;
                    canvas.drawLine(f8, i10, f8, i10 + this.measuredHeight, paint);
                }
                int i11 = this.y;
                if (i11 == 0) {
                    int i12 = this.x;
                    float f9 = i12;
                    float f10 = this.measuredWidth + i12;
                    if (i12 == 0) {
                        f9 += iDp;
                    }
                    if (f10 == TableLayout.this.drawingWidth) {
                        f10 -= iDp;
                    }
                    float f11 = f10;
                    float f12 = this.y + strokeWidth;
                    canvas.drawLine(f9, f12, f11, f12, linePaint);
                } else {
                    int i13 = this.x;
                    float f13 = i11 - strokeWidth2;
                    canvas.drawLine(i13, f13, i13 + this.measuredWidth, f13, paint);
                }
                float f14 = (z4 && (i = this.y) == 0) ? i + iDp : this.y - strokeWidth;
                float f15 = (z4 && z5) ? (this.y + this.measuredHeight) - iDp : (this.y + this.measuredHeight) - strokeWidth;
                float f16 = (this.x + this.measuredWidth) - strokeWidth;
                canvas.drawLine(f16, f14, f16, f15, linePaint);
                int i14 = this.x;
                float f17 = (i14 == 0 && z5) ? i14 + iDp : i14 - strokeWidth;
                float f18 = (z4 && z5) ? (i14 + this.measuredWidth) - iDp : (i14 + this.measuredWidth) - strokeWidth;
                float f19 = (this.y + this.measuredHeight) - strokeWidth;
                canvas.drawLine(f17, f19, f18, f19, linePaint);
                if (this.x == 0 && this.y == 0) {
                    RectF rectF2 = TableLayout.this.rect;
                    float f20 = this.x + strokeWidth;
                    float f21 = this.y + strokeWidth;
                    float f22 = iDp * 2;
                    rectF2.set(f20, f21, f20 + f22, f22 + f21);
                    canvas.drawArc(TableLayout.this.rect, -180.0f, 90.0f, false, linePaint);
                }
                if (z4 && this.y == 0) {
                    RectF rectF3 = TableLayout.this.rect;
                    float f23 = (this.x + this.measuredWidth) - strokeWidth;
                    float f24 = iDp * 2;
                    float f25 = this.y + strokeWidth;
                    rectF3.set(f23 - f24, f25, f23, f24 + f25);
                    canvas.drawArc(TableLayout.this.rect, 0.0f, -90.0f, false, linePaint);
                }
                if (this.x == 0 && z5) {
                    RectF rectF4 = TableLayout.this.rect;
                    float f26 = this.x + strokeWidth;
                    float f27 = (this.y + this.measuredHeight) - strokeWidth;
                    float f28 = iDp * 2;
                    rectF4.set(f26, f27 - f28, f28 + f26, f27);
                    canvas.drawArc(TableLayout.this.rect, 180.0f, -90.0f, false, linePaint);
                }
                if (z4 && z5) {
                    RectF rectF5 = TableLayout.this.rect;
                    float f29 = (this.x + this.measuredWidth) - strokeWidth;
                    float f30 = iDp * 2;
                    float f31 = (this.y + this.measuredHeight) - strokeWidth;
                    rectF5.set(f29 - f30, f31 - f30, f29, f31);
                    canvas.drawArc(TableLayout.this.rect, 0.0f, 90.0f, false, linePaint);
                }
            }
        }
    }

    public static final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Interval.class != obj.getClass()) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.max == interval.max && this.min == interval.min;
        }

        public int hashCode() {
            return (this.min * 31) + this.max;
        }

        public Interval inverse() {
            return new Interval(this.max, this.min);
        }

        public int size() {
            return this.max - this.min;
        }
    }

    public static final class PackedMap<K, V> {
        public final int[] index;
        public final K[] keys;
        public final V[] values;

        private static <K> K[] compact(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(kArr.getClass().getComponentType(), TableLayout.max2(iArr, -1) + 1));
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }

        private static <K> int[] createIndex(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer numValueOf = (Integer) map.get(k);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(k, numValueOf);
                }
                iArr[i] = numValueOf.intValue();
            }
            return iArr;
        }

        public V getValue(int i) {
            return this.values[this.index[i]];
        }

        private PackedMap(K[] kArr, V[] vArr) {
            int[] iArrCreateIndex = createIndex(kArr);
            this.index = iArrCreateIndex;
            this.keys = (K[]) compact(kArr, iArrCreateIndex);
            this.values = (V[]) compact(vArr, iArrCreateIndex);
        }
    }

    public class TableA11yHelper extends ExploreByTouchHelper {
        private final Rect tmpRect;

        public TableA11yHelper(View view) {
            super(view);
            this.tmpRect = new Rect();
        }

        @Override
        public int getVirtualViewAt(float f, float f2) {
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                if (childAt.measuredWidth > 0 && childAt.measuredHeight > 0) {
                    int i2 = childAt.x;
                    if (f >= i2 && f < childAt.measuredWidth + i2) {
                        int i3 = childAt.y;
                        if (f2 >= i3 && f2 < childAt.measuredHeight + i3) {
                            return i;
                        }
                    }
                }
            }
            return Integer.MIN_VALUE;
        }

        @Override
        public void getVisibleVirtualViews(List<Integer> list) {
            int childCount = TableLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = TableLayout.this.getChildAt(i);
                if (childAt.measuredWidth > 0 && childAt.measuredHeight > 0) {
                    list.add(Integer.valueOf(i));
                }
            }
        }

        @Override
        public boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            return false;
        }

        @Override
        public void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i < 0 || i >= TableLayout.this.getChildCount()) {
                this.tmpRect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
                accessibilityNodeInfoCompat.setVisibleToUser(false);
                accessibilityNodeInfoCompat.setContentDescription("");
                return;
            }
            Child childAt = TableLayout.this.getChildAt(i);
            Rect rect = this.tmpRect;
            int i2 = childAt.x;
            rect.set(i2, childAt.y, childAt.measuredWidth + i2, childAt.measuredHeight + childAt.y);
            accessibilityNodeInfoCompat.setBoundsInParent(this.tmpRect);
            accessibilityNodeInfoCompat.setClassName("android.widget.TextView");
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
            accessibilityNodeInfo.setEnabled(true);
            CellText cellText = childAt.textLayout;
            CharSequence text = cellText != null ? cellText.getText() : null;
            if (text == null || text.length() == 0) {
                text = " ";
            }
            accessibilityNodeInfoCompat.setText(text);
            if (childAt.cell == null || !childAt.cell.header) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setHeading(true);
                return;
            }
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
            }
        }
    }

    static {
        Alignment alignment = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return 0;
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return 0;
            }
        };
        LEADING = alignment;
        Alignment alignment2 = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return i;
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return i;
            }
        };
        TRAILING = alignment2;
        TOP = alignment;
        BOTTOM = alignment2;
        START = alignment;
        END = alignment2;
        LEFT = createSwitchingAlignment(alignment);
        RIGHT = createSwitchingAlignment(alignment2);
        CENTER = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return i >> 1;
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return i >> 1;
            }
        };
        BASELINE = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return Integer.MIN_VALUE;
            }

            @Override
            public Bounds getBounds() {
                return new Bounds() {
                    private int size;

                    @Override
                    public int getOffset(TableLayout tableLayout, Child child, Alignment alignment3, int i, boolean z) {
                        return Math.max(0, super.getOffset(tableLayout, child, alignment3, i, z));
                    }

                    @Override
                    public void include(int i, int i2) {
                        super.include(i, i2);
                        this.size = Math.max(this.size, i + i2);
                    }

                    @Override
                    public void reset() {
                        super.reset();
                        this.size = Integer.MIN_VALUE;
                    }

                    @Override
                    public int size(boolean z) {
                        return Math.max(super.size(z), this.size);
                    }
                };
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return 0;
            }
        };
        FILL = new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return Integer.MIN_VALUE;
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return 0;
            }

            @Override
            public int getSizeInCell(Child child, int i, int i2) {
                return i2;
            }
        };
    }

    public TableLayout(Context context, TableLayoutDelegate tableLayoutDelegate, TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper) {
        super(context);
        this.mHorizontalAxis = new Axis(true);
        this.mVerticalAxis = new Axis(false);
        this.mOrientation = 0;
        this.mUseDefaultMargins = false;
        this.mAlignmentMode = 1;
        this.mLastLayoutParamsHashCode = 0;
        this.itemPaddingTop = AndroidUtilities.dp(8.0f);
        this.itemPaddingBottom = AndroidUtilities.dp(9.0f);
        this.itemPaddingLeft = AndroidUtilities.dp(12.0f);
        this.fillWidth = true;
        this.naturalRowLocations = new int[0];
        this.cellsToFixHeight = new ArrayList<>();
        this.rowSpans = new ArrayList<>();
        this.linePath = new Path();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.childrens = new ArrayList<>();
        this.textSelectionHelper = articleTextSelectionHelper;
        setRowCount(Integer.MIN_VALUE);
        setColumnCount(Integer.MIN_VALUE);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.delegate = tableLayoutDelegate;
        TableA11yHelper tableA11yHelper = new TableA11yHelper(this);
        this.accessibilityHelper = tableA11yHelper;
        ViewCompat.setAccessibilityDelegate(this, tableA11yHelper);
    }

    public static int adjust(int i, int i2) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 + i), View.MeasureSpec.getMode(i));
    }

    public static <T> T[] append(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static boolean canStretch(int i) {
        return (i & 2) != 0;
    }

    private void checkLayoutParams(LayoutParams layoutParams, boolean z) {
        String str = z ? "column" : "row";
        Interval interval = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
        int i = interval.min;
        if (i != Integer.MIN_VALUE && i < 0) {
            handleInvalidParams(str.concat(" indices must be positive"));
        }
        int i2 = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i2 != Integer.MIN_VALUE) {
            if (interval.max > i2) {
                handleInvalidParams(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (interval.size() > i2) {
                handleInvalidParams(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int clip(Interval interval, boolean z, int i) {
        int size = interval.size();
        if (i == 0) {
            return size;
        }
        return Math.min(size, i - (z ? Math.min(interval.min, i) : 0));
    }

    private int computeLayoutParamsHashCode() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i = 0; i < childCount; i++) {
            iHashCode = (iHashCode * 31) + getChildAt(i).getLayoutParams().hashCode();
        }
        return iHashCode;
    }

    private void consistencyCheck() {
        int i = this.mLastLayoutParamsHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.mLastLayoutParamsHashCode = computeLayoutParamsHashCode();
        } else if (i != computeLayoutParamsHashCode()) {
            invalidateStructure();
            consistencyCheck();
        }
    }

    private static Alignment createSwitchingAlignment(final Alignment alignment) {
        return new Alignment() {
            @Override
            public int getAlignmentValue(Child child, int i) {
                return alignment.getAlignmentValue(child, i);
            }

            @Override
            public int getGravityOffset(Child child, int i) {
                return alignment.getGravityOffset(child, i);
            }
        };
    }

    private static boolean fits(int[] iArr, int i, int i2, int i3) {
        if (i3 > iArr.length) {
            return false;
        }
        while (i2 < i3) {
            if (iArr[i2] > i) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static Alignment getAlignment(int i, boolean z) {
        int i2 = (i & (z ? 7 : 112)) >> (z ? 0 : 4);
        if (i2 == 1) {
            return CENTER;
        }
        if (i2 == 3) {
            return z ? LEFT : TOP;
        }
        if (i2 == 5) {
            return z ? RIGHT : BOTTOM;
        }
        if (i2 == 7) {
            return FILL;
        }
        if (i2 != 8388611) {
            return i2 != 8388613 ? UNDEFINED_ALIGNMENT : END;
        }
        return START;
    }

    private int getDefaultMargin(Child child, boolean z, boolean z2) {
        return this.mDefaultGap / 2;
    }

    private int getMargin(Child child, boolean z, boolean z2) {
        if (this.mAlignmentMode == 1) {
            return getMargin1(child, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        int[] leadingMargins = z2 ? axis.getLeadingMargins() : axis.getTrailingMargins();
        LayoutParams layoutParams = child.getLayoutParams();
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        return leadingMargins[z2 ? spec.span.min : spec.span.max];
    }

    private int getMeasurement(Child child, boolean z) {
        return z ? child.getMeasuredWidth() : child.getMeasuredHeight();
    }

    private int getTotalMargin(Child child, boolean z) {
        return getMargin(child, z, true) + getMargin(child, z, false);
    }

    public static void handleInvalidParams(String str) {
        throw new IllegalArgumentException(zzhp.m(str, ". "));
    }

    private void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        this.mHorizontalAxis.invalidateStructure();
        this.mVerticalAxis.invalidateStructure();
        invalidateValues();
    }

    private void invalidateValues() {
        Axis axis = this.mHorizontalAxis;
        if (axis == null || this.mVerticalAxis == null) {
            return;
        }
        axis.invalidateValues();
        this.mVerticalAxis.invalidateValues();
    }

    public static int max2(int[] iArr, int i) {
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    private void measureChildWithMargins2(Child child, int i, int i2, int i3, int i4, boolean z) {
        child.measure(getTotalMargin(child, true) + i3, getTotalMargin(child, false) + i4, z);
    }

    private void measureChildrenWithMargins(int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            Child childAt = getChildAt(i6);
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (z) {
                int size = View.MeasureSpec.getSize(i);
                childAt.setTextLayout(this.delegate.createTextLayout(childAt.cell, this.colCount == 2 ? ((int) (size / 2.0f)) - (this.itemPaddingLeft * 4) : (int) (size / 1.5f)));
                if (childAt.textLayout != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = Math.max(this.minimumCellHeight, childAt.textHeight + this.itemPaddingTop + this.itemPaddingBottom);
                    int emojiOnlyCount = childAt.textLayout.getEmojiOnlyCount();
                    if (emojiOnlyCount > 0) {
                        i5 = ((ViewGroup.MarginLayoutParams) layoutParams).height * emojiOnlyCount;
                    } else {
                        i5 = (this.itemPaddingLeft * 2) + childAt.textWidth;
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i5;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                }
                i3 = i;
                i4 = i2;
                measureChildWithMargins2(childAt, i3, i4, ((ViewGroup.MarginLayoutParams) layoutParams).width, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
            } else {
                i3 = i;
                i4 = i2;
                boolean z2 = this.mOrientation == 0;
                Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                if (spec.getAbsoluteAlignment(z2) == FILL) {
                    Interval interval = spec.span;
                    int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                    int totalMargin = (locations[interval.max] - locations[interval.min]) - getTotalMargin(childAt, z2);
                    if (z2) {
                        CellText cellText = childAt.textLayout;
                        int emojiOnlyCount2 = cellText != null ? cellText.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int iMax = Math.max(1, Math.round(totalMargin / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = iMax;
                            childAt.fixedHeight = iMax;
                        }
                        measureChildWithMargins2(childAt, i3, i4, totalMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    } else {
                        measureChildWithMargins2(childAt, i3, i4, ((ViewGroup.MarginLayoutParams) layoutParams).width, totalMargin, false);
                    }
                }
            }
            i6++;
            i = i3;
            i2 = i4;
        }
    }

    private static void procrusteanFill(int[] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i, length), Math.min(i2, length), i3);
    }

    private static void setCellGroup(LayoutParams layoutParams, int i, int i2, int i3, int i4) {
        layoutParams.setRowSpecSpan(new Interval(i, i2 + i));
        layoutParams.setColumnSpecSpan(new Interval(i3, i4 + i3));
    }

    public static Spec spec(int i, int i2, Alignment alignment, float f) {
        return new Spec(i != Integer.MIN_VALUE, i, i2, alignment, f);
    }

    private void updateRenderRowGeometry() {
        int[] iArr = this.naturalRowLocations;
        if (iArr.length < 2) {
            this.drawingHeight = getMeasuredHeight();
            return;
        }
        int length = iArr.length;
        int i = length - 1;
        int[] iArr2 = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int[] iArr3 = this.naturalRowLocations;
            int i3 = i2 + 1;
            iArr2[i2] = iArr3[i3] - iArr3[i2];
            i2 = i3;
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            Child childAt = getChildAt(i4);
            CellText cellText = childAt.textLayout;
            int emojiOnlyCount = cellText != null ? cellText.getEmojiOnlyCount() : 0;
            if (emojiOnlyCount > 0) {
                Interval interval = childAt.layoutParams.rowSpec.span;
                int iMax = Math.max(0, interval.min);
                int iMin = Math.min(i, interval.max);
                if (iMax < iMin) {
                    int i5 = 0;
                    for (int i6 = iMax; i6 < iMin; i6++) {
                        i5 += iArr2[i6];
                    }
                    int iMax2 = Math.max(1, Math.round(childAt.measuredWidth / emojiOnlyCount)) - i5;
                    while (iMax < iMin && iMax2 > 0) {
                        int i7 = iMin - iMax;
                        int i8 = ((iMax2 + i7) - 1) / i7;
                        iArr2[iMax] = iArr2[iMax] + i8;
                        iMax2 -= i8;
                        iMax++;
                    }
                }
            }
        }
        int[] iArr4 = new int[length];
        int i9 = 0;
        while (i9 < i) {
            int i10 = i9 + 1;
            iArr4[i10] = iArr4[i9] + iArr2[i9];
            i9 = i10;
        }
        this.drawingHeight = iArr4[i];
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            Child childAt2 = getChildAt(i11);
            Interval interval2 = childAt2.layoutParams.rowSpec.span;
            int iMax3 = Math.max(0, Math.min(i, interval2.min));
            childAt2.setRenderVerticalGeometry(iArr4[iMax3], iArr4[Math.max(iMax3, Math.min(i, interval2.max))]);
            this.delegate.onLayoutChild(childAt2.textLayout, childAt2.getTextX(), childAt2.getTextY());
        }
    }

    private void validateLayoutParams() {
        boolean z = this.mOrientation == 0;
        int i = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        int[] iArr = new int[i];
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            LayoutParams layoutParams = getChildAt(i4).getLayoutParams();
            Spec spec = z ? layoutParams.rowSpec : layoutParams.columnSpec;
            Interval interval = spec.span;
            boolean z2 = spec.startDefined;
            int size = interval.size();
            if (z2) {
                i2 = interval.min;
            }
            Spec spec2 = z ? layoutParams.columnSpec : layoutParams.rowSpec;
            Interval interval2 = spec2.span;
            boolean z3 = spec2.startDefined;
            int iClip = clip(interval2, z3, i);
            if (z3) {
                i3 = interval2.min;
            }
            if (i != 0) {
                if (!z2 || !z3) {
                    while (true) {
                        int i5 = i3 + iClip;
                        if (fits(iArr, i2, i3, i5)) {
                            break;
                        }
                        if (z3) {
                            i2++;
                        } else if (i5 <= i) {
                            i3++;
                        } else {
                            i2++;
                            i3 = 0;
                        }
                    }
                }
                procrusteanFill(iArr, i3, i3 + iClip, i2 + size);
            }
            if (z) {
                setCellGroup(layoutParams, i2, size, i3, iClip);
            } else {
                setCellGroup(layoutParams, i3, iClip, i2, size);
            }
            i3 += iClip;
        }
    }

    public void addChild(int i, int i2, int i3, int i4) {
        Child child = new Child(this.childrens.size());
        LayoutParams layoutParams = new LayoutParams();
        Interval interval = new Interval(i2, i4 + i2);
        Alignment alignment = FILL;
        layoutParams.rowSpec = new Spec(false, interval, alignment, 0.0f);
        layoutParams.columnSpec = new Spec(false, new Interval(i, i3 + i), alignment, 0.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        this.childrens.add(child);
        invalidateStructure();
    }

    @Override
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        TableA11yHelper tableA11yHelper = this.accessibilityHelper;
        if (tableA11yHelper == null || !tableA11yHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public Child getChildAt(int i) {
        if (i < 0 || i >= this.childrens.size()) {
            return null;
        }
        return this.childrens.get(i);
    }

    public int getChildCount() {
        return this.childrens.size();
    }

    public int getColumnCount() {
        return this.mHorizontalAxis.getCount();
    }

    public int getMargin1(Child child, boolean z, boolean z2) {
        int i;
        LayoutParams layoutParams = child.getLayoutParams();
        if (z) {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i == Integer.MIN_VALUE ? getDefaultMargin(child, layoutParams, z, z2) : i;
    }

    public final int getMeasurementIncludingMargin(Child child, boolean z) {
        return getMeasurement(child, z) + getTotalMargin(child, z);
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRenderHeight() {
        return this.drawingHeight;
    }

    public int getRowCount() {
        return this.mVerticalAxis.getCount();
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public boolean isColumnOrderPreserved() {
        return this.mHorizontalAxis.isOrderPreserved();
    }

    public boolean isRowOrderPreserved() {
        return this.mVerticalAxis.isOrderPreserved();
    }

    @Override
    public void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).draw(canvas, this);
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        consistencyCheck();
    }

    @Override
    public void onMeasure(int i, int i2) {
        int measure;
        int measure2;
        boolean z;
        TableLayout tableLayout = this;
        tableLayout.consistencyCheck();
        tableLayout.invalidateValues();
        tableLayout.colCount = 0;
        int childCount = tableLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            tableLayout.colCount = Math.max(tableLayout.colCount, tableLayout.getChildAt(i3).layoutParams.columnSpec.span.max);
        }
        boolean z2 = true;
        tableLayout.measureChildrenWithMargins(i, i2, true);
        if (tableLayout.mOrientation == 0) {
            measure = tableLayout.mHorizontalAxis.getMeasure(i);
            if (tableLayout.fillWidth) {
                measure = Math.max(measure, View.MeasureSpec.getSize(i));
                tableLayout.mHorizontalAxis.layout(measure);
            }
            tableLayout.measureChildrenWithMargins(i, i2, false);
            measure2 = tableLayout.mVerticalAxis.getMeasure(i2);
        } else {
            int measure3 = tableLayout.mVerticalAxis.getMeasure(i2);
            tableLayout.measureChildrenWithMargins(i, i2, false);
            measure = tableLayout.mHorizontalAxis.getMeasure(i);
            measure2 = measure3;
        }
        int iMax = Math.max(measure2, tableLayout.getSuggestedMinimumHeight());
        tableLayout.setMeasuredDimension(measure, iMax);
        tableLayout.mHorizontalAxis.layout(measure);
        tableLayout.mVerticalAxis.layout(iMax);
        int[] locations = tableLayout.mHorizontalAxis.getLocations();
        int[] locations2 = tableLayout.mVerticalAxis.getLocations();
        int[] iArrCopyOf = Arrays.copyOf(locations2, locations2.length);
        tableLayout.cellsToFixHeight.clear();
        int i4 = locations[locations.length - 1];
        int childCount2 = tableLayout.getChildCount();
        int i5 = 0;
        while (i5 < childCount2) {
            Child childAt = tableLayout.getChildAt(i5);
            LayoutParams layoutParams = childAt.getLayoutParams();
            Spec spec = layoutParams.columnSpec;
            Spec spec2 = layoutParams.rowSpec;
            Interval interval = spec.span;
            Interval interval2 = spec2.span;
            int i6 = locations[interval.min];
            int i7 = locations2[interval2.min];
            int i8 = locations[interval.max] - i6;
            int i9 = locations2[interval2.max] - i7;
            int measurement = tableLayout.getMeasurement(childAt, z2);
            int measurement2 = tableLayout.getMeasurement(childAt, false);
            Alignment absoluteAlignment = spec.getAbsoluteAlignment(z2);
            Alignment absoluteAlignment2 = spec2.getAbsoluteAlignment(false);
            Bounds value = tableLayout.mHorizontalAxis.getGroupBounds().getValue(i5);
            Bounds value2 = tableLayout.mVerticalAxis.getGroupBounds().getValue(i5);
            int gravityOffset = absoluteAlignment.getGravityOffset(childAt, i8 - value.size(true));
            int gravityOffset2 = absoluteAlignment2.getGravityOffset(childAt, i9 - value2.size(true));
            int margin = tableLayout.getMargin(childAt, true, true);
            int margin2 = tableLayout.getMargin(childAt, false, true);
            int margin3 = tableLayout.getMargin(childAt, true, false);
            int i10 = margin + margin3;
            int margin4 = margin2 + tableLayout.getMargin(childAt, false, false);
            int offset = value.getOffset(tableLayout, childAt, absoluteAlignment, measurement + i10, true);
            tableLayout = this;
            int i11 = iMax;
            int offset2 = value2.getOffset(tableLayout, childAt, absoluteAlignment2, measurement2 + margin4, false);
            int sizeInCell = absoluteAlignment.getSizeInCell(childAt, measurement, i8 - i10);
            int sizeInCell2 = absoluteAlignment2.getSizeInCell(childAt, measurement2, i9 - margin4);
            int i12 = i6 + gravityOffset + offset;
            int i13 = !tableLayout.isRtl ? margin + i12 : ((i4 - sizeInCell) - margin3) - i12;
            int i14 = i7 + gravityOffset2 + offset2 + margin2;
            if (childAt.cell != null) {
                if (sizeInCell != childAt.getMeasuredWidth() || sizeInCell2 != childAt.getMeasuredHeight()) {
                    childAt.measure(sizeInCell, sizeInCell2, false);
                }
                if (childAt.fixedHeight != 0 && childAt.fixedHeight != sizeInCell2 && childAt.layoutParams.rowSpec.span.max - childAt.layoutParams.rowSpec.span.min <= 1) {
                    int size = tableLayout.rowSpans.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size) {
                            tableLayout.cellsToFixHeight.add(childAt);
                            break;
                        }
                        PointF pointF = tableLayout.rowSpans.get(i15);
                        if (pointF.x <= childAt.layoutParams.rowSpec.span.min && pointF.y > childAt.layoutParams.rowSpec.span.min) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            childAt.layout(i13, i14, sizeInCell + i13, sizeInCell2 + i14);
            i5++;
            iMax = i11;
            z2 = true;
        }
        int size2 = tableLayout.cellsToFixHeight.size();
        int i16 = 0;
        while (i16 < size2) {
            Child child = tableLayout.cellsToFixHeight.get(i16);
            int iMin = child.measuredHeight - child.fixedHeight;
            int i17 = child.index + 1;
            int size3 = tableLayout.childrens.size();
            while (true) {
                if (i17 < size3) {
                    Child child2 = tableLayout.childrens.get(i17);
                    if (child.layoutParams.rowSpec.span.min == child2.layoutParams.rowSpec.span.min) {
                        if (child.fixedHeight < child2.fixedHeight) {
                            z = true;
                            break;
                        }
                        int i18 = child2.measuredHeight - child2.fixedHeight;
                        if (i18 > 0) {
                            iMin = Math.min(iMin, i18);
                        }
                        i17++;
                    }
                }
                z = false;
                break;
            }
            if (!z) {
                for (int i19 = child.index - 1; i19 >= 0; i19--) {
                    Child child3 = tableLayout.childrens.get(i19);
                    if (child.layoutParams.rowSpec.span.min != child3.layoutParams.rowSpec.span.min) {
                        break;
                    }
                    if (child.fixedHeight < child3.fixedHeight) {
                        z = true;
                        break;
                    }
                    int i20 = child3.measuredHeight - child3.fixedHeight;
                    if (i20 > 0) {
                        iMin = Math.min(iMin, i20);
                    }
                }
            }
            if (!z) {
                child.setFixedHeight(child.fixedHeight);
                iMax -= iMin;
                int i21 = child.layoutParams.rowSpec.span.min;
                while (true) {
                    i21++;
                    if (i21 >= iArrCopyOf.length) {
                        break;
                    } else {
                        iArrCopyOf[i21] = iArrCopyOf[i21] - iMin;
                    }
                }
                int size4 = tableLayout.childrens.size();
                int i22 = i16;
                for (int i23 = 0; i23 < size4; i23++) {
                    Child child4 = tableLayout.childrens.get(i23);
                    if (child != child4) {
                        if (child.layoutParams.rowSpec.span.min == child4.layoutParams.rowSpec.span.min) {
                            if (child4.fixedHeight != child4.measuredHeight) {
                                tableLayout.cellsToFixHeight.remove(child4);
                                if (child4.index < child.index) {
                                    i22--;
                                }
                                size2--;
                            }
                            Child.access$2120(child4, iMin);
                            child4.measure(child4.measuredWidth, child4.measuredHeight, true);
                        } else if (child.layoutParams.rowSpec.span.min < child4.layoutParams.rowSpec.span.min) {
                            child4.y -= iMin;
                        }
                    }
                }
                i16 = i22;
            }
            i16++;
        }
        int childCount3 = tableLayout.getChildCount();
        for (int i24 = 0; i24 < childCount3; i24++) {
            Child childAt2 = tableLayout.getChildAt(i24);
            tableLayout.delegate.onLayoutChild(childAt2.textLayout, childAt2.getTextX(), childAt2.getTextY());
            childAt2.captureNaturalHorizontalGeometry();
        }
        tableLayout.drawingWidth = i4;
        tableLayout.drawingHeight = iMax;
        tableLayout.naturalRowLocations = iArrCopyOf;
        tableLayout.setMeasuredDimension(i4, iMax);
    }

    public void removeAllChildrens() {
        this.childrens.clear();
        this.rowSpans.clear();
        invalidateStructure();
    }

    @Override
    public void requestLayout() {
        super.requestLayout();
        invalidateValues();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        requestLayout();
    }

    public void setCellPadding(int i, int i2, int i3) {
        if (this.itemPaddingLeft == i && this.itemPaddingTop == i2 && this.itemPaddingBottom == i3) {
            return;
        }
        this.itemPaddingLeft = i;
        this.itemPaddingTop = i2;
        this.itemPaddingBottom = i3;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.mHorizontalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        this.mHorizontalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setDrawLines(boolean z) {
        this.drawLines = z;
    }

    public void setFillWidth(boolean z) {
        if (this.fillWidth == z) {
            return;
        }
        this.fillWidth = z;
        requestLayout();
    }

    public void setMinimumCellHeight(int i) {
        this.minimumCellHeight = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            requestLayout();
        }
    }

    public void setRenderWidth(int i) {
        int measuredWidth = getMeasuredWidth();
        this.drawingWidth = Math.max(measuredWidth, i);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            Child childAt = getChildAt(i2);
            if (measuredWidth <= 0 || this.drawingWidth == measuredWidth) {
                childAt.setRenderHorizontalGeometry(childAt.naturalX, childAt.naturalWidth + childAt.naturalX);
            } else {
                float f = measuredWidth;
                childAt.setRenderHorizontalGeometry(Math.round((childAt.naturalX * this.drawingWidth) / f), Math.round(((childAt.naturalWidth + childAt.naturalX) * this.drawingWidth) / f));
            }
        }
        updateRenderRowGeometry();
        invalidate();
    }

    public void setRowCount(int i) {
        this.mVerticalAxis.setCount(i);
        invalidateStructure();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        this.mVerticalAxis.setOrderPreserved(z);
        invalidateStructure();
        requestLayout();
    }

    public void setRtl(boolean z) {
        this.isRtl = z;
    }

    public void setStriped(boolean z) {
        this.isStriped = z;
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        requestLayout();
    }

    public static final class MutableInt {
        public int value;

        public MutableInt() {
            reset();
        }

        public void reset() {
            this.value = Integer.MIN_VALUE;
        }

        public MutableInt(int i) {
            this.value = i;
        }
    }

    public static class Spec {
        static final float DEFAULT_WEIGHT = 0.0f;
        static final Spec UNDEFINED = TableLayout.spec(Integer.MIN_VALUE);
        final Alignment alignment;
        final Interval span;
        final boolean startDefined;
        float weight;

        public Alignment getAbsoluteAlignment(boolean z) {
            Alignment alignment = this.alignment;
            if (alignment != TableLayout.UNDEFINED_ALIGNMENT) {
                return alignment;
            }
            if (this.weight == 0.0f) {
                return z ? TableLayout.START : TableLayout.BASELINE;
            }
            return TableLayout.FILL;
        }

        public final Spec copyWriteAlignment(Alignment alignment) {
            return new Spec(this.startDefined, this.span, alignment, this.weight);
        }

        public final Spec copyWriteSpan(Interval interval) {
            return new Spec(this.startDefined, interval, this.alignment, this.weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Spec spec = (Spec) obj;
            return this.alignment.equals(spec.alignment) && this.span.equals(spec.span);
        }

        public final int getFlexibility() {
            return (this.alignment == TableLayout.UNDEFINED_ALIGNMENT && this.weight == 0.0f) ? 0 : 2;
        }

        public int hashCode() {
            return this.alignment.hashCode() + (this.span.hashCode() * 31);
        }

        private Spec(boolean z, Interval interval, Alignment alignment, float f) {
            this.startDefined = z;
            this.span = interval;
            this.alignment = alignment;
            this.weight = f;
        }

        private Spec(boolean z, int i, int i2, Alignment alignment, float f) {
            this(z, new Interval(i, i2 + i), alignment, f);
        }
    }

    private int getDefaultMargin(Child child, boolean z, boolean z2, boolean z3) {
        return getDefaultMargin(child, z2, z3);
    }

    public static Spec spec(int i, Alignment alignment, float f) {
        return spec(i, 1, alignment, f);
    }

    private int getDefaultMargin(Child child, LayoutParams layoutParams, boolean z, boolean z2) {
        boolean z3 = false;
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        Interval interval = spec.span;
        if ((z && this.isRtl) == z2 ? interval.max == axis.getCount() : interval.min == 0) {
            z3 = true;
        }
        return getDefaultMargin(child, z3, z, z2);
    }

    public static Spec spec(int i, int i2, float f) {
        return spec(i, i2, UNDEFINED_ALIGNMENT, f);
    }

    public static Spec spec(int i, float f) {
        return spec(i, 1, f);
    }

    public static Spec spec(int i, int i2, Alignment alignment) {
        return spec(i, i2, alignment, 0.0f);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int DEFAULT_HEIGHT = -2;
        private static final int DEFAULT_MARGIN = Integer.MIN_VALUE;
        private static final Interval DEFAULT_SPAN;
        private static final int DEFAULT_SPAN_SIZE;
        private static final int DEFAULT_WIDTH = -2;
        public Spec columnSpec;
        public Spec rowSpec;

        static {
            Interval interval = new Interval(Integer.MIN_VALUE, -2147483647);
            DEFAULT_SPAN = interval;
            DEFAULT_SPAN_SIZE = interval.size();
        }

        private LayoutParams(int i, int i2, int i3, int i4, int i5, int i6, Spec spec, Spec spec2) {
            super(i, i2);
            Spec spec3 = Spec.UNDEFINED;
            this.rowSpec = spec3;
            this.columnSpec = spec3;
            setMargins(i3, i4, i5, i6);
            this.rowSpec = spec;
            this.columnSpec = spec2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec);
        }

        public int hashCode() {
            return this.columnSpec.hashCode() + (this.rowSpec.hashCode() * 31);
        }

        public final void setColumnSpecSpan(Interval interval) {
            this.columnSpec = this.columnSpec.copyWriteSpan(interval);
        }

        public void setGravity(int i) {
            this.rowSpec = this.rowSpec.copyWriteAlignment(TableLayout.getAlignment(i, false));
            this.columnSpec = this.columnSpec.copyWriteAlignment(TableLayout.getAlignment(i, true));
        }

        public final void setRowSpecSpan(Interval interval) {
            this.rowSpec = this.rowSpec.copyWriteSpan(interval);
        }

        public LayoutParams(Spec spec, Spec spec2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, spec, spec2);
        }

        public LayoutParams() {
            Spec spec = Spec.UNDEFINED;
            this(spec, spec);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            Spec spec = Spec.UNDEFINED;
            this.rowSpec = spec;
            this.columnSpec = spec;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            Spec spec = Spec.UNDEFINED;
            this.rowSpec = spec;
            this.columnSpec = spec;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            Spec spec = Spec.UNDEFINED;
            this.rowSpec = spec;
            this.columnSpec = spec;
            this.rowSpec = layoutParams.rowSpec;
            this.columnSpec = layoutParams.columnSpec;
        }
    }

    public static Spec spec(int i, Alignment alignment) {
        return spec(i, 1, alignment);
    }

    public static Spec spec(int i, int i2) {
        return spec(i, i2, UNDEFINED_ALIGNMENT);
    }

    public static Spec spec(int i) {
        return spec(i, 1);
    }

    public void addChild(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        int i4 = i3 == 0 ? 1 : i3;
        Child child = new Child(this.childrens.size());
        child.cell = pagetablecell;
        LayoutParams layoutParams = new LayoutParams();
        int i5 = pagetablecell.rowspan;
        if (i5 == 0) {
            i5 = 1;
        }
        Interval interval = new Interval(i2, i5 + i2);
        Alignment alignment = FILL;
        layoutParams.rowSpec = new Spec(false, interval, alignment, 0.0f);
        layoutParams.columnSpec = new Spec(false, new Interval(i, i4 + i), alignment, 1.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        this.childrens.add(child);
        int i6 = pagetablecell.rowspan;
        if (i6 > 1) {
            this.rowSpans.add(new PointF(i2, i6 + i2));
        }
        invalidateStructure();
    }

    public interface TableLayoutDelegate {
        CellText createTextLayout(TL_iv.pageTableCell pagetablecell, int i);

        Paint getHalfLinePaint();

        Paint getHeaderPaint();

        Paint getLinePaint();

        Paint getStripPaint();

        void onLayoutChild(CellText cellText, int i, int i2);

        public abstract class CC {
            public static void $default$onLayoutChild(TableLayoutDelegate tableLayoutDelegate, CellText cellText, int i, int i2) {
            }
        }
    }
}
