package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.stripe.android.Stripe;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.aspectj.runtime.reflect.MethodSignatureImpl;
import org.aspectj.runtime.reflect.StringMaker;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.Views.MaskPaintView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class RichMapCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost {
    public static final int $r8$clinit = 0;
    public final Paint backgroundPaint;
    public final RichCaptionController caption;
    public final View clickView;
    public final int currentAccount;
    public int currentMapProvider;
    public Delegate delegate;
    public final TextPaint hintPaint;
    public final ImageReceiver imageReceiver;
    public String loadedKey;
    public int mapImageH;
    public final Drawable placeholderIcon;
    public final Paint placeholderPaint;
    public Drawable redPinIcon;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint selectionPaint;

    public final class AnonymousClass1 implements ListenerHolder.Notifier, Continuation, ObjectConstructor, PaintWeightChooserView.ValueOverride, RichCaptionController.Host {
        public final int $r8$classId;
        public Object this$0;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override
        public TextSelectionHelper.ArticleSelectableView cell() {
            switch (this.$r8$classId) {
                case 0:
                    return (RichMapCell) this.this$0;
                default:
                    return (RichDocumentCell) this.this$0;
            }
        }

        @Override
        public Object construct() {
            Type type = (Type) this.this$0;
            if (!(type instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + type.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }

        @Override
        public BlockRow currentRow() {
            switch (this.$r8$classId) {
                case 0:
                    return ((RichMapCell) this.this$0).currentRow;
                default:
                    return ((RichDocumentCell) this.this$0).currentRow;
            }
        }

        public int decodeWithECCount(int i, int[] iArr) throws ReedSolomonException {
            int[] iArr2;
            GenericGF genericGF;
            int[] iArr3;
            int i2;
            if (iArr.length == 0) {
                throw new IllegalArgumentException();
            }
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                iArr2 = iArr;
            } else {
                int i3 = 1;
                while (i3 < length && iArr[i3] == 0) {
                    i3++;
                }
                if (i3 == length) {
                    iArr2 = new int[]{0};
                } else {
                    int i4 = length - i3;
                    int[] iArr4 = new int[i4];
                    System.arraycopy(iArr, i3, iArr4, 0, i4);
                    iArr2 = iArr4;
                }
            }
            int[] iArr5 = new int[i];
            int i5 = 0;
            boolean z = true;
            while (true) {
                genericGF = (GenericGF) this.this$0;
                if (i5 >= i) {
                    break;
                }
                int i6 = genericGF.expTable[genericGF.generatorBase + i5];
                if (i6 == 0) {
                    i2 = iArr2[iArr2.length - 1];
                } else if (i6 == 1) {
                    int i7 = 0;
                    for (int i8 : iArr2) {
                        GenericGF genericGF2 = GenericGF.QR_CODE_FIELD_256;
                        i7 ^= i8;
                    }
                    i2 = i7;
                } else {
                    int iMultiply = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        iMultiply = genericGF.multiply(i6, iMultiply) ^ iArr2[i9];
                    }
                    i2 = iMultiply;
                }
                iArr5[(i - 1) - i5] = i2;
                if (i2 != 0) {
                    z = false;
                }
                i5++;
            }
            if (z) {
                return 0;
            }
            GenericGFPoly genericGFPoly = new GenericGFPoly(genericGF, iArr5);
            GenericGFPoly genericGFPolyBuildMonomial = genericGF.buildMonomial(i, 1);
            if (genericGFPolyBuildMonomial.getDegree() >= genericGFPoly.getDegree()) {
                genericGFPolyBuildMonomial = genericGFPoly;
                genericGFPoly = genericGFPolyBuildMonomial;
            }
            GenericGFPoly genericGFPoly2 = genericGF.zero;
            GenericGFPoly genericGFPoly3 = genericGF.one;
            GenericGFPoly genericGFPoly4 = genericGFPolyBuildMonomial;
            GenericGFPoly genericGFPolyAddOrSubtract = genericGFPoly;
            GenericGFPoly genericGFPoly5 = genericGFPoly4;
            GenericGFPoly genericGFPoly6 = genericGFPoly2;
            while (genericGFPoly5.getDegree() * 2 >= i) {
                if (genericGFPoly5.isZero()) {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
                int iInverse = genericGF.inverse(genericGFPoly5.getCoefficient(genericGFPoly5.getDegree()));
                GenericGFPoly genericGFPolyAddOrSubtract2 = genericGFPoly2;
                while (genericGFPolyAddOrSubtract.getDegree() >= genericGFPoly5.getDegree() && !genericGFPolyAddOrSubtract.isZero()) {
                    int degree = genericGFPolyAddOrSubtract.getDegree() - genericGFPoly5.getDegree();
                    int iMultiply2 = genericGF.multiply(genericGFPolyAddOrSubtract.getCoefficient(genericGFPolyAddOrSubtract.getDegree()), iInverse);
                    genericGFPolyAddOrSubtract2 = genericGFPolyAddOrSubtract2.addOrSubtract(genericGF.buildMonomial(degree, iMultiply2));
                    genericGFPolyAddOrSubtract = genericGFPolyAddOrSubtract.addOrSubtract(genericGFPoly5.multiplyByMonomial(degree, iMultiply2));
                }
                GenericGFPoly genericGFPolyAddOrSubtract3 = genericGFPolyAddOrSubtract2.multiply(genericGFPoly3).addOrSubtract(genericGFPoly6);
                if (genericGFPolyAddOrSubtract.getDegree() >= genericGFPoly5.getDegree()) {
                    throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + genericGFPolyAddOrSubtract + ", rLast: " + genericGFPoly5);
                }
                GenericGFPoly genericGFPoly7 = genericGFPolyAddOrSubtract;
                genericGFPolyAddOrSubtract = genericGFPoly5;
                genericGFPoly5 = genericGFPoly7;
                genericGFPoly6 = genericGFPoly3;
                genericGFPoly3 = genericGFPolyAddOrSubtract3;
            }
            int coefficient = genericGFPoly3.getCoefficient(0);
            if (coefficient == 0) {
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
            int iInverse2 = genericGF.inverse(coefficient);
            GenericGFPoly[] genericGFPolyArr = {genericGFPoly3.multiply(iInverse2), genericGFPoly5.multiply(iInverse2)};
            GenericGFPoly genericGFPoly8 = genericGFPolyArr[0];
            GenericGFPoly genericGFPoly9 = genericGFPolyArr[1];
            int degree2 = genericGFPoly8.getDegree();
            if (degree2 == 1) {
                iArr3 = new int[]{genericGFPoly8.getCoefficient(1)};
            } else {
                int[] iArr6 = new int[degree2];
                int i10 = 0;
                for (int i11 = 1; i11 < genericGF.size && i10 < degree2; i11++) {
                    if (genericGFPoly8.evaluateAt(i11) == 0) {
                        iArr6[i10] = genericGF.inverse(i11);
                        i10++;
                    }
                }
                if (i10 != degree2) {
                    throw new ReedSolomonException("Error locator degree does not match number of roots");
                }
                iArr3 = iArr6;
            }
            int length3 = iArr3.length;
            int[] iArr7 = new int[length3];
            for (int i12 = 0; i12 < length3; i12++) {
                int iInverse3 = genericGF.inverse(iArr3[i12]);
                int iMultiply3 = 1;
                for (int i13 = 0; i13 < length3; i13++) {
                    if (i12 != i13) {
                        int iMultiply4 = genericGF.multiply(iArr3[i13], iInverse3);
                        iMultiply3 = genericGF.multiply(iMultiply3, (iMultiply4 & 1) == 0 ? iMultiply4 | 1 : iMultiply4 & (-2));
                    }
                }
                int iMultiply5 = genericGF.multiply(genericGFPoly9.evaluateAt(iInverse3), genericGF.inverse(iMultiply3));
                iArr7[i12] = iMultiply5;
                if (genericGF.generatorBase != 0) {
                    iArr7[i12] = genericGF.multiply(iMultiply5, iInverse3);
                }
            }
            for (int i14 = 0; i14 < iArr3.length; i14++) {
                int length4 = iArr.length - 1;
                int i15 = iArr3[i14];
                if (i15 == 0) {
                    throw new IllegalArgumentException();
                }
                int i16 = length4 - genericGF.logTable[i15];
                if (i16 < 0) {
                    throw new ReedSolomonException("Bad error location");
                }
                iArr[i16] = iArr[i16] ^ iArr7[i14];
            }
            return iArr3.length;
        }

        @Override
        public float get() {
            switch (this.$r8$classId) {
                case 13:
                    MaskPaintView maskPaintView = (MaskPaintView) this.this$0;
                    Brush currentBrush = maskPaintView.renderView.getCurrentBrush();
                    if (currentBrush == null) {
                        return PersistColorPalette.getInstance(maskPaintView.currentAccount).currentWeight;
                    }
                    return PersistColorPalette.getInstance(maskPaintView.currentAccount).mConfig.getFloat("weight_-1", currentBrush.getDefaultWeight());
                default:
                    StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.this$0;
                    Brush currentBrush2 = anonymousClass24.renderView.getCurrentBrush();
                    int i = anonymousClass24.currentAccount;
                    if (currentBrush2 == null) {
                        return PersistColorPalette.getInstance(i).currentWeight;
                    }
                    PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
                    String strValueOf = String.valueOf(Brush.BRUSHES_LIST.indexOf(currentBrush2));
                    float defaultWeight = currentBrush2.getDefaultWeight();
                    return persistColorPalette.mConfig.getFloat("weight_" + strValueOf, defaultWeight);
            }
        }

        public Boolean getSessionEnabled() {
            Bundle bundle = (Bundle) this.this$0;
            if (bundle.containsKey("firebase_sessions_enabled")) {
                return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
            }
            return null;
        }

        @Override
        public void notifyListener(Object obj) {
            ((LocationCallback) obj).onLocationAvailability((LocationAvailability) this.this$0);
        }

        @Override
        public void onCaptionChanged() {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null) {
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            richEditorHistory.onTyping();
                        }
                        richEditorListView.delegate.onContentChanged();
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 != null) {
                        RichEditorListView richEditorListView2 = RichEditorListView.this;
                        RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.onTyping();
                        }
                        richEditorListView2.delegate.onContentChanged();
                    }
                    break;
            }
        }

        @Override
        public void onCaptionEnter() {
            switch (this.$r8$classId) {
                case 0:
                    RichMapCell richMapCell = (RichMapCell) this.this$0;
                    Delegate delegate = richMapCell.delegate;
                    if (delegate != null) {
                        RichEditorListView.this.onCaptionEnter(richMapCell.currentRow);
                    }
                    break;
                default:
                    RichDocumentCell richDocumentCell = (RichDocumentCell) this.this$0;
                    RichEditorListView.AnonymousClass8 anonymousClass8 = richDocumentCell.delegate;
                    if (anonymousClass8 != null) {
                        RichEditorListView.this.onCaptionEnter(richDocumentCell.currentRow);
                    }
                    break;
            }
        }

        @Override
        public void onCaptionLockedInsert(CharSequence charSequence) {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null) {
                        RichEditorListView.AnonymousClass9 anonymousClass9 = (RichEditorListView.AnonymousClass9) delegate;
                        if (charSequence != null && charSequence.length() > 0) {
                            RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
                            break;
                        }
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 != null && charSequence != null && charSequence.length() > 0) {
                        RichEditorListView.this.replaceHelperSelectionWith(charSequence.toString());
                        break;
                    }
                    break;
            }
        }

        @Override
        public boolean onCaptionSelectAll() {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    return delegate != null && RichEditorListView.this.tryEscalateSelectAll();
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    return anonymousClass8 != null && RichEditorListView.this.tryEscalateSelectAll();
            }
        }

        @Override
        public void onCaptionSpansChanged() {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null) {
                        RichEditorListView.access$3700(RichEditorListView.this);
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 != null) {
                        RichEditorListView.access$3700(RichEditorListView.this);
                    }
                    break;
            }
        }

        @Override
        public void onCaptionWillChange(int i, int i2) {
            RichEditorHistory richEditorHistory;
            RichEditorHistory richEditorHistory2;
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null && (richEditorHistory = RichEditorListView.this.history) != null) {
                        richEditorHistory.onBeforeChange(i, i2);
                        break;
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 != null && (richEditorHistory2 = RichEditorListView.this.history) != null) {
                        richEditorHistory2.onBeforeChange(i, i2);
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onRequestWindowFocusable(RichEditText richEditText) {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null) {
                        RichEditorListView richEditorListView = RichEditorListView.this;
                        richEditorListView.prepareEditText(richEditText);
                        richEditorListView.delegate.makeEditTextFocusable(richEditText);
                    }
                    break;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 != null) {
                        RichEditorListView richEditorListView2 = RichEditorListView.this;
                        richEditorListView2.prepareEditText(richEditText);
                        richEditorListView2.delegate.makeEditTextFocusable(richEditText);
                    }
                    break;
            }
        }

        @Override
        public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
            switch (this.$r8$classId) {
                case 0:
                    Delegate delegate = ((RichMapCell) this.this$0).delegate;
                    if (delegate != null) {
                        return RichEditorListView.this.getTextSelectionHelper();
                    }
                    return null;
                default:
                    RichEditorListView.AnonymousClass8 anonymousClass8 = ((RichDocumentCell) this.this$0).delegate;
                    if (anonymousClass8 == null) {
                        return null;
                    }
                    return RichEditorListView.this.getTextSelectionHelper();
            }
        }

        @Override
        public void set(float f) {
            switch (this.$r8$classId) {
                case 13:
                    MaskPaintView maskPaintView = (MaskPaintView) this.this$0;
                    PersistColorPalette.getInstance(maskPaintView.currentAccount).setWeight("-1", f);
                    maskPaintView.renderView.setBrushSize(f);
                    break;
                default:
                    StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) this.this$0;
                    PersistColorPalette.getInstance(anonymousClass24.currentAccount).setWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(anonymousClass24.renderView.getCurrentBrush())), f);
                    Swatch swatch = anonymousClass24.colorSwatch;
                    swatch.brushWeight = f;
                    anonymousClass24.setCurrentSwatch(null, swatch, false);
                    break;
            }
        }

        @Override
        public Object then(Task task) {
            return ((Callable) this.this$0).call();
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 11:
                    StringMaker stringMaker = StringMaker.middleStringMaker;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("method-execution".substring(7));
                    stringBuffer.append("(");
                    stringBuffer.append(((MethodSignatureImpl) this.this$0).toString$1());
                    stringBuffer.append(")");
                    return stringBuffer.toString();
                default:
                    return super.toString();
            }
        }

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass1() {
            this.$r8$classId = 12;
            this.this$0 = new Stripe[AmountUtils$Currency.values().length];
        }

        public AnonymousClass1(IObjectWrapper iObjectWrapper) {
            this.$r8$classId = 3;
            zzah.checkNotNull(iObjectWrapper);
            this.this$0 = iObjectWrapper;
        }

        public AnonymousClass1(Context context) {
            this.$r8$classId = 8;
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            this.this$0 = bundle == null ? Bundle.EMPTY : bundle;
        }
    }

    public interface Delegate {
    }

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichMapCell richMapCell = (RichMapCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            Delegate delegate = (Delegate) uItem.object2;
            richMapCell.currentRow = blockRow;
            richMapCell.delegate = delegate;
            richMapCell.bindBlockInset(blockRow);
            richMapCell.loadedKey = null;
            richMapCell.caption.bind();
            richMapCell.loadMapImage();
            richMapCell.requestLayout();
            richMapCell.invalidate();
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichMapCell(context, i, resourcesProvider);
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichMapCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.placeholderPaint = new Paint(1);
        this.selectionPaint = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.hintPaint = textPaint;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.imageReceiver = new ImageReceiver(this);
        this.placeholderIcon = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        setBlockPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.clickView = view;
        view.setOnClickListener(new RichMapCell$$ExternalSyntheticLambda0(this, 0));
        addView(view, LayoutHelper.createFrame(-1, -2, 51));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new AnonymousClass1(this, 0));
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return (TL_iv.pageBlockMap) pageBlock;
        }
        return null;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public final boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
    }

    public final void loadMapImage() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.imageReceiver;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.setImageBitmap((Drawable) null);
            this.loadedKey = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i = this.mapImageH;
        if (measuredWidth <= 0 || i <= 0) {
            return;
        }
        float f = AndroidUtilities.density;
        int i2 = (int) (measuredWidth / f);
        int i3 = (int) (i / f);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i2 + "x" + i3;
        if (str.equals(this.loadedKey)) {
            return;
        }
        this.loadedKey = str;
        int i4 = MessagesController.getInstance(this.currentAccount).mapProvider;
        this.currentMapProvider = i4;
        if (i4 == 2) {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i2, i3, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.currentAccount, geoPoint.lat, geoPoint._long, i2, i3, true, 15, -1), null, null, null, 0L);
    }

    @Override
    public final int nestedContentMargin() {
        return 0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
        this.loadedKey = null;
        loadMapImage();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        int childAdapterPosition;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.imageReceiver;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.backgroundPaint);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.placeholderIcon;
            if (drawable != null) {
                int intrinsicWidth = centerX - (drawable.getIntrinsicWidth() / 2);
                int intrinsicHeight = centerY - (drawable.getIntrinsicHeight() / 2);
                drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.currentMapProvider == 2 && imageReceiver.hasNotThumb()) {
                    if (this.redPinIcon == null) {
                        this.redPinIcon = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth2 = (int) (this.redPinIcon.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth2 / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight2);
                    this.redPinIcon.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(centerX2, centerY2, intrinsicWidth2 + centerX2, intrinsicHeight2 + centerY2);
                    this.redPinIcon.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        Delegate delegate = this.delegate;
        if (delegate != null && (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition > textSelectionHelper.startViewPosition && childAdapterPosition <= textSelectionHelper.endViewPosition) {
            canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.mapImageH, this.selectionPaint);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int iMax = Math.max(0, (i5 - paddingLeft) - paddingRight);
        this.imageReceiver.setImageCoords(paddingLeft, getPaddingTop(), iMax, this.mapImageH);
        this.clickView.layout(paddingLeft, getPaddingTop(), iMax + paddingLeft, getPaddingTop() + this.mapImageH);
        this.caption.layout(paddingLeft, paddingRight, i5, getPaddingTop() + this.mapImageH);
        loadMapImage();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iMax = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.mapImageH = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.mapImageH = Math.max(Math.min((int) ((((long) (iMax - AndroidUtilities.dp(32.0f))) * ((long) map.h)) / ((long) map.w)), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        }
        int iMeasure = this.caption.measure(paddingLeft, paddingRight, size);
        this.clickView.measure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mapImageH, 1073741824));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.mapImageH + iMeasure);
    }

    @Override
    public final void persistCaption() {
        this.caption.persist();
    }

    @Override
    public final void updateColors() {
        int i = Theme.key_chat_inLocationBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.backgroundPaint.setColor(Theme.getColor(i, resourcesProvider));
        this.placeholderPaint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        this.hintPaint.setColor(Theme.multAlpha(0.5f, Theme.getColor(i2, resourcesProvider)));
        this.placeholderIcon.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.5f, Theme.getColor(i2, resourcesProvider)), PorterDuff.Mode.SRC_IN));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }
}
