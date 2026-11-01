package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public abstract class n31 extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.vs {
    public static final String[] O1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap P1;
    public int A1;
    public boolean B1;
    public boolean C1;
    public final z21 D1;
    public final m31 E1;
    public final org.telegram.ui.Cells.k9 F1;
    public final org.telegram.ui.Cells.v9 G1;
    public final View H1;
    public final TextView I1;
    public org.telegram.ui.ActionBar.k2 J1;
    public org.telegram.messenger.s20 K1;
    public boolean L1;
    public final t5 M1;
    public Boolean N1;
    public Integer f28646i1;
    public final CharSequence f28647j1;
    public final TLRPC.InputPeer f28648k1;
    public final int l1;
    public final boolean f28649m1;
    public final TL_iv.RichMessage f28650n1;
    public final org.telegram.messenger.mu f28651o1;
    public final org.telegram.messenger.mu f28652p1;
    public final String f28653q1;
    public String f28654r1;
    public String f28655s1;
    public final l31 f28656t1;
    public final bi.j6 f28657u1;
    public final y21 f28658v1;
    public final p80 f28659w1;
    public final Drawable f28660x1;
    public final Drawable f28661y1;
    public int f28662z1;

    public n31(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i10, boolean z10, TL_iv.RichMessage richMessage) {
        super(1, context, (org.telegram.ui.ActionBar.p6) null, false);
        String charSequence2;
        View view;
        this.B1 = org.telegram.ui.ActionBar.t6.I.q();
        this.L1 = true;
        this.f21616t0 = 0;
        O();
        this.f28647j1 = charSequence;
        this.f28648k1 = inputPeer;
        this.l1 = i10;
        this.f28649m1 = z10;
        this.f28650n1 = richMessage;
        this.f28653q1 = str;
        this.f28654r1 = str2;
        h31 h31Var = new h31(this, context);
        this.f21587b = h31Var;
        this.M1 = new t5(h31Var, 320L, gr.h);
        bi.j6 j6Var = new bi.j6(context, 6);
        this.f28657u1 = j6Var;
        j6Var.setPadding(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(6.0f));
        j6Var.setTextSize(1, org.telegram.messenger.uz.W0);
        int i11 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(j6Var, i11, null);
        org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.2f, i11);
        org.telegram.ui.ActionBar.a7.o(j6Var, 2, L.f21453a, -1, 2, L.d, null);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        j6Var.setText(org.telegram.messenger.k6.m(charSequence2, j6Var.getPaint().getFontMetricsInt(), true, null, 0));
        this.f28658v1 = new FrameLayout(context);
        p80 p80Var = new p80(context, null);
        this.f28659w1 = p80Var;
        p80Var.setDisablePaddingsOffsetY(true);
        p80Var.setPadding(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(6.0f));
        p80Var.setTextSize(1, org.telegram.messenger.uz.W0);
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, null);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, null);
        p80Var.setTextIsSelectable(true);
        org.telegram.ui.ActionBar.a7.D(p80Var, org.telegram.ui.ActionBar.t6.f21029ig, null);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21049jg, this.I0);
        this.A1 = w02;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.d6.i()) {
                Drawable textSelectHandleLeft = p80Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(w02, mode);
                p80Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.f28660x1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = p80Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(w02, mode);
                p80Var.setTextSelectHandleRight(textSelectHandleRight);
                this.f28661y1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.f28658v1.addView(this.f28659w1, w7.b6.c(-1.0f, -1));
        if (this.f28650n1 != null) {
            org.telegram.messenger.mu muVar = new org.telegram.messenger.mu(this.f21584a, context, null);
            this.f28651o1 = muVar;
            muVar.setPadding(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(6.0f));
            muVar.set(this.f28650n1);
            muVar.setTranslationLoading(true);
            org.telegram.messenger.mu muVar2 = new org.telegram.messenger.mu(this.f21584a, context, null);
            this.f28652p1 = muVar2;
            muVar2.setPadding(org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(22.0f), org.telegram.messenger.i0.L(6.0f));
        }
        z21 z21Var = new z21(this, context);
        this.D1 = z21Var;
        z21Var.setOverScrollMode(1);
        z21Var.setPadding(0, org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16166m, 0, org.telegram.messenger.i0.L(80.0f));
        z21Var.setClipToPadding(true);
        s4.a0 a0Var = new s4.a0();
        z21Var.setLayoutManager(a0Var);
        if (this.f28650n1 != null) {
            view = this.f28651o1;
        } else {
            view = this.f28657u1;
        }
        ?? g0Var = new s4.g0();
        g0Var.e = 1;
        g0Var.f28366c = context;
        g0Var.d = view;
        this.E1 = g0Var;
        z21Var.setAdapter(g0Var);
        z21Var.setOnScrollListener(new a31(this));
        b31 b31Var = new b31(this);
        b31Var.n(180L);
        b31Var.o(new LinearInterpolator());
        z21Var.setItemAnimator(b31Var);
        this.f21587b.addView(z21Var, w7.b6.e(-1, -2, 80));
        org.telegram.ui.Cells.k9 k9Var = new org.telegram.ui.Cells.k9();
        this.F1 = k9Var;
        k9Var.S(z21Var);
        k9Var.f22197z0 = a0Var;
        org.telegram.ui.Cells.v9 n10 = k9Var.n(context);
        this.G1 = n10;
        org.telegram.messenger.i0.E2(n10);
        this.f21587b.addView(n10, w7.b6.e(-1, -1, 119));
        org.telegram.messenger.mu muVar3 = this.f28652p1;
        if (muVar3 != null) {
            muVar3.setTextSelectionHelper(k9Var);
        }
        l31 l31Var = new l31(this, context);
        this.f28656t1 = l31Var;
        this.f21587b.addView(l31Var, w7.b6.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, frameLayout, null);
        View view2 = new View(context);
        this.H1 = view2;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.V5, view2, null);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, w7.b6.a(-1.0f, org.telegram.messenger.i0.f1() / org.telegram.messenger.i0.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.I1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(org.telegram.messenger.dd.L0(2131752037, null));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
        this.f28662z1 = x02;
        textView.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 24.0f));
        textView.setOnClickListener(new db0(this, 20));
        frameLayout.addView(textView, w7.b6.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.f21587b.addView(frameLayout, w7.b6.e(-1, -2, 87));
        W0();
    }

    public static boolean I0(n31 n31Var) {
        View childAt;
        z21 z21Var = n31Var.D1;
        float f7 = 0.0f;
        for (int i10 = 0; i10 < z21Var.getChildCount(); i10++) {
            if (RecyclerView.R(z21Var.getChildAt(i10)) == 1) {
                f7 += childAt.getHeight();
            }
        }
        if (f7 < (z21Var.getHeight() - z21Var.getPaddingTop()) - z21Var.getPaddingBottom()) {
            return false;
        }
        return true;
    }

    public static void J0(String str, String str2, String str3, org.telegram.messenger.k20 k20Var) {
        if (str2 == null) {
            org.telegram.messenger.ks.d(str, new x21(str, str3, k20Var), new x21(str, str3, k20Var), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() > 5000) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < encode.length()) {
                int min = Math.min(i10 + 5000, encode.length());
                int i11 = min - 1;
                int lastIndexOf = encode.lastIndexOf("%0A", i11);
                if (lastIndexOf < i10) {
                    lastIndexOf = -1;
                }
                if (lastIndexOf == -1) {
                    int lastIndexOf2 = encode.lastIndexOf("%20", i11);
                    if (lastIndexOf2 >= i10) {
                        lastIndexOf = lastIndexOf2;
                    } else {
                        lastIndexOf = -1;
                    }
                }
                if (lastIndexOf != -1) {
                    min = lastIndexOf + 3;
                }
                arrayList.add(encode.substring(i10, min));
                i10 = min;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(null);
            }
            boolean[] zArr = new boolean[1];
            int i13 = 0;
            while (i13 < arrayList.size()) {
                org.telegram.messenger.k20 k20Var2 = k20Var;
                new d31(str2, str3, (String) arrayList.get(i13), new org.telegram.ui.f0(zArr, arrayList2, i13, k20Var2, 3)).start();
                i13++;
                k20Var = k20Var2;
            }
            return;
        }
        new d31(str2, str3, encode, k20Var).start();
    }

    public static String K0(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        }
        return null;
    }

    public static String M0() {
        return org.telegram.messenger.wp.d1().getString("translate_to_language", org.telegram.messenger.dd.D0().f15365y.getLanguage());
    }

    public static HashMap N0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j10 = org.telegram.messenger.k6.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i10 = 0; i10 < j10.size(); i10++) {
                org.telegram.messenger.i6 i6Var = (org.telegram.messenger.i6) j10.get(i10);
                if (i6Var != null && i6Var.f16235c != null) {
                    String substring = charSequence2.substring(i6Var.f16233a, i6Var.f16234b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(i6Var);
                }
            }
        }
        return hashMap;
    }

    public static String O0(String str, boolean[] zArr, boolean[] zArr2) {
        org.telegram.messenger.ad adVar;
        String str2;
        boolean z10;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        boolean z11 = true;
        if (zArr != null) {
            String M0 = org.telegram.messenger.dd.M0("TranslateLanguage" + str3.toUpperCase());
            if (M0 != null && !M0.startsWith("LOC_ERR")) {
                z10 = true;
            } else {
                z10 = false;
            }
            zArr[0] = z10;
            if (z10) {
                return M0;
            }
        }
        if (zArr2 != null) {
            String M02 = org.telegram.messenger.dd.M0("TranslateLanguageGenitive" + str3.toUpperCase());
            if (M02 == null || M02.startsWith("LOC_ERR")) {
                z11 = false;
            }
            zArr2[0] = z11;
            if (z11) {
                return M02;
            }
        }
        String V0 = V0(str, false);
        if (V0 == null) {
            V0 = V0(str3, false);
        }
        if (V0 != null) {
            return V0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        org.telegram.messenger.ad adVar2 = org.telegram.messenger.dd.D0().B;
        Iterator it = org.telegram.messenger.dd.D0().N.values().iterator();
        while (true) {
            if (it.hasNext()) {
                adVar = (org.telegram.messenger.ad) it.next();
                String str4 = adVar.d;
                if (str4 != null && str4.equals("remote") && ((str2 = adVar.f14593c) == null || !str2.endsWith("_raw"))) {
                    String str5 = adVar.f14594f;
                    if (str5 != null && str5.equals(str)) {
                        break;
                    }
                }
            } else {
                adVar = null;
                break;
            }
        }
        if (adVar == null) {
            return null;
        }
        if (adVar2 != null && "en".equals(adVar2.f14594f)) {
            return adVar.f14592b;
        }
        return adVar.f14591a;
    }

    public static TLRPC.TL_textWithEntities P0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        org.telegram.messenger.i6 i6Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 != null && tL_textWithEntities2.text != null) {
            for (int i10 = 0; i10 < tL_textWithEntities2.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                    if (messageEntity.url != null) {
                        String str = tL_textWithEntities2.text;
                        int i11 = messageEntity.offset;
                        String substring = str.substring(i11, messageEntity.length + i11);
                        if (TextUtils.equals(substring, messageEntity.url)) {
                            TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                            tL_messageEntityUrl.offset = messageEntity.offset;
                            tL_messageEntityUrl.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i10, tL_messageEntityUrl);
                        } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            tL_messageEntityMention.offset = messageEntity.offset;
                            tL_messageEntityMention.length = messageEntity.length;
                            tL_textWithEntities2.entities.set(i10, tL_messageEntityMention);
                        }
                    }
                } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i10 < arrayList.size() && (tL_textWithEntities.entities.get(i10) instanceof TLRPC.TL_messageEntityPre)) {
                    messageEntity.language = tL_textWithEntities.entities.get(i10).language;
                }
            }
            if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
                HashMap N0 = N0(tL_textWithEntities.text);
                HashMap N02 = N0(tL_textWithEntities2.text);
                for (int i12 = 0; i12 < tL_textWithEntities.entities.size(); i12++) {
                    TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i12);
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                        String str2 = tL_textWithEntities.text;
                        int i13 = messageEntity2.offset;
                        String substring2 = str2.substring(i13, messageEntity2.length + i13);
                        if (!TextUtils.isEmpty(substring2)) {
                            ArrayList arrayList2 = (ArrayList) N0.get(substring2);
                            ArrayList arrayList3 = (ArrayList) N02.get(substring2);
                            if (arrayList2 != null && arrayList3 != null) {
                                int i14 = 0;
                                while (true) {
                                    if (i14 < arrayList2.size()) {
                                        org.telegram.messenger.i6 i6Var2 = (org.telegram.messenger.i6) arrayList2.get(i14);
                                        int i15 = i6Var2.f16233a;
                                        int i16 = messageEntity2.offset;
                                        if (i15 == i16 && i6Var2.f16234b == i16 + messageEntity2.length) {
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        i14 = -1;
                                        break;
                                    }
                                }
                                if (i14 >= 0 && i14 < arrayList3.size() && (i6Var = (org.telegram.messenger.i6) arrayList3.get(i14)) != null) {
                                    int i17 = i6Var.f16234b;
                                    int i18 = i6Var.f16233a;
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 < tL_textWithEntities2.entities.size()) {
                                            TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i19);
                                            if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                                int i20 = messageEntity3.offset;
                                                if (org.telegram.messenger.i0.B1(i18, i17, i20, messageEntity3.length + i20)) {
                                                    break;
                                                }
                                            }
                                            i19++;
                                        } else {
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                            TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                            tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                            tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                            tL_messageEntityCustomEmoji.offset = i18;
                                            tL_messageEntityCustomEmoji.length = i17 - i18;
                                            tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return tL_textWithEntities2;
        }
        return null;
    }

    public static void S0(String str) {
        org.telegram.messenger.wp.d1().edit().putString("translate_to_language", str).apply();
    }

    public static e31 T0(Activity activity, org.telegram.ui.un unVar, TLRPC.InputPeer inputPeer, int i10, boolean z10, String str, String str2, CharSequence charSequence, boolean z11, org.telegram.ui.rf rfVar, Runnable runnable) {
        e31 e31Var = new e31(activity, str, str2, charSequence, inputPeer, i10, z10, runnable);
        e31Var.R0(z11);
        e31Var.J1 = unVar;
        e31Var.K1 = rfVar;
        if (unVar.getParentActivity() != null) {
            unVar.showDialog(e31Var);
        }
        return e31Var;
    }

    public static void U0(Context context, org.telegram.ui.ActionBar.k2 k2Var, String str, String str2, CharSequence charSequence, org.telegram.ui.j10 j10Var, org.telegram.ui.Cells.f fVar) {
        if (context == null) {
            return;
        }
        g31 g31Var = new g31(context, str, str2, charSequence, fVar);
        g31Var.R0(false);
        g31Var.J1 = k2Var;
        g31Var.K1 = j10Var;
        if (k2Var != null) {
            if (k2Var.getParentActivity() != null) {
                k2Var.showDialog(g31Var);
                return;
            }
            return;
        }
        g31Var.show();
    }

    public static String V0(String str, boolean z10) {
        Locale locale;
        Locale locale2;
        if (str != null) {
            if (P1 == null) {
                P1 = new HashMap();
                try {
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    for (int i10 = 0; i10 < availableLocales.length; i10++) {
                        P1.put(availableLocales[i10].getLanguage(), availableLocales[i10]);
                        String country = availableLocales[i10].getCountry();
                        if (country != null && country.length() > 0) {
                            HashMap hashMap = P1;
                            hashMap.put(availableLocales[i10].getLanguage() + "-" + country.toLowerCase(), availableLocales[i10]);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            String lowerCase = str.replace("_", "-").toLowerCase();
            try {
                Locale locale3 = (Locale) P1.get(lowerCase);
                if (locale3 != null) {
                    if (z10) {
                        locale = locale3;
                    } else {
                        locale = Locale.getDefault();
                    }
                    String displayLanguage = locale3.getDisplayLanguage(locale);
                    if (lowerCase.contains("-")) {
                        if (z10) {
                            locale2 = locale3;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        String displayCountry = locale3.getDisplayCountry(locale2);
                        if (!TextUtils.isEmpty(displayCountry)) {
                            return displayLanguage + " (" + displayCountry + ")";
                        }
                        return displayLanguage;
                    }
                    return displayLanguage;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final void L() {
        if (this.f28646i1 != null) {
            ConnectionsManager.getInstance(this.f21584a).cancelRequest(this.f28646i1.intValue(), true);
            this.f28646i1 = null;
        }
        super.L();
    }

    public final float L0(boolean z10) {
        t5 t5Var;
        z21 z21Var = this.D1;
        float top = z21Var.getTop();
        if (z21Var.getChildCount() >= 1) {
            top += Math.max(0, z21Var.getChildAt(z21Var.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - org.telegram.messenger.i0.L(78.0f));
        if (z10 && (t5Var = this.M1) != null) {
            if (!z21Var.I1 && !this.C1) {
                return t5Var.e(false, max);
            }
            t5Var.e(true, max);
        }
        return max;
    }

    public final CharSequence Q0(CharSequence charSequence) {
        URLSpan[] uRLSpanArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.K1 != null || this.J1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.h(8, this, uRLSpan), spanStart, spanEnd, 33);
                }
            }
        }
        return org.telegram.messenger.k6.m(spannableStringBuilder, this.f28659w1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void R0(boolean z10) {
        p80 p80Var = this.f28659w1;
        if (p80Var != null) {
            p80Var.setTextIsSelectable(!z10);
        }
        if (z10) {
            getWindow().addFlags(8192);
            org.telegram.messenger.i0.h2();
            return;
        }
        getWindow().clearFlags(8192);
        org.telegram.messenger.i0.h2();
    }

    public final void W0() {
        String charSequence;
        if (this.f28646i1 != null) {
            ConnectionsManager.getInstance(this.f21584a).cancelRequest(this.f28646i1.intValue(), true);
            this.f28646i1 = null;
        }
        if ("alternative".equalsIgnoreCase(org.telegram.messenger.wp.r1(this.f21584a).V6)) {
            X0();
            return;
        }
        String str = this.f28654r1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        TL_iv.RichMessage richMessage = this.f28650n1;
        int i10 = this.l1;
        TLRPC.InputPeer inputPeer = this.f28648k1;
        if (richMessage != null && inputPeer != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags = 1 | tL_messages_translateRichMessage.flags;
            tL_messages_translateRichMessage.peer = inputPeer;
            tL_messages_translateRichMessage.f19917id.add(Integer.valueOf(i10));
            tL_messages_translateRichMessage.to_lang = org.telegram.messenger.u10.D(str);
            this.f28646i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_messages_translateRichMessage, new x1(this, 15)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence2 = this.f28647j1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        tL_textWithEntities.text = charSequence;
        if (this.f28649m1 && inputPeer != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags = 1 | tL_messages_summarizeText.flags;
            tL_messages_summarizeText.peer = inputPeer;
            tL_messages_summarizeText.f19916id = i10;
            tL_messages_summarizeText.to_lang = org.telegram.messenger.u10.D(str);
            this.f28646i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f21584a).sendRequestTyped(tL_messages_summarizeText, new a3.b(1), new ih.s(10, this, tL_textWithEntities)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        if (inputPeer != null) {
            tL_messages_translateText.flags = 1 | tL_messages_translateText.flags;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.f19918id.add(Integer.valueOf(i10));
        } else {
            tL_messages_translateText.flags |= 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = org.telegram.messenger.u10.D(str);
        this.f28646i1 = Integer.valueOf(ConnectionsManager.getInstance(this.f21584a).sendRequest(tL_messages_translateText, new t20(7, this, tL_textWithEntities)));
    }

    public final void X0() {
        String charSequence;
        CharSequence charSequence2 = this.f28647j1;
        if (charSequence2 == null) {
            charSequence = "";
        } else {
            charSequence = charSequence2.toString();
        }
        String str = this.f28653q1;
        if (str != null) {
            str = str.split("_")[0];
        }
        String str2 = "no";
        if ("nb".equals(str)) {
            str = "no";
        }
        String str3 = this.f28654r1;
        if (str3 != null) {
            str3 = str3.split("_")[0];
        }
        if (!"nb".equals(str3)) {
            str2 = str3;
        }
        J0(charSequence, str, str2, new d(this, 21));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14726i4) {
            this.f28657u1.invalidate();
            this.f28659w1.invalidate();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.I5);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.H5);
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
            TextView textView = this.I1;
            if (textView != null) {
                if (x02 == this.f28662z1) {
                    if (this.B1 != org.telegram.ui.ActionBar.t6.I.q()) {
                    }
                }
                this.f28662z1 = x02;
                this.B1 = org.telegram.ui.ActionBar.t6.I.q();
                textView.setBackground(org.telegram.ui.ActionBar.j6.e(x02, 24.0f));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21049jg, this.I0);
            if (w02 != this.A1) {
                this.A1 = w02;
                Drawable drawable = this.f28660x1;
                if (drawable != null) {
                    drawable.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.f28661y1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(w02, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.I5);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.H5);
    }
}
