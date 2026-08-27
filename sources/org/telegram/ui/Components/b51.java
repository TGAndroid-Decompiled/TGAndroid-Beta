package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.c91;
import org.telegram.ui.o91;

public class b51 extends xf.b {
    public z41 D;
    public z41 E;
    public int F;
    public boolean G;
    public Utilities.Callback2 H;
    public boolean I;
    public final zk0 d;

    public final Context f26939e;

    public final int f26940f;
    public final int h;

    public final boolean f26941n;

    public Utilities.Callback2 f26943s;
    public final org.telegram.ui.ActionBar.c6 v;

    public rf.f f26946y;

    public boolean f26942r = true;

    public final ArrayList f26944w = new ArrayList();

    public final ArrayList f26945x = new ArrayList();
    public int A = 0;
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();

    public b51(zk0 zk0Var, Context context, int i10, int i11, boolean z10, Utilities.Callback2 callback2, org.telegram.ui.ActionBar.c6 c6Var) {
        this.d = zk0Var;
        this.f26939e = context;
        this.f26940f = i10;
        this.h = i11;
        this.f26941n = z10;
        this.f26943s = callback2;
        this.v = c6Var;
        N(false);
    }

    public static boolean K(int i10) {
        if (i10 < 10000) {
            return i10 == 7 || i10 == 8 || i10 == 38 || i10 == 31 || i10 == -4 || i10 == 28 || i10 == 2 || i10 == -2;
        }
        m41 m41VarF = n41.F(i10);
        return m41VarF != null && m41VarF.isShadow();
    }

