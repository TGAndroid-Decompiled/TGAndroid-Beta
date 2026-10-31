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
public final class gi0 extends org.telegram.ui.ActionBar.z2 implements AdapterView.OnItemSelectedListener {
    public static final int V1 = 0;
    public String A1;
    public String B1;
    public final org.telegram.ui.ActionBar.k2 C1;
    public final int D1;
    public final fi0 E1;
    public final View F1;
    public final fi0 G1;
    public final ImageView H1;
    public final org.telegram.ui.Components.ep I1;
    public final TextView J1;
    public final LinearLayout K1;
    public int L1;
    public final org.telegram.ui.ActionBar.q2 M1;
    public final TextView N1;
    public final RadialProgressView O1;
    public final FrameLayout P1;
    public final TextView Q1;
    public String R1;
    public int S1;
    public int T1;
    public boolean U1;
    public final LinearLayout f37559i1;
    public final org.telegram.ui.Components.dc0 f37560j1;
    public final org.telegram.ui.Components.dc0 f37561k1;
    public final FrameLayout l1;
    public final View f37562m1;
    public final vh.d f37563n1;
    public final org.telegram.ui.Components.dc0 f37564o1;
    public final org.telegram.ui.Components.ec0 f37565p1;
    public final org.telegram.ui.Components.p80 f37566q1;
    public final ArrayList f37567r1;
    public final HashMap f37568s1;
    public final HashMap f37569t1;
    public boolean f37570u1;
    public boolean f37571v1;
    public boolean f37572w1;
    public boolean f37573x1;
    public String f37574y1;
    public boolean f37575z1;

    public gi0(android.content.Context r25, org.telegram.ui.ActionBar.k2 r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gi0.<init>(android.content.Context, org.telegram.ui.ActionBar.k2):void");
    }

