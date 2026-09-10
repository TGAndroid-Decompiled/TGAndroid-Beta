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
public final class u00 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27533w = 0;
    public final bi.y1 f27534b;
    public final t00 f27535c;
    public final TextView d;
    public AnimatorSet e;
    public final View f27536f;
    public int h;
    public boolean f27537n;
    public org.telegram.ui.iu f27538r;
    public final ArrayList f27539s;
    public final ArrayList v;

    public u00(org.telegram.ui.wy wyVar, ArrayList arrayList) {
        super(wyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f27539s = new ArrayList(wyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f27539s.size()) {
            if (((MessagesController.DialogFilter) this.f27539s.get(i10)).isDefault()) {
                this.f27539s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = wyVar.getParentActivity();
        s00 s00Var = new s00(this, parentActivity);
        this.containerView = s00Var;
        s00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f27536f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        bi.y1 y1Var = new bi.y1(this, parentActivity, 16);
        this.f27534b = y1Var;
        y1Var.setTag(14);
        getContext();
        y1Var.setLayoutManager(new s4.c0(1, false));
        t00 t00Var = new t00(this, parentActivity);
        this.f27535c = t00Var;
        y1Var.setAdapter(t00Var);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        y1Var.setClipToPadding(false);
        y1Var.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A5, false));
        y1Var.setOnScrollListener(new bi.a2(this, 25));
        y1Var.setOnItemClickListener(new k(this, 7));
        this.containerView.addView(y1Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18054k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18072l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.a6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static int A(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static int C(u00 u00Var) {
        return u00Var.currentAccount;
    }

    public static int D(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int E(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static void F(u00 u00Var) {
        View view = u00Var.f27536f;
        TextView textView = u00Var.d;
        bi.y1 y1Var = u00Var.f27534b;
        if (y1Var.getChildCount() <= 0) {
            int paddingTop = y1Var.getPaddingTop();
            u00Var.h = paddingTop;
            y1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(u00Var.h);
            view.setTranslationY(u00Var.h);
            u00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = y1Var.getChildAt(0);
        fl0 fl0Var = (fl0) y1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && fl0Var != null && fl0Var.b() == 0) {
            u00Var.J(false);
            i10 = top;
        } else {
            u00Var.J(true);
        }
        if (u00Var.h != i10) {
            u00Var.h = i10;
            y1Var.setTopGlowOffset(i10);
            textView.setTranslationY(u00Var.h);
            view.setTranslationY(u00Var.h);
            u00Var.containerView.invalidate();
        }
    }

    public static int H(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static ArrayList I(org.telegram.ui.ActionBar.p2 p2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat m10 = org.telegram.messenger.a2.m(p2Var.getMessagesController(), longValue);
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

    public static int m(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int n(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int o(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int p(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static Drawable q(u00 u00Var) {
        return u00Var.shadowDrawable;
    }

    public static Drawable r(u00 u00Var) {
        return u00Var.shadowDrawable;
    }

    public static int s(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static int t(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int u(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static int v(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static int w(u00 u00Var) {
        return u00Var.backgroundPaddingTop;
    }

    public static int x(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static int y(u00 u00Var) {
        return u00Var.backgroundPaddingLeft;
    }

    public static org.telegram.ui.ActionBar.f6 z(u00 u00Var) {
        return u00Var.resourcesProvider;
    }

    public final void J(boolean z10) {
        Integer num;
        float f7;
        View view = this.f27536f;
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
            AnimatorSet animatorSet = this.e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.e.setDuration(150L);
            this.e.addListener(new yo(4, this, z10));
            this.e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f27534b, (e2.h) new gg.g0(20));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
