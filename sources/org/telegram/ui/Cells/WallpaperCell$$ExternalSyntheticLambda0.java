package org.telegram.ui.Cells;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.recorder.PreviewView$$ExternalSyntheticLambda8;
import org.telegram.ui.web.SearchEngine;

public final class WallpaperCell$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public WallpaperCell$$ExternalSyntheticLambda0(int i, AtomicReference atomicReference, View view) {
        this.$r8$classId = 6;
        this.f$2 = i;
        this.f$0 = view;
        this.f$1 = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                ((WallpaperCell) this.f$0).lambda$new$0((WallpaperCell.WallpaperView) this.f$1, this.f$2, view);
                break;
            case 1:
                UnconfirmedAuthHintCell unconfirmedAuthHintCell = (UnconfirmedAuthHintCell) this.f$0;
                unconfirmedAuthHintCell.noButton.setLoading(true, true);
                int i = this.f$2;
                MessagesController.getInstance(i).getUnconfirmedAuthController().deny((ArrayList) this.f$1, new PreviewView$$ExternalSyntheticLambda8(unconfirmedAuthHintCell, i, 2));
                break;
            case 2:
                PaintToolsView paintToolsView = (PaintToolsView) this.f$0;
                int i2 = this.f$2;
                paintToolsView.animateNextIndex(i2);
                paintToolsView.delegate.onGetPalette().setCurrentBrush(i2 - 1, true);
                paintToolsView.delegate.onBrushSelected((Brush) this.f$1);
                break;
            case 3:
                ProfileGiftsContainer.lambda$setGiftFilterOptionsClickListeners$22((StarsController.GiftsList) this.f$0, this.f$2, (Runnable) this.f$1, view);
                break;
            case 4:
                ((ProfileGiftsContainer) this.f$0).lambda$new$10((BaseFragment) this.f$1, this.f$2, view);
                break;
            case 5:
                Browser.openUrl((Context) this.f$0, "https://" + MessagesController.getInstance(this.f$2).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) this.f$1).slug);
                break;
            default:
                SharedConfig.setSearchEngineType(this.f$2);
                ((TextCell) ((View) this.f$0)).setValue(SearchEngine.getCurrent().name, true);
                ((Dialog) ((AtomicReference) this.f$1).get()).dismiss();
                break;
        }
    }

    public WallpaperCell$$ExternalSyntheticLambda0(FrameLayout frameLayout, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = frameLayout;
        this.f$1 = obj;
        this.f$2 = i;
    }

    public WallpaperCell$$ExternalSyntheticLambda0(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = obj2;
    }
}
