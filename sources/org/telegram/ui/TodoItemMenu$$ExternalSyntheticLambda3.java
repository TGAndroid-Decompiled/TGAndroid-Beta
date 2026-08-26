package org.telegram.ui;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import androidx.collection.LongSparseArray;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.FilterGLThread;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.VideoEditTextureView;

public final class TodoItemMenu$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, CountrySelectActivity.CountrySelectActivityDelegate, RecyclerListView.OnItemClickListenerExtended, RecyclerListView.OnItemLongClickListener, MultiLayoutTypingAnimator.Renderer, Utilities.Callback5, VideoEditTextureView.VideoEditTextureViewDelegate, ActionBarPopupWindow.onSizeChangedListener, OnApplyWindowInsetsListener, LanguageDetector.ExceptionCallback, RequestTimeDelegate, BaseFragment.PreviewDelegate, BaseChartView.DateSelectionListener, SearchAdapterHelper.SearchAdapterHelperDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public boolean canApplySearchResults(int i) {
        return true;
    }

    @Override
    public void didSelectCountry(CountrySelectActivity.Country country) {
        ((LoginActivity.PhoneView) this.f$0).lambda$new$5(country);
    }

    @Override
    public void draw(Canvas canvas) {
        ((Layout) this.f$0).draw(canvas);
    }

    @Override
    public LongSparseArray getExcludeCallParticipants() {
        return null;
    }

    @Override
    public LongSparseArray getExcludeUsers() {
        return null;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 15:
                return ((PremiumPreviewFragment) this.f$0).onApplyWindowInsets(view, windowInsetsCompat);
            default:
                return ((ViewPagerActivity) this.f$0).onApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 1:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$new$6(alertDialog, i);
                break;
            case 2:
                ((LoginActivity.LoginActivityPasswordView) this.f$0).lambda$new$5(alertDialog, i);
                break;
            case 3:
                ((LoginActivity.LoginActivityResetWaitView) this.f$0).lambda$new$2(alertDialog, i);
                break;
            case 9:
                ((PasscodeActivity) this.f$0).lambda$createView$2(alertDialog, i);
                break;
            case 12:
                ((PollCreateActivity) this.f$0).lambda$checkDiscard$2(alertDialog, i);
                break;
            default:
                ((PopupNotificationActivity) this.f$0).lambda$onRequestPermissionsResult$0(alertDialog, i);
                break;
        }
    }

    @Override
    public void onDataSetChanged(int i) {
        ((UsersSelectActivity.GroupCreateAdapter) this.f$0).lambda$new$0(i);
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onEGLThreadAvailable(FilterGLThread filterGLThread) {
        PhotoViewer.lambda$createVideoTextureView$103((MediaController.SavedFilterState) this.f$0, filterGLThread);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((LogoutActivity) this.f$0).lambda$createView$0(view, i, f, f2);
    }

    @Override
    public void onSetHashtags(ArrayList arrayList, HashMap map) {
    }

    @Override
    public void onSizeChanged() {
        switch (this.$r8$classId) {
            case 0:
                ((TodoItemMenu) this.f$0).updateTranslation();
                break;
            default:
                ((PollItemMenu) this.f$0).updateTranslation();
                break;
        }
    }

    @Override
    public void run(long j) {
        ProxyListActivity.lambda$checkProxyList$6((SharedConfig.ProxyInfo) this.f$0, j);
    }

    @Override
    public boolean onItemClick(View view, int i) {
        switch (this.$r8$classId) {
            case 6:
                return ((MessageStatisticActivity) this.f$0).lambda$createView$2(view, i);
            case 8:
                return ((NotificationsSoundActivity) this.f$0).lambda$createView$2(view, i);
            case 19:
                return ((SelectStoriesBottomSheet) this.f$0).onItemClick(view, i);
            case 20:
                return ((StatisticActivity) this.f$0).lambda$createView$9(view, i);
            default:
                return ((TooManyCommunitiesActivity) this.f$0).lambda$new$1(view, i);
        }
    }

    @Override
    public void run(Exception exc) {
        ProfileActivity.lambda$processOnClickOrPress$83((ArticleViewer$$ExternalSyntheticLambda20) this.f$0, exc);
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int iIntValue = ((Integer) obj3).intValue();
        float fFloatValue = ((Float) obj4).floatValue();
        float fFloatValue2 = ((Float) obj5).floatValue();
        ((PasskeysActivity) this.f$0).onItemClick((UItem) obj, (View) obj2, iIntValue, fFloatValue, fFloatValue2);
    }
}
