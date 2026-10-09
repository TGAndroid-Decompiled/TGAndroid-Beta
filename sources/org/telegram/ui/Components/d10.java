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
public final class d10 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f25544w = 0;
    public final ai.w0 f25545b;
    public final c10 f25546c;
    public final TextView d;
    public AnimatorSet f25547e;
    public final View f25548f;
    public int h;
    public boolean f25549n;
    public org.telegram.ui.gu f25550r;
    public final ArrayList f25551s;
    public final ArrayList v;

    public d10(org.telegram.ui.ty tyVar, ArrayList arrayList) {
        super(tyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f25551s = new ArrayList(tyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f25551s.size()) {
            if (((MessagesController.DialogFilter) this.f25551s.get(i10)).isDefault()) {
                this.f25551s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = tyVar.getParentActivity();
        b10 b10Var = new b10(this, parentActivity);
        this.containerView = b10Var;
        b10Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f25548f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        ai.w0 w0Var = new ai.w0(this, parentActivity, 17);
        this.f25545b = w0Var;
        w0Var.setTag(14);
        getContext();
        w0Var.setLayoutManager(new s4.d0(1, false));
        c10 c10Var = new c10(this, parentActivity);
        this.f25546c = c10Var;
        w0Var.setAdapter(c10Var);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0Var.setClipToPadding(false);
        w0Var.setGlowColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.A5, false));
        w0Var.setOnScrollListener(new ai.r(this, 27));
        w0Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(w0Var, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 51));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20924k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20942l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, w7.x5.a(50.0f, 0.0f, 0.0f, 40.0f, 0.0f, -1, 51));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static int B(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public static org.telegram.ui.ActionBar.e6 C(d10 d10Var) {
        return d10Var.resourcesProvider;
    }

    public static int D(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public static int E(d10 d10Var) {
        return d10Var.currentAccount;
    }

    public static int F(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int G(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static void H(d10 d10Var) {
        View view = d10Var.f25548f;
        TextView textView = d10Var.d;
        ai.w0 w0Var = d10Var.f25545b;
        if (w0Var.getChildCount() <= 0) {
            int paddingTop = w0Var.getPaddingTop();
            d10Var.h = paddingTop;
            w0Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(d10Var.h);
            view.setTranslationY(d10Var.h);
            d10Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = w0Var.getChildAt(0);
        am0 am0Var = (am0) w0Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && am0Var != null && am0Var.b() == 0) {
            d10Var.K(false);
            i10 = top;
        } else {
            d10Var.K(true);
        }
        if (d10Var.h != i10) {
            d10Var.h = i10;
            w0Var.setTopGlowOffset(i10);
            textView.setTranslationY(d10Var.h);
            view.setTranslationY(d10Var.h);
            d10Var.containerView.invalidate();
        }
    }

    public static int I(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static ArrayList J(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(n2Var.getMessagesController(), longValue);
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

    public static int o(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int p(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int q(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int r(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static Drawable s(d10 d10Var) {
        return d10Var.shadowDrawable;
    }

    public static Drawable t(d10 d10Var) {
        return d10Var.shadowDrawable;
    }

    public static int u(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public static int v(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int w(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public static int x(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public static int y(d10 d10Var) {
        return d10Var.backgroundPaddingTop;
    }

    public static int z(d10 d10Var) {
        return d10Var.backgroundPaddingLeft;
    }

    public final void K(boolean z10) {
        Integer num;
        float f7;
        View view = this.f25548f;
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
            AnimatorSet animatorSet = this.f25547e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f25547e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f7));
            this.f25547e.setDuration(150L);
            this.f25547e.addListener(new fa(8, this, z10));
            this.f25547e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f25545b, (Utilities.Callback<View>) new ai.i(12));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
