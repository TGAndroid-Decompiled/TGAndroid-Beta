package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.RecyclerListView;

public final class OAuthSheet$$ExternalSyntheticLambda13 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;

    public OAuthSheet$$ExternalSyntheticLambda13(Context context, String str, String[] strArr, Theme.ResourcesProvider resourcesProvider, BottomSheet bottomSheet) {
        this.$r8$classId = 3;
        this.f$1 = context;
        this.f$2 = str;
        this.f$3 = strArr;
        this.f$4 = resourcesProvider;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                OAuthSheet.lambda$handle$6((BottomSheet) this.f$0, (FrameLayout) this.f$1, (ArrayList) this.f$2, (int[]) this.f$3, (OAuthSheet$$ExternalSyntheticLambda12) this.f$4, view);
                break;
            case 1:
                RecyclerListView recyclerListView = (RecyclerListView) this.f$3;
                ((CachedMediaLayout.AnonymousClass1) this.f$0).lambda$createView$0((CachedMediaLayout.ItemInner) this.f$1, (CachedMediaLayout.BaseAdapter) this.f$2, recyclerListView, (SharedPhotoVideoCell2) this.f$4, view);
                break;
            case 2:
                ((ContentPreviewViewer.AnonymousClass1) this.f$0).lambda$run$5((ArrayList) this.f$2, (RecyclerListView) this.f$1, (LinearLayout) this.f$3, (ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$4, view);
                break;
            case 3:
                CallLogActivity.lambda$showCallLinkSheet$35((Context) this.f$1, (String) this.f$2, (String[]) this.f$3, (Theme.ResourcesProvider) this.f$4, (BottomSheet) this.f$0, view);
                break;
            case 4:
                ((ChatActivity) this.f$0).lambda$updateBotHelpCellClick$401((String) this.f$1, (String) this.f$2, (CharSequence) this.f$3, (Runnable[]) this.f$4, view);
                break;
            case 5:
                ((ChatActivity) this.f$0).lambda$updateBotHelpCellClick$403((String) this.f$1, (String) this.f$2, (CharSequence) this.f$3, (BotHelpCell) this.f$4, view);
                break;
            default:
                ((LoginActivity.LoginPayView) this.f$0).lambda$setParams$25((ProductDetails) this.f$1, (TLRPC.TL_inputStorePaymentAuthCode) this.f$2, (String) this.f$3, (TLRPC.TL_payments_canPurchaseStore) this.f$4, view);
                break;
        }
    }

    public OAuthSheet$$ExternalSyntheticLambda13(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public OAuthSheet$$ExternalSyntheticLambda13(ContentPreviewViewer.AnonymousClass1 anonymousClass1, ArrayList arrayList, RecyclerListView recyclerListView, LinearLayout linearLayout, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass1;
        this.f$2 = arrayList;
        this.f$1 = recyclerListView;
        this.f$3 = linearLayout;
        this.f$4 = actionBarPopupWindowLayout;
    }
}
