package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ProfileActivity;
public final class g11 extends FrameLayout implements org.telegram.messenger.gs {
    public static final int f35364r0 = 0;
    public final FrameLayout E;
    public final View F;
    public final View G;
    public int H;
    public int I;
    public int J;
    public ValueAnimator K;
    public long L;
    public String M;
    public final ArrayList N;
    public int O;
    public t01 P;
    public org.telegram.messenger.e00 Q;
    public boolean R;
    public final org.telegram.ui.f61 S;
    public final di.l4 T;
    public final ArrayList U;
    public long V;
    public Boolean W;
    public final int f35365a;
    public float f35366a0;
    public final long f35367b;
    public ValueAnimator f35368b0;
    public final boolean f35369c;
    public boolean f35370c0;
    public final boolean d;
    public float f35371d0;
    public final org.telegram.ui.ActionBar.h6 f35372e;
    public float f35373e0;
    public final org.telegram.ui.ek f35374f;
    public boolean f35375f0;
    public boolean f35376g0;
    public final bi.t2 h;
    public float f35377h0;
    public VelocityTracker f35378i0;
    public boolean f35379j0;
    public ValueAnimator f35380k0;
    public final TextPaint f35381l0;
    public final HashMap m0;
    public final ImageView f35382n;
    public final TextPaint f35383n0;
    public final TextPaint f35384o0;
    public final TextPaint f35385p0;
    public final TextPaint f35386q0;
    public final ek0 f35387r;
    public final b11 f35388s;
    public final EditText f35389w;
    public final Paint f35390x;
    public float f35391y;

