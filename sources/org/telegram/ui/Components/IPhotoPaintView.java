package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.PhotoViewer;

public interface IPhotoPaintView {
    float adjustPanLayoutHelperProgress();

    int getAdditionalBottom();

    int getAdditionalTop();

    Bitmap getBitmap(ArrayList<VideoEditedInfo.MediaEntity> arrayList, Bitmap[] bitmapArr);

    View getCancelView();

    View getDoneView();

    int getEmojiPadding(boolean z);

    long getLcm();

    List<TLRPC.InputDocument> getMasks();

    float getOffsetTranslationY();

    RenderView getRenderView();

    View getView();

    boolean hasChanges();

    void init();

    void maybeShowDismissalAlert(PhotoViewer photoViewer, Activity activity, Runnable runnable);

    void onAnimationStateChanged(boolean z);

    boolean onBackPressed();

    void onCleanupEntities();

    void onResume();

    boolean onTouch(MotionEvent motionEvent);

    void setOffsetTranslationX(float f);

    void setOffsetTranslationY(float f, float f2, int i, boolean z);

    void setOnDoneButtonClickedListener(Runnable runnable);

    void setTransform(float f, float f2, float f3, float f4, float f5);

    void shutdown();

    void updateColors();

    void updateZoom(boolean z);

    public abstract class CC {
        public static int $default$getAdditionalBottom(IPhotoPaintView iPhotoPaintView) {
            return 0;
        }

        public static int $default$getAdditionalTop(IPhotoPaintView iPhotoPaintView) {
            return 0;
        }

        public static View $default$getView(IPhotoPaintView iPhotoPaintView) {
            if (iPhotoPaintView instanceof View) {
                return (View) iPhotoPaintView;
            }
            throw new IllegalArgumentException("You should override getView() if you're not inheriting from it.");
        }

        public static void $default$onCleanupEntities(IPhotoPaintView iPhotoPaintView) {
        }

        public static void $default$onAnimationStateChanged(IPhotoPaintView iPhotoPaintView, boolean z) {
        }

        public static void $default$setOffsetTranslationX(IPhotoPaintView iPhotoPaintView, float f) {
        }
    }
}
