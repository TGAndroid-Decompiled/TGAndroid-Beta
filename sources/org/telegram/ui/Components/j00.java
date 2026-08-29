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
public final class j00 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29512w = 0;
    public final jh.e1 f29513b;
    public final i00 f29514c;
    public final TextView d;
    public AnimatorSet f29515e;
    public final View f29516f;
    public int h;
    public boolean f29517n;
    public org.telegram.ui.xt f29518r;
    public final ArrayList f29519s;
    public final ArrayList v;

    public j00(ArrayList arrayList, org.telegram.ui.fy fyVar) {
        super(fyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f29519s = new ArrayList(fyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f29519s.size()) {
            if (((MessagesController.DialogFilter) this.f29519s.get(i10)).isDefault()) {
                this.f29519s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = fyVar.getParentActivity();
        g00 g00Var = new g00(this, parentActivity);
        this.containerView = g00Var;
        g00Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f29516f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        jh.e1 e1Var = new jh.e1(this, parentActivity, 16);
        this.f29513b = e1Var;
        e1Var.setTag(14);
        getContext();
        e1Var.setLayoutManager(new f2.j0(1, false));
        i00 i00Var = new i00(this, parentActivity);
        this.f29514c = i00Var;
        e1Var.setAdapter(i00Var);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        e1Var.setClipToPadding(false);
        e1Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        e1Var.setOnScrollListener(new h00(this, 0));
        e1Var.setOnItemClickListener(new k(this, 7));
        this.containerView.addView(e1Var, i7.f6.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23188k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23205l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, i7.f6.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static org.telegram.ui.ActionBar.c6 A(j00 j00Var) {
        return j00Var.resourcesProvider;
    }

    public static int B(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public static int C(j00 j00Var) {
        return j00Var.currentAccount;
    }

    public static int D(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int E(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static void F(j00 j00Var) {
        View view = j00Var.f29516f;
        TextView textView = j00Var.d;
        jh.e1 e1Var = j00Var.f29513b;
        if (e1Var.getChildCount() <= 0) {
            int paddingTop = e1Var.getPaddingTop();
            j00Var.h = paddingTop;
            e1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(j00Var.h);
            view.setTranslationY(j00Var.h);
            j00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = e1Var.getChildAt(0);
        vk0 vk0Var = (vk0) e1Var.G(childAt);
        int top = childAt.getTop();
        if (top >= 0 && vk0Var != null && vk0Var.b() == 0) {
            j00Var.I(false);
            i10 = top;
        } else {
            j00Var.I(true);
        }
        if (j00Var.h != i10) {
            j00Var.h = i10;
            e1Var.setTopGlowOffset(i10);
            textView.setTranslationY(j00Var.h);
            view.setTranslationY(j00Var.h);
            j00Var.containerView.invalidate();
        }
    }

    public static int G(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static ArrayList H(org.telegram.ui.ActionBar.o2 o2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(longValue)) {
                TLRPC.EncryptedChat p10 = org.telegram.messenger.x3.p(o2Var.getMessagesController(), longValue);
                if (p10 != null) {
                    longValue = p10.user_id;
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

    public static int m(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int n(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int o(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int p(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static Drawable q(j00 j00Var) {
        return j00Var.shadowDrawable;
    }

    public static Drawable r(j00 j00Var) {
        return j00Var.shadowDrawable;
    }

    public static int s(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public static int t(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int u(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public static int v(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public static int w(j00 j00Var) {
        return j00Var.backgroundPaddingTop;
    }

    public static int x(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public static int y(j00 j00Var) {
        return j00Var.backgroundPaddingLeft;
    }

    public final void I(boolean z10) {
        Integer num;
        float f9;
        View view = this.f29516f;
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
            AnimatorSet animatorSet = this.f29515e;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f29515e = animatorSet2;
            Property property = View.ALPHA;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, property, f9));
            this.f29515e.setDuration(150L);
            this.f29515e.addListener(new z9(8, this, z10));
            this.f29515e.start();
        }
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f29513b, (f5.d) new l4.x0(7));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
