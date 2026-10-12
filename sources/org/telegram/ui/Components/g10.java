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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class g10 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26212w = 0;
    public final ai.w0 f26213b;
    public final f10 f26214c;
    public final TextView d;
    public AnimatorSet f26215e;
    public final View f26216f;
    public int h;
    public boolean f26217n;
    public org.telegram.ui.ju f26218r;
    public final ArrayList f26219s;
    public final ArrayList v;

    public g10(org.telegram.ui.vy vyVar, ArrayList arrayList) {
        super(vyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f26219s = new ArrayList(vyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f26219s.size()) {
            if (((MessagesController.DialogFilter) this.f26219s.get(i10)).isDefault()) {
                this.f26219s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = vyVar.getParentActivity();
        e10 e10Var = new e10(this, parentActivity);
        this.containerView = e10Var;
        e10Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f26216f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.w0 w0Var = new ai.w0(this, parentActivity, 17);
        this.f26213b = w0Var;
        w0Var.setTag(14);
        getContext();
        w0Var.setLayoutManager(new s4.d0(1, false));
        f10 f10Var = new f10(this, parentActivity);
        this.f26214c = f10Var;
        w0Var.setAdapter(f10Var);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.A5, false));
        w0Var.setOnScrollListener(new ai.r(this, 27));
        w0Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(w0Var, w7.w5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 51));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20667j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20686k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20704l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.w5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static int A(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public static org.telegram.ui.ActionBar.c6 B(g10 g10Var) {
        return g10Var.resourcesProvider;
    }

    public static int D(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public static int E(g10 g10Var) {
        return g10Var.currentAccount;
    }

    public static int F(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int G(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static void H(g10 g10Var) {
        View view = g10Var.f26216f;
        TextView textView = g10Var.d;
        ai.w0 w0Var = g10Var.f26213b;
        if (w0Var.getChildCount() <= 0) {
            int paddingTop = w0Var.getPaddingTop();
            g10Var.h = paddingTop;
            w0Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(g10Var.h);
            view.setTranslationY(g10Var.h);
            g10Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        gm0 gm0Var = (gm0) w0Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && gm0Var != null && gm0Var.b() == 0) {
            g10Var.K(false);
            i10 = top;
        } else {
            g10Var.K(true);
        }
        if (g10Var.h != i10) {
            g10Var.h = i10;
            w0Var.setTopGlowOffset(i10);
            textView.setTranslationY(g10Var.h);
            view.setTranslationY(g10Var.h);
            g10Var.containerView.invalidate();
        }
    }

    public static int I(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static ArrayList J(org.telegram.ui.ActionBar.m2 m2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(m2Var.getMessagesController(), longValue);
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

    public static int o(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int p(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int q(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int r(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static Drawable s(g10 g10Var) {
        return g10Var.shadowDrawable;
    }

    public static Drawable t(g10 g10Var) {
        return g10Var.shadowDrawable;
    }

    public static int u(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public static int v(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int w(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public static int x(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public static int y(g10 g10Var) {
        return g10Var.backgroundPaddingTop;
    }

    public static int z(g10 g10Var) {
        return g10Var.backgroundPaddingLeft;
    }

    public final void K(boolean z10) {
        Integer num;
        float f7;
        View view = this.f26216f;
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
            AnimatorSet animatorSet = this.f26215e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f26215e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f26215e.setDuration(150L);
            this.f26215e.addListener(new ea(8, this, z10));
            this.f26215e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26213b, (Utilities.Callback<View>) new ai.i(12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
