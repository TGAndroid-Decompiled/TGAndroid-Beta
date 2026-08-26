package org.telegram.ui.ActionBar;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;

public final class BottomSheetTabs$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public BottomSheetTabs$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public final void run() throws Throwable {
        ViewGroup viewGroup;
        switch (this.$r8$classId) {
            case 0:
                BottomSheetTabs bottomSheetTabs = (BottomSheetTabs) this.f$0;
                bottomSheetTabs.getClass();
                ((BaseFragment) this.f$1).presentFragment((ChatActivity) this.f$2);
                bottomSheetTabs.doNotDismiss = false;
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.f$0;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = actionBarLayout.previewMenu;
                if (actionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.previewMenu);
                }
                if (actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) {
                    actionBarLayout.containerViewBack.setScaleX(1.0f);
                    actionBarLayout.containerViewBack.setScaleY(1.0f);
                    actionBarLayout.inPreviewMode = false;
                    actionBarLayout.previewMenu = null;
                    actionBarLayout.transitionAnimationPreviewMode = false;
                } else {
                    actionBarLayout.containerViewBack.setTranslationX(0.0f);
                }
                BaseFragment baseFragment = (BaseFragment) this.f$1;
                baseFragment.finishing = true;
                baseFragment.onPause();
                baseFragment.onFragmentDestroy();
                baseFragment.setParentLayout(null);
                actionBarLayout.fragmentsStack.remove(baseFragment);
                actionBarLayout.containerViewBack.setVisibility(4);
                actionBarLayout.containerViewBack.setTranslationY(0.0f);
                actionBarLayout.bringChildToFront(actionBarLayout.containerView);
                ActionBarLayout.LayoutContainer layoutContainer = actionBarLayout.sheetContainer;
                if (layoutContainer != null) {
                    actionBarLayout.bringChildToFront(layoutContainer);
                }
                actionBarLayout.onFragmentStackChanged("closeLastFragmentInternalRemoveOld");
                baseFragment.setRemovingFromStack(false);
                baseFragment.onTransitionAnimationEnd(false, true);
                BaseFragment baseFragment2 = (BaseFragment) this.f$2;
                baseFragment2.onTransitionAnimationEnd(true, true);
                baseFragment2.onBecomeFullyVisible();
                break;
            case 2:
                BottomSheetTabs bottomSheetTabs2 = (BottomSheetTabs) this.f$0;
                bottomSheetTabs2.getClass();
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f$1;
                    if (i >= arrayList.size()) {
                        bottomSheetTabs2.invalidate();
                    } else {
                        if (((BottomSheetTabs.TabDrawable) arrayList.get(i)).tab == ((BottomSheetTabs.WebTabData) this.f$2)) {
                            arrayList.remove(i);
                            i--;
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) this.f$0;
                themeInfo.getClass();
                TLObject tLObject = (TLObject) this.f$1;
                if (!(tLObject instanceof TLRPC.TL_wallPaper)) {
                    themeInfo.onFinishLoadingRemoteTheme();
                } else {
                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
                    themeInfo.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
                    NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(themeInfo.account).addObserver(themeInfo, NotificationCenter.fileLoadFailed);
                    FileLoader.getInstance(((Theme.ThemeInfo) this.f$2).account).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
                }
                break;
        }
    }
}
