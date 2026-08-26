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
import androidx.core.app.NotificationCompatBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;

public final class TableLayout extends View {
    public final TableA11yHelper accessibilityHelper;
    public final Path backgroundPath;
    public final ArrayList cellsToFixHeight;
    public final ArrayList childrens;
    public int colCount;
    public final TableLayoutDelegate delegate;
    public boolean drawLines;
    public int drawingHeight;
    public int drawingWidth;
    public boolean fillWidth;
    public boolean isRtl;
    public boolean isStriped;
    public int itemPaddingBottom;
    public int itemPaddingLeft;
    public int itemPaddingTop;
    public int mAlignmentMode;
    public final Axis mHorizontalAxis;
    public int mLastLayoutParamsHashCode;
    public int mOrientation;
    public boolean mUseDefaultMargins;
    public final Axis mVerticalAxis;
    public int minimumCellHeight;
    public int[] naturalRowLocations;
    public final float[] radii;
    public final RectF rect;
    public final ArrayList rowSpans;
    public final TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
    public static final AnonymousClass1 UNDEFINED_ALIGNMENT = new AnonymousClass1(0);
    public static final AnonymousClass1 START = new AnonymousClass1(1);
    public static final AnonymousClass1 BASELINE = new AnonymousClass1(2);
    public static final AnonymousClass1 FILL = new AnonymousClass1(3);

    public final class AnonymousClass1 {
        public final int $r8$classId;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        public final int getAlignmentValue() {
            switch (this.$r8$classId) {
                case 0:
                    return Integer.MIN_VALUE;
                case 1:
                    return 0;
                case 2:
                    return Integer.MIN_VALUE;
                default:
                    return Integer.MIN_VALUE;
            }
        }

        public final int getGravityOffset() {
            switch (this.$r8$classId) {
                case 0:
                    return Integer.MIN_VALUE;
                case 1:
                    return 0;
                case 2:
                    return 0;
                default:
                    return 0;
            }
        }

        public int getSizeInCell(int i, int i2) {
            switch (this.$r8$classId) {
                case 3:
                    return i2;
                default:
                    return i;
            }
        }
    }

    public final class Arc {
        public final Interval span;
        public boolean valid = true;
        public final MutableInt value;

        public Arc(Interval interval, MutableInt mutableInt) {
            this.span = interval;
            this.value = mutableInt;
        }
    }

    public final class Assoc extends ArrayList {
        public final Class keyType;
        public final Class valueType;

        public Assoc(Class cls, Class cls2) {
            this.keyType = cls;
            this.valueType = cls2;
        }

