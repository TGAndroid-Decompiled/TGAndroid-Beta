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
public final class t00 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f30671x = 0;
    public int f30672b;
    public final ai.u1 f30673c;
    public final s00 d;
    public final TextView e;
    public AnimatorSet f30674f;
    public final View h;
    public int f30675n;
    public boolean f30676r;
    public org.telegram.ui.xt f30677s;
    public final ArrayList v;
    public final ArrayList f30678w;

    public t00(org.telegram.ui.ey eyVar, ArrayList arrayList) {
        super(eyVar.getParentActivity(), false);
        fixNavigationBar();
        this.f30678w = arrayList;
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
        r00 r00Var = new r00(this, parentActivity);
        this.containerView = r00Var;
        r00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.h = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.u1 u1Var = new ai.u1(this, parentActivity, 18);
        this.f30673c = u1Var;
        u1Var.setTag(14);
        getContext();
        u1Var.setLayoutManager(new s4.b0(1, false));
        s00 s00Var = new s00(this, parentActivity);
        this.d = s00Var;
        u1Var.setAdapter(s00Var);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        u1Var.setClipToPadding(false);
        org.telegram.ui.ActionBar.r6.m(u1Var, 21, org.telegram.ui.ActionBar.k6.A5, null);
        u1Var.setOnScrollListener(new iv(this, 2));
        u1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(u1Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.e = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.I(textView, org.telegram.ui.ActionBar.k6.f21310k5, null);
        org.telegram.ui.ActionBar.r6.E(textView, org.telegram.ui.ActionBar.k6.f21327l5, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static org.telegram.ui.ActionBar.g6 A(t00 t00Var) {
        return t00Var.resourcesProvider;
    }

    public static int C(t00 t00Var) {
        return t00Var.currentAccount;
    }

    public static void F(t00 t00Var) {
        View view = t00Var.h;
        TextView textView = t00Var.e;
        ai.u1 u1Var = t00Var.f30673c;
        if (u1Var.getChildCount() <= 0) {
            int paddingTop = u1Var.getPaddingTop();
            t00Var.f30675n = paddingTop;
            u1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(t00Var.f30675n);
            view.setTranslationY(t00Var.f30675n);
            t00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = u1Var.getChildAt(0);
        vl0 vl0Var = (vl0) u1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vl0Var != null && vl0Var.b() == 0) {
            t00Var.J(false);
            i10 = top;
        } else {
            t00Var.J(true);
        }
        if (t00Var.f30675n != i10) {
            t00Var.f30675n = i10;
            u1Var.setTopGlowOffset(i10);
            textView.setTranslationY(t00Var.f30675n);
            view.setTranslationY(t00Var.f30675n);
            t00Var.containerView.invalidate();
        }
    }

    public static ArrayList I(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(o2Var.getMessagesController(), longValue);
                if (l4 != null) {
                    longValue = l4.user_id;
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
            AnimatorSet animatorSet = this.f30674f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f30674f = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f30674f.setDuration(150L);
            this.f30674f.addListener(new org.telegram.ui.ho(9, this, z10));
            this.f30674f.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f30673c, (Utilities.Callback<View>) new ci.e(12));
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
        ai.u1 u1Var = this.f30673c;
        if (u1Var != null) {
            try {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider);
                if (w02 != this.f30672b) {
                    this.f30672b = w02;
                    for (int i10 = 0; i10 < u1Var.getChildCount(); i10++) {
                        View childAt = u1Var.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.ActionBar.z2) && ((org.telegram.ui.ActionBar.z2) childAt).getTextView() != null) {
                            ((org.telegram.ui.ActionBar.z2) childAt).getTextView().setEmojiColor(w02);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
