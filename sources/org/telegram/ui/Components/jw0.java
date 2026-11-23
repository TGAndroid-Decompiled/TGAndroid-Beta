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
public class jw0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.fs {
    public static final int f36526r2 = 0;
    public p9 A1;
    public TextView B1;
    public n C1;
    public final AnimatorSet[] D1;
    public final View[] E1;
    public bi.g3 F1;
    public final org.telegram.ui.ActionBar.g2 G1;
    public gi.g H1;
    public final Activity I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public TLRPC.TL_messages_stickerSet N1;
    public TLRPC.Document O1;
    public org.telegram.messenger.sy P1;
    public TLRPC.InputStickerSet Q1;
    public ArrayList R1;
    public final ArrayList S1;
    public ArrayList T1;
    public HashMap U1;
    public final String V1;
    public final gw0 W1;
    public hw0 X1;
    public org.telegram.ui.h50 Y1;
    public int Z1;
    public int f36527a2;
    public boolean f36528b2;
    public boolean f36529c2;
    public boolean d2;
    public boolean f36530e2;
    public int f36531f2;
    public final a8.b8 f36532g2;
    public final yv0 f36533h2;
    public as0 f36534i2;
    public String f36535j2;
    public int f36536k2;
    public boolean f36537l2;
    public Pattern f36538m1;
    public String f36539m2;
    public di.b1 n1;
    public Runnable f36540n2;
    public fw0 f36541o1;
    public ArrayList f36542o2;
    public v4.z f36543p1;
    public int f36544p2;
    public TLRPC.Document f36545q1;
    public int f36546q2;
    public j80 f36547r1;
    public org.telegram.ui.ActionBar.q0 f36548s1;
    public org.telegram.ui.ActionBar.y0 f36549t1;
    public n6 f36550u1;
    public ug.r0 f36551v1;
    public FrameLayout f36552w1;
    public FrameLayout f36553x1;
    public TextView f36554y1;
    public View f36555z1;

