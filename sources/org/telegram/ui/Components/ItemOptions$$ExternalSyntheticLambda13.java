package org.telegram.ui.Components;

import android.view.View;
import android.widget.TextView;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public final class ItemOptions$$ExternalSyntheticLambda13 implements View.OnLayoutChangeListener {
    public final int $r8$classId;
    public final Object f$0;

    public ItemOptions$$ExternalSyntheticLambda13(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$r8$classId) {
            case 0:
                ItemOptions itemOptions = (ItemOptions) this.f$0;
                if (itemOptions.isShown()) {
                    itemOptions.reposition();
                }
                break;
            case 1:
                ChartHeaderView chartHeaderView = (ChartHeaderView) this.f$0;
                TextView textView = chartHeaderView.datesTmp;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = chartHeaderView.dates;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                break;
            case 2:
                StickerTabView stickerTabView = (StickerTabView) this.f$0;
                ArticleViewer.AnonymousClass9 anonymousClass9 = stickerTabView.textView;
                if (anonymousClass9 != null && anonymousClass9.getLayout() != null) {
                    stickerTabView.textWidth = anonymousClass9.getLayout().getLineWidth(0);
                    break;
                }
                break;
            default:
                ((KeyboardNotifier) this.f$0).update();
                break;
        }
    }
}
