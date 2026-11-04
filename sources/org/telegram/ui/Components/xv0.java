package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class xv0 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static final int f40505o2 = 0;
    public final AnimatorSet[] A1;
    public final View[] B1;
    public ai.o2 C1;
    public final org.telegram.ui.ActionBar.d2 D1;
    public fi.g E1;
    public final Activity F1;
    public int G1;
    public int H1;
    public boolean I1;
    public boolean J1;
    public TLRPC.TL_messages_stickerSet K1;
    public TLRPC.Document L1;
    public org.telegram.messenger.ry M1;
    public TLRPC.InputStickerSet N1;
    public ArrayList O1;
    public final ArrayList P1;
    public ArrayList Q1;
    public HashMap R1;
    public final String S1;
    public final uv0 T1;
    public vv0 U1;
    public org.telegram.ui.b50 V1;
    public int W1;
    public int X1;
    public boolean Y1;
    public boolean Z1;
    public boolean f40506a2;
    public boolean f40507b2;
    public int c2;
    public final l2.e f40508d2;
    public final mv0 f40509e2;
    public iv0 f40510f2;
    public String f40511g2;
    public int f40512h2;
    public boolean f40513i2;
    public Pattern f40514j1;
    public String f40515j2;
    public ci.j1 k1;
    public Runnable f40516k2;
    public tv0 f40517l1;
    public ArrayList f40518l2;
    public u4.y m1;
    public int f40519m2;
    public TLRPC.Document f40520n1;
    public int f40521n2;
    public s70 f40522o1;
    public org.telegram.ui.ActionBar.q0 f40523p1;
    public org.telegram.ui.ActionBar.y0 f40524q1;
    public h6 f40525r1;
    public vg.o0 f40526s1;
    public FrameLayout f40527t1;
    public FrameLayout f40528u1;
    public TextView f40529v1;
    public View f40530w1;
    public k9 f40531x1;
    public TextView f40532y1;
    public k f40533z1;

    public xv0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.A1 = new AnimatorSet[2];
        this.B1 = new View[2];
        this.f40507b2 = true;
        this.f40508d2 = new l2.e(4);
        this.f40509e2 = new mv0(this);
        this.J0 = e6Var;
        N();
        this.F1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f27071id = tL_inputPhoto;
            tL_inputPhoto.f27020id = photo.f27025id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.f27070id = tL_inputDocument;
            tL_inputDocument.f27013id = document.f27007id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) this;
        this.X1 = ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_getAttachedStickers, new ai.q1(go0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.ActionBar.h6(24, go0Var, tL_messages_getAttachedStickers), 13));
        P0(context);
    }

    public static void I0(xv0 xv0Var) {
        if (xv0Var.k1.getChildCount() <= 0) {
            xv0Var.W0(xv0Var.k1.getPaddingTop());
            return;
        }
        int i3 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < xv0Var.k1.getChildCount(); i11++) {
            View childAt = xv0Var.k1.getChildAt(i11);
            xv0Var.k1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            xv0Var.T0(0, false);
            i3 = top;
        } else {
            xv0Var.T0(0, true);
        }
        xv0Var.T0(1, true);
        if (xv0Var.W1 != i3) {
            xv0Var.W0(i3);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.wm wmVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (d2Var != null) {
            if (d2Var instanceof org.telegram.ui.wm) {
                wmVar = (org.telegram.ui.wm) d2Var;
            } else {
                wmVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.h10.f22829t0);
                File K = org.telegram.messenger.w7.K(document, null, true, true);
                if (K != null && K.exists()) {
                    org.telegram.messenger.g0.i3(new lg.p0(K, arrayList, d2Var, wmVar, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(new gi.q1((Object) d2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) wmVar, z10, 10), 300L);
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28025l5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        if (this.K1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.hp.s1(this.f28583a).x0(this.K1);
            this.K1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.bd.M0(2131749243, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28234w6, this.J0);
            this.f40513i2 = true;
            this.f40511g2 = str;
            return;
        }
        iv0 iv0Var = this.f40510f2;
        if (iv0Var != null) {
            org.telegram.messenger.g0.r(iv0Var);
            this.f40510f2 = null;
            this.f40511g2 = null;
            if (this.f40512h2 != 0) {
                ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.f40512h2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.bd.M0(2131749245, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28120q5, this.J0);
            return;
        }
        this.f40513i2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str.charAt(i3);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.bd.M0(2131749245, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, this.J0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131749241, null));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, this.J0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.bd.M0(2131749240, null));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.bd.M0(2131749242, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.F6, this.J0);
            this.f40511g2 = str;
            iv0 iv0Var2 = new iv0(this, str, textView, 2);
            this.f40510f2 = iv0Var2;
            org.telegram.messenger.g0.i3(iv0Var2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.bd.M0(2131749239, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28102p7, this.J0);
    }

    public final void L0() {
        if (!this.J1) {
            return;
        }
        this.m1.h(null);
        this.J1 = false;
        this.f40508d2.s(true);
        org.telegram.messenger.g0.d0(this.k1, new ei.e(14));
        this.f40523p1.postDelayed(new hv0(this, 0), 200L);
        this.f40525r1.c(org.telegram.messenger.bd.M0(2131751222, null), true, true);
    }

    public final void N0() {
        if (this.J1) {
            return;
        }
        this.m1.h(this.k1);
        this.J1 = true;
        l2.e eVar = this.f40508d2;
        char c2 = 0;
        eVar.s(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) eVar.d;
        if (arrayList.isEmpty()) {
            for (int i3 = 0; i3 < 6; i3++) {
                arrayList.add(valueOf);
                ((ArrayList) eVar.f17692e).add(valueOf);
                ((ArrayList) eVar.f17693f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.f21385b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new wv0(eVar, i10, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j10 = 300;
            ofFloat.setDuration(j10);
            ofFloat.start();
            char c10 = c2;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[c10] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new wv0(eVar, i10, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c10] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new wv0(eVar, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j10);
            ofFloat3.start();
            ((ArrayList) eVar.f17689a).add(ofFloat);
            ((ArrayList) eVar.f17690b).add(ofFloat2);
            ((ArrayList) eVar.f17691c).add(ofFloat3);
            i10++;
            f10 = f11;
            c2 = c10;
        }
        org.telegram.messenger.g0.d0(this.k1, new ei.e(15));
        this.f40523p1.postDelayed(new hv0(this, 1), 200L);
        this.f40525r1.c(org.telegram.messenger.bd.M0(2131751355, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40528u1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new a60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        int i3;
        pv0 pv0Var = new pv0(this, context);
        this.f28586b = pv0Var;
        pv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.B1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i11, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f28586b.addView(viewArr[0], layoutParams);
        ci.j1 j1Var = new ci.j1(27, context, this);
        this.k1 = j1Var;
        j1Var.setTag(14);
        ci.j1 j1Var2 = this.k1;
        getContext();
        fi.g gVar = new fi.g(this);
        this.E1 = gVar;
        j1Var2.setLayoutManager(gVar);
        this.E1.O = new ai.g2(this, 13);
        this.m1 = new u4.y(new qv0(this));
        ci.j1 j1Var3 = this.k1;
        tv0 tv0Var = new tv0(this, context);
        this.f40517l1 = tv0Var;
        j1Var3.setAdapter(tv0Var);
        this.k1.setVerticalScrollBarEnabled(false);
        this.k1.i(new ei.l(12));
        this.k1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.k1.setClipToPadding(false);
        this.k1.setEnabled(true);
        org.telegram.ui.ActionBar.r6.I(this.k1, org.telegram.ui.ActionBar.k6.A5, this.J0);
        this.k1.setOnTouchListener(new yj(this, 6));
        this.k1.setOnScrollListener(new ji(this, 20));
        k kVar = new k(this, 16);
        this.f40533z1 = kVar;
        this.k1.setOnItemClickListener(kVar);
        this.f28586b.addView(this.k1, b8.mf.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        ai.o2 o2Var = new ai.o2(29, context, this);
        this.C1 = o2Var;
        this.f28586b.addView(o2Var, b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.k1.setEmptyView(this.C1);
        this.C1.setOnTouchListener(new fi.a(24));
        s70 s70Var = new s70(context, null);
        this.f40522o1 = s70Var;
        s70Var.setLines(1);
        this.f40522o1.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(this.f40522o1, org.telegram.ui.ActionBar.k6.f27988j5, this.J0);
        this.f40522o1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(this.f40522o1, org.telegram.ui.ActionBar.k6.f28006k5, this.J0);
        this.f40522o1.setEllipsize(TextUtils.TruncateAt.END);
        this.f40522o1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.f40522o1.setGravity(16);
        this.f40522o1.setTypeface(org.telegram.messenger.g0.o());
        this.f28586b.addView(this.f40522o1, b8.mf.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, this.J0), false, this.J0);
        this.f40523p1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.f40523p1.setSubMenuOpenSide(2);
        this.f40523p1.setIcon(2131231244);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f40523p1;
        int i12 = org.telegram.ui.ActionBar.k6.Bj;
        org.telegram.ui.ActionBar.r6.R(q0Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.J0), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.J0);
        this.f28586b.addView(this.f40523p1, b8.mf.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f40523p1.e(1, 2131232363, org.telegram.messenger.bd.M0(2131744856, null));
        this.f40523p1.e(2, 2131232203, org.telegram.messenger.bd.M0(2131751762, null));
        this.f40523p1.setOnClickListener(new fv0(this, 1));
        this.f40523p1.setDelegate(new gv0(this));
        this.f40523p1.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f40523p1;
        if (this.N1 != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        q0Var3.setVisibility(i3);
        this.C1.addView(new RadialProgressView(context, null), b8.mf.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.r6.i(i11, view2, this.J0);
        this.f28586b.addView(viewArr[1], layoutParams2);
        h6 h6Var = new h6(context, false, false, false);
        this.f40525r1 = h6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27954h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.J0);
        int i14 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(w02, org.telegram.ui.ActionBar.k6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        h6Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(h6Var, i02, N, N2, e6Var);
        h6 h6Var2 = this.f40525r1;
        int i15 = org.telegram.ui.ActionBar.k6.f28061n5;
        this.c2 = i15;
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i15, this.J0);
        this.f40525r1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f40525r1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f40525r1.setTypeface(org.telegram.messenger.g0.o());
        this.f40525r1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40527t1 = frameLayout;
        frameLayout.addView(this.f40525r1, b8.mf.c(48.0f, -1));
        this.f28586b.addView(this.f40527t1, b8.mf.e(-1, -2, 83));
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.f40526s1 = o0Var;
        o0Var.setIcon(2131624314);
        this.f40526s1.setVisibility(4);
        this.f28586b.addView(this.f40526s1, b8.mf.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40528u1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f40528u1.setSoundEffectsEnabled(false);
        this.f28586b.addView(this.f40528u1, b8.mf.c(-1.0f, -1));
        this.f40528u1.setOnClickListener(new fv0(this, 2));
        k9 k9Var = new k9(context);
        this.f40531x1 = k9Var;
        k9Var.setAspectFit(true);
        this.f40531x1.setLayerNum(7);
        this.f40528u1.addView(this.f40531x1);
        TextView textView = new TextView(context);
        this.f40532y1 = textView;
        textView.setTextSize(1, 30.0f);
        this.f40532y1.setGravity(85);
        this.f40528u1.addView(this.f40532y1);
        TextView textView2 = new TextView(context);
        this.f40529v1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.f40529v1, i15, this.J0);
        org.telegram.ui.ActionBar.r6.R(this.f40529v1, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.w0(i13, this.J0), org.telegram.ui.ActionBar.k6.w0(i14, this.J0)), org.telegram.ui.ActionBar.r6.N(i13), org.telegram.ui.ActionBar.r6.N(i14), this.J0);
        this.f40529v1.setGravity(17);
        this.f40529v1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f40529v1.setTypeface(org.telegram.messenger.g0.o());
        this.f40528u1.addView(this.f40529v1, b8.mf.e(-1, 48, 83));
        this.f40529v1.setOnClickListener(new fv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f40530w1 = view3;
        org.telegram.ui.ActionBar.r6.i(i11, view3, this.J0);
        this.f40528u1.addView(this.f40530w1, layoutParams3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        if (this.P1 != null) {
            org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.U1);
            org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.V1);
        }
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23333x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.f40517l1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.K1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.I1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.N1 != null) {
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.f28583a);
            if (this.K1 == null && (str = this.N1.short_name) != null) {
                this.K1 = b02.p0(str);
            }
            if (this.K1 == null) {
                this.K1 = b02.o0(this.N1.f27021id);
            }
            if (this.K1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.N1;
                ConnectionsManager.getInstance(this.f28583a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ActionBar.h6(23, this, b02));
            } else {
                if (this.f40517l1 != null) {
                    a1();
                    Z0();
                    this.f40517l1.f();
                }
                Y0();
                b02.q1(this.K1);
                J0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.K1;
        if (tL_messages_stickerSet != null) {
            this.Z1 = !tL_messages_stickerSet.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.ry ryVar) {
        int indexOf = this.Q1.indexOf(ryVar);
        if (indexOf >= 0) {
            this.Q1.remove(indexOf);
            this.f40517l1.s(indexOf);
            if (this.Q1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i3, boolean z10) {
        Integer num;
        float f10;
        if (this.O1 == null) {
            View[] viewArr = this.B1;
            if ((z10 && viewArr[i3].getTag() != null) || (!z10 && viewArr[i3].getTag() == null)) {
                View view = viewArr[i3];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i3].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.A1;
                AnimatorSet animatorSet = animatorSetArr[i3];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i3] = animatorSet2;
                View view2 = viewArr[i3];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i3].setDuration(150L);
                animatorSetArr[i3].addListener(new lv0(this, i3, z10));
                animatorSetArr[i3].start();
            }
        }
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        q6 q6Var = new q6(this, 6);
        ViewGroup viewGroup = this.f28586b;
        Drawable[] drawableArr = {this.f28616s0};
        int i3 = org.telegram.ui.ActionBar.k6.f27954h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28586b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        if (this.f40517l1.f38564r.O1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, q6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40523p1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40525r1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        h6 h6Var = this.f40525r1;
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(h6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40525r1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.c2));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40529v1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40529v1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i3) {
        V0(onClickListener, str, i3, -1, -1);
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i3, int i10, int i11) {
        if (i3 >= 0) {
            h6 h6Var = this.f40525r1;
            this.c2 = i3;
            org.telegram.ui.ActionBar.r6.Z(h6Var, i3, this.J0);
        }
        this.f40525r1.c(str, false, true);
        this.f40525r1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40525r1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.B1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.k1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.C1.getLayoutParams();
        if (onClickListener == null) {
            this.f40525r1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            h6 h6Var2 = this.f40525r1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.J0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.r6.R(h6Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), this.J0);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, this.f40527t1, this.J0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f40525r1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40525r1.animate().alpha(1.0f), xq.h, 240L);
            }
        } else {
            h6 h6Var3 = this.f40525r1;
            int i12 = org.telegram.ui.ActionBar.k6.f27954h5;
            int w04 = org.telegram.ui.ActionBar.k6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.k6.f28122q7;
            org.telegram.ui.ActionBar.r6.R(h6Var3, org.telegram.ui.ActionBar.k6.i0(w04, org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, this.J0))), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.L(0.1f, i13), this.J0);
            this.f40527t1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f40525r1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40525r1.animate().alpha(1.0f), xq.h, 240L);
            }
        }
        this.f28586b.requestLayout();
    }

    public final void W0(int i3) {
        this.W1 = i3;
        if (this.O1 == null) {
            float f10 = i3;
            this.f40522o1.setTranslationY(f10);
            if (this.P1 == null) {
                this.f40523p1.setTranslationY(f10);
            }
            this.B1[0].setTranslationY(f10);
        }
        this.f28586b.invalidate();
    }

    public final void X0(boolean z10) {
        this.f40517l1.getClass();
        this.f40522o1.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28025l5, this.J0));
        this.f40528u1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0) & (-536870913));
        this.f40523p1.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, this.J0));
        this.f40523p1.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.J0), false);
        this.f40523p1.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.J0), true);
        this.f40523p1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, this.J0));
        this.f40523p1.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.J0));
        if (this.f40524q1 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28122q7, this.J0);
            this.f40524q1.d(w02, w02);
            this.f40524q1.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            if (this.f40524q1.getRightIcon() != null && w02 != this.f40519m2) {
                this.f40519m2 = w02;
                this.f40524q1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.k6.h1() && this.f40518l2 == null) {
                ArrayList U = U();
                this.f40518l2 = U;
                int size = U.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((org.telegram.ui.ActionBar.t6) this.f40518l2.get(i3)).f28661g = null;
                }
            }
            int size2 = this.f40518l2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.f40518l2.get(i10);
                t6Var.e(org.telegram.ui.ActionBar.k6.w0(t6Var.f28659e, this.J0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.k6.h1() && this.f40518l2 != null) {
            this.f40518l2 = null;
        }
    }

    public final void Y0() {
        if (this.f28586b != null && !org.telegram.messenger.h10.i(this.f28583a).q()) {
            org.telegram.messenger.zi.W3(this.K1);
        }
    }

    public final void Z0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String G;
        int i3;
        int i10;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i11;
        String M0;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.f40522o1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.K1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.i6.m(this.K1.set.title, this.f40522o1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f40514j1 == null) {
                    this.f40514j1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f40514j1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.K1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new g4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f40522o1.setText(m10);
            if (Q0()) {
                int measuredWidth = this.k1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f22608q.x;
                }
                tv0 tv0Var = this.f40517l1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                tv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.f40517l1.d = 5;
            }
            this.E1.y1(this.f40517l1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.K1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.h10.i(this.f28583a).q() && this.V1 == null) {
                if (this.K1.documents != null) {
                    for (int i17 = 0; i17 < this.K1.documents.size(); i17++) {
                        if (!org.telegram.messenger.zi.n3(this.K1.documents.get(i17))) {
                            this.f40526s1.setVisibility(0);
                            this.f40525r1.setBackground(null);
                            U0(null, null, -1);
                            this.f40526s1.b(org.telegram.messenger.bd.M0(2131743875, null), new fv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f40526s1.setVisibility(4);
            }
            org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.f28583a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.K1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList s02 = b02.s0(5);
                for (int i18 = 0; s02 != null && i18 < s02.size(); i18++) {
                    if (s02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set.f27028id == this.K1.set.f27028id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && b02.B0(stickerSet.f27028id, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.b50 b50Var = this.V1;
            if (b50Var != null) {
                fv0 fv0Var = new fv0(this, 5);
                boolean z12 = b50Var.f43928a;
                if (b50Var.f43930c.O) {
                    if (z12) {
                        i14 = 2131746318;
                    } else {
                        i14 = 2131745554;
                    }
                    M0 = org.telegram.messenger.bd.M0(i14, null);
                } else {
                    if (z12) {
                        i11 = 2131746317;
                    } else {
                        i11 = 2131745553;
                    }
                    M0 = org.telegram.messenger.bd.M0(i11, null);
                }
                String str = M0;
                boolean z13 = this.V1.f43928a;
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.k6.f28122q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.Gi;
                }
                if (!z13) {
                    i13 = org.telegram.ui.ActionBar.k6.Ci;
                } else {
                    i13 = -1;
                }
                if (!z13) {
                    i16 = org.telegram.ui.ActionBar.k6.Ei;
                }
                V0(fv0Var, str, i12, i13, i16);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.K1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!b02.X[i15]) {
                    b02.B(i15);
                    V0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.K1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.bd.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.bd.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    G2 = org.telegram.messenger.bd.G(i10, "AddManyStickersCount", new Object[0]);
                }
                V0(new fv0(this, 9), G2, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.Ci, org.telegram.ui.ActionBar.k6.Ei);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.K1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.J1) {
                        i3 = 2131751355;
                    } else {
                        i3 = 2131751222;
                    }
                    G = org.telegram.messenger.bd.M0(i3, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.bd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.bd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.bd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z14) {
                    V0(new fv0(this, 10), str2, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.Ci, org.telegram.ui.ActionBar.k6.Ei);
                } else if (this.K1.set.official) {
                    U0(new fv0(this, 11), str2, org.telegram.ui.ActionBar.k6.f28122q7);
                } else {
                    U0(new fv0(this, 12), str2, org.telegram.ui.ActionBar.k6.f28122q7);
                }
            }
            this.f40517l1.f();
            return;
        }
        ArrayList arrayList5 = this.P1;
        if (arrayList5 != null) {
            s70 s70Var = this.f40522o1;
            ArrayList arrayList6 = this.Q1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            s70Var.setText(org.telegram.messenger.bd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.R1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.bd.M0(2131749237, null), org.telegram.ui.ActionBar.k6.f28120q5);
                this.f40525r1.setEnabled(false);
                return;
            }
            fv0 fv0Var2 = new fv0(this, 13);
            ArrayList arrayList7 = this.Q1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            U0(fv0Var2, org.telegram.messenger.bd.a0("ImportStickers", null, 2131749250, org.telegram.messenger.bd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.k6.f28061n5);
            this.f40525r1.setEnabled(true);
            return;
        }
        U0(new fv0(this, 14), org.telegram.messenger.bd.M0(2131752041, null), org.telegram.ui.ActionBar.k6.f28061n5);
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f22608q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f22607p);
        if (this.P1 != null) {
            this.f40529v1.setText(org.telegram.messenger.bd.M0(2131749236, null));
            org.telegram.ui.ActionBar.r6.V(this.f40529v1, org.telegram.ui.ActionBar.k6.f28122q7, this.J0);
            float f10 = min;
            this.f40531x1.setLayoutParams(b8.mf.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40532y1.setLayoutParams(b8.mf.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40529v1.setVisibility(0);
            this.f40530w1.setVisibility(0);
        } else if (this.T1 != null && ((tL_messages_stickerSet = this.K1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f40529v1.setText(org.telegram.messenger.bd.M0(2131745599, null));
            float f11 = min;
            this.f40531x1.setLayoutParams(b8.mf.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40532y1.setLayoutParams(b8.mf.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40529v1.setVisibility(0);
            this.f40530w1.setVisibility(0);
        } else {
            this.f40529v1.setText(org.telegram.messenger.bd.M0(2131752041, null));
            this.f40531x1.setLayoutParams(b8.mf.e(min, min, 17));
            this.f40532y1.setLayoutParams(b8.mf.e(min, min, 17));
            this.f40529v1.setVisibility(8);
            this.f40530w1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23246i4) {
            ci.j1 j1Var = this.k1;
            if (j1Var != null) {
                int childCount = j1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.k1.getChildAt(i11).invalidate();
                }
            }
        } else if (i3 == org.telegram.messenger.hs.U1) {
            HashMap hashMap = this.R1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.ry ryVar = (org.telegram.messenger.ry) hashMap.get(str);
                if (ryVar != null) {
                    ryVar.a(this.f28583a, (TLRPC.InputFile) objArr[1], new e7(this, str, ryVar, 29));
                }
            }
        } else if (i3 == org.telegram.messenger.hs.V1) {
            HashMap hashMap2 = this.R1;
            if (hashMap2 != null) {
                org.telegram.messenger.ry ryVar2 = (org.telegram.messenger.ry) hashMap2.remove((String) objArr[0]);
                if (ryVar2 != null) {
                    S0(ryVar2);
                }
                if (this.R1.isEmpty()) {
                    Z0();
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23333x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.N1 != null) {
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.f28583a);
                String str2 = this.N1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = b02.p0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = b02.o0(this.N1.f27021id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.K1) {
                this.K1 = tL_messages_stickerSet;
                R0();
            }
            Z0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f40508d2.s(false);
        Runnable runnable = this.f40516k2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.X1 != 0) {
            ConnectionsManager.getInstance(this.f28583a).cancelRequest(this.X1, true);
            this.X1 = 0;
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        if (this.P1 != null) {
            ArrayList arrayList = this.Q1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.messenger.ry ryVar = (org.telegram.messenger.ry) this.Q1.get(i3);
                    if (!ryVar.f25251c) {
                        org.telegram.messenger.w7.G(this.f28583a).b(ryVar.f25249a, false);
                    }
                    if (ryVar.f25252e) {
                        new File(ryVar.f25249a).delete();
                    }
                }
            }
            org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.U1);
            org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.V1);
        }
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23333x0);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f40516k2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.is.p().E) {
            org.telegram.ui.is.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        ac.a((FrameLayout) this.f28586b, new ai.h1(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        ac.h((FrameLayout) this.f28586b);
    }

    @Override
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0);
            if (this.f28616s0 != null && w02 != this.f40521n2) {
                this.f40521n2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f28586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 4);
    }

    public xv0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.A1 = new AnimatorSet[2];
        this.B1 = new View[2];
        this.f40507b2 = true;
        this.f40508d2 = new l2.e(4);
        this.f40509e2 = new mv0(this);
        N();
        this.F1 = (Activity) context;
        this.P1 = arrayList;
        this.S1 = str;
        Utilities.f21387e.c(new iv0(this, arrayList, arrayList2, 3));
        P0(context);
    }

    public xv0(Context context, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, uv0 uv0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        this.A1 = new AnimatorSet[2];
        this.B1 = new View[2];
        this.f40507b2 = true;
        this.f40508d2 = new l2.e(4);
        this.f40509e2 = new mv0(this);
        N();
        this.T1 = uv0Var;
        this.N1 = inputStickerSet;
        this.K1 = tL_messages_stickerSet;
        this.D1 = d2Var;
        R0();
        P0(context);
    }
}
