package org.telegram.ui;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.content.OperationApplicationException;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public final class dh0 extends org.telegram.ui.ActionBar.w2 implements AdapterView.OnItemSelectedListener {
    public static final int Z1 = 0;
    public boolean A1;
    public boolean B1;
    public String C1;
    public boolean D1;
    public String E1;
    public String F1;
    public final org.telegram.ui.ActionBar.g2 G1;
    public final int H1;
    public final ch0 I1;
    public final View J1;
    public final ch0 K1;
    public final ImageView L1;
    public final org.telegram.ui.Components.lp M1;
    public final TextView N1;
    public final LinearLayout O1;
    public int P1;
    public final org.telegram.ui.ActionBar.n2 Q1;
    public final TextView R1;
    public final RadialProgressView S1;
    public final FrameLayout T1;
    public final TextView U1;
    public String V1;
    public int W1;
    public int X1;
    public boolean Y1;
    public final LinearLayout f47129m1;
    public final org.telegram.ui.Components.tb0 n1;
    public final org.telegram.ui.Components.tb0 f47130o1;
    public final FrameLayout f47131p1;
    public final View f47132q1;
    public final hi.e f47133r1;
    public final org.telegram.ui.Components.tb0 f47134s1;
    public final org.telegram.ui.Components.vb0 f47135t1;
    public final org.telegram.ui.Components.j80 f47136u1;
    public final ArrayList f47137v1;
    public final HashMap f47138w1;
    public final HashMap f47139x1;
    public boolean f47140y1;
    public boolean f47141z1;

    public dh0(android.content.Context r25, org.telegram.ui.ActionBar.g2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dh0.<init>(android.content.Context, org.telegram.ui.ActionBar.g2):void");
    }

    public static void J0(dh0 dh0Var) {
        String replaceAll = (dh0Var.I1.getText().toString() + dh0Var.K1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) dh0Var.f47138w1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) dh0Var.f47139x1.get(substring);
                if (list2 != null && !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (replaceAll.length() - min >= ((String) it.next()).replace(" ", "").length()) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
        }
        if (!z10) {
            if (!TextUtils.isEmpty(dh0Var.V1)) {
                dh0Var.V1 = null;
                dh0Var.R0(null);
            }
        } else if (!TextUtils.equals(dh0Var.V1, replaceAll)) {
            dh0Var.V1 = replaceAll;
            dh0Var.R0(replaceAll);
        }
    }

    public static String L0(LaunchActivity launchActivity, TLRPC.User user, String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(launchActivity.getResources().getAssets().open("countries.txt")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(";");
                hashMap.put(split[0], split[2]);
            }
            bufferedReader.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i7 = 4; i7 >= 1; i7--) {
                    String substring = str2.substring(0, i7);
                    if (((String) hashMap.get(substring)) != null) {
                        return a8.p0.p("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29598l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
    }

    public final void K0() {
        String str;
        this.B1 = true;
        org.telegram.messenger.g0.X3(this.R1, false, 0.5f, true, true);
        org.telegram.messenger.g0.X3(this.S1, true, 0.5f, true, true);
        String str2 = "+" + this.I1.getText().toString() + this.K1.getText().toString();
        String obj = this.n1.getEditText().getText().toString();
        String obj2 = this.f47130o1.getEditText().getText().toString();
        if (this.f47134s1.getVisibility() == 0) {
            str = this.f47134s1.getEditText().getText().toString();
        } else {
            str = "";
        }
        TLRPC.TL_contacts_importContacts tL_contacts_importContacts = new TLRPC.TL_contacts_importContacts();
        TLRPC.TL_inputPhoneContact tL_inputPhoneContact = new TLRPC.TL_inputPhoneContact();
        tL_inputPhoneContact.first_name = obj;
        tL_inputPhoneContact.last_name = obj2;
        tL_inputPhoneContact.phone = str2;
        if (!TextUtils.isEmpty(str)) {
            tL_inputPhoneContact.flags = 1 | tL_inputPhoneContact.flags;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_inputPhoneContact.note = tL_textWithEntities;
            tL_textWithEntities.text = str;
        }
        tL_contacts_importContacts.contacts.add(tL_inputPhoneContact);
        ConnectionsManager.getInstance(this.f30223a).bindRequestToGuid(ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_contacts_importContacts, new z9(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.H1);
        if (this.M1.f37189a.f32938q) {
            Context context = getContext();
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentProviderOperation.Builder newInsert = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI);
            newInsert.withValue("account_type", null);
            newInsert.withValue("account_name", null);
            arrayList.add(newInsert.build());
            Uri uri = ContactsContract.Data.CONTENT_URI;
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name");
            if (!TextUtils.isEmpty(obj)) {
                withValue = withValue.withValue("data2", obj);
            }
            if (!TextUtils.isEmpty(obj2)) {
                withValue = withValue.withValue("data2", obj2);
            }
            arrayList.add(withValue.build());
            if (str2 != null && !str2.isEmpty()) {
                arrayList.add(ContentProviderOperation.newInsert(uri).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", str2).withValue("data2", 2).build());
            }
            try {
                context.getContentResolver().applyBatch("com.android.contacts", arrayList);
            } catch (OperationApplicationException | RemoteException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void M0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.Q1.animate();
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.f36858f;
            animate.setInterpolator(krVar).translationY(org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.U1.animate().setInterpolator(krVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            this.I1.animate().setInterpolator(krVar).translationX(-org.telegram.messenger.g0.L(30.0f)).setDuration(150L);
            return;
        }
        this.Q1.animate().setInterpolator(org.telegram.messenger.g0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.U1.animate();
        org.telegram.ui.Components.kr krVar2 = org.telegram.ui.Components.kr.f36858f;
        animate2.setInterpolator(krVar2).translationX(0.0f).setDuration(150L);
        this.I1.animate().setInterpolator(krVar2).translationX(0.0f).setDuration(150L);
        this.Q1.setText(charSequence);
    }

    public final void N0(java.lang.String r12, org.telegram.ui.ps r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dh0.N0(java.lang.String, org.telegram.ui.ps):void");
    }

    public final void O0(String str, boolean z10) {
        String country;
        this.C1 = str;
        this.D1 = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f10 = org.telegram.messenger.i10.i(this.f30223a).f();
            if (this.C1.startsWith("+")) {
                this.I1.setText(this.C1.substring(1));
            } else if (!this.D1 && f10 != null && !TextUtils.isEmpty(f10.phone)) {
                String str2 = f10.phone;
                int i7 = 4;
                while (true) {
                    if (i7 >= 1) {
                        List list = (List) this.f47138w1.get(str2.substring(0, i7));
                        if (list != null && list.size() > 0) {
                            String str3 = ((ps) list.get(0)).f51137c;
                            this.I1.setText(str3);
                            if (str3.endsWith("0") && this.C1.startsWith("0")) {
                                this.C1 = this.C1.substring(1);
                            }
                        } else {
                            i7--;
                        }
                    } else {
                        Context context = org.telegram.messenger.t0.f27013b;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.I1.setText(country);
                        if (country.endsWith("0") && this.C1.startsWith("0")) {
                            this.C1 = this.C1.substring(1);
                        }
                    }
                }
                this.K1.setText(this.C1);
            } else {
                this.I1.setText(this.C1);
            }
            this.C1 = null;
        }
    }

    public final void P0(boolean z10) {
        float f10;
        ViewPropertyAnimator animate = this.O1.animate();
        float f11 = 0.0f;
        if (z10) {
            f10 = -org.telegram.messenger.g0.L(21.33f);
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f10);
        org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
        org.telegram.messenger.m10.o(translationY, krVar, 420L);
        ViewPropertyAnimator animate2 = this.f47131p1.animate();
        if (z10) {
            f11 = -org.telegram.messenger.g0.L(10.665f);
        }
        animate2.translationY(f11).setInterpolator(krVar).setDuration(420L).start();
    }

    public final void Q0(boolean z10) {
        int i7;
        float f10;
        int i10;
        float f11;
        float f12;
        float f13;
        boolean z11 = this.M1.f37189a.f32938q;
        final boolean z12 = !z11;
        float f14 = 0.0f;
        int i11 = 0;
        if (z10) {
            this.f47133r1.setVisibility(0);
            ViewPropertyAnimator animate = this.f47133r1.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.h;
            alpha.setInterpolator(krVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final dh0 f45720b;

                {
                    this.f45720b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            dh0 dh0Var = this.f45720b;
                            if (!z13) {
                                dh0Var.f47133r1.setVisibility(4);
                                return;
                            } else {
                                dh0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            dh0 dh0Var2 = this.f45720b;
                            if (!z14) {
                                dh0Var2.f47132q1.setVisibility(4);
                                return;
                            } else {
                                dh0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            dh0 dh0Var3 = this.f45720b;
                            if (z15) {
                                dh0Var3.f47134s1.setVisibility(4);
                                return;
                            } else {
                                dh0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f47132q1.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f47132q1.animate();
            if (!z11) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animate2.alpha(f13).setInterpolator(krVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final dh0 f45720b;

                {
                    this.f45720b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            dh0 dh0Var = this.f45720b;
                            if (!z13) {
                                dh0Var.f47133r1.setVisibility(4);
                                return;
                            } else {
                                dh0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            dh0 dh0Var2 = this.f45720b;
                            if (!z14) {
                                dh0Var2.f47132q1.setVisibility(4);
                                return;
                            } else {
                                dh0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            dh0 dh0Var3 = this.f45720b;
                            if (z15) {
                                dh0Var3.f47134s1.setVisibility(4);
                                return;
                            } else {
                                dh0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f47134s1.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f47134s1.animate();
            if (z11) {
                f14 = 1.0f;
            }
            animate3.alpha(f14).setInterpolator(krVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final dh0 f45720b;

                {
                    this.f45720b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            dh0 dh0Var = this.f45720b;
                            if (!z13) {
                                dh0Var.f47133r1.setVisibility(4);
                                return;
                            } else {
                                dh0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            dh0 dh0Var2 = this.f45720b;
                            if (!z14) {
                                dh0Var2.f47132q1.setVisibility(4);
                                return;
                            } else {
                                dh0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            dh0 dh0Var3 = this.f45720b;
                            if (z15) {
                                dh0Var3.f47134s1.setVisibility(4);
                                return;
                            } else {
                                dh0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f47133r1.animate().cancel();
        if (!z11) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f47133r1.setVisibility(i7);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f47133r1.setAlpha(f10);
        this.f47132q1.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f47132q1.setVisibility(i10);
        if (!z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        this.f47132q1.setAlpha(f11);
        this.f47134s1.animate().cancel();
        if (!z11) {
            i11 = 4;
        }
        this.f47134s1.setVisibility(i11);
        if (z11) {
            f14 = 1.0f;
        }
        this.f47134s1.setAlpha(f14);
    }

    public final void R0(String str) {
        if (this.W1 >= 0) {
            ConnectionsManager.getInstance(this.f30223a).cancelRequest(this.W1, true);
            this.W1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.m10.o(this.L1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.kr.h, 420L);
            this.f47136u1.setText("");
            P0(true);
            return;
        }
        org.telegram.messenger.m10.o(this.L1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.kr.h, 420L);
        this.L1.setImageDrawable(new org.telegram.ui.Components.rp(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29615m5, this.J0)));
        this.f47136u1.setText("");
        P0(true);
        org.telegram.ui.Components.ph phVar = new org.telegram.ui.Components.ph(21, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.i5.r(this.f30223a).f24699l0.get(pf.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(this.f30223a).c2(Long.valueOf(tL_contact.user_id));
            if (c22 != null) {
                phVar.a(c22);
                return;
            } else {
                org.telegram.messenger.tr.a0(this.f30223a).f27149a.c(new lc0(this, tL_contact, phVar, 8));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = pf.b.d(str, false);
        this.W1 = ConnectionsManager.getInstance(this.f30223a).sendRequest(tL_contacts_resolvePhone, new d00(14, this, phVar));
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f47130o1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        int i10 = org.telegram.ui.ActionBar.n6.f29580k6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.I1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.f29598l6;
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.I1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.K1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.K1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.K1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.g0.h3(new xg0(this, 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j3) {
        if (this.A1) {
            this.A1 = false;
            return;
        }
        this.f47140y1 = true;
        this.I1.setText(((ps) this.f47137v1.get(i7)).f51137c);
        this.f47140y1 = false;
    }

    @Override
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.S1;
            org.telegram.ui.ActionBar.g2 g2Var = this.G1;
            if (radialProgressView != null && g2Var != null) {
                radialProgressView.setProgressColor(g2Var.getThemedColor(org.telegram.ui.ActionBar.n6.Ji));
            }
            if (this.T1 != null && g2Var != null && ((themedColor = g2Var.getThemedColor(org.telegram.ui.ActionBar.n6.Fi)) != this.X1 || this.Y1 != org.telegram.ui.ActionBar.n6.I.q())) {
                this.Y1 = org.telegram.ui.ActionBar.n6.I.q();
                this.X1 = themedColor;
                org.telegram.ui.ActionBar.n6.H1(this.T1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.n6.H1(this.T1.getBackground(), org.telegram.ui.ActionBar.b6.b(themedColor), true);
                this.T1.invalidate();
            }
            ImageView imageView = this.L1;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.rp)) {
                ((org.telegram.ui.Components.rp) this.L1.getDrawable()).b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29615m5, this.J0));
                this.L1.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.n1.getEditText().requestFocus();
        this.n1.getEditText().setSelection(this.n1.getEditText().length());
        org.telegram.messenger.g0.h3(new xg0(this, 1), 50L);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
