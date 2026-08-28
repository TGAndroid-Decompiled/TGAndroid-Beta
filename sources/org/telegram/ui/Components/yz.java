package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class yz extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f35110w = 0;
    public final gh.f1 f35111b;
    public final xz f35112c;
    public final TextView d;
    public AnimatorSet f35113e;
    public final View f35114f;
    public int h;
    public boolean f35115n;
    public org.telegram.ui.wt f35116r;
    public final ArrayList f35117s;
    public final ArrayList v;

    public yz(org.telegram.ui.dy dyVar, ArrayList arrayList) {
        super(dyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f35117s = new ArrayList(dyVar.getMessagesController().dialogFilters);
        int i9 = 0;
        while (i9 < this.f35117s.size()) {
            if (((MessagesController.DialogFilter) this.f35117s.get(i9)).isDefault()) {
                this.f35117s.remove(i9);
                i9--;
            }
            i9++;
        }
        Activity parentActivity = dyVar.getParentActivity();
        wz wzVar = new wz(this, parentActivity);
        this.containerView = wzVar;
        wzVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f35114f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        gh.f1 f1Var = new gh.f1(this, parentActivity, 17);
        this.f35111b = f1Var;
        f1Var.setTag(14);
        getContext();
        f1Var.setLayoutManager(new f2.m0(1, false));
        xz xzVar = new xz(this, parentActivity);
        this.f35112c = xzVar;
        f1Var.setAdapter(xzVar);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A5, false));
        f1Var.setOnScrollListener(new kn(this, 4));
        f1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(f1Var, g7.e6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23126k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23143l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, g7.e6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static int A(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static int C(yz yzVar) {
        return yzVar.currentAccount;
    }

    public static int D(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int E(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static void F(yz yzVar) {
        View view = yzVar.f35114f;
        TextView textView = yzVar.d;
        gh.f1 f1Var = yzVar.f35111b;
        if (f1Var.getChildCount() <= 0) {
            int paddingTop = f1Var.getPaddingTop();
            yzVar.h = paddingTop;
            f1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(yzVar.h);
            view.setTranslationY(yzVar.h);
            yzVar.containerView.invalidate();
            return;
        }
        int i9 = 0;
        View childAt = f1Var.getChildAt(0);
        ik0 ik0Var = (ik0) f1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && ik0Var != null && ik0Var.b() == 0) {
            yzVar.I(false);
            i9 = top;
        } else {
            yzVar.I(true);
        }
        if (yzVar.h != i9) {
            yzVar.h = i9;
            f1Var.setTopGlowOffset(i9);
            textView.setTranslationY(yzVar.h);
            view.setTranslationY(yzVar.h);
            yzVar.containerView.invalidate();
        }
    }

    public static int G(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static ArrayList H(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            long longValue = ((Long) arrayList.get(i9)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l10 = org.telegram.messenger.l0.l(o2Var.getMessagesController(), longValue);
                if (l10 != null) {
                    longValue = l10.user_id;
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

    public static int m(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int n(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int o(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int p(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static Drawable q(yz yzVar) {
        return yzVar.shadowDrawable;
    }

    public static Drawable r(yz yzVar) {
        return yzVar.shadowDrawable;
    }

    public static int s(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static int t(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int u(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static int v(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static int w(yz yzVar) {
        return yzVar.backgroundPaddingTop;
    }

    public static int x(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static int y(yz yzVar) {
        return yzVar.backgroundPaddingLeft;
    }

    public static org.telegram.ui.ActionBar.b6 z(yz yzVar) {
        return yzVar.resourcesProvider;
    }

    public final void I(boolean z10) {
        Integer num;
        float f10;
        View view = this.f35114f;
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
            AnimatorSet animatorSet = this.f35113e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35113e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f10));
            this.f35113e.setDuration(150L);
            this.f35113e.addListener(new u9(8, this, z10));
            this.f35113e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f35111b, (d5.d) new ih.e(7));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