    public g11(Activity activity, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, final org.telegram.ui.ek ekVar) {
        super(activity);
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        String str;
        String N0;
        TLRPC.Chat chat;
        TLRPC.User user;
        this.f35390x = new Paint();
        this.H = -1;
        this.J = org.telegram.messenger.g0.L(288.0f);
        this.M = "";
        this.N = new ArrayList();
        this.U = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.f35381l0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        this.m0 = new HashMap();
        TextPaint textPaint2 = new TextPaint(1);
        this.f35383n0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.f35384o0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.f35385p0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.f35386q0 = textPaint5;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(16.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint3.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint4.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint5.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint5.setTypeface(org.telegram.messenger.g0.o());
        this.f35365a = i7;
        this.f35367b = j3;
        this.f35372e = h6Var;
        this.f35374f = ekVar;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3));
        boolean p02 = org.telegram.messenger.v3.p0(O0);
        this.f35369c = p02;
        if (j3 == org.telegram.messenger.k10.i(i7).e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        setWillNotDraw(false);
        bi.t2 t2Var = new bi.t2(activity, 24);
        this.h = t2Var;
        t2Var.setElevation(org.telegram.messenger.g0.L(9.0f));
        t2Var.setOutlineProvider(new bg.q0(16));
        t2Var.setClipToOutline(true);
        t2Var.setOnTouchListener(new gi.a(26));
        addView(t2Var, c8.ma.e(288, -1, 53));
        int i11 = org.telegram.messenger.g0.f24040m;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        q9 q9Var = new q9(activity);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        if (z10) {
            b9Var.g(1);
            b9Var.f33802p = 0.75f;
            q9Var.setImageDrawable(b9Var);
            String N02 = org.telegram.messenger.hd.N0(2131745705, null);
            i10 = i11;
            N0 = org.telegram.messenger.hd.G(u12.I1().f26509j.size(), "Chats", new Object[0]);
            z11 = p02;
            z12 = z10;
            str = N02;
        } else {
            i10 = i11;
            if (p02) {
                z11 = p02;
                z12 = z10;
                if (O0 != null) {
                    chat = u12.O0(Long.valueOf(O0.linked_monoforum_id));
                } else {
                    chat = null;
                }
                chat = chat == null ? O0 : chat;
                if (chat == null) {
                    str = "";
                } else {
                    b9Var.q(chat);
                    q9Var.f(chat, b9Var);
                    str = chat.title;
                }
                N0 = org.telegram.messenger.hd.N0(2131743738, null);
            } else {
                z11 = p02;
                z12 = z10;
                if (O0 != null) {
                    b9Var.q(O0);
                    q9Var.f(O0, b9Var);
                    str = O0.title;
                    TLRPC.ChatFull P0 = u12.P0(O0.f28434id);
                    int i12 = (P0 == null || (i12 = P0.participants_count) <= 0) ? O0.participants_count : i12;
                    if (i12 > 0) {
                        N0 = org.telegram.messenger.hd.H(',', "Members", i12);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(2131743751, null);
                    }
                } else {
                    TLRPC.User c22 = u12.c2(Long.valueOf(j3));
                    if (c22 == null) {
                        str = "";
                    } else {
                        b9Var.r(c22);
                        q9Var.f(c22, b9Var);
                        str = org.telegram.messenger.p10.q(c22);
                    }
                    N0 = org.telegram.messenger.hd.N0(2131743751, null);
                }
            }
        }
        x01 x01Var = new x01(activity, 0);
        int i13 = org.telegram.ui.ActionBar.m6.G6;
        boolean z13 = z11;
        boolean z14 = z12;
        x01Var.setBackground(org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i13, h6Var)), 24, 24));
        x01Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.ek ekVar2 = ekVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.bn bnVar = ekVar2.f47320a;
                        bnVar.f46122n0.e();
                        if (bnVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", bnVar.getUserConfig().e());
                            bnVar.presentFragment(new k90(bundle, null));
                            return;
                        } else if (org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                            bnVar.presentFragment(ProfileActivity.D4(-bnVar.f46005e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = bnVar.f46005e;
                            if (chat2 != null) {
                                bnVar.presentFragment(ProfileActivity.D4(-chat2.f28434id));
                                return;
                            }
                            TLRPC.User user2 = bnVar.f46019f;
                            if (user2 != null) {
                                bnVar.presentFragment(ProfileActivity.D4(user2.f28583id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.bn bnVar2 = ekVar2.f47320a;
                        org.telegram.ui.ActionBar.q0 q0Var = bnVar2.f46072j0;
                        if (q0Var != null && bnVar2.f46122n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = bnVar2.f46072j0.getPopupLayout();
                            a70 J = a70.J(bnVar2, view);
                            boolean z15 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.M.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            J.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                        CharSequence text = y0Var.getTextView().getText();
                                        if (y0Var.getIconResId() == 0) {
                                            drawable = y0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) {
                                            drawable2 = new oh0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = bnVar2.f46199t1;
                                        if (o0Var != null && y0Var == o0Var.f29838j) {
                                            if (bnVar2.getMessagesController().u2(bnVar2.f46103l6, bnVar2.d(), null)) {
                                                J.c(y0Var.getIconResId(), text, new org.telegram.ui.af(bnVar2, 16), false);
                                            } else {
                                                J.c(y0Var.getIconResId(), text, new org.telegram.ui.u8(17, bnVar2, J), false);
                                            }
                                        } else if (y0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) y0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.b(y0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.re(bnVar2, intValue, 4));
                                            if (drawable3 instanceof oh0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                    if (y0Var2.getImageView() instanceof rh0) {
                                                        rh0 rh0Var = (rh0) y0Var2.getImageView();
                                                        rh0Var.setAnimation((oh0) drawable3);
                                                        rh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.hq0(y0Var, 26));
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            return;
                        }
                        return;
                }
            }
        });
        t2Var.addView(x01Var, c8.ma.f(48.0f, -1, 51, org.telegram.messenger.g0.L(6.0f), i10 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(52.0f), 0));
        x01Var.addView(q9Var, c8.ma.f(40.0f, 40, 51, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(4.0f), 0, 0));
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231244);
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, h6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i13, h6Var)), 1, -1));
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                Drawable drawable;
                Drawable drawable2;
                int i14 = r2;
                org.telegram.ui.ek ekVar2 = ekVar;
                switch (i14) {
                    case 0:
                        org.telegram.ui.bn bnVar = ekVar2.f47320a;
                        bnVar.f46122n0.e();
                        if (bnVar.Z9()) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", bnVar.getUserConfig().e());
                            bnVar.presentFragment(new k90(bundle, null));
                            return;
                        } else if (org.telegram.messenger.v3.p0(bnVar.f46005e)) {
                            bnVar.presentFragment(ProfileActivity.D4(-bnVar.f46005e.linked_monoforum_id));
                            return;
                        } else {
                            TLRPC.Chat chat2 = bnVar.f46005e;
                            if (chat2 != null) {
                                bnVar.presentFragment(ProfileActivity.D4(-chat2.f28434id));
                                return;
                            }
                            TLRPC.User user2 = bnVar.f46019f;
                            if (user2 != null) {
                                bnVar.presentFragment(ProfileActivity.D4(user2.f28583id));
                                return;
                            }
                            return;
                        }
                    default:
                        org.telegram.ui.bn bnVar2 = ekVar2.f47320a;
                        org.telegram.ui.ActionBar.q0 q0Var = bnVar2.f46072j0;
                        if (q0Var != null && bnVar2.f46122n0 != null) {
                            q0Var.z();
                            org.telegram.ui.ActionBar.n0 n0Var = q0Var.R;
                            if (n0Var != null) {
                                n0Var.k();
                            }
                            ActionBarPopupWindow$ActionBarPopupWindowLayout popupLayout = bnVar2.f46072j0.getPopupLayout();
                            a70 J = a70.J(bnVar2, view);
                            boolean z15 = true;
                            for (int i15 = 0; i15 < popupLayout.getItemsCount(); i15++) {
                                View childAt = popupLayout.M.getChildAt(i15);
                                if (childAt != null && childAt.getVisibility() == 0) {
                                    if (childAt instanceof org.telegram.ui.ActionBar.d1) {
                                        if (!z15) {
                                            J.k();
                                            z15 = true;
                                        }
                                    } else if (childAt instanceof org.telegram.ui.ActionBar.y0) {
                                        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt;
                                        CharSequence text = y0Var.getTextView().getText();
                                        if (y0Var.getIconResId() == 0) {
                                            drawable = y0Var.getImageView().getDrawable();
                                        } else {
                                            drawable = null;
                                        }
                                        if ((y0Var.getTag() instanceof Integer) && ((Integer) y0Var.getTag()).intValue() == 29) {
                                            drawable2 = new oh0(2131623944, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                                        } else if (drawable != null && drawable.getConstantState() != null) {
                                            drawable2 = drawable.getConstantState().newDrawable().mutate();
                                        } else {
                                            drawable2 = null;
                                        }
                                        org.telegram.ui.ActionBar.o0 o0Var = bnVar2.f46199t1;
                                        if (o0Var != null && y0Var == o0Var.f29838j) {
                                            if (bnVar2.getMessagesController().u2(bnVar2.f46103l6, bnVar2.d(), null)) {
                                                J.c(y0Var.getIconResId(), text, new org.telegram.ui.af(bnVar2, 16), false);
                                            } else {
                                                J.c(y0Var.getIconResId(), text, new org.telegram.ui.u8(17, bnVar2, J), false);
                                            }
                                        } else if (y0Var.getTag() instanceof Integer) {
                                            int intValue = ((Integer) y0Var.getTag()).intValue();
                                            Drawable drawable3 = drawable2;
                                            J.b(y0Var.getIconResId(), drawable3, text, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.re(bnVar2, intValue, 4));
                                            if (drawable3 instanceof oh0) {
                                                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) J.A;
                                                View childAt2 = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount() - 1);
                                                if (childAt2 instanceof org.telegram.ui.ActionBar.y0) {
                                                    org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt2;
                                                    if (y0Var2.getImageView() instanceof rh0) {
                                                        rh0 rh0Var = (rh0) y0Var2.getImageView();
                                                        rh0Var.setAnimation((oh0) drawable3);
                                                        rh0Var.d();
                                                    }
                                                }
                                            }
                                        } else {
                                            J.b(y0Var.getIconResId(), drawable2, text, org.telegram.ui.ActionBar.m6.F8, org.telegram.ui.ActionBar.m6.E8, new org.telegram.ui.hq0(y0Var, 26));
                                        }
                                        z15 = false;
                                    }
                                }
                            }
                            J.W(5);
                            J.b0(0.0f, -view.getHeight());
                            J.a0();
                            return;
                        }
                        return;
                }
            }
        });
        t2Var.addView(imageView, c8.ma.f(40.0f, 40, 53, 0, org.telegram.messenger.g0.L(3.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        this.f35382n = imageView;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        x01Var.addView(textView, c8.ma.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(6.0f), 0));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine();
        textView2.setEllipsize(truncateAt);
        int i14 = org.telegram.ui.ActionBar.m6.f29773y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.m6.w0(i14, h6Var));
        textView2.setText(N0);
        textView2.setIncludeFontPadding(false);
        x01Var.addView(textView2, c8.ma.f(-2.0f, -1, 51, org.telegram.messenger.g0.L(58.0f), org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(6.0f), 0));
        FrameLayout frameLayout = new FrameLayout(activity);
        int L = org.telegram.messenger.g0.L(4.0f);
        frameLayout.setPadding(L, L, L, L);
        frameLayout.setBackground(new y01(this, L));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(2131232488);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i14, h6Var), mode));
        frameLayout.addView(imageView2, c8.ma.d(20, 20.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        EditText editText = new EditText(activity);
        this.f35389w = editText;
        editText.setBackground(null);
        editText.setPadding(0, 0, 0, 0);
        editText.setTextSize(1, 15.0f);
        editText.setSingleLine();
        editText.setImeOptions(268435459);
        editText.setHint(org.telegram.messenger.hd.N0(2131745640, null));
        editText.setHintTextColor(org.telegram.ui.ActionBar.m6.w0(i14, h6Var));
        editText.setTextColor(org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
        editText.addTextChangedListener(new ah.j(this, 28));
        frameLayout.addView(editText, c8.ma.d(-1, -1.0f, 119, 48.0f, 0.0f, 12.0f, 0.0f));
        t2Var.addView(frameLayout, c8.ma.f(48.0f, -1, 51, org.telegram.messenger.g0.L(12.0f) - L, (org.telegram.messenger.g0.L(56.0f) + i10) - L, org.telegram.messenger.g0.L(8.0f) - L, 0));
        ek0 ek0Var = new ek0(activity, h6Var);
        this.f35387r = ek0Var;
        ek0Var.setLayoutManager(new v4.c0());
        ek0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ek0Var.setClipToPadding(false);
        ek0Var.setVerticalScrollBarEnabled(false);
        v4.k kVar = new v4.k();
        kVar.f59194m = false;
        kVar.C = false;
        nr nrVar = nr.h;
        kVar.f59242i = nrVar;
        kVar.n(350L);
        kVar.d = 160L;
        ek0Var.setItemAnimator(kVar);
        ek0Var.setSelectorRadius(org.telegram.messenger.g0.L(16.0f));
        ek0Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.m6.r1(0.06f, org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
        b11 b11Var = new b11(this);
        this.f35388s = b11Var;
        ek0Var.setAdapter(b11Var);
        ek0Var.setOnItemClickListener(new fi.g4(14, this, ekVar));
        ek0Var.setOnItemLongClickListener((sj0) new h2(22, this, ekVar));
        ek0Var.j(new z01(this, i7, j3));
        t2Var.addView(ek0Var, c8.ma.f(-1.0f, -1, 119, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(100.0f) + i10, org.telegram.messenger.g0.L(8.0f), 0));
        org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(7, activity, h6Var);
        this.S = f61Var;
        f61Var.setLayoutManager(new v4.c0(0, false));
        f61Var.setPadding(org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f), 0);
        f61Var.setClipToPadding(false);
        f61Var.setHorizontalScrollBarEnabled(false);
        f61Var.setOverScrollMode(2);
        v4.k kVar2 = new v4.k();
        kVar2.f59194m = false;
        kVar2.C = false;
        kVar2.o(nrVar);
        kVar2.n(320L);
        f61Var.setItemAnimator(kVar2);
        di.l4 l4Var = new di.l4(this, 5);
        this.T = l4Var;
        f61Var.setAdapter(l4Var);
        f61Var.setOnItemClickListener(new o(this, 19));
        f61Var.setVisibility(8);
        t2Var.addView(f61Var, c8.ma.f(36.0f, -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        int i15 = org.telegram.ui.ActionBar.m6.f29381d6;
        int w03 = org.telegram.ui.ActionBar.m6.w0(i15, h6Var);
        View view = new View(activity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{w03, i0.a.o(w03, 0)}));
        t2Var.addView(view, c8.ma.f(org.telegram.messenger.g0.L(16.0f), -1, 51, 0, org.telegram.messenger.g0.L(100.0f) + i10, 0, 0));
        View view2 = new View(activity);
        this.G = view2;
        view2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{w03, i0.a.o(w03, 0)}));
        t2Var.addView(view2, c8.ma.e(-1, 24, 87));
        this.F = view;
        o();
        if (j3 > 0) {
            user = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(j3));
        } else {
            user = null;
        }
        if (!z13 && !z14 && ((O0 != null && org.telegram.messenger.v3.w(15, O0)) || org.telegram.messenger.p10.w(user))) {
            FrameLayout frameLayout2 = new FrameLayout(activity);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(25.0f));
            gradientDrawable.setColor(i0.a.o(w03, 224));
            frameLayout2.setBackground(gradientDrawable);
            frameLayout2.setElevation(org.telegram.messenger.g0.L(2.0f));
            frameLayout2.setPadding(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(org.telegram.messenger.g0.o());
            int i16 = org.telegram.ui.ActionBar.m6.Ji;
            textView3.setTextColor(org.telegram.ui.ActionBar.m6.w0(i16, h6Var));
            textView3.setText(org.telegram.messenger.hd.N0(2131748058, null));
            textView3.setGravity(17);
            textView3.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
            textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(8.0f));
            Drawable mutate = activity.getDrawable(2131231177).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i16, h6Var), mode));
            textView3.setCompoundDrawablesWithIntrinsicBounds(mutate, (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(22.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var)));
            c8.ra.a(textView3);
            textView3.setOnClickListener(new m8(27, this, ekVar));
            frameLayout2.addView(textView3, c8.ma.c(44.0f, -2));
            t2Var.addView(frameLayout2, c8.ma.d(-2, 50.0f, 81, 0.0f, 0.0f, 0.0f, 8.0f));
            this.E = frameLayout2;
        }
        t2Var.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(i15, h6Var));
        setProgress(0.0f);
    }

    public static boolean a(g11 g11Var, c11 c11Var) {
        if (g11Var.i()) {
            TLRPC.TL_forumTopic tL_forumTopic = c11Var.f33975a;
            if (tL_forumTopic != null) {
                long j3 = g11Var.V;
                if (j3 == 0 || tL_forumTopic.icon_emoji_id == j3) {
                    Boolean bool = g11Var.W;
                    if (bool != null && tL_forumTopic.closed != bool.booleanValue()) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private int getPanelWidth() {
        return this.J + this.I;
    }

    private void setTagsShown(boolean z10) {
        float f10;
        if (this.f35379j0 == z10) {
            return;
        }
        this.f35379j0 = z10;
        ValueAnimator valueAnimator = this.f35368b0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f35368b0 = null;
        }
        float f11 = this.f35366a0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f35368b0 = ofFloat;
        ofFloat.addUpdateListener(new s01(this, 1));
        this.f35368b0.addListener(new w01(this, 0));
        this.f35368b0.setDuration(320L);
        this.f35368b0.setInterpolator(nr.h);
        this.f35368b0.start();
    }

    public final void b(float f10, float f11) {
        long j3;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        float f12 = this.f35391y;
        if (f12 == f10) {
            setProgress(f10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new s01(this, 2));
        this.K.addListener(new w01(this, 2));
        float abs = Math.abs(f10 - this.f35391y) * getPanelWidth();
        if (Math.abs(f11) > org.telegram.messenger.g0.L(300.0f)) {
            j3 = Math.max(150.0f, Math.min(320.0f, (abs / Math.abs(f11)) * 1000.0f * 2.0f));
        } else {
            j3 = 320;
        }
        this.K.setDuration(j3);
        this.K.setInterpolator(nr.h);
        this.K.start();
    }

    public final void c(float f10) {
        org.telegram.ui.f61 f61Var = this.S;
        int childCount = f61Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = f61Var.getChildAt(i7);
            float T1 = org.telegram.messenger.g0.T1(0.6f, 1.0f, f10);
            childAt.setScaleX(T1);
            childAt.setScaleY(T1);
            childAt.setAlpha(f10);
        }
    }

    public final void d() {
        t01 t01Var = this.P;
        if (t01Var != null) {
            org.telegram.messenger.g0.r(t01Var);
            this.P = null;
        }
        if (this.O != 0) {
            ConnectionsManager.getInstance(this.f35365a).cancelRequest(this.O, true);
            this.O = 0;
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25390t5) {
            if (((Long) objArr[0]).longValue() == (-this.f35367b)) {
                n();
            }
        } else if (i7 == org.telegram.messenger.ls.f25371r) {
            n();
        } else if (i7 == org.telegram.messenger.ls.f25325i3) {
            if (this.d) {
                n();
            }
        } else if (i7 == org.telegram.messenger.ls.f25342l4) {
            org.telegram.messenger.g0.d0(this.f35387r, new pg.c(0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.m6.r1(this.f35391y, 687865856);
        Paint paint = this.f35390x;
        paint.setColor(r12);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        org.telegram.ui.ek ekVar = this.f35374f;
        if (ekVar != null && this.f35391y > 0.0f) {
            org.telegram.ui.bn.N2(ekVar.f47320a, canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f35370c0 = true;
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return dispatchTouchEvent;
        }
        int i7 = 0;
        this.f35370c0 = false;
        if (this.f35391y <= 0.0f) {
            i7 = 8;
        }
        setVisibility(i7);
        return dispatchTouchEvent;
    }

    public final void e() {
        b(0.0f, 0.0f);
        org.telegram.messenger.g0.v1(this.f35389w);
    }

    public final TLObject f(c11 c11Var) {
        long o4;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(this.f35365a);
        org.telegram.messenger.pv pvVar = c11Var.f33976b;
        if (pvVar != null) {
            o4 = pvVar.f26350a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic = c11Var.f33975a;
            if (tL_forumTopic != null && this.f35369c) {
                o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
            } else {
                return null;
            }
        }
        if (o4 >= 0) {
            return u12.c2(Long.valueOf(o4));
        }
        return u12.O0(Long.valueOf(-o4));
    }

    public final String g(long j3) {
        int i7 = this.f35365a;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(i7);
        if (j3 == org.telegram.messenger.k10.i(i7).e()) {
            return org.telegram.messenger.hd.N0(2131748110, null);
        }
        if (j3 == 2666000) {
            return org.telegram.messenger.hd.N0(2131754249, null);
        }
        if (j3 >= 0) {
            return org.telegram.messenger.p10.q(u12.c2(Long.valueOf(j3)));
        }
        TLRPC.Chat O0 = u12.O0(Long.valueOf(-j3));
        if (O0 != null) {
            return O0.title;
        }
        return "";
    }

    public int getContentWidth() {
        return this.J;
    }

    public float getProgress() {
        return this.f35391y;
    }

    public final boolean h() {
        if (!this.d && !this.f35369c && this.f35367b < 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.V == 0 && this.W == null) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        if (!this.d && !this.f35369c) {
            if (!TextUtils.isEmpty(this.M) || i()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k() {
        if (this.P == null && this.O == 0 && !this.R && j()) {
            String str = this.M;
            long j3 = this.V;
            Boolean bool = this.W;
            org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(this.f35365a).f25968t7;
            long j10 = -this.f35367b;
            org.telegram.messenger.e00 e00Var = this.Q;
            u01 u01Var = new u01(this, str, j3, bool);
            f00Var.getClass();
            TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
            tL_messages_getForumTopics.peer = f00Var.getMessagesController().l1(-j10);
            Long l10 = null;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            tL_messages_getForumTopics.f28654q = str;
            if (j3 != 0) {
                l10 = Long.valueOf(j3);
            }
            tL_messages_getForumTopics.icon_emoji_id = l10;
            tL_messages_getForumTopics.closed = bool;
            if (e00Var != null) {
                tL_messages_getForumTopics.offset_date = e00Var.f23653a;
                tL_messages_getForumTopics.offset_id = e00Var.f23654b;
                tL_messages_getForumTopics.offset_topic = e00Var.f23655c;
            }
            tL_messages_getForumTopics.limit = 50;
            this.O = f00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.ho(f00Var, j10, u01Var, 10));
        }
    }

    public final void l(boolean z10) {
        long j3;
        d();
        this.N.clear();
        this.Q = null;
        this.R = false;
        if (!j()) {
            return;
        }
        t01 t01Var = new t01(this, 0);
        this.P = t01Var;
        if (z10) {
            j3 = 350;
        } else {
            j3 = 0;
        }
        org.telegram.messenger.g0.h3(t01Var, j3);
    }

    public final boolean m(c11 c11Var) {
        String str;
        org.telegram.messenger.pv pvVar = c11Var.f33976b;
        String str2 = "";
        if (pvVar != null) {
            String g10 = g(pvVar.f26350a);
            if (g10 != null) {
                str2 = g10.toString();
            }
        } else {
            TLObject f10 = f(c11Var);
            if (f10 instanceof TLRPC.User) {
                str2 = org.telegram.messenger.p10.q((TLRPC.User) f10);
            } else if (f10 instanceof TLRPC.Chat) {
                str2 = ((TLRPC.Chat) f10).title;
            } else {
                TLRPC.TL_forumTopic tL_forumTopic = c11Var.f33975a;
                if (tL_forumTopic != null && (str = tL_forumTopic.title) != null) {
                    str2 = str;
                }
            }
        }
        return str2.toLowerCase().contains(this.M);
    }

    public final void n() {
        boolean z10;
        float f10;
        boolean z11;
        ArrayList l10;
        boolean z12;
        String str;
        String str2;
        String str3;
        float f11;
        ArrayList arrayList;
        boolean z13;
        int visibility = getVisibility();
        b11 b11Var = this.f35388s;
        if (visibility != 0 && this.f35391y <= 0.0f && b11Var.f33705c.size() > 0) {
            return;
        }
        ArrayList arrayList2 = b11Var.f33705c;
        String str4 = b11Var.d;
        g11 g11Var = b11Var.f33706e;
        long j3 = g11Var.f35367b;
        int i7 = g11Var.f35365a;
        String str5 = g11Var.M;
        boolean z14 = g11Var.d;
        if (TextUtils.equals(str4, str5) && g11Var.f35391y > 0.0f && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        b11Var.d = g11Var.M;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList2.clear();
        if (z14) {
            f10 = 0.0f;
            z11 = z10;
            l10 = null;
        } else {
            f10 = 0.0f;
            z11 = z10;
            l10 = org.telegram.messenger.np.u1(i7).f25968t7.l(-j3);
        }
        if (!z14) {
            di.l4 l4Var = g11Var.T;
            ArrayList arrayList4 = g11Var.U;
            if (g11Var.h()) {
                f11 = f10;
                arrayList = (ArrayList) org.telegram.messenger.np.u1(i7).f25968t7.f23811f.f(-j3);
            } else {
                f11 = f10;
                arrayList = null;
            }
            ArrayList arrayList5 = new ArrayList();
            z12 = z14;
            if (arrayList != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    long longValue = ((Long) obj).longValue();
                    if (longValue != 0) {
                        ArrayList arrayList6 = arrayList;
                        ?? obj2 = new Object();
                        obj2.f34344a = longValue;
                        arrayList5.add(obj2);
                        arrayList = arrayList6;
                    }
                }
            }
            if (g11Var.h()) {
                boolean[] zArr = {false, true};
                for (int i11 = 0; i11 < 2; i11++) {
                    boolean z15 = zArr[i11];
                    ?? obj3 = new Object();
                    obj3.f34345b = Boolean.valueOf(z15);
                    arrayList5.add(obj3);
                }
            }
            if (arrayList5.isEmpty() && g11Var.i()) {
                g11Var.V = 0L;
                str = null;
                g11Var.W = null;
                g11Var.l(false);
            } else {
                str = null;
            }
            ArrayList arrayList7 = new ArrayList(arrayList4);
            arrayList4.clear();
            arrayList4.addAll(arrayList5);
            if (arrayList7.isEmpty() || arrayList5.isEmpty() || g11Var.f35366a0 <= f11) {
                z13 = true;
                l4Var.f();
            } else {
                a11 a11Var = new a11(arrayList7, arrayList5);
                z13 = true;
                v4.o.c(a11Var, true).c(l4Var);
            }
            g11Var.setTagsShown(arrayList4.isEmpty() ^ z13);
        } else {
            z12 = z14;
            str = null;
        }
        if (TextUtils.isEmpty(g11Var.M) && !g11Var.i()) {
            arrayList2.add(new c11(g11Var));
        }
        if (z12) {
            ArrayList arrayList8 = org.telegram.messenger.np.u1(i7).I1().f26509j;
            int size2 = arrayList8.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj4 = arrayList8.get(i12);
                i12++;
                c11 c11Var = new c11(g11Var);
                c11Var.f33976b = (org.telegram.messenger.pv) obj4;
                if (!TextUtils.isEmpty(g11Var.M) && !g11Var.m(c11Var)) {
                    TLObject f12 = g11Var.f(c11Var);
                    if (f12 instanceof TLRPC.User) {
                        str3 = org.telegram.messenger.p10.o((TLRPC.User) f12);
                    } else if (f12 instanceof TLRPC.Chat) {
                        str3 = org.telegram.messenger.v3.K((TLRPC.Chat) f12, false);
                    } else {
                        str3 = str;
                    }
                    if (str3 != null && str3.toLowerCase().contains(g11Var.M)) {
                    }
                }
                arrayList2.add(c11Var);
            }
            b11Var.E(arrayList3, z11);
        } else {
            boolean z16 = z11;
            HashSet hashSet = new HashSet();
            if (l10 != null) {
                int size3 = l10.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj5 = l10.get(i13);
                    i13++;
                    c11 c11Var2 = new c11(g11Var);
                    c11Var2.f33975a = (TLRPC.TL_forumTopic) obj5;
                    if (!TextUtils.isEmpty(g11Var.M) && !g11Var.m(c11Var2)) {
                        TLObject f13 = g11Var.f(c11Var2);
                        if (f13 instanceof TLRPC.User) {
                            str2 = org.telegram.messenger.p10.o((TLRPC.User) f13);
                        } else if (f13 instanceof TLRPC.Chat) {
                            str2 = org.telegram.messenger.v3.K((TLRPC.Chat) f13, false);
                        } else {
                            str2 = str;
                        }
                        if (str2 != null && str2.toLowerCase().contains(g11Var.M)) {
                        }
                    }
                    if (a(g11Var, c11Var2)) {
                        arrayList2.add(c11Var2);
                        hashSet.add(Long.valueOf(c11Var2.a()));
                    }
                }
            }
            if (g11Var.j()) {
                ArrayList arrayList9 = g11Var.N;
                int size4 = arrayList9.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj6 = arrayList9.get(i14);
                    i14++;
                    c11 c11Var3 = new c11(g11Var);
                    c11Var3.f33975a = (TLRPC.TL_forumTopic) obj6;
                    if (a(g11Var, c11Var3) && hashSet.add(Long.valueOf(c11Var3.a()))) {
                        arrayList2.add(c11Var3);
                    }
                }
            }
            b11Var.E(arrayList3, z16);
        }
        this.f35387r.post(new t01(this, 1));
    }

    public final void o() {
        View view;
        View view2 = this.F;
        if (view2 != null && (view = this.G) != null) {
            ek0 ek0Var = this.f35387r;
            view2.setAlpha(Utilities.i(ek0Var.computeVerticalScrollOffset() / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            if (this.E != null) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(Utilities.i(((ek0Var.computeVerticalScrollRange() - ek0Var.computeVerticalScrollOffset()) - ek0Var.computeVerticalScrollExtent()) / org.telegram.messenger.g0.L(16.0f), 1.0f, 0.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.f35365a;
        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25390t5);
        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25371r);
        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25325i3);
        org.telegram.messenger.ls.e().b(this, org.telegram.messenger.ls.f25342l4);
        if (h()) {
            org.telegram.messenger.f00 f00Var = org.telegram.messenger.np.u1(i7).f25968t7;
            long j3 = -this.f35367b;
            LongSparseIntArray longSparseIntArray = f00Var.f23812n;
            long j10 = -j3;
            if (!f00Var.getMessagesController().E2(j10) && longSparseIntArray.get(j3, 0) == 0 && System.currentTimeMillis() - f00Var.h.get(j3, 0L) >= 300000) {
                longSparseIntArray.put(j3, 1);
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = f00Var.getMessagesController().l1(j10);
                tL_messages_getForumTopics.limit = 1;
                f00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.x4(f00Var, j3, 5));
            }
        }
        n();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.f35365a;
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25390t5);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25371r);
        org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25325i3);
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
        d();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f35371d0 = motionEvent.getX();
            this.f35373e0 = motionEvent.getY();
            this.f35375f0 = false;
            this.f35376g0 = true;
            this.f35377h0 = this.f35391y;
            VelocityTracker velocityTracker = this.f35378i0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f35378i0 = obtain;
            obtain.addMovement(motionEvent);
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && this.f35376g0) {
            VelocityTracker velocityTracker2 = this.f35378i0;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            float x10 = motionEvent.getX() - this.f35371d0;
            float y10 = motionEvent.getY() - this.f35373e0;
            if (x10 > ViewConfiguration.get(getContext()).getScaledTouchSlop() && Math.abs(x10) > Math.abs(y10) * 1.5f) {
                this.f35375f0 = true;
                this.f35371d0 = motionEvent.getX();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.l1 a10 = r0.b0.a(this);
        if (a10 != null) {
            i13 = a10.f56303a.f(2).d;
        } else {
            i13 = 0;
        }
        if (i13 != this.H) {
            this.H = i13;
            ek0 ek0Var = this.f35387r;
            View view = this.G;
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(8.0f) + i13;
                view.getLayoutParams().height = org.telegram.messenger.g0.L(64.0f) + i13;
                ek0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(66.0f) + i13);
            } else {
                view.getLayoutParams().height = org.telegram.messenger.g0.L(24.0f) + i13;
                ek0Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(8.0f) + i13);
            }
            this.h.requestLayout();
        }
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        org.telegram.ui.bn bnVar;
        org.telegram.ui.ActionBar.q0 o92;
        org.telegram.ui.ActionBar.k kVar;
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.l1 a10 = r0.b0.a(this);
        int i12 = 0;
        if (a10 != null) {
            i11 = org.telegram.messenger.g0.I0(a10, false).f15919c;
        } else {
            i11 = 0;
        }
        int i13 = this.I;
        bi.t2 t2Var = this.h;
        if (i11 != i13) {
            this.I = i11;
            t2Var.getLayoutParams().width = getPanelWidth();
            t2Var.setPadding(0, 0, i11, 0);
            t2Var.setTranslationX((1.0f - this.f35391y) * getPanelWidth());
        }
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.ui.ek ekVar = this.f35374f;
        if (ekVar != null && (o92 = (bnVar = ekVar.f47320a).o9()) != null) {
            kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
            i12 = (int) ((kVar.getWidth() - ((o92.getWidth() / 2.0f) + (o92.getX() + ((View) o92.getParent()).getX()))) + org.telegram.messenger.g0.L(31.0f));
        }
        int max = Math.max(org.telegram.messenger.g0.L(200.0f), Math.min(org.telegram.messenger.g0.L(288.0f), (size - this.I) - i12));
        if (max != this.J) {
            this.J = max;
            t2Var.getLayoutParams().width = getPanelWidth();
            t2Var.setTranslationX((1.0f - this.f35391y) * getPanelWidth());
            this.f35388s.f();
        }
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g11.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentTopic(long j3) {
        this.L = j3;
        this.f35388s.f();
    }

    public void setMenuAvailable(boolean z10) {
        int i7;
        ImageView imageView = this.f35382n;
        if (imageView != null) {
            if (z10) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView.setVisibility(i7);
        }
    }

    public void setProgress(float f10) {
        boolean z10;
        int i7 = 0;
        if (this.f35391y <= 0.0f && f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35391y = Utilities.l(f10);
        if (z10 && this.S != null) {
            ValueAnimator valueAnimator = this.f35380k0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.f35379j0 && this.f35368b0 == null) {
                c(0.0f);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f35380k0 = ofFloat;
                ofFloat.addUpdateListener(new s01(this, 0));
                this.f35380k0.addListener(new w01(this, 1));
                this.f35380k0.setDuration(320L);
                this.f35380k0.setInterpolator(nr.h);
                this.f35380k0.start();
            }
        }
        this.h.setTranslationX((1.0f - this.f35391y) * getPanelWidth());
        if (this.f35391y <= 0.0f && !this.f35370c0) {
            i7 = 8;
        }
        setVisibility(i7);
        invalidate();
        org.telegram.ui.ek ekVar = this.f35374f;
        if (ekVar != null) {
            ekVar.f47320a.f46111m1.invalidate();
        }
    }

    public void settle(float f10) {
        boolean z10 = false;
        float f11 = 0.0f;
        if (Math.abs(f10) <= org.telegram.messenger.g0.L(300.0f) ? this.f35391y > 0.5f : f10 < 0.0f) {
            z10 = true;
        }
        if (z10) {
            n();
        }
        if (z10) {
            f11 = 1.0f;
        }
        b(f11, f10);
        if (!z10) {
            org.telegram.messenger.g0.v1(this.f35389w);
        }
    }
}