    public static void I0(gi0 gi0Var) {
        String replaceAll = (gi0Var.E1.getText().toString() + gi0Var.G1.getText().toString()).replaceAll("[^\\d]+", "");
        boolean z10 = false;
        for (int min = Math.min(3, replaceAll.length()); min >= 0; min--) {
            String substring = replaceAll.substring(0, min);
            List list = (List) gi0Var.f37568s1.get(substring);
            if (list != null && !list.isEmpty()) {
                List list2 = (List) gi0Var.f37569t1.get(substring);
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
            if (!TextUtils.isEmpty(gi0Var.R1)) {
                gi0Var.R1 = null;
                gi0Var.Q0(null);
            }
        } else if (!TextUtils.equals(gi0Var.R1, replaceAll)) {
            gi0Var.R1 = replaceAll;
            gi0Var.Q0(replaceAll);
        }
    }

    public static String K0(LaunchActivity launchActivity, TLRPC.User user, String str) {
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
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (!str.startsWith("+")) {
            if (user != null && !TextUtils.isEmpty(user.phone)) {
                String str2 = user.phone;
                for (int i10 = 4; i10 >= 1; i10--) {
                    String substring = str2.substring(0, i10);
                    if (((String) hashMap.get(substring)) != null) {
                        return a1.g.n("+", substring, str);
                    }
                }
            } else {
                return "+".concat(str);
            }
        }
        return str;
    }

    @Override
    public final void F(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21076l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
    }

    public final void J0() {
        String str;
        this.f37573x1 = true;
        org.telegram.messenger.i0.Y3(this.N1, false, 0.5f, true, true);
        org.telegram.messenger.i0.Y3(this.O1, true, 0.5f, true, true);
        String str2 = "+" + this.E1.getText().toString() + this.G1.getText().toString();
        String obj = this.f37560j1.getEditText().getText().toString();
        String obj2 = this.f37561k1.getEditText().getText().toString();
        if (this.f37564o1.getVisibility() == 0) {
            str = this.f37564o1.getEditText().getText().toString();
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
        ConnectionsManager.getInstance(this.f21583a).bindRequestToGuid(ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_contacts_importContacts, new aa(this, tL_inputPhoneContact, tL_contacts_importContacts, 26), 2), this.D1);
        if (this.I1.f25836a.f23919q) {
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
            } catch (OperationApplicationException | RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public final void L0(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            ViewPropertyAnimator animate = this.M1.animate();
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
            animate.setInterpolator(grVar).translationY(org.telegram.messenger.i0.L(30.0f)).setDuration(150L);
            this.Q1.animate().setInterpolator(grVar).translationX(-org.telegram.messenger.i0.L(30.0f)).setDuration(150L);
            this.E1.animate().setInterpolator(grVar).translationX(-org.telegram.messenger.i0.L(30.0f)).setDuration(150L);
            return;
        }
        this.M1.animate().setInterpolator(org.telegram.messenger.i0.H).translationY(0.0f).setDuration(350L).start();
        ViewPropertyAnimator animate2 = this.Q1.animate();
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f26495f;
        animate2.setInterpolator(grVar2).translationX(0.0f).setDuration(150L);
        this.E1.animate().setInterpolator(grVar2).translationX(0.0f).setDuration(150L);
        this.M1.setText(charSequence);
    }

    public final void M0(java.lang.String r12, org.telegram.ui.nt r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gi0.M0(java.lang.String, org.telegram.ui.nt):void");
    }

    public final void N0(String str, boolean z10) {
        String country;
        this.f37574y1 = str;
        this.f37575z1 = z10;
        if (!TextUtils.isEmpty(str)) {
            TLRPC.User f7 = org.telegram.messenger.d20.i(this.f21583a).f();
            if (this.f37574y1.startsWith("+")) {
                this.E1.setText(this.f37574y1.substring(1));
            } else if (!this.f37575z1 && f7 != null && !TextUtils.isEmpty(f7.phone)) {
                String str2 = f7.phone;
                int i10 = 4;
                while (true) {
                    if (i10 >= 1) {
                        List list = (List) this.f37568s1.get(str2.substring(0, i10));
                        if (list != null && list.size() > 0) {
                            String str3 = ((nt) list.get(0)).f40049c;
                            this.E1.setText(str3);
                            if (str3.endsWith("0") && this.f37574y1.startsWith("0")) {
                                this.f37574y1 = this.f37574y1.substring(1);
                            }
                        } else {
                            i10--;
                        }
                    } else {
                        Context context = org.telegram.messenger.w0.f19025b;
                        if (context != null) {
                            country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                        } else {
                            country = Locale.getDefault().getCountry();
                        }
                        this.E1.setText(country);
                        if (country.endsWith("0") && this.f37574y1.startsWith("0")) {
                            this.f37574y1 = this.f37574y1.substring(1);
                        }
                    }
                }
                this.G1.setText(this.f37574y1);
            } else {
                this.E1.setText(this.f37574y1);
            }
            this.f37574y1 = null;
        }
    }

    public final void O0(boolean z10) {
        float f7;
        ViewPropertyAnimator animate = this.K1.animate();
        float f10 = 0.0f;
        if (z10) {
            f7 = -org.telegram.messenger.i0.L(21.33f);
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator translationY = animate.translationY(f7);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        org.telegram.messenger.z20.m(translationY, grVar, 420L);
        ViewPropertyAnimator animate2 = this.l1.animate();
        if (z10) {
            f10 = -org.telegram.messenger.i0.L(10.665f);
        }
        animate2.translationY(f10).setInterpolator(grVar).setDuration(420L).start();
    }

    public final void P0(boolean z10) {
        int i10;
        float f7;
        int i11;
        float f10;
        float f11;
        float f12;
        boolean z11 = this.I1.f25836a.f23919q;
        final boolean z12 = !z11;
        float f13 = 0.0f;
        int i12 = 0;
        if (z10) {
            this.f37563n1.setVisibility(0);
            ViewPropertyAnimator animate = this.f37563n1.animate();
            if (!z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            alpha.setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final gi0 f36774b;

                {
                    this.f36774b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            gi0 gi0Var = this.f36774b;
                            if (!z13) {
                                gi0Var.f37563n1.setVisibility(4);
                                return;
                            } else {
                                gi0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            gi0 gi0Var2 = this.f36774b;
                            if (!z14) {
                                gi0Var2.f37562m1.setVisibility(4);
                                return;
                            } else {
                                gi0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            gi0 gi0Var3 = this.f36774b;
                            if (z15) {
                                gi0Var3.f37564o1.setVisibility(4);
                                return;
                            } else {
                                gi0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f37562m1.setVisibility(0);
            ViewPropertyAnimator animate2 = this.f37562m1.animate();
            if (!z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            animate2.alpha(f12).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final gi0 f36774b;

                {
                    this.f36774b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            gi0 gi0Var = this.f36774b;
                            if (!z13) {
                                gi0Var.f37563n1.setVisibility(4);
                                return;
                            } else {
                                gi0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            gi0 gi0Var2 = this.f36774b;
                            if (!z14) {
                                gi0Var2.f37562m1.setVisibility(4);
                                return;
                            } else {
                                gi0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            gi0 gi0Var3 = this.f36774b;
                            if (z15) {
                                gi0Var3.f37564o1.setVisibility(4);
                                return;
                            } else {
                                gi0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            this.f37564o1.setVisibility(0);
            ViewPropertyAnimator animate3 = this.f37564o1.animate();
            if (z11) {
                f13 = 1.0f;
            }
            animate3.alpha(f13).setInterpolator(grVar).setDuration(420L).withEndAction(new Runnable(this) {
                public final gi0 f36774b;

                {
                    this.f36774b = this;
                }

                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            boolean z13 = z12;
                            gi0 gi0Var = this.f36774b;
                            if (!z13) {
                                gi0Var.f37563n1.setVisibility(4);
                                return;
                            } else {
                                gi0Var.getClass();
                                return;
                            }
                        case 1:
                            boolean z14 = z12;
                            gi0 gi0Var2 = this.f36774b;
                            if (!z14) {
                                gi0Var2.f37562m1.setVisibility(4);
                                return;
                            } else {
                                gi0Var2.getClass();
                                return;
                            }
                        default:
                            boolean z15 = z12;
                            gi0 gi0Var3 = this.f36774b;
                            if (z15) {
                                gi0Var3.f37564o1.setVisibility(4);
                                return;
                            } else {
                                gi0Var3.getClass();
                                return;
                            }
                    }
                }
            }).start();
            return;
        }
        this.f37563n1.animate().cancel();
        if (!z11) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f37563n1.setVisibility(i10);
        if (!z11) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f37563n1.setAlpha(f7);
        this.f37562m1.animate().cancel();
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f37562m1.setVisibility(i11);
        if (!z11) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f37562m1.setAlpha(f10);
        this.f37564o1.animate().cancel();
        if (!z11) {
            i12 = 4;
        }
        this.f37564o1.setVisibility(i12);
        if (z11) {
            f13 = 1.0f;
        }
        this.f37564o1.setAlpha(f13);
    }

    public final void Q0(String str) {
        if (this.S1 >= 0) {
            ConnectionsManager.getInstance(this.f21583a).cancelRequest(this.S1, true);
            this.S1 = -1;
        }
        if (TextUtils.isEmpty(str)) {
            org.telegram.messenger.z20.m(this.H1.animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f), org.telegram.ui.Components.gr.h, 420L);
            this.f37566q1.setText("");
            O0(true);
            return;
        }
        org.telegram.messenger.z20.m(this.H1.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), org.telegram.ui.Components.gr.h, 420L);
        this.H1.setImageDrawable(new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21094m5, this.I0)));
        this.f37566q1.setText("");
        O0(true);
        org.telegram.ui.Components.vg vgVar = new org.telegram.ui.Components.vg(22, this, str);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) org.telegram.messenger.i5.r(this.f21583a).f16072k0.get(af.b.d(str, false));
        if (tL_contact != null) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.f21583a).Z1(Long.valueOf(tL_contact.user_id));
            if (Z1 != null) {
                vgVar.a(Z1);
                return;
            } else {
                org.telegram.messenger.hs.a0(this.f21583a).f15938a.c(new qd0(this, tL_contact, vgVar, 9));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = af.b.d(str, false);
        this.S1 = ConnectionsManager.getInstance(this.f21583a).sendRequest(tL_contacts_resolvePhone, new org.telegram.ui.Components.t20(26, this, vgVar));
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37560j1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f37561k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        int i11 = org.telegram.ui.ActionBar.t6.f21058k6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.E1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        int i12 = org.telegram.ui.ActionBar.t6.f21076l6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.E1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G1, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.G1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        return arrayList;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        org.telegram.messenger.i0.h3(new ai0(this, 0), 50L);
    }

    @Override
    public final void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        if (this.f37572w1) {
            this.f37572w1 = false;
            return;
        }
        this.f37570u1 = true;
        this.E1.setText(((nt) this.f37567r1.get(i10)).f40049c);
        this.f37570u1 = false;
    }

    @Override
    public final void s0() {
        int themedColor;
        super.s0();
        try {
            RadialProgressView radialProgressView = this.O1;
            org.telegram.ui.ActionBar.k2 k2Var = this.C1;
            if (radialProgressView != null && k2Var != null) {
                radialProgressView.setProgressColor(k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.Gi));
            }
            if (this.P1 != null && k2Var != null && ((themedColor = k2Var.getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.T1 || this.U1 != org.telegram.ui.ActionBar.t6.I.q())) {
                this.U1 = org.telegram.ui.ActionBar.t6.I.q();
                this.T1 = themedColor;
                org.telegram.ui.ActionBar.t6.H1(this.P1.getBackground(), themedColor, false);
                org.telegram.ui.ActionBar.t6.H1(this.P1.getBackground(), org.telegram.ui.ActionBar.j6.b(themedColor), true);
                this.P1.invalidate();
            }
            ImageView imageView = this.H1;
            if (imageView != null && (imageView.getDrawable() instanceof org.telegram.ui.Components.kp)) {
                ((org.telegram.ui.Components.kp) this.H1.getDrawable()).b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21094m5, this.I0));
                this.H1.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        this.f37560j1.getEditText().requestFocus();
        this.f37560j1.getEditText().setSelection(this.f37560j1.getEditText().length());
        org.telegram.messenger.i0.h3(new ai0(this, 1), 50L);
    }

    @Override
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
