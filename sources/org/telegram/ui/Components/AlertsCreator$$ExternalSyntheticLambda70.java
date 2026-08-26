package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;

public final class AlertsCreator$$ExternalSyntheticLambda70 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public AlertsCreator$$ExternalSyntheticLambda70(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$createThemeCreateDialog$243((BaseFragment) this.f$0, (EditTextBoldCursor) this.f$1, (Theme.ThemeAccent) this.f$2, (Theme.ThemeInfo) this.f$3, (AlertDialog) this.f$4, view);
                break;
            case 1:
                BackButtonMenu.lambda$show$0((AtomicReference) this.f$1, (BackButtonMenu.PulledDialog) this.f$2, (INavigationLayout) this.f$3, (TLRPC.TL_forumTopic) this.f$4, (BaseFragment) this.f$0, view);
                break;
            case 2:
                StickersDialogs.lambda$showAddStickerDialog$12((ActionBarPopupWindow) this.f$1, (ArrayList) this.f$2, (TLRPC.TL_messages_stickerSet) this.f$3, (BaseFragment) this.f$0, (Theme.ResourcesProvider) this.f$4, view);
                break;
            default:
                String str = (String) this.f$3;
                ActionBarPopupWindow actionBarPopupWindow = (ActionBarPopupWindow) this.f$4;
                ((TranslateButton) this.f$0).lambda$onMenuClick$8((String) this.f$1, (TranslateController) this.f$2, str, actionBarPopupWindow, view);
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda70(AtomicReference atomicReference, BackButtonMenu.PulledDialog pulledDialog, INavigationLayout iNavigationLayout, TLRPC.TL_forumTopic tL_forumTopic, BaseFragment baseFragment) {
        this.$r8$classId = 1;
        this.f$1 = atomicReference;
        this.f$2 = pulledDialog;
        this.f$3 = iNavigationLayout;
        this.f$4 = tL_forumTopic;
        this.f$0 = baseFragment;
    }

    public AlertsCreator$$ExternalSyntheticLambda70(ActionBarPopupWindow actionBarPopupWindow, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        this.$r8$classId = 2;
        this.f$1 = actionBarPopupWindow;
        this.f$2 = arrayList;
        this.f$3 = tL_messages_stickerSet;
        this.f$0 = baseFragment;
        this.f$4 = resourcesProvider;
    }
}
