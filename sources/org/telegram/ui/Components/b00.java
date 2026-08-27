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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class b00 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public static final int f26864w = 0;

    public final hh.f1 f26865b;

    public final a00 f26866c;
    public final TextView d;

    public AnimatorSet f26867e;

    public final View f26868f;
    public int h;

    public boolean f26869n;

    public org.telegram.ui.zt f26870r;

    public final ArrayList f26871s;
    public final ArrayList v;

    public b00(org.telegram.ui.gy gyVar, ArrayList arrayList) {
        super(gyVar.getParentActivity(), false);
        fixNavigationBar();
        this.v = arrayList;
        this.f26871s = new ArrayList(gyVar.getMessagesController().dialogFilters);
        int i10 = 0;
        while (i10 < this.f26871s.size()) {
            if (((MessagesController.DialogFilter) this.f26871s.get(i10)).isDefault()) {
                this.f26871s.remove(i10);
                i10--;
            }
            i10++;
        }
        Activity parentActivity = gyVar.getParentActivity();
        zz zzVar = new zz(this, parentActivity);
        this.containerView = zzVar;
        zzVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i11 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i11, 0, i11, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(parentActivity);
        this.f26868f = view;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.V5, false));
        view.setAlpha(0.0f);
        view.setVisibility(4);
        view.setTag(1);
        this.containerView.addView(view, layoutParams);
        hh.f1 f1Var = new hh.f1(this, parentActivity, 17);
        this.f26865b = f1Var;
        f1Var.setTag(14);
        getContext();
        f1Var.setLayoutManager(new f2.k0(1, false));
        a00 a00Var = new a00(this, parentActivity);
        this.f26866c = a00Var;
        f1Var.setAdapter(a00Var);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        f1Var.setClipToPadding(false);
        f1Var.setGlowColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A5, false));
        f1Var.setOnScrollListener(new xm(this, 5));
        f1Var.setOnItemClickListener(new j(this, 7));
        this.containerView.addView(f1Var, h7.z5.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        TextView textView = new TextView(parentActivity);
        this.d = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
        textView.setTextSize(1, 20.0f);
        textView.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23180k5, false));
        textView.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23197l5, false));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
        textView.setGravity(16);
        textView.setText(LocaleController.getString(R.string.FilterChoose));
        textView.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(textView, h7.z5.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    public static void G(b00 b00Var) {
        View view = b00Var.f26868f;
        TextView textView = b00Var.d;
        hh.f1 f1Var = b00Var.f26865b;
        if (f1Var.getChildCount() <= 0) {
            int paddingTop = f1Var.getPaddingTop();
            b00Var.h = paddingTop;
            f1Var.setTopGlowOffset(paddingTop);
            textView.setTranslationY(b00Var.h);
            view.setTranslationY(b00Var.h);
            b00Var.containerView.invalidate();
            return;
        }
        int i10 = 0;
        View childAt = f1Var.getChildAt(0);
        lk0 lk0Var = (lk0) f1Var.G(childAt);
        int top = childAt.getTop();
        if (top < 0 || lk0Var == null || lk0Var.b() != 0) {
            b00Var.J(true);
        } else {
            b00Var.J(false);
            i10 = top;
        }
        if (b00Var.h != i10) {
            b00Var.h = i10;
            f1Var.setTopGlowOffset(i10);
            textView.setTranslationY(b00Var.h);
            view.setTranslationY(b00Var.h);
            b00Var.containerView.invalidate();
        }
    }

    public static ArrayList I(org.telegram.ui.ActionBar.n2 n2Var, MessagesController.DialogFilter dialogFilter, ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) arrayList.get(i10)).longValue();
            if (DialogObject.isEncryptedDialog(jLongValue)) {
                TLRPC.EncryptedChat encryptedChatN = org.telegram.messenger.y1.n(n2Var.getMessagesController(), jLongValue);
                if (encryptedChatN != null) {
                    jLongValue = encryptedChatN.user_id;
                    if (!arrayList2.contains(Long.valueOf(jLongValue))) {
                        if (dialogFilter == null) {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z11) {
                                break;
                                break;
                            }
                        } else {
                            arrayList2.add(Long.valueOf(jLongValue));
                            if (z11) {
                                break;
                                break;
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (dialogFilter == null || ((!z10 || !dialogFilter.alwaysShow.contains(Long.valueOf(jLongValue))) && (z10 || !dialogFilter.neverShow.contains(Long.valueOf(jLongValue))))) {
                arrayList2.add(Long.valueOf(jLongValue));
                if (z11) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public final void J(boolean z10) {
        View view = this.f26868f;
        if ((!z10 || view.getTag() == null) && (z10 || view.getTag() != null)) {
            return;
        }
        view.setTag(z10 ? null : 1);
        if (z10) {
            view.setVisibility(0);
        }
        AnimatorSet animatorSet = this.f26867e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f26867e = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z10 ? 1.0f : 0.0f));
        this.f26867e.setDuration(150L);
        this.f26867e.addListener(new org.telegram.ui.go(9, this, z10));
        this.f26867e.start();
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f26865b, (d5.d) new j4.w0(7));
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }
}
