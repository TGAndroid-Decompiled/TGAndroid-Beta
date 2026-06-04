package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
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

public class RichMapCell extends FrameLayout implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView {
    private final Paint backgroundPaint;
    private final View clickView;
    private final int currentAccount;
    private int currentMapProvider;
    private BlockRow currentRow;
    private Delegate delegate;
    private final TextPaint hintPaint;
    private final ImageReceiver imageReceiver;
    private String loadedKey;
    private final Drawable placeholderIcon;
    private final Paint placeholderPaint;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Paint selectionPaint;
    private Layout stubLayout;
    private final TextPaint stubPaint;

    public interface Delegate {
        TextSelectionHelper.ArticleTextSelectionHelper getSelectionHelper();

        void onPickLocation(BlockRow blockRow);
    }

    public RichMapCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.placeholderPaint = new Paint(1);
        this.selectionPaint = new Paint(1);
        TextPaint textPaint = new TextPaint();
        this.stubPaint = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.hintPaint = textPaint2;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        textPaint.setTextSize(1.0f);
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTextAlign(Paint.Align.CENTER);
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
        addView(view, LayoutHelper.createFrame(-1, -1, 119));
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
        loadMapImage();
        requestLayout();
        invalidate();
    }

    public BlockRow getRow() {
        return this.currentRow;
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
        TL_iv.pageBlockMap map = getMap();
        return (map == null || map.geo == null) ? false : true;
    }

    private void loadMapImage() {
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.geo == null) {
            this.imageReceiver.setImageBitmap((Drawable) null);
            this.loadedKey = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        float f = AndroidUtilities.density;
        int i = (int) (measuredWidth / f);
        int i2 = (int) (measuredHeight / f);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i + "x" + i2;
        if (str.equals(this.loadedKey)) {
            return;
        }
        this.loadedKey = str;
        int i3 = MessagesController.getInstance(this.currentAccount).mapProvider;
        this.currentMapProvider = i3;
        if (i3 == 2) {
            this.imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i, i2, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
        } else {
            int i4 = this.currentAccount;
            TLRPC.GeoPoint geoPoint = map.geo;
            this.imageReceiver.setImage(AndroidUtilities.formapMapUrl(i4, geoPoint.lat, geoPoint._long, i, i2, true, 15, -1), null, null, null, 0L);
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
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(200.0f);
        TL_iv.pageBlockMap map = getMap();
        if (map != null && map.w > 0 && map.h > 0) {
            iDp = Math.max(Math.min((int) (((size - AndroidUtilities.dp(32.0f)) * map.h) / map.w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f)) + getPaddingTop() + getPaddingBottom();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.imageReceiver.setImageCoords(0.0f, getPaddingTop(), i3 - i, ((i4 - i2) - getPaddingTop()) - getPaddingBottom());
        loadMapImage();
    }

    private boolean isCellSelected() {
        TextSelectionHelper.ArticleTextSelectionHelper selectionHelper;
        int childAdapterPosition;
        Delegate delegate = this.delegate;
        return delegate != null && (selectionHelper = delegate.getSelectionHelper()) != null && selectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView) && (childAdapterPosition = ((RecyclerView) getParent()).getChildAdapterPosition(this)) >= 0 && childAdapterPosition >= selectionHelper.getStartCell() && childAdapterPosition <= selectionHelper.getEndCell();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        if (!hasLocation()) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.placeholderPaint);
            int iDp = AndroidUtilities.dp(40.0f);
            int measuredWidth = (getMeasuredWidth() - iDp) / 2;
            int paddingTop = (getPaddingTop() + ((measuredHeight - iDp) / 2)) - AndroidUtilities.dp(12.0f);
            this.placeholderIcon.setBounds(measuredWidth, paddingTop, measuredWidth + iDp, iDp + paddingTop);
            this.placeholderIcon.draw(canvas);
            canvas.drawText("Tap to pick a location", getMeasuredWidth() / 2.0f, r1 + AndroidUtilities.dp(20.0f), this.hintPaint);
        } else {
            canvas.drawRect(this.imageReceiver.getImageX(), this.imageReceiver.getImageY(), this.imageReceiver.getImageX2(), this.imageReceiver.getImageY2(), this.backgroundPaint);
            int centerX = (int) this.imageReceiver.getCenterX();
            int centerY = (int) this.imageReceiver.getCenterY();
            Drawable drawable = Theme.chat_locationDrawable[0];
            if (drawable != null) {
                int intrinsicWidth = centerX - (drawable.getIntrinsicWidth() / 2);
                int intrinsicHeight = centerY - (drawable.getIntrinsicHeight() / 2);
                drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
                drawable.draw(canvas);
            }
            this.imageReceiver.draw(canvas);
        }
        if (isCellSelected()) {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.selectionPaint);
        }
    }

    @Override
    public void fillTextLayoutBlocks(ArrayList arrayList) {
        if (this.stubLayout == null) {
            this.stubLayout = new StaticLayout("•", this.stubPaint, Math.max(1, getMeasuredWidth()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        final Layout layout = this.stubLayout;
        arrayList.add(new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
            }

            @Override
            public int getRow() {
                return 0;
            }

            @Override
            public int getX() {
                return 0;
            }

            @Override
            public int getY() {
                return 0;
            }

            @Override
            public Layout getLayout() {
                return layout;
            }
        });
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.stubLayout = null;
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