    @Override
    public boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        n41 n41VarG = G(o1Var.b());
        if (i10 >= 10000) {
            m41 m41VarF = n41.F(i10);
            if (m41VarF == null || !m41VarF.isClickable()) {
                return false;
            }
        } else if (i10 != 3 && i10 != 5 && i10 != 6 && i10 != 30 && i10 != 4 && i10 != 10 && i10 != 44 && i10 != 11 && i10 != 12 && i10 != 17 && i10 != 16 && i10 != 29 && i10 != 25 && i10 != 27 && i10 != 32 && i10 != 33 && i10 != 35 && i10 != 36 && i10 != 37 && i10 != 41 && i10 != 39 && i10 != 40 && i10 != 38) {
            return false;
        }
        return n41VarG == null || n41VarG.f30840g;
    }

    public final void F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.C;
            if (i10 >= arrayList.size()) {
                return;
            }
            z41 z41Var = (z41) arrayList.get(i10);
            this.H.run(Integer.valueOf(i10), new ArrayList(this.f26945x.subList(z41Var.f35149a, z41Var.f35150b + 1)));
            this.G = false;
        }
    }

    public final n41 G(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f26945x;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (n41) arrayList.get(i10);
    }

    public final int H(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.C;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            z41 z41Var = (z41) arrayList.get(i11);
            if (i10 >= z41Var.f35149a && i10 <= z41Var.f35150b) {
                return i11;
            }
            i11++;
        }
    }

    public int I(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.v);
    }

    public final boolean J(int i10) {
        n41 n41VarG = G(i10);
        n41 n41VarG2 = G(i10 + 1);
        return (n41VarG == null || n41VarG.f30842j || n41VarG2 == null || K(n41VarG2.f49413a) != K(n41VarG.f49413a)) ? false : true;
    }

    public final void L() {
        z41 z41Var = this.E;
        if (z41Var != null) {
            z41Var.f35150b = Math.max(0, this.f26945x.size() - 1);
        }
    }

    public final int M() {
        z41 z41Var = new z41();
        this.E = z41Var;
        z41Var.f35149a = this.f26945x.size();
        z41 z41Var2 = this.E;
        z41Var2.f35150b = -1;
        ArrayList arrayList = this.C;
        arrayList.add(z41Var2);
        return arrayList.size() - 1;
    }

    public void N(boolean z10) {
        zk0 zk0Var = this.d;
        if (zk0Var == null || !zk0Var.b0()) {
            P(z10);
        } else {
            zk0Var.post(new f50(9, this, z10));
        }
    }

    public final void O(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.ActionBar.x5) {
            ((org.telegram.ui.ActionBar.x5) view).d();
            int i10 = o1Var.f5793f;
            if (this.f26942r) {
                if (i10 < 10000) {
                    switch (i10) {
                    }
                }
                view.setBackgroundColor(I(this.f26941n ? org.telegram.ui.ActionBar.g6.f23124h5 : org.telegram.ui.ActionBar.g6.f23053d6));
            }
        }
    }

    public final void P(boolean z10) {
        zk0 zk0Var = this.d;
        if (zk0Var == null || !zk0Var.b0()) {
            ArrayList arrayList = this.f26944w;
            arrayList.clear();
            ArrayList arrayList2 = this.f26945x;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            this.D = null;
            this.B.clear();
            this.C.clear();
            Utilities.Callback2 callback2 = this.f26943s;
            if (callback2 != null) {
                callback2.run(arrayList2, this);
                R();
                if (z10) {
                    E(arrayList, arrayList2);
                } else {
                    l();
                }
            }
        }
    }

    public final void Q(f2.o1 o1Var, boolean z10) {
        if (o1Var == null) {
            return;
        }
        View view = o1Var.f5789a;
        int i10 = o1Var.f5793f;
        if (i10 < 10000) {
            if (i10 != 16) {
                return;
            }
            ((qf.m1) view).setReorder(z10);
        } else {
            m41 m41VarF = n41.F(i10);
            if (m41VarF != null) {
                m41VarF.attachedView(this.d, view, G(o1Var.b()));
            }
        }
    }

    public final void R() {
        zk0 zk0Var = this.d;
        if (zk0Var == null) {
            return;
        }
        ArrayList arrayList = zk0Var.G2;
        if (arrayList == null) {
            zk0Var.G2 = new ArrayList();
        } else {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            z41 z41Var = (z41) obj;
            zk0Var.G2.add(Long.valueOf(AndroidUtilities.pack(z41Var.f35149a, z41Var.f35150b)));
        }
    }

    public final void S() {
        ArrayList arrayList = this.f26944w;
        arrayList.clear();
        ArrayList arrayList2 = this.f26945x;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.B.clear();
        this.C.clear();
        Utilities.Callback2 callback2 = this.f26943s;
        if (callback2 != null) {
            callback2.run(arrayList2, this);
        }
        R();
    }

    public final void T() {
        z41 z41Var = this.D;
        if (z41Var != null) {
            z41Var.f35150b = Math.max(0, (this.f26945x.size() + this.A) - 1);
            z41 z41Var2 = this.D;
            if (z41Var2.f35149a == z41Var2.f35150b) {
                this.B.remove(z41Var2);
            }
            this.D = null;
        }
    }

    public final void U() {
        z41 z41Var = new z41();
        this.D = z41Var;
        z41Var.f35149a = this.f26945x.size() + this.A;
        z41 z41Var2 = this.D;
        z41Var2.f35150b = -1;
        this.B.add(z41Var2);
    }

    @Override
    public final int h() {
        return this.f26945x.size();
    }

    @Override
    public final int j(int i10) {
        n41 n41VarG = G(i10);
        if (n41VarG == null) {
            return 0;
        }
        return n41VarG.f49413a;
    }

    @Override
    public void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.x8 x8Var;
        View view;
        boolean z10;
        boolean z11;
        int i11;
        org.telegram.ui.Cells.z1 z1Var;
        ?? r10;
        TLRPC.Document document;
        long j10;
        String str;
        ImageLocation imageLocation;
        TLRPC.Photo photo;
        long j11;
        boolean z12;
        byte b10;
        boolean z13;
        long j12;
        long j13;
        boolean z14;
        CharSequence charSequenceConcat;
        int i12;
        int i13 = this.f26940f;
        zk0 zk0Var = this.d;
        n41 n41VarG = G(i10);
        n41 n41VarG2 = G(i10 + 1);
        n41 n41VarG3 = G(i10 - 1);
        if (n41VarG == null) {
            return;
        }
        int i14 = o1Var.f5793f;
        View view2 = o1Var.f5789a;
        boolean zJ = J(i10);
        O(o1Var);
        if (i14 < 10000) {
            String str2 = "+";
            String userName = "";
            switch (i14) {
                case -4:
                case -2:
                case -1:
                    FrameLayout frameLayout = (FrameLayout) view2;
                    frameLayout.setClipChildren(!n41VarG.f30838e);
                    frameLayout.setClipToPadding(!n41VarG.f30838e);
                    if (frameLayout.getChildCount() != (n41VarG.f30837c == null ? 0 : 1) || frameLayout.getChildAt(0) != n41VarG.f30837c) {
                        frameLayout.removeAllViews();
                        View view3 = n41VarG.f30837c;
                        if (view3 != null) {
                            AndroidUtilities.removeFromParent(view3);
                            frameLayout.addView(n41VarG.f30837c, (i14 == -1 || i14 == -4) ? h7.z5.c(n41VarG.f30857z, -1) : h7.z5.c(-2.0f, -2));
                        }
                    }
                    break;
                case -3:
                    y41 y41Var = (y41) view2;
                    y41Var.f34808a = n41VarG.f30857z;
                    y41Var.f34809b = h7.a8.a(n41VarG.f30856y, 1);
                    if (y41Var.getChildCount() != (n41VarG.f30837c == null ? 0 : 1) || y41Var.getChildAt(0) != n41VarG.f30837c) {
                        y41Var.removeAllViews();
                        View view4 = n41VarG.f30837c;
                        if (view4 != null) {
                            AndroidUtilities.removeFromParent(view4);
                            y41Var.addView(n41VarG.f30837c, h7.z5.c(-1.0f, -1));
                        }
                    }
                    break;
                case 0:
                case 1:
                case 26:
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view2;
                    j4Var.setText(n41VarG.f30844l);
                    j4Var.b(n41VarG.f30840g);
                    break;
                case 2:
                    h11 h11Var = (h11) view2;
                    int i15 = n41VarG.f30843k;
                    if (i15 == 0) {
                        int i16 = n41VarG.f30857z;
                        if (i16 != 0) {
                            h11Var.setEmojiSize(i16);
                        }
                        String string = n41VarG.f30845m.toString();
                        String string2 = n41VarG.f30846n.toString();
                        h11Var.getClass();
                        MediaDataController.getInstance(UserConfig.selectedAccount).setPlaceholderImage(h11Var.f28899b, string, string2, "90_90");
                    } else if (n41VarG.f30849q) {
                        h11Var.setEmojiStatic(i15);
                    } else {
                        h11Var.setEmoji(i15);
                    }
                    if (!TextUtils.isEmpty(n41VarG.f30847o)) {
                        CharSequence charSequence = n41VarG.f30844l;
                        CharSequence charSequence2 = n41VarG.f30847o;
                        p80 p80Var = h11Var.f28900c;
                        p80Var.setText(charSequence);
                        p80Var.setVisibility(0);
                        p80 p80Var2 = h11Var.d;
                        p80Var2.setText(charSequence2);
                        p80Var2.setMaxWidth(lh.w3.a(charSequence2, p80Var2.getPaint()));
                        p80Var2.requestLayout();
                        h11Var.d();
                    } else {
                        h11Var.setText(n41VarG.f30844l);
                    }
                    break;
                case 3:
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view2;
                    Object obj = n41VarG.G;
                    if (obj instanceof TLRPC.Document) {
                        CharSequence charSequence3 = n41VarG.f30844l;
                        TLRPC.Document document2 = (TLRPC.Document) obj;
                        l8Var.f24636w = 16;
                        l8Var.f24635s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var = l8Var.f24628a;
                        h5Var.l(charSequence3, false);
                        h5Var.i(null);
                        j6 j6Var = l8Var.f24630c;
                        l8Var.I = null;
                        j6Var.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        j6Var.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        ri0 ri0Var = l8Var.f24631e;
                        ri0Var.setVisibility(8);
                        ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        l8Var.f24634r = zJ;
                        l8Var.setWillNotDraw(!zJ);
                        Switch r11 = l8Var.f24632f;
                        if (r11 != null) {
                            r11.setVisibility(8);
                        }
                        l8Var.setValueSticker(document2);
                    } else if (obj instanceof String) {
                        CharSequence charSequence4 = n41VarG.f30844l;
                        String str3 = (String) obj;
                        l8Var.f24636w = 16;
                        l8Var.f24635s = 58;
                        org.telegram.ui.ActionBar.h5 h5Var2 = l8Var.f24628a;
                        h5Var2.l(charSequence4, false);
                        h5Var2.i(null);
                        j6 j6Var2 = l8Var.f24630c;
                        l8Var.I = null;
                        j6Var2.c(null, false, true);
                        l8Var.h.setVisibility(8);
                        j6Var2.setVisibility(8);
                        l8Var.d.setVisibility(8);
                        ri0 ri0Var2 = l8Var.f24631e;
                        ri0Var2.setVisibility(8);
                        ri0Var2.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                        l8Var.f24634r = zJ;
                        l8Var.setWillNotDraw(!zJ);
                        Switch r12 = l8Var.f24632f;
                        if (r12 != null) {
                            r12.setVisibility(8);
                        }
                        l8Var.setValueSticker(str3);
                    } else if (TextUtils.isEmpty(n41VarG.f30846n)) {
                        Object obj2 = n41VarG.G;
                        if (obj2 instanceof Drawable) {
                            l8Var.n(n41VarG.f30844l, (Drawable) obj2, zJ);
                        } else {
                            int i17 = n41VarG.f30843k;
                            if (i17 == 0) {
                                l8Var.i(n41VarG.f30844l, zJ);
                            } else {
                                l8Var.m(i17, n41VarG.f30844l, zJ);
                            }
                        }
                    } else {
                        Object obj3 = n41VarG.G;
                        if (obj3 instanceof Drawable) {
                            l8Var.r(n41VarG.f30844l, n41VarG.f30846n, (Drawable) obj3, zJ);
                        } else {
                            int i18 = n41VarG.f30843k;
                            if (i18 == 0) {
                                l8Var.o(n41VarG.f30844l, n41VarG.f30846n, false, zJ);
                            } else {
                                l8Var.s(n41VarG.f30844l, n41VarG.f30846n, false, i18, zJ);
                            }
                        }
                    }
                    if (n41VarG.f30849q) {
                        int i19 = org.telegram.ui.ActionBar.g6.q6;
                        l8Var.e(i19, i19);
                    } else if (n41VarG.f30850r) {
                        l8Var.e(org.telegram.ui.ActionBar.g6.f23284q7, org.telegram.ui.ActionBar.g6.f23269p7);
                    } else {
                        l8Var.e(org.telegram.ui.ActionBar.g6.f23215m6, org.telegram.ui.ActionBar.g6.G6);
                    }
                    l8Var.g(n41VarG.f30840g);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view2;
                    if (p8Var.f25001b == n41VarG.d) {
                        p8Var.setChecked(n41VarG.f30838e);
                    }
                    p8Var.e(null, n41VarG.f30840g);
                    p8Var.f(n41VarG.f30844l, n41VarG.f30838e, zJ);
                    p8Var.f25001b = n41VarG.d;
                    if (i14 == 9) {
                        view2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, n41VarG.f30838e ? org.telegram.ui.ActionBar.g6.f23090f6 : org.telegram.ui.ActionBar.g6.f23072e6, false));
                    }
                    break;
                case 5:
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view2;
                    CharSequence charSequence5 = n41VarG.f30845m;
                    g5Var.b(n41VarG.f30844l, n41VarG.f30845m, 0, n41VarG.f30838e, 0, charSequence5 != null && charSequence5.toString().contains("\n"), zJ, false);
                    break;
                case 6:
                    ((org.telegram.ui.Cells.g5) view2).b(n41VarG.f30844l, n41VarG.f30845m, 0, n41VarG.f30838e, 0, false, zJ, false);
                    break;
                case 7:
                case 8:
                case 38:
                    if (i14 == 7 || i14 == 8) {
                        x8Var = (org.telegram.ui.Cells.x8) view2;
                        if (TextUtils.isEmpty(n41VarG.f30844l)) {
                            x8Var.setFixedSize(i14 == 8 ? 220 : 12);
                            x8Var.setText("");
                        } else {
                            x8Var.setFixedSize(0);
                            x8Var.setText(n41VarG.f30844l);
                        }
                        if (n41VarG.f30849q) {
                            x8Var.setTextGravity(17);
                            x8Var.getTextView().setWidth(Math.min(lh.w3.a(x8Var.getText(), x8Var.getTextView().getPaint()), AndroidUtilities.displaySize.x - AndroidUtilities.dp(60.0f)));
                            x8Var.getTextView().setPadding(0, AndroidUtilities.dp(17.0f), 0, AndroidUtilities.dp(17.0f));
                        } else {
                            x8Var.setTextGravity(8388611);
                            x8Var.getTextView().setMinWidth(0);
                            x8Var.getTextView().setMaxWidth(AndroidUtilities.displaySize.x);
                            x8Var.getTextView().setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(17.0f));
                        }
                    } else if (i14 == 38) {
                        z1Var = (org.telegram.ui.Cells.z1) view2;
                        CharSequence charSequence6 = n41VarG.f30847o;
                        boolean z15 = n41VarG.f30839f;
                        z1Var.f26015a.setText(charSequence6);
                        View view5 = z1Var.f26016b;
                        view5.animate().cancel();
                        view5.animate().rotation(z15 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
                        if (n41VarG.f30849q) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.q6);
                        } else if (n41VarG.f30850r) {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.f23269p7);
                        } else {
                            z1Var.setColor(org.telegram.ui.ActionBar.g6.G6);
                        }
                    } else {
                        view = null;
                    }
                    if (n41VarG3 != null) {
                        view = x8Var;
                        view = x8Var;
                        view = z1Var;
                        view = z1Var;
                        if (K(n41VarG3.f49413a)) {
                            view = x8Var;
                            view = x8Var;
                            view = z1Var;
                            view = z1Var;
                            view = z1Var;
                            view = z1Var;
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                    } else {
                        view = x8Var;
                        view = x8Var;
                        view = z1Var;
                        view = z1Var;
                        view = z1Var;
                        view = z1Var;
                        z10 = false;
                    }
                    if (n41VarG2 == null || K(n41VarG2.f49413a)) {
                        view = z1Var;
                        view = z1Var;
                        z11 = false;
                    } else {
                        view = z1Var;
                        z11 = true;
                    }
                    if (!zk0Var.b1()) {
                        if (z10 && z11) {
                            i11 = R.drawable.greydivider;
                        } else if (z10) {
                            i11 = R.drawable.greydivider_bottom;
                        } else {
                            i11 = z11 ? R.drawable.greydivider_top : R.drawable.field_carret_empty;
                        }
                        Drawable drawableU0 = org.telegram.ui.ActionBar.g6.U0(this.f26939e, i11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23018b7, this.v));
                        if (!this.f26941n) {
                            view.setBackground(drawableU0);
                        } else {
                            view.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(I(org.telegram.ui.ActionBar.g6.f23143i5)), drawableU0}));
                        }
                    } else {
                        view.setBackground(null);
                    }
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view2;
                    int i20 = r2Var.f25201a;
                    TextView textView = r2Var.f25202b;
                    TextView textView2 = r2Var.f25203c;
                    RadioButton radioButton = r2Var.d;
                    if (i20 == n41VarG.d) {
                        radioButton.a(n41VarG.f30838e, true);
                        r2Var.a(n41VarG.f30840g, true);
                        r10 = 0;
                    } else {
                        r10 = 0;
                        r2Var.a(n41VarG.f30840g, false);
                    }
                    if (TextUtils.isEmpty(n41VarG.f30846n)) {
                        CharSequence charSequence7 = n41VarG.f30844l;
                        boolean z16 = n41VarG.f30838e;
                        textView2.setVisibility(8);
                        textView.setText(charSequence7);
                        radioButton.a(z16, r10);
                        r2Var.f25204e = zJ;
                        r2Var.b();
                        r2Var.setWillNotDraw(!zJ);
                    } else {
                        CharSequence charSequence8 = n41VarG.f30844l;
                        CharSequence charSequence9 = n41VarG.f30846n;
                        boolean z17 = n41VarG.f30838e;
                        textView2.setVisibility(r10);
                        textView2.setText(charSequence9);
                        textView.setText(charSequence8);
                        radioButton.a(z17, r10);
                        r2Var.f25204e = zJ;
                        r2Var.b();
                        r2Var.setWillNotDraw(!zJ);
                    }
                    r2Var.f25201a = n41VarG.d;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view2;
                    saVar.h(i13, n41VarG, zJ);
                    if (i14 == 12) {
                        saVar.c(n41VarG.f30838e, false);
                    }
                    break;
                case 13:
                    org.telegram.ui.Cells.sa saVar2 = (org.telegram.ui.Cells.sa) view2;
                    saVar2.h(i13, n41VarG, zJ);
                    CharSequence charSequence10 = n41VarG.f30846n;
                    saVar2.setQuery(charSequence10 == null ? null : charSequence10.toString().toLowerCase());
                    saVar2.setAddButtonVisible(!n41VarG.f30838e);
                    saVar2.setCloseIcon(n41VarG.D);
                    break;
                case 14:
                    dv0 dv0Var = (dv0) view2;
                    dv0Var.b(n41VarG.f30857z, null, n41VarG.f30848p);
                    dv0Var.setMinAllowedIndex((int) n41VarG.B);
                    dv0Var.setCallback(new vu(n41VarG, 26));
                    break;
                case 15:
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view2;
                    u7Var.d(n41VarG.f30857z, (org.telegram.ui.Cells.t7) n41VarG.G, n41VarG.C);
                    u7Var.setMinValueAllowed((int) n41VarG.B);
                    break;
                case 16:
                    qf.m1 m1Var = (qf.m1) view2;
                    m1Var.d.a(n41VarG.f30838e, false);
                    m1Var.setReorder(this.I);
                    Object obj4 = n41VarG.G;
                    if (obj4 instanceof qf.p1) {
                        m1Var.a((qf.p1) obj4, null, zJ);
                    }
                    break;
                case 17:
                    qf.l1 l1Var = (qf.l1) view2;
                    l1Var.f46346e.a(n41VarG.f30838e, false);
                    Object obj5 = n41VarG.G;
                    if (obj5 instanceof qf.p1) {
                        qf.p1 p1Var = (qf.p1) obj5;
                        y8 y8Var = l1Var.f46343a;
                        int[] iArr = l1Var.f46349r;
                        TextView textView3 = l1Var.d;
                        ImageReceiver imageReceiver = l1Var.f46344b;
                        int i21 = UserConfig.selectedAccount;
                        l1Var.f46345c.setText(MessagesController.getInstance(i21).getPeerName(UserConfig.getInstance(i21).getClientUserId()));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        MessageObject messageObject = p1Var.f46421e;
                        if (messageObject != null) {
                            spannableStringBuilder.append(Emoji.replaceEmoji(messageObject.messageText, textView3.getPaint().getFontMetricsInt(), false));
                        }
                        CharSequence charSequence11 = spannableStringBuilder;
                        if (p1Var.a() > 1) {
                            spannableStringBuilder.append((CharSequence) "  ");
                            int iDp = AndroidUtilities.displaySize.x - AndroidUtilities.dp(80.0f);
                            int iA = p1Var.a() - 1;
                            int i22 = z.d;
                            SpannableString spannableString = new SpannableString("+");
                            z zVar = new z(iA);
                            iArr[0] = (int) (((pz0) zVar.f35104c).f31697c + AndroidUtilities.dp(10.0f));
                            spannableString.setSpan(zVar, 0, spannableString.length(), 33);
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, textView3.getPaint(), (iDp * 1.5f) - iArr[0], TextUtils.TruncateAt.END));
                            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                                spannableStringBuilder2.append((CharSequence) "  ");
                            }
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            charSequence11 = spannableStringBuilder2;
                        }
                        textView3.setText(charSequence11);
                        TLRPC.MessageMedia media = MessageObject.getMedia(p1Var.f46421e);
                        if (media != null && (photo = media.photo) != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), true, null, true);
                            ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize, media.photo);
                            MessageObject messageObject2 = p1Var.f46421e;
                            imageReceiver.setImage(forObject, "36_36", messageObject2.strippedThumb, closestPhotoSizeWithSize == null ? 0L : closestPhotoSizeWithSize.size, (String) null, messageObject2, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        } else if (media == null || (document = media.document) == null) {
                            y8Var.r(UserConfig.getInstance(i21).getCurrentUser());
                            imageReceiver.setForUserOrChat(UserConfig.getInstance(i21).getCurrentUser(), y8Var);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                        } else {
                            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), true, null, true);
                            if (closestPhotoSizeWithSize2 == null) {
                                ImageLocation forDocument = ImageLocation.getForDocument(media.document);
                                j10 = media.document.size;
                                imageLocation = forDocument;
                                str = "g";
                            } else {
                                ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize2, media.document);
                                j10 = closestPhotoSizeWithSize2.size;
                                str = "36_36";
                                imageLocation = forObject2;
                            }
                            long j14 = j10;
                            MessageObject messageObject3 = p1Var.f46421e;
                            imageReceiver.setImage(imageLocation, str, messageObject3.strippedThumb, j14, (String) null, messageObject3, 0);
                            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                        }
                        l1Var.f46350s = zJ;
                        l1Var.invalidate();
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    o91 o91Var = (o91) view2;
                    int i23 = n41VarG.f30857z;
                    c91 c91Var = (c91) n41VarG.G;
                    x41 x41Var = new x41(0, this, n41VarG);
                    o91Var.f41042x = i23;
                    o91Var.f41043y = x41Var;
                    o91Var.e(c91Var, false);
                    break;
                case 24:
                    ((org.telegram.ui.de) view2).set((org.telegram.ui.ce) n41VarG.G);
                    break;
                case 25:
                    org.telegram.ui.ee eeVar = (org.telegram.ui.ee) view2;
                    TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction = (TL_stats.BroadcastRevenueTransaction) n41VarG.G;
                    s5 s5Var = eeVar.f37738b;
                    org.telegram.ui.ActionBar.c6 c6Var = eeVar.f37737a;
                    TextView textView4 = eeVar.f37739c;
                    TextView textView5 = eeVar.d;
                    if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal) {
                        TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
                        textView4.setText(LocaleController.getString(R.string.MonetizationTransactionWithdraw));
                        if (tL_broadcastRevenueTransactionWithdrawal.pending) {
                            textView5.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
                            z12 = false;
                        } else {
                            z12 = tL_broadcastRevenueTransactionWithdrawal.failed;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionWithdrawal.date));
                            sb2.append(z12 ? org.telegram.messenger.y1.i(R.string.MonetizationTransactionNotCompleted, new StringBuilder(" — ")) : "");
                            textView5.setText(sb2.toString());
                        }
                        j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
                        str2 = "+";
                        b10 = -1;
                    } else {
                        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                            TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionProceed));
                            textView5.setText(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionProceeds.from_date) + " - " + LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionProceeds.to_date));
                            j11 = tL_broadcastRevenueTransactionProceeds.amount;
                        } else if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                            TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                            textView4.setText(LocaleController.getString(R.string.MonetizationTransactionRefund));
                            textView5.setText(LocaleController.formatShortDateTime(tL_broadcastRevenueTransactionRefund.from_date));
                            j11 = tL_broadcastRevenueTransactionRefund.amount;
                        }
                        z12 = false;
                        b10 = 1;
                    }
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(z12 ? org.telegram.ui.ActionBar.g6.f23269p7 : org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    spannableStringBuilder3.append((CharSequence) (b10 < 0 ? "-" : str2));
                    spannableStringBuilder3.append((CharSequence) "TON ");
                    spannableStringBuilder3.append((CharSequence) eeVar.f37740e.format(Math.abs(j11) / 1.0E9d));
                    int iIndexOf = TextUtils.indexOf(spannableStringBuilder3, ".");
                    if (iIndexOf >= 0) {
                        z13 = false;
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.15f), 0, iIndexOf + 1, 33);
                    } else {
                        z13 = false;
                    }
                    s5Var.setText(org.telegram.ui.fe.f0(spannableStringBuilder3, s5Var.getPaint(), 1.1f, AndroidUtilities.dp(0.33f), z13));
                    s5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(b10 < 0 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.f23200l8, c6Var));
                    eeVar.f37741f = zJ;
                    eeVar.setWillNotDraw(!zJ);
                    break;
                case 27:
                    lh.p9 p9Var = (lh.p9) view2;
                    long j15 = p9Var.f16545x;
                    Object obj6 = n41VarG.G;
                    if (!(obj6 instanceof TLRPC.User)) {
                        if (obj6 instanceof TLRPC.Chat) {
                            j13 = -((TLRPC.Chat) obj6).f22380id;
                        } else {
                            j12 = 0;
                        }
                        if (j15 == j12) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        p9Var.d(false, true);
                        p9Var.set(n41VarG.G);
                        p9Var.f16540f.setVisibility(8);
                        p9Var.h.setVisibility(0);
                        p9Var.c(n41VarG.f30838e, z14);
                        p9Var.setDivider(zJ);
                    } else {
                        j13 = ((TLRPC.User) obj6).f22527id;
                    }
                    j12 = j13;
                    if (j15 == j12) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    p9Var.d(false, true);
                    p9Var.set(n41VarG.G);
                    p9Var.f16540f.setVisibility(8);
                    p9Var.h.setVisibility(0);
                    p9Var.c(n41VarG.f30838e, z14);
                    p9Var.setDivider(zJ);
                    break;
                case 28:
                    if (n41VarG.f30851s) {
                        view2.setBackgroundColor(0);
                    } else {
                        int i24 = n41VarG.f30843k;
                        if (i24 != 0) {
                            view2.setBackgroundColor(i24);
                        }
                    }
                    view2.setId(n41VarG.d);
                    ((a51) view2).setHeight(n41VarG.f30857z);
                    break;
                case 29:
                    qf.q qVar = (qf.q) view2;
                    Object obj7 = n41VarG.G;
                    if (obj7 instanceof qf.r) {
                        org.telegram.ui.ActionBar.h5 h5Var3 = qVar.f46424a;
                        org.telegram.ui.ActionBar.h5 h5Var4 = qVar.f46426c;
                        eh.s sVar = qVar.f46425b;
                        qVar.f46427e = zJ;
                        TL_account.TL_businessChatLink tL_businessChatLink = ((qf.r) obj7).f46438a;
                        qVar.f46428f = tL_businessChatLink;
                        if (TextUtils.isEmpty(tL_businessChatLink.title)) {
                            String strSubstring = qVar.f46428f.link;
                            qf.v[] vVarArr = qf.v.f46463e;
                            if (strSubstring.startsWith("https://")) {
                                strSubstring = strSubstring.substring(8);
                            }
                            h5Var3.l(strSubstring, false);
                        } else {
                            h5Var3.l(qVar.f46428f.title, false);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(qVar.f46428f.message);
                        TL_account.TL_businessChatLink tL_businessChatLink2 = qVar.f46428f;
                        MediaDataController.addTextStyleRuns(tL_businessChatLink2.entities, tL_businessChatLink2.message, spannableStringBuilder4);
                        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder4, sVar.getPaint().getFontMetricsInt(), false);
                        MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, qVar.f46428f.entities, sVar.getPaint().getFontMetricsInt());
                        sVar.setText(charSequenceReplaceEmoji);
                        int i25 = qVar.f46428f.views;
                        if (i25 == 0) {
                            h5Var4.l(LocaleController.formatString(R.string.NoClicks, new Object[0]), false);
                        } else {
                            h5Var4.l(LocaleController.formatPluralString("Clicks", i25, new Object[0]), false);
                        }
                        h5Var4.requestLayout();
                        qVar.invalidate();
                    }
                    break;
                case 30:
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view2;
                    CharSequence charSequence12 = n41VarG.f30844l;
                    int i26 = n41VarG.f30843k;
                    a9Var.f24081b.l(charSequence12, false);
                    a9Var.f24080a.setImageResource(i26);
                    a9Var.setDivider(zJ);
                    a9Var.setBackgroundColor(I(org.telegram.ui.ActionBar.g6.f23124h5));
                    break;
                case 31:
                    org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view2;
                    if (!TextUtils.equals(s3Var.getText(), n41VarG.f30844l)) {
                        s3Var.c(n41VarG.f30844l, n41VarG.f30845m, n41VarG.D);
                    } else {
                        s3Var.b(n41VarG.f30845m, n41VarG.D);
                    }
                    break;
                case 32:
                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                    Object obj8 = n41VarG.G;
                    if (n41VarG.f30849q && (obj8 instanceof TLRPC.User) && (i12 = ((TLRPC.User) obj8).bot_active_users) != 0) {
                        if (i12 != 0) {
                            charSequenceConcat = LocaleController.formatPluralStringSpaced("BotUsers", i12);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else if (n41VarG.I) {
                        String publicUsername = obj8 instanceof TLRPC.User ? UserObject.getPublicUsername((TLRPC.User) obj8) : obj8 instanceof TLRPC.Chat ? ChatObject.getPublicUsername((TLRPC.Chat) obj8) : null;
                        if (publicUsername != null) {
                            charSequenceConcat = "@".concat(publicUsername);
                        } else {
                            charSequenceConcat = "";
                        }
                    } else {
                        charSequenceConcat = "";
                    }
                    if (obj8 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) obj8;
                        if (chat.participants_count != 0) {
                            String pluralStringSpaced = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.formatPluralStringSpaced("Members", chat.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", chat.participants_count);
                            charSequenceConcat = !TextUtils.isEmpty(charSequenceConcat) ? TextUtils.concat(charSequenceConcat, ", ", pluralStringSpaced) : pluralStringSpaced;
                        }
                        userName = chat.title;
                    } else if (obj8 instanceof TLRPC.User) {
                        userName = UserObject.getUserName((TLRPC.User) obj8);
                    }
                    String str4 = userName;
                    boolean z18 = n41VarG.f30852t;
                    Object obj9 = n41VarG.H;
                    Utilities.Callback callback = obj9 instanceof Utilities.Callback ? (Utilities.Callback) obj9 : null;
                    e6Var.f24296x0 = z18;
                    e6Var.f24298y0 = callback;
                    e6Var.setRectangularAvatar(n41VarG.f30850r);
                    CharSequence charSequence13 = n41VarG.f30845m;
                    e6Var.u(obj8, null, str4, charSequence13 != null ? charSequence13 : charSequenceConcat, false, false);
                    e6Var.t(n41VarG.f30838e, false);
                    e6Var.I = zJ;
                    break;
                case 33:
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view2;
                    Object obj10 = n41VarG.G;
                    MessageObject messageObject4 = obj10 instanceof MessageObject ? (MessageObject) obj10 : null;
                    p2Var.f24907o2 = zJ;
                    if (messageObject4 != null) {
                        p2Var.W(messageObject4.getDialogId(), messageObject4, messageObject4.messageOwner.date, false, false);
                    } else {
                        p2Var.W(0L, null, 0, false, false);
                    }
                    break;
                case 34:
                    ((h00) view2).setViewType(n41VarG.f30857z);
                    break;
                case 35:
                case 36:
                case 41:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view2;
                    y1Var.setPad(n41VarG.f30841i);
                    y1Var.e(n41VarG.f30844l, "", n41VarG.f30838e, zJ, y1Var.f25975a == n41VarG.d);
                    y1Var.f25975a = n41VarG.d;
                    y1Var.setIcon(n41VarG.f30852t ? R.drawable.permission_locked : 0);
                    if (i14 == 36 || i14 == 41) {
                        boolean z19 = n41VarG.f30839f;
                        CharSequence charSequence14 = n41VarG.f30847o;
                        View.OnClickListener onClickListener = n41VarG.D;
                        org.telegram.ui.Cells.x1 x1Var = y1Var.v;
                        if (x1Var != null) {
                            j6 j6Var3 = x1Var.f25923b;
                            j6Var3.a();
                            j6Var3.setText(charSequence14);
                            View view6 = x1Var.f25924c;
                            view6.animate().cancel();
                            view6.animate().rotation(z19 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
                            if (onClickListener != null) {
                                x1Var.setOnClickListener(onClickListener);
                            }
                        }
                    }
                    break;
                case 37:
                    org.telegram.ui.Cells.y1 y1Var2 = (org.telegram.ui.Cells.y1) view2;
                    y1Var2.setPad(n41VarG.f30841i);
                    y1Var2.setUserOrChat((TLObject) n41VarG.G);
                    y1Var2.c(n41VarG.f30838e, y1Var2.f25975a == n41VarG.d);
                    y1Var2.f25975a = n41VarG.d;
                    y1Var2.setNeedDivider(zJ);
                    break;
                case 39:
                case 40:
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view2;
                    o8Var.d(n41VarG.f30844l.toString(), n41VarG.f30838e, zJ, o8Var.f24818a == n41VarG.d);
                    o8Var.getCheckBox().setDrawIconType(n41VarG.f30857z);
                    Switch checkBox = o8Var.getCheckBox();
                    int i27 = n41VarG.f30857z == 0 ? org.telegram.ui.ActionBar.g6.M6 : org.telegram.ui.ActionBar.g6.f23302r7;
                    int i28 = org.telegram.ui.ActionBar.g6.N6;
                    int i29 = org.telegram.ui.ActionBar.g6.f23053d6;
                    checkBox.d(i27, i28, i29, i29);
                    o8Var.f24818a = n41VarG.d;
                    o8Var.setIcon(n41VarG.f30852t ? R.drawable.permission_locked : 0);
                    if (i14 == 40) {
                        if (!TextUtils.isEmpty(n41VarG.f30847o)) {
                            o8Var.a(new lg0(27, n41VarG, o8Var), n41VarG.f30847o.toString(), n41VarG.f30839f);
                        } else {
                            LinearLayout linearLayout = o8Var.f24822f;
                            if (linearLayout != null) {
                                linearLayout.setVisibility(8);
                            }
                        }
                    }
                    break;
                case 42:
                    org.telegram.ui.Cells.j4 j4Var2 = (org.telegram.ui.Cells.j4) view2;
                    j4Var2.c(n41VarG.f30847o, j4Var2.f24525a == n41VarG.d);
                    j4Var2.f24525a = n41VarG.d;
                    break;
                case 43:
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view2;
                    x9Var.getValueBackupImageView().setImageDrawable(null);
                    CharSequence charSequence15 = n41VarG.f30844l;
                    if (charSequence15 != null) {
                        CharSequence charSequence16 = n41VarG.f30845m;
                        if (charSequence16 != null) {
                            x9Var.c(charSequence15, charSequence16, false, zJ);
                        } else {
                            x9Var.b(charSequence15, zJ);
                        }
                    }
                    x9Var.setIcon(n41VarG.f30843k);
                    break;
                case 44:
                    ((org.telegram.ui.Cells.f6) view2).b(n41VarG.f30844l.toString(), n41VarG.f30846n.toString(), zJ, n41VarG.f30838e);
                    break;
            }
        } else {
            m41 m41VarF = n41.F(i14);
            if (m41VarF != null) {
                m41VarF.bindView(o1Var.f5789a, n41VarG, zJ, this, zk0Var instanceof k51 ? (k51) zk0Var : null);
            }
        }
        org.telegram.ui.x3 x3Var = n41VarG.F;
        if (x3Var != null) {
            x3Var.run(view2);
        }
    }

    @Override
    public f2.o1 x(ViewGroup viewGroup, int i10) {
        View dVar;
        ViewParent j4Var;
        Object j4Var2;
        ?? o91Var;
        org.telegram.ui.Cells.j4 j4Var3;
        int i11;
        boolean z10 = this.f26941n;
        int i12 = z10 ? org.telegram.ui.ActionBar.g6.f23124h5 : org.telegram.ui.ActionBar.g6.f23053d6;
        Context context = this.f26939e;
        if (i10 < 10000) {
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            switch (i10) {
                case -4:
                case -1:
                    dVar = new ag.d(context, 20);
                    if (i10 == -4) {
                        dVar.setTag(-33024);
                    }
                    o91Var = dVar;
                    break;
                case -3:
                    y41 y41Var = new y41(context);
                    y41Var.f34808a = 0;
                    o91Var = y41Var;
                    break;
                case -2:
                    o91Var = new ag.d(context, 21);
                    break;
                case 0:
                    if (!z10) {
                        o91Var = new org.telegram.ui.Cells.j4(context, c6Var);
                    } else {
                        j4Var2 = new org.telegram.ui.Cells.j4(this.f26939e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, false, this.v);
                        o91Var = j4Var2;
                    }
                    break;
                case 1:
                    j4Var = new org.telegram.ui.Cells.j4(this.f26939e, org.telegram.ui.ActionBar.g6.G6, 17, 15, false, this.v);
                    o91Var = j4Var;
                    break;
                case 2:
                    o91Var = new h11(context, c6Var);
                    break;
                case 3:
                    o91Var = new org.telegram.ui.Cells.l8(context, c6Var);
                    break;
                case 4:
                case 9:
                    org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, c6Var);
                    j4Var2 = p8Var;
                    if (i10 == 9) {
                        p8Var.setDrawCheckRipple(true);
                        p8Var.d(org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
                        p8Var.setTypeface(AndroidUtilities.bold());
                        p8Var.setHeight(56);
                        j4Var2 = p8Var;
                    }
                    o91Var = j4Var2;
                    break;
                case 5:
                case 6:
                    j4Var = new org.telegram.ui.Cells.g5(21, 60, this.f26939e, this.v, i10 == 6);
                    o91Var = j4Var;
                    break;
                case 7:
                case 8:
                default:
                    o91Var = new org.telegram.ui.Cells.x8(context, c6Var);
                    break;
                case 10:
                    org.telegram.ui.Cells.r2 r2Var = new org.telegram.ui.Cells.r2(context);
                    TextView textView = new TextView(context);
                    r2Var.f25202b = textView;
                    org.telegram.messenger.rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
                    textView.setMaxLines(1);
                    textView.setSingleLine(true);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView.setEllipsize(truncateAt);
                    textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
                    boolean z11 = LocaleController.isRTL;
                    r2Var.addView(textView, h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f));
                    TextView textView2 = new TextView(context);
                    r2Var.f25203c = textView2;
                    org.telegram.messenger.rl.p(textView2, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false), 1, 16.0f, 1);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(truncateAt);
                    textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
                    textView2.setVisibility(8);
                    r2Var.addView(textView2, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 23.0f, 0.0f, 23.0f, 0.0f));
                    RadioButton radioButton = new RadioButton(context);
                    r2Var.d = radioButton;
                    radioButton.setSize(AndroidUtilities.dp(20.0f));
                    radioButton.b(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23109g7, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126h7, false));
                    r2Var.addView(radioButton, h7.z5.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f));
                    r2Var.b();
                    o91Var = r2Var;
                    break;
                case 11:
                case 12:
                    org.telegram.ui.Cells.sa saVar = new org.telegram.ui.Cells.sa(context, 6, i10 != 12 ? 0 : 3, false);
                    saVar.setSelfAsSavedMessages(true);
                    o91Var = saVar;
                    break;
                case 13:
                    j4Var = new org.telegram.ui.Cells.sa(6, 0, this.f26939e, null, false, true);
                    o91Var = j4Var;
                    break;
                case 14:
                    o91Var = new dv0(context, c6Var);
                    break;
                case 15:
                    o91Var = new org.telegram.ui.Cells.u7(context, c6Var);
                    break;
                case 16:
                    o91Var = new qf.m1(context, c6Var, this.H != null);
                    break;
                case 17:
                    o91Var = new qf.l1(context, c6Var);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    if (this.f26946y == null) {
                        this.f26946y = new rf.f(null);
                    }
                    o91Var = new o91(this.f26939e, this.f26940f, i10 - 18, this.f26946y, this.h);
                    break;
                case 24:
                    o91Var = new org.telegram.ui.de(context, c6Var);
                    break;
                case 25:
                    o91Var = new org.telegram.ui.ee(context, c6Var);
                    break;
                case 26:
                    j4Var3 = new org.telegram.ui.Cells.j4(this.f26939e, org.telegram.ui.ActionBar.g6.G6, 23, 20, 0, false, false, this.v);
                    j4Var3.setTextSize(20.0f);
                    o91Var = j4Var3;
                    break;
                case 27:
                    lh.p9 p9Var = new lh.p9(context, c6Var);
                    p9Var.d(false, false);
                    o91Var = p9Var;
                    break;
                case 28:
                    dVar = new a51(context);
                    dVar.setTag(-33024);
                    o91Var = dVar;
                    break;
                case 29:
                    o91Var = new qf.q(context, c6Var);
                    break;
                case 30:
                    o91Var = new org.telegram.ui.Cells.a9(context, c6Var);
                    break;
                case 31:
                    zk0 zk0Var = this.d;
                    if (zk0Var != null && zk0Var.b1()) {
                        org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, 28, c6Var);
                        s3Var.setNoBackground(true);
                        o91Var = s3Var;
                    } else {
                        o91Var = new org.telegram.ui.Cells.s3(context, c6Var);
                    }
                    break;
                case 32:
                    o91Var = new org.telegram.ui.Cells.e6(context, null);
                    break;
                case 33:
                    o91Var = new org.telegram.ui.Cells.p2(context, true);
                    break;
                case 34:
                    h00 h00Var = new h00(context, c6Var);
                    h00Var.setIsSingleCell(true);
                    o91Var = h00Var;
                    break;
                case 35:
                case 36:
                case 37:
                case 41:
                    if (i10 == 35) {
                        i11 = 4;
                    } else if (i10 == 36) {
                        i11 = 6;
                    } else if (i10 == 37) {
                        i11 = 7;
                    } else {
                        i11 = i10 == 41 ? 8 : 0;
                    }
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(i11, 21, this.f26939e, this.v, true);
                    y1Var.getCheckBoxRound().b(org.telegram.ui.ActionBar.g6.V6, org.telegram.ui.ActionBar.g6.f23109g7, org.telegram.ui.ActionBar.g6.f23182k7);
                    o91Var = y1Var;
                    break;
                case 38:
                    o91Var = new org.telegram.ui.Cells.z1(context, c6Var);
                    break;
                case 39:
                case 40:
                    o91Var = new org.telegram.ui.Cells.o8(context);
                    break;
                case 42:
                    j4Var3 = new org.telegram.ui.Cells.j4(this.f26939e, org.telegram.ui.ActionBar.g6.L6, 21, 15, 0, false, true, this.v);
                    o91Var = j4Var3;
                    break;
                case 43:
                    o91Var = new org.telegram.ui.Cells.x9(context, 0, c6Var);
                    break;
                case 44:
                    o91Var = new org.telegram.ui.Cells.f6(context, false);
                    break;
            }
        } else {
            m41 m41VarF = n41.F(i10);
            o91Var = m41VarF != null ? m41VarF.createView(this.f26939e, this.d, this.f26940f, this.h, this.v) : new View(context);
        }
        if (this.f26942r) {
            if (i10 < 10000) {
                switch (i10) {
                    case -3:
                    case 0:
                    case 1:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        o91Var.setBackgroundColor(I(i12));
                        break;
                }
            } else {
                o91Var.setBackgroundColor(I(i12));
            }
        }
        return new lk0(o91Var);
    }

    @Override
    public void y(f2.o1 o1Var) {
        Q(o1Var, this.I);
        O(o1Var);
    }
}
