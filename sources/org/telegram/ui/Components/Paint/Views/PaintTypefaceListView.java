package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.ViewGroup;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ArticleViewer$10$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.RecyclerListView;

public final class PaintTypefaceListView extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public final Path mask;
    public Consumer maskProvider;

    public final class AnonymousClass1 extends RecyclerListView.SelectionAdapter {
        @Override
        public final int getItemCount() {
            return PaintTypeface.get().size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PaintTextOptionsView.TypefaceCell typefaceCell = (PaintTextOptionsView.TypefaceCell) viewHolder.itemView;
            PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
            typefaceCell.getClass();
            typefaceCell.setTypeface(paintTypeface.getTypeface());
            String string = paintTypeface.name;
            if (string == null) {
                string = LocaleController.getString(paintTypeface.nameKey);
            }
            typefaceCell.setText(string);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            PaintTextOptionsView.TypefaceCell typefaceCell = new PaintTextOptionsView.TypefaceCell(viewGroup.getContext());
            typefaceCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(typefaceCell);
        }
    }

    public PaintTypefaceListView(Context context) {
        super(context);
        this.mask = new Path();
        setWillNotDraw(false);
        setLayoutManager(new LinearLayoutManager(1, false));
        setAdapter(new AnonymousClass1());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.customTypefacesLoaded) {
            getAdapter().notifyDataSetChanged();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Consumer consumer = this.maskProvider;
        if (consumer != null) {
            Path path = this.mask;
            consumer.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.maskProvider != null) {
            canvas.restore();
        }
    }

    @Override
    public final Integer getSelectorColor(int i) {
        return 285212671;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, ArticleViewer$10$$ExternalSyntheticOutline0.m(16.0f, AndroidUtilities.dp(48.0f) * Math.min(PaintTypeface.get().size(), 6), 1073741824));
    }

    public void setMaskProvider(Consumer consumer) {
        this.maskProvider = consumer;
        invalidate();
    }
}
