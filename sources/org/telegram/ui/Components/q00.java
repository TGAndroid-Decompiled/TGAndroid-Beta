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
public final class q00 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29848w = 0;
    public final ai.w0 f29849b;
    public final p00 f29850c;
    public final TextView d;
    public AnimatorSet f29851e;
    public final View f29852f;
    public int h;
    public boolean f29853n;
    public org.telegram.ui.bu f29854r;
    public final ArrayList f29855s;
    public final ArrayList v;

    public q00(org.telegram.ui.uy uyVar, ArrayList arrayList) {
        super(uyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f29855s = new ArrayList(uyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f29855s.size()) {
            if (((MessagesController.DialogFilter) this.f29855s.get(i10)).isDefault()) {
                this.f29855s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = uyVar.getParentActivity();
        o00 o00Var = new o00(this, parentActivity);
        this.containerView = o00Var;
        o00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f29852f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.w0 w0Var = new ai.w0(this, parentActivity, 17);
        this.f29849b = w0Var;
        w0Var.setTag(14);
        getContext();
        w0Var.setLayoutManager(new s4.c0(1, false));
        p00 p00Var = new p00(this, parentActivity);
        this.f29850c = p00Var;
        w0Var.setAdapter(p00Var);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.A5, false));
        w0Var.setOnScrollListener(new ai.r(this, 28));
        w0Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(w0Var, w7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20926j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20946k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20964l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static int A(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static int B(q00 q00Var) {
        return q00Var.currentAccount;
    }

    public static int C(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int D(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static void E(q00 q00Var) {
        View view = q00Var.f29852f;
        TextView textView = q00Var.d;
        ai.w0 w0Var = q00Var.f29849b;
        if (w0Var.getChildCount() <= 0) {
            int paddingTop = w0Var.getPaddingTop();
            q00Var.h = paddingTop;
            w0Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(q00Var.h);
            view.setTranslationY(q00Var.h);
            q00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        il0 il0Var = (il0) w0Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && il0Var != null && il0Var.b() == 0) {
            q00Var.H(false);
            i10 = top;
        } else {
            q00Var.H(true);
        }
        if (q00Var.h != i10) {
            q00Var.h = i10;
            w0Var.setTopGlowOffset(i10);
            textView.setTranslationY(q00Var.h);
            view.setTranslationY(q00Var.h);
            q00Var.containerView.invalidate();
        }
    }

    public static int F(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static ArrayList G(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.f0.l(n2Var.getMessagesController(), longValue);
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

    public static int m(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int n(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int o(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int p(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static Drawable q(q00 q00Var) {
        return q00Var.shadowDrawable;
    }

    public static Drawable r(q00 q00Var) {
        return q00Var.shadowDrawable;
    }

    public static int s(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static int t(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int u(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static int v(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static int w(q00 q00Var) {
        return q00Var.backgroundPaddingTop;
    }

    public static int x(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static int y(q00 q00Var) {
        return q00Var.backgroundPaddingLeft;
    }

    public static org.telegram.ui.ActionBar.d6 z(q00 q00Var) {
        return q00Var.resourcesProvider;
    }

    public final void H(boolean z10) {
        Integer num;
        float f7;
        View view = this.f29852f;
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
            AnimatorSet animatorSet = this.f29851e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29851e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f29851e.setDuration(150L);
            this.f29851e.addListener(new da(8, this, z10));
            this.f29851e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29849b, (Utilities.Callback<View>) new ai.i(12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
