package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.iv.RichCaptionController;

public class RichMapCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost {
    private final Paint backgroundPaint;
    private final RichCaptionController caption;
    private final View clickView;
    private final int currentAccount;
    private int currentMapProvider;
    private BlockRow currentRow;
    private Delegate delegate;
    private final TextPaint hintPaint;
    private final ImageReceiver imageReceiver;
    private String loadedKey;
    private int mapImageH;
    private final Drawable placeholderIcon;
    private final Paint placeholderPaint;
    private Drawable redPinIcon;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onCaptionChanged(BlockRow blockRow);

        void onCaptionEnter(BlockRow blockRow);

        void onCaptionLockedInsert(CharSequence charSequence);

        boolean onCaptionSelectAll(BlockRow blockRow);

        void onCaptionSpansChanged(BlockRow blockRow);

        void onCaptionWillChange(BlockRow blockRow, int i, int i2);

        void onPickLocation(BlockRow blockRow);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);
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
        setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.clickView = view;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$0(view2);
            }
        });
        addView(view, LayoutHelper.createFrame(-1, -2, 51));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new RichCaptionController.Host() {
            @Override
            public BlockRow currentRow() {
                return RichMapCell.this.currentRow;
            }

            @Override
            public TextSelectionHelper.ArticleTextSelectionHelper selectionHelper() {
                if (RichMapCell.this.delegate != null) {
                    return RichMapCell.this.delegate.getSelectionHelper();
                }
                return null;
            }

            @Override
            public TextSelectionHelper.ArticleSelectableView cell() {
                return RichMapCell.this;
            }

            @Override
            public void onCaptionWillChange(int i2, int i3) {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onCaptionWillChange(RichMapCell.this.currentRow, i2, i3);
                }
            }

            @Override
            public void onCaptionChanged() {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onCaptionChanged(RichMapCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionSpansChanged() {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onCaptionSpansChanged(RichMapCell.this.currentRow);
                }
            }

            @Override
            public void onCaptionEnter() {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onCaptionEnter(RichMapCell.this.currentRow);
                }
            }

            @Override
            public void onRequestWindowFocusable(RichEditText richEditText, boolean z) {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onRequestWindowFocusable(richEditText, z);
                }
            }

            @Override
            public void onCaptionLockedInsert(CharSequence charSequence) {
                if (RichMapCell.this.delegate != null) {
                    RichMapCell.this.delegate.onCaptionLockedInsert(charSequence);
                }
            }

            @Override
            public boolean onCaptionSelectAll() {
                return RichMapCell.this.delegate != null && RichMapCell.this.delegate.onCaptionSelectAll(RichMapCell.this.currentRow);
            }
        });
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors();
    }

    public void lambda$new$0(View view) {
        Delegate delegate;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null || (delegate = this.delegate) == null) {
            return;
        }
        delegate.onPickLocation(blockRow);
    }

    public void bind(BlockRow blockRow, Delegate delegate) {
        this.currentRow = blockRow;
        this.delegate = delegate;
        this.loadedKey = null;
        this.caption.bind();
        loadMapImage();
        requestLayout();
        invalidate();
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    @Override
    public void persistCaption() {
        this.caption.persist();
    }

    @Override
    public boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
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

    private boolean hasLocation() {
        return hasGeo(getMap());
    }

    public static boolean hasGeo(TL_iv.pageBlockMap pageblockmap) {
        return pageblockmap != null && (pageblockmap.geo instanceof TLRPC.TL_geoPoint);
    }

    private void loadMapImage() {
        TL_iv.pageBlockMap map = getMap();
        if (!hasGeo(map)) {
            this.imageReceiver.setImageBitmap((Drawable) null);
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
            this.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i2, i3, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
        } else {
            int i5 = this.currentAccount;
            TLRPC.GeoPoint geoPoint = map.geo;
            this.imageReceiver.setImage(AndroidUtilities.formapMapUrl(i5, geoPoint.lat, geoPoint._long, i2, i3, true, 15, -1), null, null, null, 0L);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
        this.loadedKey = null;
        loadMapImage();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    @Override
    public void updateColors() {
        this.backgroundPaint.setColor(Theme.getColor(Theme.key_chat_inLocationBackground, this.resourcesProvider));
        this.placeholderPaint.setColor(Theme.getColor(Theme.key_chat_inFileBackground, this.resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
        TextPaint textPaint = this.hintPaint;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textPaint.setColor(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.5f));
        this.placeholderIcon.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(Theme.getColor(i, this.resourcesProvider), 0.5f), PorterDuff.Mode.SRC_IN));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.w > 0 && map.h > 0) {
            this.mapImageH = Math.max(Math.min((int) (((size - AndroidUtilities.dp(32.0f)) * map.h) / map.w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        } else {
            this.mapImageH = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        }
        int iMeasure = this.caption.measure(size);
        this.clickView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mapImageH, 1073741824));
        setMeasuredDimension(size, getPaddingTop() + this.mapImageH + iMeasure + getPaddingBottom());
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        this.imageReceiver.setImageCoords(0.0f, getPaddingTop(), i5, this.mapImageH);
        this.clickView.layout(0, getPaddingTop(), i5, getPaddingTop() + this.mapImageH);
        this.caption.layout(i5, getPaddingTop() + this.mapImageH);
        loadMapImage();
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition > selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (getMap() != null) {
            canvas.drawRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX2(), this.imageReceiver.getImageY2(), this.backgroundPaint);
            int centerX = (int) this.imageReceiver.getCenterX();
            int centerY = (int) this.imageReceiver.getCenterY();
            Drawable drawable = this.placeholderIcon;
            if (drawable != null) {
                int intrinsicWidth = centerX - (drawable.getIntrinsicWidth() / 2);
                int intrinsicHeight = centerY - (this.placeholderIcon.getIntrinsicHeight() / 2);
                Drawable drawable2 = this.placeholderIcon;
                drawable2.setBounds(intrinsicWidth, intrinsicHeight, drawable2.getIntrinsicWidth() + intrinsicWidth, this.placeholderIcon.getIntrinsicHeight() + intrinsicHeight);
                this.placeholderIcon.draw(canvas);
            }
            if (hasLocation()) {
                this.imageReceiver.draw(canvas);
                if (this.currentMapProvider == 2 && this.imageReceiver.hasNotThumb()) {
                    if (this.redPinIcon == null) {
                        this.redPinIcon = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth2 = (int) (this.redPinIcon.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight2 = (int) (this.redPinIcon.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (this.imageReceiver.getCenterX() - (intrinsicWidth2 / 2.0f));
                    int centerY2 = (int) (this.imageReceiver.getCenterY() - intrinsicHeight2);
                    this.redPinIcon.setAlpha((int) (this.imageReceiver.getCurrentAlpha() * 255.0f));
                    this.redPinIcon.setBounds(centerX2, centerY2, intrinsicWidth2 + centerX2, intrinsicHeight2 + centerY2);
                    this.redPinIcon.draw(canvas);
                }
            }
        }
        if (isCellSelected()) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.mapImageH, this.selectionPaint);
        }
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    public static final class Factory extends UItem.UItemFactory {
        @Override
        public boolean isClickable() {
            return false;
        }

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public RichMapCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichMapCell(context, i, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichMapCell) view).bind((BlockRow) uItem.object, (Delegate) uItem.object2);
        }

        public static UItem of(BlockRow blockRow, Delegate delegate) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            uItemOfFactory.object2 = delegate;
            return uItemOfFactory;
        }
    }
}
