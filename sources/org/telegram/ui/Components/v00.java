package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class v00 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f33502x = 0;
    public int f33503b;
    public final bi.r1 f33504c;
    public final u00 d;
    public final TextView e;
    public AnimatorSet f33505f;
    public final View h;
    public int f33506n;
    public boolean f33507r;
    public org.telegram.ui.st f33508s;
    public final ArrayList v;
    public final ArrayList f33509w;

    public v00(org.telegram.ui.ey eyVar, ArrayList arrayList) {
        super(eyVar.getParentActivity(), false);
        fixNavigationBar();
        this.f33509w = arrayList;
        this.v = new ArrayList(eyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.v.size()) {
            if (((MessagesController.DialogFilter) this.v.get(i10)).isDefault()) {
                this.v.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = eyVar.getParentActivity();
        t00 t00Var = new t00(this, parentActivity);
        this.containerView = t00Var;
        t00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.h = view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        bi.r1 r1Var = new bi.r1(this, parentActivity, 18);
        this.f33504c = r1Var;
        r1Var.setTag(14);
        getContext();
        r1Var.setLayoutManager(new s4.c0(1, false));
        u00 u00Var = new u00(this, parentActivity);
        this.d = u00Var;
        r1Var.setAdapter(u00Var);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        r1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.f7.m(r1Var, 21, org.telegram.ui.ActionBar.y6.A5, null);
        r1Var.setOnScrollListener(new ml(this, 6));
        r1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(r1Var, kb1.h(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.e = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.f7.H(textView, org.telegram.ui.ActionBar.y6.f23484k5, null);
        org.telegram.ui.ActionBar.f7.D(textView, org.telegram.ui.ActionBar.y6.f23502l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, kb1.h(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    public static org.telegram.ui.ActionBar.u6 A(v00 v00Var) {
        return v00Var.resourcesProvider;
    }

    public static int C(v00 v00Var) {
        return v00Var.currentAccount;
    }

    public static void G(v00 v00Var) {
        View view = v00Var.h;
        TextView textView = v00Var.e;
        bi.r1 r1Var = v00Var.f33504c;
        if (r1Var.getChildCount() <= 0) {
            int paddingTop = r1Var.getPaddingTop();
            v00Var.f33506n = paddingTop;
            r1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(v00Var.f33506n);
            view.setTranslationY(v00Var.f33506n);
            v00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = r1Var.getChildAt(0);
        wl0 wl0Var = (wl0) r1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && wl0Var != null && wl0Var.b() == 0) {
            v00Var.J(false);
            i10 = top;
        } else {
            v00Var.J(true);
        }
        if (v00Var.f33506n != i10) {
            v00Var.f33506n = i10;
            r1Var.setTopGlowOffset(i10);
            textView.setTranslationY(v00Var.f33506n);
            view.setTranslationY(v00Var.f33506n);
            v00Var.containerView.invalidate();
        }
    }

    public static ArrayList I(org.telegram.ui.ActionBar.r2 r2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(r2Var.getMessagesController(), longValue);
                if (m10 != null) {
                    longValue = m10.user_id;
                    if (arrayList2.contains(Long.valueOf(longValue))) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (dialogFilter == null || ((!z10 || !dialogFilter.alwaysShow.contains(Long.valueOf(longValue))) && (z10 || !dialogFilter.neverShow.contains(Long.valueOf(longValue))))) {
                arrayList2.add(Long.valueOf(longValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public final void J(boolean z10) {
        Integer num;
        float f7;
        View view = this.h;
        if ((z10 && view.getTag() != null) || (!z10 && view.getTag() == null)) {
            if (z10) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z10) {
                view.setVisibility(0);
            }
            AnimatorSet animatorSet = this.f33505f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f33505f = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f33505f.setDuration(150L);
            this.f33505f.addListener(new org.telegram.ui.lo(9, this, z10));
            this.f33505f.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f33504c, (Utilities.Callback<View>) new di.e(12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        bi.r1 r1Var = this.f33504c;
        if (r1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider);
                if (w02 != this.f33503b) {
                    this.f33503b = w02;
                    for (int i10 = 0; i10 < r1Var.getChildCount(); i10++) {
                        View childAt = r1Var.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.ActionBar.c3) && ((org.telegram.ui.ActionBar.c3) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.c3) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