    public jw0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f36530e2 = true;
        this.f36532g2 = new a8.b8(6);
        this.f36533h2 = new yv0(this);
        this.J0 = i6Var;
        O();
        this.I1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f28562id = tL_inputPhoto;
            tL_inputPhoto.f28511id = photo.f28516id;
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
            tL_inputStickeredMediaDocument.f28561id = tL_inputDocument;
            tL_inputDocument.f28504id = document.f28498id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) this;
        this.f36527a2 = ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_getAttachedStickers, new bi.m2(qo0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.v7(23, qo0Var, tL_messages_getAttachedStickers), 13));
        Q0(context);
    }

    public static void J0(jw0 jw0Var) {
        if (jw0Var.n1.getChildCount() <= 0) {
            jw0Var.X0(jw0Var.n1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < jw0Var.n1.getChildCount(); i11++) {
            View childAt = jw0Var.n1.getChildAt(i11);
            jw0Var.n1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            jw0Var.U0(0, false);
            i7 = top;
        } else {
            jw0Var.U0(0, true);
        }
        jw0Var.U0(1, true);
        if (jw0Var.Z1 != i7) {
            jw0Var.X0(i7);
        }
    }

    public static void N0(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.bn bnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (g2Var != null) {
            if (g2Var instanceof org.telegram.ui.bn) {
                bnVar = (org.telegram.ui.bn) g2Var;
            } else {
                bnVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.i10.f24637t0);
                File J = org.telegram.messenger.w7.J(document, null, true, true);
                if (J != null && J.exists()) {
                    org.telegram.messenger.g0.h3(new kg.q0(J, arrayList, g2Var, bnVar, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new ai.e(g2Var, tL_messages_stickerSet, document, bnVar, z10, 11), 300L);
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29597l5));
    }

    @Override
    public final boolean F() {
        return false;
    }

    public final void K0() {
        if (this.N1 != null) {
            TLRPC.TL_messages_stickerSet z02 = org.telegram.messenger.mp.u1(this.f30223a).z0(this.N1);
            this.N1 = z02;
            if (z02 == null) {
                dismiss();
            }
        }
    }

    public final void L0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.gd.N0(2131749042, null));
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29805w6, this.J0);
            this.f36537l2 = true;
            this.f36535j2 = str;
            return;
        }
        as0 as0Var = this.f36534i2;
        if (as0Var != null) {
            org.telegram.messenger.g0.r(as0Var);
            this.f36534i2 = null;
            this.f36535j2 = null;
            if (this.f36536k2 != 0) {
                ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.f36536k2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.gd.N0(2131749044, null));
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29690q5, this.J0);
            return;
        }
        this.f36537l2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.gd.N0(2131749044, null));
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29672p7, this.J0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131749040, null));
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29672p7, this.J0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.gd.N0(2131749039, null));
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29672p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.gd.N0(2131749041, null));
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.F6, this.J0);
            this.f36535j2 = str;
            as0 as0Var2 = new as0(this, str, textView, 5);
            this.f36534i2 = as0Var2;
            org.telegram.messenger.g0.h3(as0Var2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.gd.N0(2131749038, null));
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29672p7, this.J0);
    }

    public final void M0() {
        if (!this.M1) {
            return;
        }
        this.f36543p1.h(null);
        this.M1 = false;
        this.f36532g2.q(true);
        org.telegram.messenger.g0.d0(this.n1, new fi.e(15));
        this.f36548s1.postDelayed(new uv0(this, 0), 200L);
        this.f36550u1.c(org.telegram.messenger.gd.N0(2131751209, null), true, true);
    }

    public final void O0() {
        if (this.M1) {
            return;
        }
        this.f36543p1.h(this.n1);
        this.M1 = true;
        a8.b8 b8Var = this.f36532g2;
        char c10 = 0;
        b8Var.q(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) b8Var.d;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 6; i7++) {
                arrayList.add(valueOf);
                ((ArrayList) b8Var.f344e).add(valueOf);
                ((ArrayList) b8Var.f345f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.f22875b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new iw0(b8Var, i10, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            char c11 = c10;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[c11] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new iw0(b8Var, i10, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new iw0(b8Var, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) b8Var.f341a).add(ofFloat);
            ((ArrayList) b8Var.f342b).add(ofFloat2);
            ((ArrayList) b8Var.f343c).add(ofFloat3);
            i10++;
            f10 = f11;
            c10 = c11;
        }
        org.telegram.messenger.g0.d0(this.n1, new fi.e(16));
        this.f36548s1.postDelayed(new uv0(this, 1), 200L);
        this.f36550u1.c(org.telegram.messenger.gd.N0(2131751342, null), true, true);
    }

    public final void P0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f36553x1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new p60(this, 24));
        animatorSet.start();
    }

    public final void Q0(Context context) {
        int i7;
        bw0 bw0Var = new bw0(this, context);
        this.f30226b = bw0Var;
        bw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30226b;
        int i10 = this.f30261u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.E1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.n6.V5;
        org.telegram.ui.ActionBar.u6.h(i11, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f30226b.addView(viewArr[0], layoutParams);
        di.b1 b1Var = new di.b1(27, context, this);
        this.n1 = b1Var;
        b1Var.setTag(14);
        di.b1 b1Var2 = this.n1;
        getContext();
        gi.g gVar = new gi.g(this);
        this.H1 = gVar;
        b1Var2.setLayoutManager(gVar);
        this.H1.O = new bi.y2(this, 13);
        this.f36543p1 = new v4.z(new cw0(this));
        di.b1 b1Var3 = this.n1;
        fw0 fw0Var = new fw0(this, context);
        this.f36541o1 = fw0Var;
        b1Var3.setAdapter(fw0Var);
        this.n1.setVerticalScrollBarEnabled(false);
        this.n1.i(new fi.k(12));
        this.n1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setEnabled(true);
        org.telegram.ui.ActionBar.u6.H(this.n1, org.telegram.ui.ActionBar.n6.A5, this.J0);
        this.n1.setOnTouchListener(new ok(this, 6));
        this.n1.setOnScrollListener(new na(this, 21));
        n nVar = new n(this, 16);
        this.C1 = nVar;
        this.n1.setOnItemClickListener(nVar);
        this.f30226b.addView(this.n1, c8.na.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.g3 g3Var = new bi.g3(28, context, this);
        this.F1 = g3Var;
        this.f30226b.addView(g3Var, c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.n1.setEmptyView(this.F1);
        this.F1.setOnTouchListener(new gi.a(25));
        j80 j80Var = new j80(context, null);
        this.f36547r1 = j80Var;
        j80Var.setLines(1);
        this.f36547r1.setSingleLine(true);
        org.telegram.ui.ActionBar.u6.U(this.f36547r1, org.telegram.ui.ActionBar.n6.f29559j5, this.J0);
        this.f36547r1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.u6.G(this.f36547r1, org.telegram.ui.ActionBar.n6.f29579k5, this.J0);
        this.f36547r1.setEllipsize(TextUtils.TruncateAt.END);
        this.f36547r1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.f36547r1.setGravity(16);
        this.f36547r1.setTypeface(org.telegram.messenger.g0.o());
        this.f30226b.addView(this.f36547r1, c8.na.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Aj, this.J0), false, this.J0);
        this.f36548s1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.f36548s1.setSubMenuOpenSide(2);
        this.f36548s1.setIcon(2131231247);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36548s1;
        int i12 = org.telegram.ui.ActionBar.n6.Ej;
        org.telegram.ui.ActionBar.u6.Q(q0Var2, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, this.J0), 1, -1), null, org.telegram.ui.ActionBar.u6.M(i12), this.J0);
        this.f30226b.addView(this.f36548s1, c8.na.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f36548s1.e(1, 2131232368, org.telegram.messenger.gd.N0(2131744605, null));
        this.f36548s1.e(2, 2131232208, org.telegram.messenger.gd.N0(2131751750, null));
        this.f36548s1.setOnClickListener(new sv0(this, 1));
        this.f36548s1.setDelegate(new tv0(this));
        this.f36548s1.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f36548s1;
        if (this.Q1 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        q0Var3.setVisibility(i7);
        this.F1.addView(new RadialProgressView(context, null), c8.na.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.u6.h(i11, view2, this.J0);
        this.f30226b.addView(viewArr[1], layoutParams2);
        n6 n6Var = new n6(context, false, false, false);
        this.f36550u1 = n6Var;
        int i13 = org.telegram.ui.ActionBar.n6.f29524h5;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i13, this.J0);
        int i14 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.n6.i0(w02, org.telegram.ui.ActionBar.n6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i14);
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        n6Var.setBackground(i02);
        org.telegram.ui.ActionBar.u6.j(n6Var, i02, M, M2, i6Var);
        n6 n6Var2 = this.f36550u1;
        int i15 = org.telegram.ui.ActionBar.n6.f29632n5;
        this.f36531f2 = i15;
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i15, this.J0);
        this.f36550u1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f36550u1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f36550u1.setTypeface(org.telegram.messenger.g0.o());
        this.f36550u1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36552w1 = frameLayout;
        frameLayout.addView(this.f36550u1, c8.na.c(48.0f, -1));
        this.f30226b.addView(this.f36552w1, c8.na.e(-1, -2, 83));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.f36551v1 = r0Var;
        r0Var.setIcon(2131624315);
        this.f36551v1.setVisibility(4);
        this.f30226b.addView(this.f36551v1, c8.na.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36553x1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f36553x1.setSoundEffectsEnabled(false);
        this.f30226b.addView(this.f36553x1, c8.na.c(-1.0f, -1));
        this.f36553x1.setOnClickListener(new sv0(this, 2));
        p9 p9Var = new p9(context);
        this.A1 = p9Var;
        p9Var.setAspectFit(true);
        this.A1.setLayerNum(7);
        this.f36553x1.addView(this.A1);
        TextView textView = new TextView(context);
        this.B1 = textView;
        textView.setTextSize(1, 30.0f);
        this.B1.setGravity(85);
        this.f36553x1.addView(this.B1);
        TextView textView2 = new TextView(context);
        this.f36554y1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(this.f36554y1, i15, this.J0);
        org.telegram.ui.ActionBar.u6.Q(this.f36554y1, org.telegram.ui.ActionBar.n6.i0(org.telegram.ui.ActionBar.n6.w0(i13, this.J0), org.telegram.ui.ActionBar.n6.w0(i14, this.J0)), org.telegram.ui.ActionBar.u6.M(i13), org.telegram.ui.ActionBar.u6.M(i14), this.J0);
        this.f36554y1.setGravity(17);
        this.f36554y1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f36554y1.setTypeface(org.telegram.messenger.g0.o());
        this.f36553x1.addView(this.f36554y1, c8.na.e(-1, 48, 83));
        this.f36554y1.setOnClickListener(new sv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f36555z1 = view3;
        org.telegram.ui.ActionBar.u6.h(i11, view3, this.J0);
        this.f36553x1.addView(this.f36555z1, layoutParams3);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25247l4);
        if (this.S1 != null) {
            org.telegram.messenger.ks.f(this.f30223a).c(this, org.telegram.messenger.ks.U1);
            org.telegram.messenger.ks.f(this.f30223a).c(this, org.telegram.messenger.ks.V1);
        }
        org.telegram.messenger.ks.f(this.f30223a).c(this, org.telegram.messenger.ks.f25317x0);
        a1();
        b1();
        Z0();
        Y0(false);
        this.f36541o1.f();
    }

    public final boolean R0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.L1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void S0() {
        String str;
        if (this.Q1 != null) {
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.f30223a);
            if (this.N1 == null && (str = this.Q1.short_name) != null) {
                this.N1 = d02.r0(str);
            }
            if (this.N1 == null) {
                this.N1 = d02.q0(this.Q1.f28512id);
            }
            if (this.N1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.Q1;
                ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.v7(22, this, d02));
            } else {
                if (this.f36541o1 != null) {
                    b1();
                    a1();
                    this.f36541o1.f();
                }
                Z0();
                d02.t1(this.N1);
                K0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet != null) {
            this.f36529c2 = !tL_messages_stickerSet.set.masks;
        }
        K0();
    }

    public final void T0(org.telegram.messenger.sy syVar) {
        int indexOf = this.T1.indexOf(syVar);
        if (indexOf >= 0) {
            this.T1.remove(indexOf);
            this.f36541o1.s(indexOf);
            if (this.T1.isEmpty()) {
                dismiss();
            } else {
                a1();
            }
        }
    }

    public final void U0(int i7, boolean z10) {
        Integer num;
        float f10;
        if (this.R1 == null) {
            View[] viewArr = this.E1;
            if ((z10 && viewArr[i7].getTag() != null) || (!z10 && viewArr[i7].getTag() == null)) {
                View view = viewArr[i7];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i7].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.D1;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i7] = animatorSet2;
                View view2 = viewArr[i7];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i7].setDuration(150L);
                animatorSetArr[i7].addListener(new xv0(this, i7, z10));
                animatorSetArr[i7].start();
            }
        }
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        w6 w6Var = new w6(this, 6);
        ViewGroup viewGroup = this.f30226b;
        Drawable[] drawableArr = {this.f30259s0};
        int i7 = org.telegram.ui.ActionBar.n6.f29524h5;
        arrayList.add(new org.telegram.ui.ActionBar.w6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f30226b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.zj));
        if (this.f36541o1.f35215r.R1 != null) {
            org.telegram.ui.Cells.v3.a(arrayList, w6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f36548s1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f36550u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        n6 n6Var = this.f36550u1;
        int i10 = org.telegram.ui.ActionBar.n6.f29543i6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(n6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f36550u1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, this.f36531f2));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f36554y1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f36554y1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7) {
        W0(onClickListener, str, i7, -1, -1);
    }

    public final void W0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            n6 n6Var = this.f36550u1;
            this.f36531f2 = i7;
            org.telegram.ui.ActionBar.u6.Y(n6Var, i7, this.J0);
        }
        this.f36550u1.c(str, false, true);
        this.f36550u1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f36550u1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.n1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.F1.getLayoutParams();
        if (onClickListener == null) {
            this.f36550u1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            n6 n6Var2 = this.f36550u1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.J0);
            int w03 = org.telegram.ui.ActionBar.n6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.u6.Q(n6Var2, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.u6.M(i10), org.telegram.ui.ActionBar.u6.M(i11), this.J0);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, this.f36552w1, this.J0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f36550u1.getAlpha() < 1.0f) {
                org.telegram.messenger.m10.o(this.f36550u1.animate().alpha(1.0f), kr.h, 240L);
            }
        } else {
            n6 n6Var3 = this.f36550u1;
            int i12 = org.telegram.ui.ActionBar.n6.f29524h5;
            int w04 = org.telegram.ui.ActionBar.n6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.n6.f29692q7;
            org.telegram.ui.ActionBar.u6.Q(n6Var3, org.telegram.ui.ActionBar.n6.i0(w04, org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i13, this.J0))), org.telegram.ui.ActionBar.u6.M(i12), org.telegram.ui.ActionBar.u6.K(0.1f, i13), this.J0);
            this.f36552w1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f36550u1.getAlpha() < 1.0f) {
                org.telegram.messenger.m10.o(this.f36550u1.animate().alpha(1.0f), kr.h, 240L);
            }
        }
        this.f30226b.requestLayout();
    }

    public final void X0(int i7) {
        this.Z1 = i7;
        if (this.R1 == null) {
            float f10 = i7;
            this.f36547r1.setTranslationY(f10);
            if (this.S1 == null) {
                this.f36548s1.setTranslationY(f10);
            }
            this.E1[0].setTranslationY(f10);
        }
        this.f30226b.invalidate();
    }

    public final void Y0(boolean z10) {
        this.f36541o1.getClass();
        this.f36547r1.setHighlightColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29597l5, this.J0));
        this.f36553x1.setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0) & (-536870913));
        this.f36548s1.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Aj, this.J0));
        this.f36548s1.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.J0), false);
        this.f36548s1.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.J0), true);
        this.f36548s1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I5, this.J0));
        this.f36548s1.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.J0));
        if (this.f36549t1 != null) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29692q7, this.J0);
            this.f36549t1.d(w02, w02);
            this.f36549t1.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.1f, w02));
            if (this.f36549t1.getRightIcon() != null && w02 != this.f36544p2) {
                this.f36544p2 = w02;
                this.f36549t1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.n6.h1() && this.f36542o2 == null) {
                ArrayList V = V();
                this.f36542o2 = V;
                int size = V.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.w6) this.f36542o2.get(i7)).f30283g = null;
                }
            }
            int size2 = this.f36542o2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) this.f36542o2.get(i10);
                w6Var.e(org.telegram.ui.ActionBar.n6.w0(w6Var.f30281e, this.J0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.n6.h1() && this.f36542o2 != null) {
            this.f36542o2 = null;
        }
    }

    public final void Z0() {
        if (this.f30226b != null && !org.telegram.messenger.i10.i(this.f30223a).q()) {
            org.telegram.messenger.fj.V3(this.N1);
        }
    }

    public final void a1() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        String G;
        int i7;
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
        String N0;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.f36547r1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.j6.m(this.N1.set.title, this.f36547r1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f36538m1 == null) {
                    this.f36538m1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f36538m1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.N1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new o4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f36547r1.setText(m10);
            if (R0()) {
                int measuredWidth = this.n1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f24226q.x;
                }
                fw0 fw0Var = this.f36541o1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                fw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.f36541o1.d = 5;
            }
            this.H1.y1(this.f36541o1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.N1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.i10.i(this.f30223a).q() && this.Y1 == null) {
                if (this.N1.documents != null) {
                    for (int i17 = 0; i17 < this.N1.documents.size(); i17++) {
                        if (!org.telegram.messenger.fj.m3(this.N1.documents.get(i17))) {
                            this.f36551v1.setVisibility(0);
                            this.f36550u1.setBackground(null);
                            V0(null, null, -1);
                            this.f36551v1.b(org.telegram.messenger.gd.N0(2131743618, null), new sv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f36551v1.setVisibility(4);
            }
            org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.f30223a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.N1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList u02 = d02.u0(5);
                for (int i18 = 0; u02 != null && i18 < u02.size(); i18++) {
                    if (u02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) u02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) u02.get(i18)).set.f28519id == this.N1.set.f28519id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && d02.E0(stickerSet.f28519id, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.h50 h50Var = this.Y1;
            if (h50Var != null) {
                sv0 sv0Var = new sv0(this, 5);
                boolean z12 = h50Var.f48431a;
                if (h50Var.f48433c.O) {
                    if (z12) {
                        i14 = 2131746114;
                    } else {
                        i14 = 2131745348;
                    }
                    N0 = org.telegram.messenger.gd.N0(i14, null);
                } else {
                    if (z12) {
                        i11 = 2131746113;
                    } else {
                        i11 = 2131745347;
                    }
                    N0 = org.telegram.messenger.gd.N0(i11, null);
                }
                String str = N0;
                boolean z13 = this.Y1.f48431a;
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.n6.f29692q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.n6.Ji;
                }
                if (!z13) {
                    i13 = org.telegram.ui.ActionBar.n6.Fi;
                } else {
                    i13 = -1;
                }
                if (!z13) {
                    i16 = org.telegram.ui.ActionBar.n6.Hi;
                }
                W0(sv0Var, str, i12, i13, i16);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.N1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!d02.X[i15]) {
                    d02.D(i15);
                    W0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.N1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.gd.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.gd.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    G2 = org.telegram.messenger.gd.G(i10, "AddManyStickersCount", new Object[0]);
                }
                W0(new sv0(this, 9), G2, org.telegram.ui.ActionBar.n6.Ji, org.telegram.ui.ActionBar.n6.Fi, org.telegram.ui.ActionBar.n6.Hi);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.N1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.M1) {
                        i7 = 2131751342;
                    } else {
                        i7 = 2131751209;
                    }
                    G = org.telegram.messenger.gd.N0(i7, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.gd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z14) {
                    W0(new sv0(this, 10), str2, org.telegram.ui.ActionBar.n6.Ji, org.telegram.ui.ActionBar.n6.Fi, org.telegram.ui.ActionBar.n6.Hi);
                } else if (this.N1.set.official) {
                    V0(new sv0(this, 11), str2, org.telegram.ui.ActionBar.n6.f29692q7);
                } else {
                    V0(new sv0(this, 12), str2, org.telegram.ui.ActionBar.n6.f29692q7);
                }
            }
            this.f36541o1.f();
            return;
        }
        ArrayList arrayList5 = this.S1;
        if (arrayList5 != null) {
            j80 j80Var = this.f36547r1;
            ArrayList arrayList6 = this.T1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            j80Var.setText(org.telegram.messenger.gd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.U1;
            if (hashMap != null && !hashMap.isEmpty()) {
                V0(null, org.telegram.messenger.gd.N0(2131749036, null), org.telegram.ui.ActionBar.n6.f29690q5);
                this.f36550u1.setEnabled(false);
                return;
            }
            sv0 sv0Var2 = new sv0(this, 13);
            ArrayList arrayList7 = this.T1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            V0(sv0Var2, org.telegram.messenger.gd.a0("ImportStickers", null, 2131749049, org.telegram.messenger.gd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.n6.f29632n5);
            this.f36550u1.setEnabled(true);
            return;
        }
        V0(new sv0(this, 14), org.telegram.messenger.gd.N0(2131752029, null), org.telegram.ui.ActionBar.n6.f29632n5);
    }

    public final void b1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f24226q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f24225p);
        if (this.S1 != null) {
            this.f36554y1.setText(org.telegram.messenger.gd.N0(2131749035, null));
            org.telegram.ui.ActionBar.u6.U(this.f36554y1, org.telegram.ui.ActionBar.n6.f29692q7, this.J0);
            float f10 = min;
            this.A1.setLayoutParams(c8.na.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.na.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f36554y1.setVisibility(0);
            this.f36555z1.setVisibility(0);
        } else if (this.W1 != null && ((tL_messages_stickerSet = this.N1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f36554y1.setText(org.telegram.messenger.gd.N0(2131745393, null));
            float f11 = min;
            this.A1.setLayoutParams(c8.na.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.na.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f36554y1.setVisibility(0);
            this.f36555z1.setVisibility(0);
        } else {
            this.f36554y1.setText(org.telegram.messenger.gd.N0(2131752029, null));
            this.A1.setLayoutParams(c8.na.e(min, min, 17));
            this.B1.setLayoutParams(c8.na.e(min, min, 17));
            this.f36554y1.setVisibility(8);
            this.f36555z1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25247l4) {
            di.b1 b1Var = this.n1;
            if (b1Var != null) {
                int childCount = b1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.n1.getChildAt(i11).invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.U1) {
            HashMap hashMap = this.U1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) hashMap.get(str);
                if (syVar != null) {
                    syVar.a(this.f30223a, (TLRPC.InputFile) objArr[1], new as0(this, str, syVar, 2));
                }
            }
        } else if (i7 == org.telegram.messenger.ks.V1) {
            HashMap hashMap2 = this.U1;
            if (hashMap2 != null) {
                org.telegram.messenger.sy syVar2 = (org.telegram.messenger.sy) hashMap2.remove((String) objArr[0]);
                if (syVar2 != null) {
                    T0(syVar2);
                }
                if (this.U1.isEmpty()) {
                    a1();
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25317x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.Q1 != null) {
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.f30223a);
                String str2 = this.Q1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = d02.r0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = d02.q0(this.Q1.f28512id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.N1) {
                this.N1 = tL_messages_stickerSet;
                S0();
            }
            a1();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f36532g2.q(false);
        Runnable runnable = this.f36540n2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f36527a2 != 0) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.f36527a2, true);
            this.f36527a2 = 0;
        }
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25247l4);
        if (this.S1 != null) {
            ArrayList arrayList = this.T1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.sy syVar = (org.telegram.messenger.sy) this.T1.get(i7);
                    if (!syVar.f27003c) {
                        org.telegram.messenger.w7.G(this.f30223a).b(syVar.f27001a, false);
                    }
                    if (syVar.f27004e) {
                        new File(syVar.f27001a).delete();
                    }
                }
            }
            org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.U1);
            org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.V1);
        }
        org.telegram.messenger.ks.f(this.f30223a).n(this, org.telegram.messenger.ks.f25317x0);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f36540n2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        fc.a((FrameLayout) this.f30226b, new bi.i1(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        fc.h((FrameLayout) this.f30226b);
    }

    @Override
    public final void s0() {
        super.s0();
        Y0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, this.J0);
            if (this.f30259s0 != null && w02 != this.f36546q2) {
                this.f36546q2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f30226b;
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
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 4);
    }

    public jw0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.i6) null, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f36530e2 = true;
        this.f36532g2 = new a8.b8(6);
        this.f36533h2 = new yv0(this);
        O();
        this.I1 = (Activity) context;
        this.S1 = arrayList;
        this.V1 = str;
        Utilities.f22877e.c(new as0((Object) this, (Object) arrayList, (Object) arrayList2, 6));
        Q0(context);
    }

    public jw0(Context context, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, gw0 gw0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f36530e2 = true;
        this.f36532g2 = new a8.b8(6);
        this.f36533h2 = new yv0(this);
        O();
        this.W1 = gw0Var;
        this.Q1 = inputStickerSet;
        this.N1 = tL_messages_stickerSet;
        this.G1 = g2Var;
        S0();
        Q0(context);
    }
}
