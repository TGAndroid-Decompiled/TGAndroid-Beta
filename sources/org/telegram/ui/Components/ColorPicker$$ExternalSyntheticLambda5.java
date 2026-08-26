package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.KeyEvent;
import android.view.View;
import androidx.dynamicanimation.animation.FloatValueHolder;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.spoilers.SpoilerEffect;
import org.telegram.ui.Components.spoilers.SpoilersClickDetector;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;

public final class ColorPicker$$ExternalSyntheticLambda5 implements ActionBarMenuItem.ActionBarMenuItemDelegate, ActionBarPopupWindow.OnDispatchKeyEventListener, SpoilersClickDetector.OnSpoilerClickedListener, AlertDialog.OnButtonClickListener, GenericProvider, LinkActionView.Delegate, PhotoEditorSeekBar.PhotoEditorSeekBarDelegate, EditTextCaption.EditTextCaptionDelegate, Utilities.Callback5, MediaActionDrawable.MediaActionDrawableDelegate, RecyclerListView.OnItemLongClickListener, ViewGroupPartRenderer.DrawChildMethod, StoriesListPlaceProvider.LoadNextInterface, FragmentContextView.FragmentContextViewDelegate, WallpaperParallaxEffect.Callback, ScrollSlidingTabStrip.ScrollSlidingTabStripDelegate, LanguageDetector.StringCallback, SlideChooseView.Callback, FilterGLThread.FilterGLThreadVideoDelegate, WebPlayerView.CallJavaResultInterface {
    public final int $r8$classId;
    public final Object f$0;

    public ColorPicker$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        return ((SharedMediaLayout.InternalListView) this.f$0).drawChild(canvas, view, j);
    }

    @Override
    public void editLink() {
        LinkActionView.Delegate.CC.$default$editLink(this);
    }

    @Override
    public void invalidate() {
        ((View) this.f$0).invalidate();
    }

    @Override
    public void jsCallFinished(String str) {
        ((WebPlayerView) this.f$0).lambda$new$0(str);
    }

    @Override
    public void loadNext(boolean z) {
        SharedMediaLayout.lambda$onItemClick$67((StoriesController.StoriesList) this.f$0, z);
    }

    @Override
    public void onAnimation(boolean z, boolean z2) {
        ((SharedMediaLayout) this.f$0).lambda$new$32(z, z2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 3:
                ((SlotsDrawable$$ExternalSyntheticLambda9) this.f$0).run();
                break;
            case 4:
                ((GigagroupConvertAlert) this.f$0).lambda$new$0(alertDialog, i);
                break;
            case 5:
                ((InviteMembersBottomSheet) this.f$0).lambda$new$1(alertDialog, i);
                break;
            case 13:
                ((ReactionsContainerLayout) this.f$0).lambda$clearRecentReactions$5(alertDialog, i);
                break;
            default:
                ((StickersArchiveAlert) this.f$0).lambda$new$1(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDispatchKeyEvent(KeyEvent keyEvent) {
        ((CustomPopupMenu) this.f$0).lambda$new$1(keyEvent);
    }

    @Override
    public void onItemClick(int i) {
        ((ColorPicker) this.f$0).lambda$new$5(i);
    }

    @Override
    public void onOffsetsChanged(int i, int i2, float f) {
        ((SizeNotifierFrameLayout) this.f$0).lambda$checkMotion$0(i, i2, f);
    }

    @Override
    public void onOptionSelected(int i) {
        UniversalAdapter.lambda$onBindViewHolder$1((UItem) this.f$0, i);
    }

    @Override
    public void onPageSelected(int i) {
        ((StickerMasksAlert) this.f$0).lambda$new$2(i);
    }

    @Override
    public void onProgressChanged(int i, int i2) {
        ((PhotoFilterView.ToolsAdapter) this.f$0).lambda$onCreateViewHolder$0(i, i2);
    }

    @Override
    public void onSpansChanged() {
        ((PhotoViewerCaptionEnterView) this.f$0).lambda$new$2();
    }

    @Override
    public void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
        ((EditTextEffects) this.f$0).onSpoilerClicked(spoilerEffect, f, f2);
    }

    @Override
    public void onTouchEnd() {
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }

    @Override
    public void onVideoSurfaceCreated(SurfaceTexture surfaceTexture) {
        ((VideoEditTextureView) this.f$0).lambda$onSurfaceTextureAvailable$0(surfaceTexture);
    }

    @Override
    public Object provide(Object obj) {
        return PasscodeView.lambda$animateBackground$7((FloatValueHolder) this.f$0, (MotionBackgroundDrawable) obj);
    }

    @Override
    public void removeLink() {
        LinkActionView.Delegate.CC.$default$removeLink(this);
    }

    @Override
    public void revokeLink() {
        ((PermanentLinkBottomSheet) this.f$0).lambda$new$1();
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$r8$classId) {
            case 10:
                int iIntValue = ((Integer) obj3).intValue();
                float fFloatValue = ((Float) obj4).floatValue();
                float fFloatValue2 = ((Float) obj5).floatValue();
                ((PostsSearchContainer) this.f$0).onItemClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
                break;
            default:
                float fFloatValue3 = ((Float) obj3).floatValue();
                float fFloatValue4 = ((Float) obj4).floatValue();
                float fFloatValue5 = ((Float) obj5).floatValue();
                ((UniversalRecyclerView) this.f$0).lambda$setSections$4((Canvas) obj, (RectF) obj2, fFloatValue3, fFloatValue4, fFloatValue5);
                break;
        }
    }

    @Override
    public void showUsersForPermanentLink() {
        LinkActionView.Delegate.CC.$default$showUsersForPermanentLink(this);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 12:
                return ((ReactedUsersListView) this.f$0).lambda$new$1(view, i);
            default:
                return ((SearchDownloadsContainer) this.f$0).lambda$new$1(view, i);
        }
    }

    @Override
    public void run(String str) {
        ((TranslateAlert3) this.f$0).lambda$setText$2(str);
    }
}
