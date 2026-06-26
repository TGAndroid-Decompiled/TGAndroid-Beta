package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;

public class RichDetailsEndCell extends View implements Theme.Colorable {
    private BlockRow currentRow;
    private final Paint paint;
    private final Theme.ResourcesProvider resourcesProvider;

    public RichDetailsEndCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.paint = new Paint();
        this.resourcesProvider = resourcesProvider;
        updateColors();
    }

    public void bind(BlockRow blockRow) {
        this.currentRow = blockRow;
    }

    public BlockRow getRow() {
        return this.currentRow;
    }

    @Override
    public void updateColors() {
        this.paint.setColor(Theme.getColor(Theme.key_divider, this.resourcesProvider));
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(6.0f) + 1);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, AndroidUtilities.dp(6.0f), getMeasuredWidth(), AndroidUtilities.dp(6.0f) + 1, this.paint);
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
        public RichDetailsEndCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new RichDetailsEndCell(context, resourcesProvider);
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            ((RichDetailsEndCell) view).bind((BlockRow) uItem.object);
        }

        public static UItem of(BlockRow blockRow) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = blockRow;
            return uItemOfFactory;
        }
    }
}