        public final ChatActivity.AnonymousClass117 pack() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.keyType, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.valueType, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = ((Pair) get(i)).first;
                objArr2[i] = ((Pair) get(i)).second;
            }
            ChatActivity.AnonymousClass117 anonymousClass117 = new ChatActivity.AnonymousClass117();
            int length = objArr.length;
            int[] iArr = new int[length];
            HashMap map = new HashMap();
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = objArr[i2];
                Integer numValueOf = (Integer) map.get(obj);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(map.size());
                    map.put(obj, numValueOf);
                }
                iArr[i2] = numValueOf.intValue();
            }
            anonymousClass117.val$primaryMessage = iArr;
            anonymousClass117.val$finalReactionsLayout = ChatActivity.AnonymousClass117.compact(objArr, iArr);
            anonymousClass117.this$0 = ChatActivity.AnonymousClass117.compact(objArr2, iArr);
            return anonymousClass117;
        }
    }

    public final class Axis {
        public Arc[] arcs;
        public ChatActivity.AnonymousClass117 backwardLinks;
        public int[] deltas;
        public ChatActivity.AnonymousClass117 forwardLinks;
        public ChatActivity.AnonymousClass117 groupBounds;
        public boolean hasWeights;
        public final boolean horizontal;
        public int[] leadingMargins;
        public int[] locations;
        public int[] trailingMargins;
        public int definedCount = Integer.MIN_VALUE;
        public int maxIndex = Integer.MIN_VALUE;
        public boolean groupBoundsValid = false;
        public boolean forwardLinksValid = false;
        public boolean backwardLinksValid = false;
        public boolean leadingMarginsValid = false;
        public boolean trailingMarginsValid = false;
        public boolean arcsValid = false;
        public boolean locationsValid = false;
        public boolean hasWeightsValid = false;
        public boolean orderPreserved = true;
        public final MutableInt parentMin = new MutableInt(0);
        public final MutableInt parentMax = new MutableInt(-100000);

        public Axis(boolean z) {
            this.horizontal = z;
        }

        public static void include(ArrayList arrayList, Interval interval, MutableInt mutableInt, boolean z) {
            if (interval.max - interval.min == 0) {
                return;
            }
            if (z) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((Arc) obj).span.equals(interval)) {
                        return;
                    }
                }
            }
            arrayList.add(new Arc(interval, mutableInt));
        }

        public final void computeLinks(ChatActivity.AnonymousClass117 anonymousClass117, boolean z) {
            for (MutableInt mutableInt : (MutableInt[]) ((Object[]) anonymousClass117.this$0)) {
                mutableInt.value = Integer.MIN_VALUE;
            }
            Bounds[] boundsArr = (Bounds[]) ((Object[]) getGroupBounds().this$0);
            for (int i = 0; i < boundsArr.length; i++) {
                int size = boundsArr[i].size(z);
                MutableInt mutableInt2 = (MutableInt) ((Object[]) anonymousClass117.this$0)[((int[]) anonymousClass117.val$primaryMessage)[i]];
                int i2 = mutableInt2.value;
                if (!z) {
                    size = -size;
                }
                mutableInt2.value = Math.max(i2, size);
            }
        }

        public final void computeMargins(boolean z) {
            int[] iArr = z ? this.leadingMargins : this.trailingMargins;
            TableLayout tableLayout = TableLayout.this;
            int childCount = tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = tableLayout.getChildAt(i);
                LayoutParams layoutParams = childAt.layoutParams;
                boolean z2 = this.horizontal;
                Interval interval = (z2 ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                int i2 = z ? interval.min : interval.max;
                iArr[i2] = Math.max(iArr[i2], tableLayout.getMargin1(childAt, z2, z));
            }
        }

        public final ChatActivity.AnonymousClass117 createLinks(boolean z) {
            Interval interval;
            Assoc assoc = new Assoc(Interval.class, MutableInt.class);
            Spec[] specArr = (Spec[]) ((Object[]) getGroupBounds().val$finalReactionsLayout);
            int length = specArr.length;
            for (int i = 0; i < length; i++) {
                if (z) {
                    interval = specArr[i].span;
                } else {
                    Interval interval2 = specArr[i].span;
                    interval = new Interval(interval2.max, interval2.min);
                }
                MutableInt mutableInt = new MutableInt();
                mutableInt.value = Integer.MIN_VALUE;
                assoc.add(Pair.create(interval, mutableInt));
            }
            return assoc.pack();
        }

        public final Arc[] getArcs() {
            if (this.arcs == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.forwardLinks == null) {
                    this.forwardLinks = createLinks(true);
                }
                if (!this.forwardLinksValid) {
                    computeLinks(this.forwardLinks, true);
                    this.forwardLinksValid = true;
                }
                ChatActivity.AnonymousClass117 anonymousClass117 = this.forwardLinks;
                int i = 0;
                while (true) {
                    Interval[] intervalArr = (Interval[]) ((Object[]) anonymousClass117.val$finalReactionsLayout);
                    if (i >= intervalArr.length) {
                        break;
                    }
                    include(arrayList, intervalArr[i], ((MutableInt[]) ((Object[]) anonymousClass117.this$0))[i], false);
                    i++;
                }
                if (this.backwardLinks == null) {
                    this.backwardLinks = createLinks(false);
                }
                if (!this.backwardLinksValid) {
                    computeLinks(this.backwardLinks, false);
                    this.backwardLinksValid = true;
                }
                ChatActivity.AnonymousClass117 anonymousClass118 = this.backwardLinks;
                int i2 = 0;
                while (true) {
                    Interval[] intervalArr2 = (Interval[]) ((Object[]) anonymousClass118.val$finalReactionsLayout);
                    if (i2 >= intervalArr2.length) {
                        break;
                    }
                    include(arrayList2, intervalArr2[i2], ((MutableInt[]) ((Object[]) anonymousClass118.this$0))[i2], false);
                    i2++;
                }
                if (this.orderPreserved) {
                    int i3 = 0;
                    while (i3 < Math.max(this.definedCount, getMaxIndex())) {
                        int i4 = i3 + 1;
                        include(arrayList, new Interval(i3, i4), new MutableInt(0), true);
                        i3 = i4;
                    }
                }
                int iMax = Math.max(this.definedCount, getMaxIndex());
                include(arrayList, new Interval(0, iMax), this.parentMin, false);
                include(arrayList2, new Interval(iMax, 0), this.parentMax, false);
                NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this, (Arc[]) arrayList.toArray(new Arc[0]));
                int length = ((Arc[][]) notificationCompatBuilder.mBuilder).length;
                for (int i5 = 0; i5 < length; i5++) {
                    notificationCompatBuilder.walk(i5);
                }
                NotificationCompatBuilder notificationCompatBuilder2 = new NotificationCompatBuilder(this, (Arc[]) arrayList2.toArray(new Arc[0]));
                int length2 = ((Arc[][]) notificationCompatBuilder2.mBuilder).length;
                for (int i6 = 0; i6 < length2; i6++) {
                    notificationCompatBuilder2.walk(i6);
                }
                Class<?> componentType = Arc[].class.getComponentType();
                Arc[] arcArr = (Arc[]) notificationCompatBuilder.mContext;
                int length3 = arcArr.length;
                Arc[] arcArr2 = (Arc[]) notificationCompatBuilder2.mContext;
                Object[] objArr = (Object[]) Array.newInstance(componentType, length3 + arcArr2.length);
                System.arraycopy(arcArr, 0, objArr, 0, arcArr.length);
                System.arraycopy(arcArr2, 0, objArr, arcArr.length, arcArr2.length);
                this.arcs = (Arc[]) objArr;
            }
            if (!this.arcsValid) {
                if (this.forwardLinks == null) {
                    this.forwardLinks = createLinks(true);
                }
                if (!this.forwardLinksValid) {
                    computeLinks(this.forwardLinks, true);
                    this.forwardLinksValid = true;
                }
                if (this.backwardLinks == null) {
                    this.backwardLinks = createLinks(false);
                }
                if (!this.backwardLinksValid) {
                    computeLinks(this.backwardLinks, false);
                    this.backwardLinksValid = true;
                }
                this.arcsValid = true;
            }
            return this.arcs;
        }

        public final ChatActivity.AnonymousClass117 getGroupBounds() {
            Object tableLayout$6$1;
            ChatActivity.AnonymousClass117 anonymousClass117 = this.groupBounds;
            boolean z = this.horizontal;
            TableLayout tableLayout = TableLayout.this;
            if (anonymousClass117 == null) {
                Assoc assoc = new Assoc(Spec.class, Bounds.class);
                int childCount = tableLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    LayoutParams layoutParams = tableLayout.getChildAt(i).layoutParams;
                    Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
                    switch (Spec.access$2200(spec, z).$r8$classId) {
                        case 2:
                            tableLayout$6$1 = new TableLayout$6$1();
                            break;
                        default:
                            tableLayout$6$1 = new Bounds();
                            break;
                    }
                    assoc.add(Pair.create(spec, tableLayout$6$1));
                }
                this.groupBounds = assoc.pack();
            }
            if (!this.groupBoundsValid) {
                for (Bounds bounds : (Bounds[]) ((Object[]) this.groupBounds.this$0)) {
                    bounds.reset();
                }
                int childCount2 = tableLayout.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    Child childAt = tableLayout.getChildAt(i2);
                    LayoutParams layoutParams2 = childAt.layoutParams;
                    Spec spec2 = z ? layoutParams2.columnSpec : layoutParams2.rowSpec;
                    int margin = tableLayout.getMargin(childAt, z, false) + tableLayout.getMargin(childAt, z, true) + (z ? childAt.measuredWidth : childAt.measuredHeight);
                    float f = spec2.weight;
                    int i3 = margin + (f == 0.0f ? 0 : this.deltas[i2]);
                    ChatActivity.AnonymousClass117 anonymousClass118 = this.groupBounds;
                    Bounds bounds2 = (Bounds) ((Object[]) anonymousClass118.this$0)[((int[]) anonymousClass118.val$primaryMessage)[i2]];
                    bounds2.flexibility = ((spec2.alignment == TableLayout.UNDEFINED_ALIGNMENT && f == 0.0f) ? 0 : 2) & bounds2.flexibility;
                    int alignmentValue = Spec.access$2200(spec2, z).getAlignmentValue();
                    bounds2.include(alignmentValue, i3 - alignmentValue);
                }
                this.groupBoundsValid = true;
            }
            return this.groupBounds;
        }

        public final int[] getLocations() {
            boolean z;
            if (this.locations == null) {
                this.locations = new int[Math.max(this.definedCount, getMaxIndex()) + 1];
            }
            if (!this.locationsValid) {
                int[] iArr = this.locations;
                boolean z2 = this.hasWeightsValid;
                float f = 0.0f;
                boolean z3 = this.horizontal;
                TableLayout tableLayout = TableLayout.this;
                if (!z2) {
                    int childCount = tableLayout.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i >= childCount) {
                            z = false;
                            break;
                        }
                        LayoutParams layoutParams = tableLayout.getChildAt(i).layoutParams;
                        if ((z3 ? layoutParams.columnSpec : layoutParams.rowSpec).weight != 0.0f) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    this.hasWeights = z;
                    this.hasWeightsValid = true;
                }
                if (this.hasWeights) {
                    if (this.deltas == null) {
                        this.deltas = new int[tableLayout.getChildCount()];
                    }
                    Arrays.fill(this.deltas, 0);
                    solve(getArcs(), iArr, true);
                    int childCount2 = (tableLayout.getChildCount() * this.parentMin.value) + 1;
                    if (childCount2 >= 2) {
                        int childCount3 = tableLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount3; i2++) {
                            LayoutParams layoutParams2 = tableLayout.getChildAt(i2).layoutParams;
                            f += (z3 ? layoutParams2.columnSpec : layoutParams2.rowSpec).weight;
                        }
                        int i3 = -1;
                        int i4 = 0;
                        boolean z4 = true;
                        while (i4 < childCount2) {
                            int i5 = (int) ((((long) i4) + ((long) childCount2)) / 2);
                            invalidateValues();
                            shareOutDelta(f, i5);
                            boolean zSolve = solve(getArcs(), iArr, false);
                            if (zSolve) {
                                i4 = i5 + 1;
                                i3 = i5;
                            } else {
                                childCount2 = i5;
                            }
                            z4 = zSolve;
                        }
                        if (i3 > 0 && !z4) {
                            invalidateValues();
                            shareOutDelta(f, i3);
                            solve(getArcs(), iArr, true);
                        }
                    }
                } else {
                    solve(getArcs(), iArr, true);
                }
                if (!this.orderPreserved) {
                    int i6 = iArr[0];
                    int length = iArr.length;
                    for (int i7 = 0; i7 < length; i7++) {
                        iArr[i7] = iArr[i7] - i6;
                    }
                }
                this.locationsValid = true;
            }
            return this.locations;
        }

        public final int getMaxIndex() {
            if (this.maxIndex == Integer.MIN_VALUE) {
                TableLayout tableLayout = TableLayout.this;
                int childCount = tableLayout.getChildCount();
                int iMax = -1;
                for (int i = 0; i < childCount; i++) {
                    LayoutParams layoutParams = tableLayout.getChildAt(i).layoutParams;
                    Interval interval = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).span;
                    int i2 = interval.min;
                    int iMax2 = Math.max(iMax, i2);
                    int i3 = interval.max;
                    iMax = Math.max(Math.max(iMax2, i3), i3 - i2);
                }
                this.maxIndex = Math.max(0, iMax != -1 ? iMax : Integer.MIN_VALUE);
            }
            return this.maxIndex;
        }

        public final int getMeasure(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            MutableInt mutableInt = this.parentMax;
            MutableInt mutableInt2 = this.parentMin;
            if (mode == Integer.MIN_VALUE) {
                mutableInt2.value = 0;
                mutableInt.value = -size;
                this.locationsValid = false;
                return getLocations()[Math.max(this.definedCount, getMaxIndex())];
            }
            if (mode == 0) {
                mutableInt2.value = 0;
                mutableInt.value = -100000;
                this.locationsValid = false;
                return getLocations()[Math.max(this.definedCount, getMaxIndex())];
            }
            if (mode != 1073741824) {
                return 0;
            }
            mutableInt2.value = size;
            mutableInt.value = -size;
            this.locationsValid = false;
            return getLocations()[Math.max(this.definedCount, getMaxIndex())];
        }

        public final void invalidateStructure() {
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

        public final void invalidateValues() {
            this.groupBoundsValid = false;
            this.forwardLinksValid = false;
            this.backwardLinksValid = false;
            this.leadingMarginsValid = false;
            this.trailingMarginsValid = false;
            this.arcsValid = false;
            this.locationsValid = false;
        }

        public final void shareOutDelta(float f, int i) {
            Arrays.fill(this.deltas, 0);
            TableLayout tableLayout = TableLayout.this;
            int childCount = tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                LayoutParams layoutParams = tableLayout.getChildAt(i2).layoutParams;
                float f2 = (this.horizontal ? layoutParams.columnSpec : layoutParams.rowSpec).weight;
                if (f2 != 0.0f) {
                    int iRound = Math.round((i * f2) / f);
                    this.deltas[i2] = iRound;
                    i -= iRound;
                    f -= f2;
                }
            }
        }

        public final boolean solve(Arc[] arcArr, int[] iArr, boolean z) {
            boolean z2;
            boolean z3;
            int iMax = Math.max(this.definedCount, getMaxIndex()) + 1;
            loop0: for (int i = 0; i < arcArr.length; i++) {
                Arrays.fill(iArr, 0);
                for (int i2 = 0; i2 < iMax; i2++) {
                    boolean z4 = false;
                    for (Arc arc : arcArr) {
                        if (arc.valid) {
                            Interval interval = arc.span;
                            int i3 = iArr[interval.min] + arc.value.value;
                            int i4 = interval.max;
                            if (i3 > iArr[i4]) {
                                iArr[i4] = i3;
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        z4 |= z3;
                    }
                    if (!z4) {
                        break loop0;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr = new boolean[arcArr.length];
                for (int i5 = 0; i5 < iMax; i5++) {
                    int length = arcArr.length;
                    for (int i6 = 0; i6 < length; i6++) {
                        boolean z5 = zArr[i6];
                        Arc arc2 = arcArr[i6];
                        if (arc2.valid) {
                            Interval interval2 = arc2.span;
                            int i7 = iArr[interval2.min] + arc2.value.value;
                            int i8 = interval2.max;
                            if (i7 > iArr[i8]) {
                                iArr[i8] = i7;
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                        zArr[i6] = z5 | z2;
                    }
                }
                for (int i9 = 0; i9 < arcArr.length; i9++) {
                    if (zArr[i9]) {
                        Arc arc3 = arcArr[i9];
                        Interval interval3 = arc3.span;
                        if (interval3.min >= interval3.max) {
                            arc3.valid = false;
                            break;
                        }
                    }
                }
            }
            return true;
        }
    }

    public class Bounds {
        public int after;
        public int before;
        public int flexibility;

        public Bounds() {
            reset();
        }

        public int getOffset(Child child, AnonymousClass1 anonymousClass1, int i) {
            return this.before - anonymousClass1.getAlignmentValue();
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
            if (!z) {
                int i = this.flexibility;
                AnonymousClass1 anonymousClass1 = TableLayout.UNDEFINED_ALIGNMENT;
                if ((i & 2) != 0) {
                    return 100000;
                }
            }
            return this.before + this.after;
        }
    }

    public interface CellText extends TextSelectionHelper.TextLayoutBlock {
        void attach(View view);

        void detach(View view);

        void draw(Canvas canvas, View view);

        int getEmojiOnlyCount();

        void setRow(int i);

        void setX(int i);

        void setY(int i);
    }

    public final class Child {
        public TL_iv.pageTableCell cell;
        public int fixedHeight;
        public final int index;
        public LayoutParams layoutParams;
        public int measuredHeight;
        public int measuredWidth;
        public int naturalWidth;
        public int naturalX;
        public int rowspan;
        public int selectionIndex = -1;
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

        public final void draw(Canvas canvas, View view, boolean z) {
            boolean z2;
            Paint paint;
            RectF rectF;
            int i;
            int i2;
            int i3;
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper;
            Canvas canvas2 = canvas;
            if (this.cell == null) {
                return;
            }
            int i4 = this.x + this.measuredWidth;
            TableLayout tableLayout = TableLayout.this;
            boolean z3 = false;
            boolean z4 = i4 == tableLayout.drawingWidth;
            boolean z5 = this.y + this.measuredHeight == tableLayout.drawingHeight;
            int iDp = AndroidUtilities.dp(8.0f);
            boolean z6 = this.cell.header;
            TableLayoutDelegate tableLayoutDelegate = tableLayout.delegate;
            RectF rectF2 = tableLayout.rect;
            if (z6 || (tableLayout.isStriped && this.layoutParams.rowSpec.span.min % 2 == 0)) {
                int i5 = this.x;
                float[] fArr = tableLayout.radii;
                if (i5 == 0 && this.y == 0) {
                    float f = iDp;
                    fArr[1] = f;
                    fArr[0] = f;
                    z3 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                }
                if (z4 && this.y == 0) {
                    float f2 = iDp;
                    fArr[3] = f2;
                    fArr[2] = f2;
                    z3 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z4 && z5) {
                    float f3 = iDp;
                    fArr[5] = f3;
                    fArr[4] = f3;
                    z3 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i5 == 0 && z5) {
                    float f4 = iDp;
                    fArr[7] = f4;
                    fArr[6] = f4;
                    z2 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                    z2 = z3;
                }
                if (z2) {
                    int i6 = this.y;
                    rectF2.set(i5, i6, i5 + this.measuredWidth, i6 + this.measuredHeight);
                    Path path = tableLayout.backgroundPath;
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.cell.header) {
                        canvas2.drawPath(path, tableLayoutDelegate.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, tableLayoutDelegate.getStripPaint());
                    }
                } else if (z6) {
                    int i7 = this.y;
                    canvas2.drawRect(i5, i7, i5 + this.measuredWidth, i7 + this.measuredHeight, tableLayoutDelegate.getHeaderPaint());
                    canvas2 = canvas;
                } else {
                    int i8 = this.y;
                    canvas2 = canvas;
                    canvas2.drawRect(i5, i8, this.measuredWidth + i5, i8 + this.measuredHeight, tableLayoutDelegate.getStripPaint());
                }
            }
            if (z && this.textLayout != null) {
                canvas2.save();
                canvas2.translate(this.x + this.textX, this.y + this.textY);
                if (this.selectionIndex >= 0 && (articleTextSelectionHelper = tableLayout.textSelectionHelper) != null) {
                    articleTextSelectionHelper.draw(canvas2, (TextSelectionHelper.ArticleSelectableView) tableLayout.getParent().getParent(), this.selectionIndex);
                }
                this.textLayout.draw(canvas2, view);
                canvas2.restore();
            }
            if (tableLayout.drawLines) {
                Paint linePaint = tableLayoutDelegate.getLinePaint();
                Paint linePaint2 = tableLayoutDelegate.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i9 = this.x;
                if (i9 == 0) {
                    int i10 = this.y;
                    float f5 = i10;
                    float f6 = this.measuredHeight + i10;
                    if (i10 == 0) {
                        f5 += iDp;
                    }
                    float f7 = f5;
                    if (f6 == tableLayout.drawingHeight) {
                        f6 -= iDp;
                    }
                    float f8 = i9 + strokeWidth;
                    canvas2.drawLine(f8, f7, f8, f6, linePaint);
                    paint = linePaint2;
                } else {
                    float f9 = i9 - strokeWidth2;
                    int i11 = this.y;
                    paint = linePaint2;
                    canvas.drawLine(f9, i11, f9, i11 + this.measuredHeight, paint);
                }
                int i12 = this.y;
                if (i12 == 0) {
                    int i13 = this.x;
                    float f10 = i13;
                    float f11 = this.measuredWidth + i13;
                    if (i13 == 0) {
                        f10 += iDp;
                    }
                    float f12 = f10;
                    if (f11 == tableLayout.drawingWidth) {
                        f11 -= iDp;
                    }
                    float f13 = i12 + strokeWidth;
                    canvas.drawLine(f12, f13, f11, f13, linePaint);
                } else {
                    int i14 = this.x;
                    float f14 = i12 - strokeWidth2;
                    canvas.drawLine(i14, f14, i14 + this.measuredWidth, f14, paint);
                }
                float f15 = (z4 && (i3 = this.y) == 0) ? i3 + iDp : this.y - strokeWidth;
                float f16 = (z4 && z5) ? (this.y + this.measuredHeight) - iDp : (this.y + this.measuredHeight) - strokeWidth;
                float f17 = (this.x + this.measuredWidth) - strokeWidth;
                canvas.drawLine(f17, f15, f17, f16, linePaint);
                int i15 = this.x;
                float f18 = (i15 == 0 && z5) ? i15 + iDp : i15 - strokeWidth;
                float f19 = (z4 && z5) ? (i15 + this.measuredWidth) - iDp : (i15 + this.measuredWidth) - strokeWidth;
                float f20 = (this.y + this.measuredHeight) - strokeWidth;
                canvas.drawLine(f18, f20, f19, f20, linePaint);
                int i16 = this.x;
                if (i16 == 0 && (i2 = this.y) == 0) {
                    float f21 = i16 + strokeWidth;
                    float f22 = i2 + strokeWidth;
                    float f23 = iDp * 2;
                    rectF2.set(f21, f22, f21 + f23, f23 + f22);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, linePaint);
                } else {
                    rectF = rectF2;
                }
                if (z4 && (i = this.y) == 0) {
                    float f24 = (this.x + this.measuredWidth) - strokeWidth;
                    float f25 = iDp * 2;
                    float f26 = i + strokeWidth;
                    rectF.set(f24 - f25, f26, f24, f25 + f26);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, linePaint);
                }
                int i17 = this.x;
                if (i17 == 0 && z5) {
                    float f27 = i17 + strokeWidth;
                    float f28 = (this.y + this.measuredHeight) - strokeWidth;
                    float f29 = iDp * 2;
                    rectF.set(f27, f28 - f29, f29 + f27, f28);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, linePaint);
                }
                if (z4 && z5) {
                    float f30 = (this.x + this.measuredWidth) - strokeWidth;
                    float f31 = iDp * 2;
                    float f32 = (this.y + this.measuredHeight) - strokeWidth;
                    rectF.set(f30 - f31, f32 - f31, f30, f32);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, linePaint);
                }
            }
        }

        public final void measure(int i, int i2, boolean z) {
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
                            TableLayout tableLayout = TableLayout.this;
                            setTextLayout(tableLayout.delegate.createTextLayout(this.cell, this.measuredWidth - (tableLayout.itemPaddingLeft * 2)));
                            this.fixedHeight = this.textHeight + tableLayout.itemPaddingTop + tableLayout.itemPaddingBottom;
                        } else if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.cell;
                            if (pagetablecell.align_center || pagetablecell.align_right) {
                                TableLayout tableLayout2 = TableLayout.this;
                                setTextLayout(tableLayout2.delegate.createTextLayout(this.cell, this.measuredWidth - (tableLayout2.itemPaddingLeft * 2)));
                                this.fixedHeight = this.textHeight + tableLayout2.itemPaddingTop + tableLayout2.itemPaddingBottom;
                            }
                        }
                    }
                    updateTextX();
                }
                updateTextY();
            }
        }

        public final void setTextLayout(CellText cellText) {
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

        public final void updateTextX() {
            int i = -this.textLeft;
            this.textX = i;
            TL_iv.pageTableCell pagetablecell = this.cell;
            boolean z = pagetablecell.align_right;
            TableLayout tableLayout = TableLayout.this;
            if (z) {
                this.textX = ((this.measuredWidth - this.textWidth) - tableLayout.itemPaddingLeft) + i;
            } else if (pagetablecell.align_center) {
                this.textX = Math.round((this.measuredWidth - this.textWidth) / 2.0f) + i;
            } else {
                this.textX = i + tableLayout.itemPaddingLeft;
            }
        }

        public final void updateTextY() {
            TL_iv.pageTableCell pagetablecell = this.cell;
            if (pagetablecell.valign_middle) {
                this.textY = (this.measuredHeight - this.textHeight) / 2;
                return;
            }
            boolean z = pagetablecell.valign_bottom;
            TableLayout tableLayout = TableLayout.this;
            if (z) {
                this.textY = (this.measuredHeight - this.textHeight) - tableLayout.itemPaddingBottom;
            } else {
                this.textY = tableLayout.itemPaddingTop;
            }
        }
    }

    public final class Interval {
        public final int max;
        public final int min;

        public Interval(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Interval.class != obj.getClass()) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.max == interval.max && this.min == interval.min;
        }

        public final int hashCode() {
            return (this.min * 31) + this.max;
        }
    }

    public final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public Spec columnSpec;
        public Spec rowSpec;

        public LayoutParams() {
            super(-2, -2);
            Spec spec = Spec.UNDEFINED;
            this.rowSpec = spec;
            this.columnSpec = spec;
            setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.rowSpec = spec;
            this.columnSpec = spec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || LayoutParams.class != obj.getClass()) {
                return false;
            }
            LayoutParams layoutParams = (LayoutParams) obj;
            return this.columnSpec.equals(layoutParams.columnSpec) && this.rowSpec.equals(layoutParams.rowSpec);
        }

        public final int hashCode() {
            return this.columnSpec.hashCode() + (this.rowSpec.hashCode() * 31);
        }
    }

    public final class MutableInt {
        public int value;

        public MutableInt(int i) {
            this.value = i;
        }
    }

    public final class Spec {
        public static final Spec UNDEFINED = new Spec(new Interval(Integer.MIN_VALUE, -2147483647), TableLayout.UNDEFINED_ALIGNMENT, 0.0f);
        public final AnonymousClass1 alignment;
        public final Interval span;
        public final float weight;

        public Spec(Interval interval, AnonymousClass1 anonymousClass1, float f) {
            this.span = interval;
            this.alignment = anonymousClass1;
            this.weight = f;
        }

        public static AnonymousClass1 access$2200(Spec spec, boolean z) {
            AnonymousClass1 anonymousClass1 = spec.alignment;
            if (anonymousClass1 != TableLayout.UNDEFINED_ALIGNMENT) {
                return anonymousClass1;
            }
            if (spec.weight == 0.0f) {
                return z ? TableLayout.START : TableLayout.BASELINE;
            }
            return TableLayout.FILL;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Spec.class != obj.getClass()) {
                return false;
            }
            Spec spec = (Spec) obj;
            return this.alignment.equals(spec.alignment) && this.span.equals(spec.span);
        }

        public final int hashCode() {
            return this.alignment.hashCode() + (this.span.hashCode() * 31);
        }
    }

    public final class TableA11yHelper extends ExploreByTouchHelper {
        public final Rect tmpRect;

        public TableA11yHelper(TableLayout tableLayout) {
            super(tableLayout);
            this.tmpRect = new Rect();
        }

        @Override
        public final int getVirtualViewAt(float f, float f2) {
            int i;
            TableLayout tableLayout = TableLayout.this;
            int childCount = tableLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Child childAt = tableLayout.getChildAt(i2);
                int i3 = childAt.measuredWidth;
                if (i3 > 0 && (i = childAt.measuredHeight) > 0) {
                    int i4 = childAt.x;
                    if (f >= i4 && f < i4 + i3) {
                        int i5 = childAt.y;
                        if (f2 >= i5 && f2 < i5 + i) {
                            return i2;
                        }
                    }
                }
            }
            return Integer.MIN_VALUE;
        }

        @Override
        public final void getVisibleVirtualViews(ArrayList arrayList) {
            TableLayout tableLayout = TableLayout.this;
            int childCount = tableLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Child childAt = tableLayout.getChildAt(i);
                if (childAt.measuredWidth > 0 && childAt.measuredHeight > 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }

        @Override
        public final boolean onPerformActionForVirtualView(int i, int i2) {
            return false;
        }

        @Override
        public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Rect rect = this.tmpRect;
            if (i >= 0) {
                TableLayout tableLayout = TableLayout.this;
                if (i < tableLayout.getChildCount()) {
                    Child childAt = tableLayout.getChildAt(i);
                    int i2 = childAt.x;
                    int i3 = childAt.y;
                    rect.set(i2, i3, childAt.measuredWidth + i2, childAt.measuredHeight + i3);
                    accessibilityNodeInfoCompat.setBoundsInParent(rect);
                    accessibilityNodeInfoCompat.setClassName("android.widget.TextView");
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                    accessibilityNodeInfo.setEnabled(true);
                    CellText cellText = childAt.textLayout;
                    CharSequence text = cellText != null ? cellText.getText() : null;
                    if (text == null || text.length() == 0) {
                        text = " ";
                    }
                    accessibilityNodeInfoCompat.setText(text);
                    TL_iv.pageTableCell pagetablecell = childAt.cell;
                    if (pagetablecell == null || !pagetablecell.header) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo.setHeading(true);
                        return;
                    }
                    Bundle extras = accessibilityNodeInfo.getExtras();
                    if (extras != null) {
                        extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | 2);
                        return;
                    }
                    return;
                }
            }
            rect.set(0, 0, 1, 1);
            accessibilityNodeInfoCompat.setBoundsInParent(rect);
            accessibilityNodeInfoCompat.setVisibleToUser(false);
            accessibilityNodeInfoCompat.setContentDescription("");
        }
    }

    public interface TableLayoutDelegate {
        CellText createTextLayout(TL_iv.pageTableCell pagetablecell, int i);

        Paint getHeaderPaint();

        Paint getLinePaint();

        Paint getStripPaint();

        void onLayoutChild(CellText cellText, int i, int i2);
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
        this.cellsToFixHeight = new ArrayList();
        this.rowSpans = new ArrayList();
        new Path();
        this.backgroundPath = new Path();
        this.rect = new RectF();
        this.radii = new float[8];
        this.childrens = new ArrayList();
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

    public final void addChild(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.childrens;
        Child child = new Child(arrayList.size());
        LayoutParams layoutParams = new LayoutParams();
        Interval interval = new Interval(i2, i4 + i2);
        AnonymousClass1 anonymousClass1 = FILL;
        layoutParams.rowSpec = new Spec(interval, anonymousClass1, 0.0f);
        layoutParams.columnSpec = new Spec(new Interval(i, i3 + i), anonymousClass1, 0.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        arrayList.add(child);
        invalidateStructure();
    }

    public final void consistencyCheck() {
        int i = this.mLastLayoutParamsHashCode;
        int iHashCode = 1;
        if (i != 0) {
            int childCount = getChildCount();
            int iHashCode2 = 1;
            for (int i2 = 0; i2 < childCount; i2++) {
                iHashCode2 = (iHashCode2 * 31) + getChildAt(i2).layoutParams.hashCode();
            }
            if (i != iHashCode2) {
                invalidateStructure();
                consistencyCheck();
                return;
            }
            return;
        }
        boolean z = this.mOrientation == 0;
        int i3 = (z ? this.mHorizontalAxis : this.mVerticalAxis).definedCount;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 0;
        }
        int[] iArr = new int[i3];
        int childCount2 = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount2; i6++) {
            LayoutParams layoutParams = getChildAt(i6).layoutParams;
            Interval interval = (z ? layoutParams.rowSpec : layoutParams.columnSpec).span;
            int i7 = interval.max - interval.min;
            Interval interval2 = (z ? layoutParams.columnSpec : layoutParams.rowSpec).span;
            int iMin = interval2.max - interval2.min;
            if (i3 != 0) {
                iMin = Math.min(iMin, i3);
            }
            if (i3 != 0) {
                while (true) {
                    int i8 = i5 + iMin;
                    if (i8 <= i3) {
                        int i9 = i5;
                        while (true) {
                            if (i9 >= i8) {
                                break;
                            } else if (iArr[i9] <= i4) {
                                i9++;
                            }
                        }
                    }
                    if (i8 <= i3) {
                        i5++;
                    } else {
                        i4++;
                        i5 = 0;
                    }
                }
                Arrays.fill(iArr, Math.min(i5, i3), Math.min(i5 + iMin, i3), i4 + i7);
            }
            if (z) {
                Interval interval3 = new Interval(i4, i7 + i4);
                Spec spec = layoutParams.rowSpec;
                spec.getClass();
                layoutParams.rowSpec = new Spec(interval3, spec.alignment, spec.weight);
                Interval interval4 = new Interval(i5, i5 + iMin);
                Spec spec2 = layoutParams.columnSpec;
                spec2.getClass();
                layoutParams.columnSpec = new Spec(interval4, spec2.alignment, spec2.weight);
            } else {
                Interval interval5 = new Interval(i5, i5 + iMin);
                Spec spec3 = layoutParams.rowSpec;
                spec3.getClass();
                layoutParams.rowSpec = new Spec(interval5, spec3.alignment, spec3.weight);
                Interval interval6 = new Interval(i4, i7 + i4);
                Spec spec4 = layoutParams.columnSpec;
                spec4.getClass();
                layoutParams.columnSpec = new Spec(interval6, spec4.alignment, spec4.weight);
            }
            i5 += iMin;
        }
        int childCount3 = getChildCount();
        for (int i10 = 0; i10 < childCount3; i10++) {
            iHashCode = (iHashCode * 31) + getChildAt(i10).layoutParams.hashCode();
        }
        this.mLastLayoutParamsHashCode = iHashCode;
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        TableA11yHelper tableA11yHelper = this.accessibilityHelper;
        if (tableA11yHelper == null || !tableA11yHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public int getAlignmentMode() {
        return this.mAlignmentMode;
    }

    public final Child getChildAt(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.childrens;
        if (i >= arrayList.size()) {
            return null;
        }
        return (Child) arrayList.get(i);
    }

    public int getChildCount() {
        return this.childrens.size();
    }

    public int getColumnCount() {
        Axis axis = this.mHorizontalAxis;
        return Math.max(axis.definedCount, axis.getMaxIndex());
    }

    public final int getMargin(Child child, boolean z, boolean z2) {
        int[] iArr;
        if (this.mAlignmentMode == 1) {
            return getMargin1(child, z, z2);
        }
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        if (z2) {
            if (axis.leadingMargins == null) {
                axis.leadingMargins = new int[Math.max(axis.definedCount, axis.getMaxIndex()) + 1];
            }
            if (!axis.leadingMarginsValid) {
                axis.computeMargins(true);
                axis.leadingMarginsValid = true;
            }
            iArr = axis.leadingMargins;
        } else {
            if (axis.trailingMargins == null) {
                axis.trailingMargins = new int[Math.max(axis.definedCount, axis.getMaxIndex()) + 1];
            }
            if (!axis.trailingMarginsValid) {
                axis.computeMargins(false);
                axis.trailingMarginsValid = true;
            }
            iArr = axis.trailingMargins;
        }
        LayoutParams layoutParams = child.layoutParams;
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        return iArr[z2 ? spec.span.min : spec.span.max];
    }

    public final int getMargin1(Child child, boolean z, boolean z2) {
        int i;
        LayoutParams layoutParams = child.layoutParams;
        if (z) {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin : ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i = z2 ? ((ViewGroup.MarginLayoutParams) layoutParams).topMargin : ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (!this.mUseDefaultMargins) {
            return 0;
        }
        Spec spec = z ? layoutParams.columnSpec : layoutParams.rowSpec;
        Axis axis = z ? this.mHorizontalAxis : this.mVerticalAxis;
        Interval interval = spec.span;
        if ((z && this.isRtl) != z2) {
            return 0;
        }
        Math.max(axis.definedCount, axis.getMaxIndex());
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRenderHeight() {
        return this.drawingHeight;
    }

    public int getRowCount() {
        Axis axis = this.mVerticalAxis;
        return Math.max(axis.definedCount, axis.getMaxIndex());
    }

    public boolean getUseDefaultMargins() {
        return this.mUseDefaultMargins;
    }

    public final void invalidateStructure() {
        this.mLastLayoutParamsHashCode = 0;
        this.mHorizontalAxis.invalidateStructure();
        this.mVerticalAxis.invalidateStructure();
        invalidateValues();
    }

    public final void invalidateValues() {
        Axis axis;
        Axis axis2 = this.mHorizontalAxis;
        if (axis2 == null || (axis = this.mVerticalAxis) == null) {
            return;
        }
        axis2.invalidateValues();
        axis.invalidateValues();
    }

    public final void measureChildrenWithMargins(int i, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Child childAt = getChildAt(i2);
            LayoutParams layoutParams = childAt.layoutParams;
            if (z) {
                int size = View.MeasureSpec.getSize(i);
                childAt.setTextLayout(this.delegate.createTextLayout(childAt.cell, this.colCount == 2 ? ((int) (size / 2.0f)) - (this.itemPaddingLeft * 4) : (int) (size / 1.5f)));
                if (childAt.textLayout != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = Math.max(this.minimumCellHeight, childAt.textHeight + this.itemPaddingTop + this.itemPaddingBottom);
                    int emojiOnlyCount = childAt.textLayout.getEmojiOnlyCount();
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = emojiOnlyCount > 0 ? ((ViewGroup.MarginLayoutParams) layoutParams).height * emojiOnlyCount : (this.itemPaddingLeft * 2) + childAt.textWidth;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                }
                childAt.measure(getMargin(childAt, true, false) + getMargin(childAt, true, true) + ((ViewGroup.MarginLayoutParams) layoutParams).width, getMargin(childAt, false, false) + getMargin(childAt, false, true) + ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
            } else {
                boolean z2 = this.mOrientation == 0;
                Spec spec = z2 ? layoutParams.columnSpec : layoutParams.rowSpec;
                if (Spec.access$2200(spec, z2) == FILL) {
                    int[] locations = (z2 ? this.mHorizontalAxis : this.mVerticalAxis).getLocations();
                    Interval interval = spec.span;
                    int margin = (locations[interval.max] - locations[interval.min]) - (getMargin(childAt, z2, false) + getMargin(childAt, z2, true));
                    if (z2) {
                        CellText cellText = childAt.textLayout;
                        int emojiOnlyCount2 = cellText != null ? cellText.getEmojiOnlyCount() : 0;
                        if (emojiOnlyCount2 > 0) {
                            int iMax = Math.max(1, Math.round(margin / emojiOnlyCount2));
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = iMax;
                            childAt.fixedHeight = iMax;
                        }
                        childAt.measure(getMargin(childAt, true, false) + getMargin(childAt, true, true) + margin, getMargin(childAt, false, false) + getMargin(childAt, false, true) + ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    } else {
                        childAt.measure(getMargin(childAt, true, false) + getMargin(childAt, true, true) + ((ViewGroup.MarginLayoutParams) layoutParams).width, getMargin(childAt, false, false) + getMargin(childAt, false, true) + margin, false);
                    }
                }
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).draw(canvas, this, true);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        consistencyCheck();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int measure;
        int measure2;
        boolean z;
        consistencyCheck();
        invalidateValues();
        this.colCount = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.colCount = Math.max(this.colCount, getChildAt(i3).layoutParams.columnSpec.span.max);
        }
        measureChildrenWithMargins(i, true);
        int i4 = this.mOrientation;
        Axis axis = this.mVerticalAxis;
        Axis axis2 = this.mHorizontalAxis;
        if (i4 == 0) {
            measure = axis2.getMeasure(i);
            if (this.fillWidth) {
                measure = Math.max(measure, View.MeasureSpec.getSize(i));
                axis2.parentMin.value = measure;
                axis2.parentMax.value = -measure;
                axis2.locationsValid = false;
                axis2.getLocations();
            }
            measureChildrenWithMargins(i, false);
            measure2 = axis.getMeasure(i2);
        } else {
            int measure3 = axis.getMeasure(i2);
            measureChildrenWithMargins(i, false);
            measure = axis2.getMeasure(i);
            measure2 = measure3;
        }
        int iMax = Math.max(measure2, getSuggestedMinimumHeight());
        setMeasuredDimension(measure, iMax);
        axis2.parentMin.value = measure;
        axis2.parentMax.value = -measure;
        axis2.locationsValid = false;
        axis2.getLocations();
        axis.parentMin.value = iMax;
        axis.parentMax.value = -iMax;
        axis.locationsValid = false;
        axis.getLocations();
        int[] locations = axis2.getLocations();
        int[] locations2 = axis.getLocations();
        int[] iArrCopyOf = Arrays.copyOf(locations2, locations2.length);
        ArrayList arrayList = this.cellsToFixHeight;
        arrayList.clear();
        int i5 = locations[locations.length - 1];
        int childCount2 = getChildCount();
        int i6 = 0;
        while (i6 < childCount2) {
            Child childAt = getChildAt(i6);
            LayoutParams layoutParams = childAt.layoutParams;
            Spec spec = layoutParams.columnSpec;
            Spec spec2 = layoutParams.rowSpec;
            Interval interval = spec.span;
            Interval interval2 = spec2.span;
            int i7 = iMax;
            int i8 = locations[interval.min];
            int i9 = locations2[interval2.min];
            int i10 = locations[interval.max] - i8;
            int i11 = locations2[interval2.max] - i9;
            int i12 = childAt.measuredWidth;
            int[] iArr = locations;
            int i13 = childAt.measuredHeight;
            AnonymousClass1 anonymousClass1Access$2200 = Spec.access$2200(spec, true);
            AnonymousClass1 anonymousClass1Access$2201 = Spec.access$2200(spec2, false);
            ChatActivity.AnonymousClass117 groupBounds = axis2.getGroupBounds();
            Bounds bounds = (Bounds) ((Object[]) groupBounds.this$0)[((int[]) groupBounds.val$primaryMessage)[i6]];
            ChatActivity.AnonymousClass117 groupBounds2 = axis.getGroupBounds();
            int[] iArr2 = locations2;
            Bounds bounds2 = (Bounds) ((Object[]) groupBounds2.this$0)[((int[]) groupBounds2.val$primaryMessage)[i6]];
            bounds.size(true);
            int gravityOffset = anonymousClass1Access$2200.getGravityOffset();
            bounds2.size(true);
            int gravityOffset2 = anonymousClass1Access$2201.getGravityOffset();
            int margin = getMargin(childAt, true, true);
            Axis axis3 = axis;
            int margin2 = getMargin(childAt, false, true);
            int margin3 = getMargin(childAt, true, false);
            int i14 = margin + margin3;
            int margin4 = margin2 + getMargin(childAt, false, false);
            int offset = bounds.getOffset(childAt, anonymousClass1Access$2200, i12 + i14);
            int offset2 = bounds2.getOffset(childAt, anonymousClass1Access$2201, i13 + margin4);
            int sizeInCell = anonymousClass1Access$2200.getSizeInCell(i12, i10 - i14);
            int sizeInCell2 = anonymousClass1Access$2201.getSizeInCell(i13, i11 - margin4);
            int i15 = i8 + gravityOffset + offset;
            int i16 = !this.isRtl ? margin + i15 : ((i5 - sizeInCell) - margin3) - i15;
            int i17 = i9 + gravityOffset2 + offset2 + margin2;
            if (childAt.cell != null) {
                if (sizeInCell != childAt.measuredWidth || sizeInCell2 != childAt.measuredHeight) {
                    childAt.measure(sizeInCell, sizeInCell2, false);
                }
                int i18 = childAt.fixedHeight;
                if (i18 != 0 && i18 != sizeInCell2) {
                    Interval interval3 = childAt.layoutParams.rowSpec.span;
                    if (interval3.max - interval3.min <= 1) {
                        ArrayList arrayList2 = this.rowSpans;
                        int size = arrayList2.size();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                arrayList.add(childAt);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i19);
                            float f = pointF.x;
                            float f2 = childAt.layoutParams.rowSpec.span.min;
                            if (f <= f2 && pointF.y > f2) {
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                }
            }
            childAt.x = i16;
            childAt.y = i17;
            i6++;
            iMax = i7;
            locations = iArr;
            locations2 = iArr2;
            axis = axis3;
        }
        int i20 = iMax;
        int size2 = arrayList.size();
        int i21 = i20;
        int i22 = 0;
        while (i22 < size2) {
            Child child = (Child) arrayList.get(i22);
            int iMin = child.measuredHeight - child.fixedHeight;
            int i23 = child.index;
            int i24 = i23 + 1;
            ArrayList arrayList3 = this.childrens;
            int size3 = arrayList3.size();
            while (true) {
                if (i24 < size3) {
                    Child child2 = (Child) arrayList3.get(i24);
                    if (child.layoutParams.rowSpec.span.min == child2.layoutParams.rowSpec.span.min) {
                        int i25 = child.fixedHeight;
                        int i26 = child2.fixedHeight;
                        if (i25 < i26) {
                            z = true;
                            break;
                        }
                        int i27 = child2.measuredHeight - i26;
                        if (i27 > 0) {
                            iMin = Math.min(iMin, i27);
                        }
                        i24++;
                    }
                }
                z = false;
                break;
            }
            if (!z) {
                for (int i28 = i23 - 1; i28 >= 0; i28--) {
                    Child child3 = (Child) arrayList3.get(i28);
                    if (child.layoutParams.rowSpec.span.min != child3.layoutParams.rowSpec.span.min) {
                        break;
                    }
                    int i29 = child.fixedHeight;
                    int i30 = child3.fixedHeight;
                    if (i29 < i30) {
                        z = true;
                        break;
                    }
                    int i31 = child3.measuredHeight - i30;
                    if (i31 > 0) {
                        iMin = Math.min(iMin, i31);
                    }
                }
            }
            if (!z) {
                child.measuredHeight = child.fixedHeight;
                child.updateTextY();
                i21 -= iMin;
                int i32 = child.layoutParams.rowSpec.span.min;
                while (true) {
                    i32++;
                    if (i32 >= iArrCopyOf.length) {
                        break;
                    } else {
                        iArrCopyOf[i32] = iArrCopyOf[i32] - iMin;
                    }
                }
                int size4 = arrayList3.size();
                int i33 = i22;
                for (int i34 = 0; i34 < size4; i34++) {
                    Child child4 = (Child) arrayList3.get(i34);
                    if (child != child4) {
                        Interval interval4 = child.layoutParams.rowSpec.span;
                        Interval interval5 = child4.layoutParams.rowSpec.span;
                        int i35 = interval4.min;
                        int i36 = interval5.min;
                        if (i35 == i36) {
                            if (child4.fixedHeight != child4.measuredHeight) {
                                arrayList.remove(child4);
                                if (child4.index < i23) {
                                    i33--;
                                }
                                size2--;
                            }
                            int i37 = child4.measuredHeight - iMin;
                            child4.measuredHeight = i37;
                            child4.measure(child4.measuredWidth, i37, true);
                            size2 = size2;
                        } else if (i35 < i36) {
                            child4.y -= iMin;
                        }
                    }
                }
                i22 = i33;
            }
            i22++;
        }
        int childCount3 = getChildCount();
        for (int i38 = 0; i38 < childCount3; i38++) {
            Child childAt2 = getChildAt(i38);
            this.delegate.onLayoutChild(childAt2.textLayout, childAt2.x + childAt2.textX, childAt2.y + childAt2.textY);
            childAt2.naturalX = childAt2.x;
            childAt2.naturalWidth = childAt2.measuredWidth;
        }
        this.drawingWidth = i5;
        this.drawingHeight = i21;
        this.naturalRowLocations = iArrCopyOf;
        setMeasuredDimension(i5, i21);
    }

    @Override
    public final void requestLayout() {
        super.requestLayout();
        invalidateValues();
    }

    public void setAlignmentMode(int i) {
        this.mAlignmentMode = i;
        super.requestLayout();
        invalidateValues();
    }

    public final void setCellPadding(int i, int i2, int i3) {
        if (this.itemPaddingLeft == i && this.itemPaddingTop == i2 && this.itemPaddingBottom == i3) {
            return;
        }
        this.itemPaddingLeft = i;
        this.itemPaddingTop = i2;
        this.itemPaddingBottom = i3;
        super.requestLayout();
        invalidateValues();
    }

    public void setColumnCount(int i) {
        Axis axis = this.mHorizontalAxis;
        if (i != Integer.MIN_VALUE && i < axis.getMaxIndex()) {
            throw new IllegalArgumentException(zzhr.m((axis.horizontal ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        axis.definedCount = i;
        invalidateStructure();
        super.requestLayout();
        invalidateValues();
    }

    public void setColumnOrderPreserved(boolean z) {
        Axis axis = this.mHorizontalAxis;
        axis.orderPreserved = z;
        axis.invalidateStructure();
        invalidateStructure();
        super.requestLayout();
        invalidateValues();
    }

    public void setDrawLines(boolean z) {
        this.drawLines = z;
    }

    public void setFillWidth(boolean z) {
        if (this.fillWidth == z) {
            return;
        }
        this.fillWidth = z;
        super.requestLayout();
        invalidateValues();
    }

    public void setMinimumCellHeight(int i) {
        this.minimumCellHeight = i;
        super.requestLayout();
        invalidateValues();
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            invalidateStructure();
            super.requestLayout();
            invalidateValues();
        }
    }

    public void setRenderWidth(int i) {
        int i2;
        int measuredWidth = getMeasuredWidth();
        this.drawingWidth = Math.max(measuredWidth, i);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            Child childAt = getChildAt(i3);
            if (measuredWidth <= 0 || (i2 = this.drawingWidth) == measuredWidth) {
                int i4 = childAt.naturalX;
                int i5 = childAt.naturalWidth + i4;
                childAt.x = i4;
                childAt.measuredWidth = Math.max(0, i5 - i4);
                if (childAt.cell != null && childAt.textLayout != null) {
                    childAt.updateTextX();
                }
            } else {
                float f = measuredWidth;
                int iRound = Math.round((childAt.naturalX * i2) / f);
                int iRound2 = Math.round(((childAt.naturalX + childAt.naturalWidth) * this.drawingWidth) / f);
                childAt.x = iRound;
                childAt.measuredWidth = Math.max(0, iRound2 - iRound);
                if (childAt.cell != null && childAt.textLayout != null) {
                    childAt.updateTextX();
                }
            }
        }
        int[] iArr = this.naturalRowLocations;
        if (iArr.length < 2) {
            this.drawingHeight = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i6 = length - 1;
            int[] iArr2 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int[] iArr3 = this.naturalRowLocations;
                int i8 = i7 + 1;
                iArr2[i7] = iArr3[i8] - iArr3[i7];
                i7 = i8;
            }
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                Child childAt2 = getChildAt(i9);
                CellText cellText = childAt2.textLayout;
                int emojiOnlyCount = cellText != null ? cellText.getEmojiOnlyCount() : 0;
                if (emojiOnlyCount > 0) {
                    Interval interval = childAt2.layoutParams.rowSpec.span;
                    int iMax = Math.max(0, interval.min);
                    int iMin = Math.min(i6, interval.max);
                    if (iMax < iMin) {
                        int i10 = 0;
                        for (int i11 = iMax; i11 < iMin; i11++) {
                            i10 += iArr2[i11];
                        }
                        int iMax2 = Math.max(1, Math.round(childAt2.measuredWidth / emojiOnlyCount)) - i10;
                        while (iMax < iMin && iMax2 > 0) {
                            int i12 = iMin - iMax;
                            int i13 = ((iMax2 + i12) - 1) / i12;
                            iArr2[iMax] = iArr2[iMax] + i13;
                            iMax2 -= i13;
                            iMax++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i14 = 0;
            while (i14 < i6) {
                int i15 = i14 + 1;
                iArr4[i15] = iArr4[i14] + iArr2[i14];
                i14 = i15;
            }
            this.drawingHeight = iArr4[i6];
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                Child childAt3 = getChildAt(i16);
                Interval interval2 = childAt3.layoutParams.rowSpec.span;
                int iMax3 = Math.max(0, Math.min(i6, interval2.min));
                int iMax4 = Math.max(iMax3, Math.min(i6, interval2.max));
                int i17 = iArr4[iMax3];
                int i18 = iArr4[iMax4];
                childAt3.y = i17;
                childAt3.measuredHeight = Math.max(0, i18 - i17);
                if (childAt3.cell != null) {
                    childAt3.updateTextY();
                }
                this.delegate.onLayoutChild(childAt3.textLayout, childAt3.x + childAt3.textX, childAt3.y + childAt3.textY);
            }
        }
        invalidate();
    }

    public void setRowCount(int i) {
        Axis axis = this.mVerticalAxis;
        if (i != Integer.MIN_VALUE && i < axis.getMaxIndex()) {
            throw new IllegalArgumentException(zzhr.m((axis.horizontal ? "column" : "row").concat("Count must be greater than or equal to the maximum of all grid indices (and spans) defined in the LayoutParams of each child"), ". "));
        }
        axis.definedCount = i;
        invalidateStructure();
        super.requestLayout();
        invalidateValues();
    }

    public void setRowOrderPreserved(boolean z) {
        Axis axis = this.mVerticalAxis;
        axis.orderPreserved = z;
        axis.invalidateStructure();
        invalidateStructure();
        super.requestLayout();
        invalidateValues();
    }

    public void setRtl(boolean z) {
        this.isRtl = z;
    }

    public void setStriped(boolean z) {
        this.isStriped = z;
    }

    public void setUseDefaultMargins(boolean z) {
        this.mUseDefaultMargins = z;
        super.requestLayout();
        invalidateValues();
    }

    public final void addChild(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.childrens;
        Child child = new Child(arrayList.size());
        child.cell = pagetablecell;
        LayoutParams layoutParams = new LayoutParams();
        int i4 = pagetablecell.rowspan;
        if (i4 == 0) {
            i4 = 1;
        }
        Interval interval = new Interval(i2, i4 + i2);
        AnonymousClass1 anonymousClass1 = FILL;
        layoutParams.rowSpec = new Spec(interval, anonymousClass1, 0.0f);
        layoutParams.columnSpec = new Spec(new Interval(i, i3 + i), anonymousClass1, 1.0f);
        child.layoutParams = layoutParams;
        child.rowspan = i2;
        arrayList.add(child);
        int i5 = pagetablecell.rowspan;
        if (i5 > 1) {
            this.rowSpans.add(new PointF(i2, i2 + i5));
        }
        invalidateStructure();
    }
}
