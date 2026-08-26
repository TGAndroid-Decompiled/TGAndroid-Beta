package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
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
import org.telegram.ui.PollItemMenu;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;

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
        view.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 12));
        addView(view, LayoutHelper.createFrame(-1, -2, 51));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new PollItemMenu.AnonymousClass6(this, 13));
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        updateColors$1();
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
        if (delegate != null && (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(this);
            if (childAdapterPosition >= 0 && childAdapterPosition > textSelectionHelper.startViewPosition && childAdapterPosition <= textSelectionHelper.endViewPosition) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.mapImageH, this.selectionPaint);
            }
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
    public final void updateColors$1() {
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
