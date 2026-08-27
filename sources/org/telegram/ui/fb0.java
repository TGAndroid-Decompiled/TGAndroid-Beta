package org.telegram.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class fb0 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Cells.j4 A;
    public bb0 B;
    public org.telegram.ui.Cells.x8 C;
    public FrameLayout D;
    public org.telegram.ui.Cells.x9 E;
    public org.telegram.ui.Components.kn0 F;
    public bb0 G;
    public org.telegram.ui.Cells.x8 H;
    public TextView I;
    public int J;
    public boolean K;
    public final ArrayList L;
    public final int[] M;
    public final ArrayList N;
    public final int[] O;
    public eb0 P;
    public org.telegram.ui.ActionBar.b2 Q;
    public boolean R;
    public int S;

    public final int f38054a;

    public final long f38055b;

    public org.telegram.ui.Components.dv0 f38056c;
    public org.telegram.ui.Components.dv0 d;

    public TLRPC.TL_chatInviteExported f38057e;

    public cb0 f38058f;
    public org.telegram.ui.Cells.x8 h;

    public org.telegram.ui.Cells.p8 f38059n;

    public db0 f38060r;

    public TextView f38061s;
    public org.telegram.ui.Cells.x8 v;

    public TextView f38062w;

    public org.telegram.ui.Cells.j4 f38063x;

    public org.telegram.ui.Cells.x8 f38064y;

    public fb0(int i10, long j10) {
        super(null);
        this.J = -3;
        this.L = new ArrayList();
        this.M = new int[]{3600, 86400, 604800};
        this.N = new ArrayList();
        this.O = new int[]{1, 10, 100};
        this.f38054a = i10;
        this.f38055b = j10;
    }

    public final void V(int i10) {
        int[] iArr;
        long j10 = i10;
        this.f38062w.setText(LocaleController.formatDateAudio(j10, false));
        int currentTime = i10 - getConnectionsManager().getCurrentTime();
        ArrayList arrayList = this.L;
        arrayList.clear();
        int iF = 0;
        boolean z10 = false;
        int length = 0;
        while (true) {
            iArr = this.M;
            if (iF >= iArr.length) {
                break;
            }
            if (!z10 && currentTime < iArr[iF]) {
                arrayList.add(Integer.valueOf(currentTime));
                length = iF;
                z10 = true;
            }
            iF = i0.a.f(iArr[iF], iF, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(currentTime));
            length = iArr.length;
        }
        int size = arrayList.size();
        int i11 = size + 1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 == size) {
                strArr[i12] = LocaleController.getString(R.string.NoLimit);
            } else if (((Integer) arrayList.get(i12)).intValue() == iArr[0]) {
                strArr[i12] = LocaleController.formatPluralString("Hours", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i12)).intValue() == iArr[1]) {
                strArr[i12] = LocaleController.formatPluralString("Days", 1, new Object[0]);
            } else if (((Integer) arrayList.get(i12)).intValue() == iArr[2]) {
                strArr[i12] = LocaleController.formatPluralString("Weeks", 1, new Object[0]);
            } else {
                long j11 = currentTime;
                if (j11 < 86400) {
                    strArr[i12] = LocaleController.getString(R.string.MessageScheduleToday);
                } else if (j11 < 31449600) {
                    strArr[i12] = LocaleController.getInstance().getFormatterScheduleDay().format(j10 * 1000);
                } else {
                    strArr[i12] = LocaleController.getInstance().getFormatterYear().format(j10 * 1000);
                }
            }
        }
        this.d.b(length, null, strArr);
    }

    public final void W(int i10) {
        int[] iArr;
        int i11;
        ArrayList arrayList = this.N;
        arrayList.clear();
        int iF = 0;
        boolean z10 = false;
        int length = 0;
        while (true) {
            iArr = this.O;
            if (iF >= iArr.length) {
                break;
            }
            if (!z10 && i10 <= (i11 = iArr[iF])) {
                if (i10 != i11) {
                    arrayList.add(Integer.valueOf(i10));
                }
                length = iF;
                z10 = true;
            }
            iF = i0.a.f(iArr[iF], iF, 1, arrayList);
        }
        if (!z10) {
            arrayList.add(Integer.valueOf(i10));
            length = iArr.length;
        }
        int size = arrayList.size();
        int i12 = size + 1;
        String[] strArr = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == size) {
                strArr[i13] = LocaleController.getString(R.string.NoLimit);
            } else {
                strArr[i13] = ((Integer) arrayList.get(i13)).toString();
            }
        }
        this.f38056c.b(length, null, strArr);
    }

    public final void X() {
        ArrayList arrayList = this.N;
        arrayList.clear();
        int iF = 0;
        while (true) {
            int[] iArr = this.O;
            if (iF >= iArr.length) {
                this.f38056c.b(3, null, "1", "10", "100", LocaleController.getString(R.string.NoLimit));
                return;
            }
            iF = i0.a.f(iArr[iF], iF, 1, arrayList);
        }
    }

    public final void Y(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        this.f38057e = tL_chatInviteExported;
        if (this.fragmentView == null || tL_chatInviteExported == null) {
            return;
        }
        int i10 = tL_chatInviteExported.expire_date;
        if (i10 > 0) {
            V(i10);
            this.S = ((Integer) this.L.get(this.d.getSelectedIndex())).intValue();
        } else {
            this.S = 0;
        }
        int i11 = tL_chatInviteExported.usage_limit;
        if (i11 > 0) {
            W(i11);
            this.B.setText(Integer.toString(tL_chatInviteExported.usage_limit));
        }
        cb0 cb0Var = this.f38058f;
        if (cb0Var != null) {
            cb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            this.f38058f.setChecked(tL_chatInviteExported.request_needed);
        }
        Z(!tL_chatInviteExported.request_needed);
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.G.getPaint().getFontMetricsInt(), false);
            this.G.setText(spannableStringBuilder);
        }
        org.telegram.ui.Cells.p8 p8Var = this.f38059n;
        if (p8Var != null) {
            p8Var.setChecked(tL_chatInviteExported.subscription_pricing != null);
        }
        if (tL_chatInviteExported.subscription_pricing != null) {
            cb0 cb0Var2 = this.f38058f;
            if (cb0Var2 != null) {
                cb0Var2.setChecked(false);
                this.f38058f.setCheckBoxIcon(R.drawable.permission_locked);
            }
            org.telegram.ui.Cells.x8 x8Var = this.h;
            if (x8Var != null) {
                x8Var.setText(LocaleController.getString(R.string.ApproveNewMembersDescriptionFrozen));
            }
        }
        db0 db0Var = this.f38060r;
        if (db0Var != null) {
            db0Var.setVisibility(tL_chatInviteExported.subscription_pricing != null ? 0 : 8);
            this.f38060r.setText(Long.toString(tL_chatInviteExported.subscription_pricing.amount));
            this.f38060r.f24370b.setClickable(false);
            this.f38060r.f24370b.setFocusable(false);
            this.f38060r.f24370b.setFocusableInTouchMode(false);
            this.f38060r.f24370b.setLongClickable(false);
        }
    }

    public final void Z(boolean z10) {
        this.A.setVisibility(z10 ? 0 : 8);
        this.f38056c.setVisibility(z10 ? 0 : 8);
        this.B.setVisibility(z10 ? 0 : 8);
        this.C.setVisibility(z10 ? 0 : 8);
    }

    @Override
    public final View createView(Context context) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.f38054a;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewLink));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditLink));
        }
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 29));
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setBackground(new org.telegram.ui.ActionBar.f5(1));
        this.I.setEllipsize(TextUtils.TruncateAt.END);
        this.I.setGravity(17);
        final int i11 = 0;
        this.I.setOnClickListener(new View.OnClickListener(this) {

            public final fb0 f44749b;

            {
                this.f44749b = this;
            }

            @Override
            public final void onClick(View view) {
                long j10;
                boolean z10;
                switch (i11) {
                    case 0:
                        final fb0 fb0Var = this.f44749b;
                        long j11 = fb0Var.f38055b;
                        ArrayList arrayList = fb0Var.N;
                        ArrayList arrayList2 = fb0Var.L;
                        if (!fb0Var.R) {
                            int selectedIndex = fb0Var.d.getSelectedIndex();
                            if (selectedIndex < arrayList2.size() && ((Integer) arrayList2.get(selectedIndex)).intValue() < 0) {
                                AndroidUtilities.shakeView(fb0Var.f38062w);
                                Vibrator vibrator = (Vibrator) fb0Var.f38062w.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                            } else {
                                org.telegram.ui.Cells.p8 p8Var = fb0Var.f38059n;
                                if (p8Var == null || !p8Var.f25003e.h) {
                                    j10 = 0;
                                } else {
                                    try {
                                        j10 = Long.parseLong(fb0Var.f38060r.f24370b.getText().toString());
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                        j10 = 0;
                                    }
                                }
                                int i12 = fb0Var.f38054a;
                                if (i12 == 0) {
                                    org.telegram.ui.ActionBar.b2 b2Var = fb0Var.Q;
                                    if (b2Var != null) {
                                        b2Var.dismiss();
                                    }
                                    fb0Var.R = true;
                                    org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                    fb0Var.Q = b2Var2;
                                    b2Var2.q(500L);
                                    TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                    tL_messages_exportChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                    tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                    int selectedIndex2 = fb0Var.d.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 1;
                                    if (selectedIndex2 < arrayList2.size()) {
                                        tL_messages_exportChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex2)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.expire_date = 0;
                                    }
                                    int selectedIndex3 = fb0Var.f38056c.getSelectedIndex();
                                    tL_messages_exportChatInvite.flags |= 2;
                                    if (selectedIndex3 < arrayList.size()) {
                                        tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList.get(selectedIndex3)).intValue();
                                    } else {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    cb0 cb0Var = fb0Var.f38058f;
                                    boolean z11 = cb0Var != null && cb0Var.f25003e.h;
                                    tL_messages_exportChatInvite.request_needed = z11;
                                    if (z11) {
                                        tL_messages_exportChatInvite.usage_limit = 0;
                                    }
                                    String string = fb0Var.G.getText().toString();
                                    tL_messages_exportChatInvite.title = string;
                                    if (!TextUtils.isEmpty(string)) {
                                        tL_messages_exportChatInvite.flags |= 16;
                                    }
                                    if (j10 > 0) {
                                        tL_messages_exportChatInvite.flags |= 32;
                                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                        tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                        tL_starsSubscriptionPricing.period = fb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                        tL_messages_exportChatInvite.subscription_pricing.amount = j10;
                                    }
                                    final int i13 = 0;
                                    fb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                                        @Override
                                        public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                            switch (i13) {
                                                case 0:
                                                    final int i14 = 0;
                                                    final fb0 fb0Var2 = fb0Var;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i14) {
                                                                case 0:
                                                                    fb0 fb0Var3 = fb0Var2;
                                                                    fb0Var3.R = false;
                                                                    org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var3.Q;
                                                                    if (b2Var3 != null) {
                                                                        b2Var3.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        org.telegram.ui.Components.y4.u0(fb0Var3, null, tL_error2.text, null);
                                                                    } else {
                                                                        eb0 eb0Var = fb0Var3.P;
                                                                        if (eb0Var != null) {
                                                                            eb0Var.c(tLObject);
                                                                        }
                                                                        fb0Var3.finishFragment();
                                                                    }
                                                                    break;
                                                                default:
                                                                    fb0 fb0Var4 = fb0Var2;
                                                                    fb0Var4.R = false;
                                                                    org.telegram.ui.ActionBar.b2 b2Var4 = fb0Var4.Q;
                                                                    if (b2Var4 != null) {
                                                                        b2Var4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error3.text, null);
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            fb0Var4.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        eb0 eb0Var2 = fb0Var4.P;
                                                                        if (eb0Var2 != null) {
                                                                            eb0Var2.b(fb0Var4.f38057e, tLObject2);
                                                                        }
                                                                        fb0Var4.finishFragment();
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                                default:
                                                    final int i15 = 1;
                                                    final fb0 fb0Var3 = fb0Var;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            switch (i15) {
                                                                case 0:
                                                                    fb0 fb0Var4 = fb0Var3;
                                                                    fb0Var4.R = false;
                                                                    org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var4.Q;
                                                                    if (b2Var3 != null) {
                                                                        b2Var3.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                                    if (tL_error2 != null) {
                                                                        org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                    } else {
                                                                        eb0 eb0Var = fb0Var4.P;
                                                                        if (eb0Var != null) {
                                                                            eb0Var.c(tLObject);
                                                                        }
                                                                        fb0Var4.finishFragment();
                                                                    }
                                                                    break;
                                                                default:
                                                                    fb0 fb0Var5 = fb0Var3;
                                                                    fb0Var5.R = false;
                                                                    org.telegram.ui.ActionBar.b2 b2Var4 = fb0Var5.Q;
                                                                    if (b2Var4 != null) {
                                                                        b2Var4.dismiss();
                                                                    }
                                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                                    if (tL_error3 != null) {
                                                                        org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                    } else {
                                                                        TLObject tLObject2 = tLObject;
                                                                        if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                            fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                        }
                                                                        eb0 eb0Var2 = fb0Var5.P;
                                                                        if (eb0Var2 != null) {
                                                                            eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                        }
                                                                        fb0Var5.finishFragment();
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                    break;
                                            }
                                        }
                                    });
                                } else if (i12 == 1) {
                                    org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var.Q;
                                    if (b2Var3 != null) {
                                        b2Var3.dismiss();
                                    }
                                    TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                    tL_messages_editExportedChatInvite.link = fb0Var.f38057e.link;
                                    tL_messages_editExportedChatInvite.revoked = false;
                                    tL_messages_editExportedChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j11);
                                    int selectedIndex4 = fb0Var.d.getSelectedIndex();
                                    if (selectedIndex4 < arrayList2.size()) {
                                        if (fb0Var.S != ((Integer) arrayList2.get(selectedIndex4)).intValue()) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList2.get(selectedIndex4)).intValue();
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                    } else if (fb0Var.S != 0) {
                                        tL_messages_editExportedChatInvite.flags |= 1;
                                        tL_messages_editExportedChatInvite.expire_date = 0;
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    int selectedIndex5 = fb0Var.f38056c.getSelectedIndex();
                                    if (selectedIndex5 < arrayList.size()) {
                                        int iIntValue = ((Integer) arrayList.get(selectedIndex5)).intValue();
                                        if (fb0Var.f38057e.usage_limit != iIntValue) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                                            z10 = true;
                                        }
                                    } else if (fb0Var.f38057e.usage_limit != 0) {
                                        tL_messages_editExportedChatInvite.flags |= 2;
                                        tL_messages_editExportedChatInvite.usage_limit = 0;
                                        z10 = true;
                                    }
                                    boolean z12 = fb0Var.f38057e.request_needed;
                                    cb0 cb0Var2 = fb0Var.f38058f;
                                    if (z12 != (cb0Var2 != null && cb0Var2.f25003e.h)) {
                                        int i14 = tL_messages_editExportedChatInvite.flags;
                                        tL_messages_editExportedChatInvite.flags = i14 | 8;
                                        boolean z13 = cb0Var2 != null && cb0Var2.f25003e.h;
                                        tL_messages_editExportedChatInvite.request_needed = z13;
                                        if (z13) {
                                            tL_messages_editExportedChatInvite.flags = i14 | 10;
                                            tL_messages_editExportedChatInvite.usage_limit = 0;
                                        }
                                        z10 = true;
                                    }
                                    String string2 = fb0Var.G.getText().toString();
                                    if (!TextUtils.equals(fb0Var.f38057e.title, string2)) {
                                        tL_messages_editExportedChatInvite.title = string2;
                                        tL_messages_editExportedChatInvite.flags |= 16;
                                        z10 = true;
                                    }
                                    if (!z10) {
                                        fb0Var.finishFragment();
                                    } else {
                                        fb0Var.R = true;
                                        org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                        fb0Var.Q = b2Var4;
                                        b2Var4.q(500L);
                                        final int i15 = 1;
                                        fb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                                            @Override
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i15) {
                                                    case 0:
                                                        final int i16 = 0;
                                                        final fb0 fb0Var2 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i16) {
                                                                    case 0:
                                                                        fb0 fb0Var4 = fb0Var2;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                        if (b2Var5 != null) {
                                                                            b2Var5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var4.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        fb0 fb0Var5 = fb0Var2;
                                                                        fb0Var5.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                        if (b2Var6 != null) {
                                                                            b2Var6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var5.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                            }
                                                                            fb0Var5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i17 = 1;
                                                        final fb0 fb0Var3 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i17) {
                                                                    case 0:
                                                                        fb0 fb0Var4 = fb0Var3;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                        if (b2Var5 != null) {
                                                                            b2Var5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var4.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        fb0 fb0Var5 = fb0Var3;
                                                                        fb0Var5.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                        if (b2Var6 != null) {
                                                                            b2Var6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var5.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                            }
                                                                            fb0Var5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        fb0 fb0Var2 = this.f44749b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb0Var2.getParentActivity());
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new va0(fb0Var2, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        fb0Var2.showDialog(alertDialog$Builder.f22702a);
                        break;
                }
            }
        });
        this.I.setSingleLine();
        if (i10 == 0) {
            this.I.setText(LocaleController.getString(R.string.CreateLinkHeaderNoCaps));
        } else if (i10 == 1) {
            this.I.setText(LocaleController.getString(R.string.SaveLinkHeaderNoCaps));
        }
        this.I.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.I.setTextSize(1, 14.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        h7.b6.a(this.I);
        this.actionBar.addView(this.I, h7.z5.d(-2, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / AndroidUtilities.density, 8388693, 0.0f, 0.0f, 12.0f, 0.0f));
        ab0 ab0Var = new ab0(this, context);
        org.telegram.ui.Components.kn0 kn0Var = new org.telegram.ui.Components.kn0(context, ab0Var, this.resourceProvider, true);
        this.F = kn0Var;
        this.actionBar.setAdaptiveBackground(kn0Var);
        gh.q4 q4Var = new gh.q4(this, context, 5);
        this.fragmentView = q4Var;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(420L);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        int i12 = 2;
        layoutTransition.setInterpolator(2, erVar);
        layoutTransition.setInterpolator(0, erVar);
        layoutTransition.setInterpolator(4, erVar);
        layoutTransition.setInterpolator(1, erVar);
        int i13 = 3;
        layoutTransition.setInterpolator(3, erVar);
        ab0Var.setLayoutTransition(layoutTransition);
        ab0Var.setOrientation(1);
        ab0Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(91.0f));
        this.F.addView(ab0Var);
        org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
        this.f38063x = j4Var;
        j4Var.setText(LocaleController.getString(R.string.LimitByPeriod));
        ab0Var.addView(this.f38063x);
        org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
        this.d = dv0Var;
        ab0Var.addView(dv0Var);
        TextView textView2 = new TextView(context);
        this.f38062w = textView2;
        textView2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.f38062w.setGravity(16);
        this.f38062w.setTextSize(1, 16.0f);
        this.f38062w.setHint(LocaleController.getString(R.string.TimeLimitHint));
        this.f38062w.setOnClickListener(new u70(i12, this, context));
        this.d.setCallback(new va0(this, i12));
        ArrayList arrayList = this.L;
        arrayList.clear();
        int iF = 0;
        while (true) {
            int[] iArr = this.M;
            if (iF >= iArr.length) {
                break;
            }
            iF = i0.a.f(iArr[iF], iF, 1, arrayList);
        }
        this.d.b(3, null, LocaleController.formatPluralString("Hours", 1, new Object[0]), LocaleController.formatPluralString("Days", 1, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.getString(R.string.NoLimit));
        ab0Var.addView(this.f38062w, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.f38064y = x8Var;
        x8Var.setText(LocaleController.getString(R.string.TimeLimitHelp));
        ab0Var.addView(this.f38064y);
        org.telegram.ui.Cells.j4 j4Var2 = new org.telegram.ui.Cells.j4(context);
        this.A = j4Var2;
        j4Var2.setText(LocaleController.getString(R.string.LimitNumberOfUses));
        ab0Var.addView(this.A);
        org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
        this.f38056c = dv0Var2;
        dv0Var2.setCallback(new va0(this, i13));
        X();
        ab0Var.addView(this.f38056c);
        bb0 bb0Var = new bb0(context, 0);
        this.B = bb0Var;
        bb0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.B.setGravity(16);
        this.B.setTextSize(1, 16.0f);
        this.B.setHint(LocaleController.getString(R.string.UsesLimitHint));
        this.B.setKeyListener(DigitsKeyListener.getInstance("0123456789."));
        this.B.setInputType(2);
        this.B.addTextChangedListener(new za0(this, 1));
        ab0Var.addView(this.B, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var2 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.C = x8Var2;
        x8Var2.setText(LocaleController.getString(R.string.UsesLimitHelp));
        ab0Var.addView(this.C);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f38055b;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        boolean z10 = (!ChatObject.isPublic(chat) || chat.join_request || chat.join_to_send) ? false : true;
        cb0 cb0Var = new cb0(context);
        this.f38058f = cb0Var;
        int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
        cb0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f38058f.setTag(Integer.valueOf(i14));
        this.f38058f.f(LocaleController.getString(R.string.ApproveNewMembers2), false, false);
        this.f38058f.setOnClickListener(new jh.a2(7, this, z10));
        ab0Var.addView(this.f38058f, h7.z5.n(-1, 56));
        org.telegram.ui.Cells.x8 x8Var3 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.h = x8Var3;
        if (z10) {
            this.f38058f.setCheckBoxIcon(R.drawable.permission_locked);
            this.h.setText(LocaleController.getString(R.string.ApproveNewMembersUnavailablePublicGroup));
        } else {
            x8Var3.setText(LocaleController.getString(R.string.ApproveNewMembersDescription2));
        }
        ab0Var.addView(this.h);
        if (chat == null || chat.username == null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(j10);
            if ((this.f38057e == null && ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10))) && chatFull != null && chatFull.paid_media_allowed) || ((tL_chatInviteExported = this.f38057e) != null && tL_chatInviteExported.subscription_pricing != null)) {
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
                this.f38059n = p8Var;
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
                this.f38059n.setDrawCheckRipple(true);
                this.f38059n.f(LocaleController.getString(R.string.RequireMonthlyFee), false, true);
                if (this.f38057e != null) {
                    this.f38059n.setCheckBoxIcon(R.drawable.permission_locked);
                    this.f38059n.setEnabled(false);
                }
                this.f38059n.setOnClickListener(new u70(3, this, new Runnable[1]));
                ab0Var.addView(this.f38059n, h7.z5.n(-1, 48));
                TextView textView3 = new TextView(context);
                this.f38061s = textView3;
                textView3.setTextSize(1, 16.0f);
                this.f38061s.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A6, false));
                db0 db0Var = new db0(this, context, LocaleController.getString(getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceHintTest5Minutes : R.string.RequireMonthlyFeePriceHint), this.resourceProvider);
                this.f38060r = db0Var;
                db0Var.f24370b.setInputType(2);
                this.f38060r.f24370b.setRawInputType(2);
                this.f38060r.setBackgroundColor(getThemedColor(i14));
                db0 db0Var2 = this.f38060r;
                db0Var2.getClass();
                org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(db0Var2, 4);
                org.telegram.ui.Cells.e3 e3Var = db0Var2.f24370b;
                e3Var.setImeOptions(6);
                e3Var.setOnEditorActionListener(new m.u2(gVar, 2));
                this.f38060r.addView(this.f38061s, h7.z5.d(-2, -2.0f, 21, 0.0f, 0.0f, 19.0f, 0.0f));
                db0 db0Var3 = this.f38060r;
                Drawable drawableMutate = getParentActivity().getResources().getDrawable(R.drawable.star_small_inner).mutate();
                db0Var3.getClass();
                ImageView imageView = new ImageView(db0Var3.getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageDrawable(drawableMutate);
                db0Var3.addView(imageView, h7.z5.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
                org.telegram.ui.Cells.e3 e3Var2 = db0Var3.f24370b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e3Var2.getLayoutParams();
                layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
                e3Var2.setLayoutParams(layoutParams);
                imageView.setScaleX(0.83f);
                imageView.setScaleY(0.83f);
                imageView.setTranslationY(AndroidUtilities.dp(-1.0f));
                imageView.setTranslationX(AndroidUtilities.dp(1.0f));
                ab0Var.addView(this.f38060r, h7.z5.n(-1, 48));
                this.f38060r.setVisibility(8);
                org.telegram.ui.Cells.x8 x8Var4 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
                this.v = x8Var4;
                if (this.f38057e != null) {
                    x8Var4.setText(LocaleController.getString(R.string.RequireMonthlyFeeInfoFrozen));
                } else {
                    x8Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.RequireMonthlyFeeInfo), new ua0(this, 2)));
                }
                ab0Var.addView(this.v, h7.z5.n(-1, -2));
            }
        }
        bb0 bb0Var2 = new bb0(context, 1);
        this.G = bb0Var2;
        bb0Var2.addTextChangedListener(new za0(this, 0));
        this.G.setCursorVisible(false);
        this.G.setFilters(new InputFilter[]{new InputFilter.LengthFilter(32)});
        this.G.setGravity(16);
        this.G.setHint(LocaleController.getString(R.string.LinkNameHint));
        bb0 bb0Var3 = this.G;
        int i15 = org.telegram.ui.ActionBar.g6.f23423y6;
        bb0Var3.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.G.setLines(1);
        this.G.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        this.G.setSingleLine();
        bb0 bb0Var4 = this.G;
        int i16 = org.telegram.ui.ActionBar.g6.G6;
        bb0Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.G.setTextSize(1, 16.0f);
        ab0Var.addView(this.G, h7.z5.n(-1, 50));
        org.telegram.ui.Cells.x8 x8Var5 = new org.telegram.ui.Cells.x8(context, 12, this.resourceProvider);
        this.H = x8Var5;
        x8Var5.setText(LocaleController.getString(R.string.LinkNameHelp));
        ab0Var.addView(this.H);
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
            this.E = x9Var;
            x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.E.b(LocaleController.getString(R.string.RevokeLink), false);
            this.E.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
            final int i17 = 1;
            this.E.setOnClickListener(new View.OnClickListener(this) {

                public final fb0 f44749b;

                {
                    this.f44749b = this;
                }

                @Override
                public final void onClick(View view) {
                    long j11;
                    boolean z11;
                    switch (i17) {
                        case 0:
                            final fb0 fb0Var = this.f44749b;
                            long j12 = fb0Var.f38055b;
                            ArrayList arrayList2 = fb0Var.N;
                            ArrayList arrayList3 = fb0Var.L;
                            if (!fb0Var.R) {
                                int selectedIndex = fb0Var.d.getSelectedIndex();
                                if (selectedIndex < arrayList3.size() && ((Integer) arrayList3.get(selectedIndex)).intValue() < 0) {
                                    AndroidUtilities.shakeView(fb0Var.f38062w);
                                    Vibrator vibrator = (Vibrator) fb0Var.f38062w.getContext().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                } else {
                                    org.telegram.ui.Cells.p8 p8Var2 = fb0Var.f38059n;
                                    if (p8Var2 == null || !p8Var2.f25003e.h) {
                                        j11 = 0;
                                    } else {
                                        try {
                                            j11 = Long.parseLong(fb0Var.f38060r.f24370b.getText().toString());
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                            j11 = 0;
                                        }
                                    }
                                    int i18 = fb0Var.f38054a;
                                    if (i18 == 0) {
                                        org.telegram.ui.ActionBar.b2 b2Var = fb0Var.Q;
                                        if (b2Var != null) {
                                            b2Var.dismiss();
                                        }
                                        fb0Var.R = true;
                                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                        fb0Var.Q = b2Var2;
                                        b2Var2.q(500L);
                                        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                                        tL_messages_exportChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j12);
                                        tL_messages_exportChatInvite.legacy_revoke_permanent = false;
                                        int selectedIndex2 = fb0Var.d.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 1;
                                        if (selectedIndex2 < arrayList3.size()) {
                                            tL_messages_exportChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList3.get(selectedIndex2)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.expire_date = 0;
                                        }
                                        int selectedIndex3 = fb0Var.f38056c.getSelectedIndex();
                                        tL_messages_exportChatInvite.flags |= 2;
                                        if (selectedIndex3 < arrayList2.size()) {
                                            tL_messages_exportChatInvite.usage_limit = ((Integer) arrayList2.get(selectedIndex3)).intValue();
                                        } else {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        cb0 cb0Var2 = fb0Var.f38058f;
                                        boolean z12 = cb0Var2 != null && cb0Var2.f25003e.h;
                                        tL_messages_exportChatInvite.request_needed = z12;
                                        if (z12) {
                                            tL_messages_exportChatInvite.usage_limit = 0;
                                        }
                                        String string = fb0Var.G.getText().toString();
                                        tL_messages_exportChatInvite.title = string;
                                        if (!TextUtils.isEmpty(string)) {
                                            tL_messages_exportChatInvite.flags |= 16;
                                        }
                                        if (j11 > 0) {
                                            tL_messages_exportChatInvite.flags |= 32;
                                            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = new TL_stars.TL_starsSubscriptionPricing();
                                            tL_messages_exportChatInvite.subscription_pricing = tL_starsSubscriptionPricing;
                                            tL_starsSubscriptionPricing.period = fb0Var.getConnectionsManager().isTestBackend() ? 300 : 2592000;
                                            tL_messages_exportChatInvite.subscription_pricing.amount = j11;
                                        }
                                        final int i19 = 0;
                                        fb0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new RequestDelegate() {
                                            @Override
                                            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                switch (i19) {
                                                    case 0:
                                                        final int i110 = 0;
                                                        final fb0 fb0Var2 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i110) {
                                                                    case 0:
                                                                        fb0 fb0Var4 = fb0Var2;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                        if (b2Var5 != null) {
                                                                            b2Var5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var4.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        fb0 fb0Var5 = fb0Var2;
                                                                        fb0Var5.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                        if (b2Var6 != null) {
                                                                            b2Var6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var5.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                            }
                                                                            fb0Var5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                    default:
                                                        final int i111 = 1;
                                                        final fb0 fb0Var3 = fb0Var;
                                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                switch (i111) {
                                                                    case 0:
                                                                        fb0 fb0Var4 = fb0Var3;
                                                                        fb0Var4.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                        if (b2Var5 != null) {
                                                                            b2Var5.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error2 = tL_error;
                                                                        if (tL_error2 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                        } else {
                                                                            eb0 eb0Var = fb0Var4.P;
                                                                            if (eb0Var != null) {
                                                                                eb0Var.c(tLObject);
                                                                            }
                                                                            fb0Var4.finishFragment();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        fb0 fb0Var5 = fb0Var3;
                                                                        fb0Var5.R = false;
                                                                        org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                        if (b2Var6 != null) {
                                                                            b2Var6.dismiss();
                                                                        }
                                                                        TLRPC.TL_error tL_error3 = tL_error;
                                                                        if (tL_error3 != null) {
                                                                            org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                        } else {
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                            }
                                                                            eb0 eb0Var2 = fb0Var5.P;
                                                                            if (eb0Var2 != null) {
                                                                                eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                            }
                                                                            fb0Var5.finishFragment();
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                        });
                                                        break;
                                                }
                                            }
                                        });
                                    } else if (i18 == 1) {
                                        org.telegram.ui.ActionBar.b2 b2Var3 = fb0Var.Q;
                                        if (b2Var3 != null) {
                                            b2Var3.dismiss();
                                        }
                                        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                                        tL_messages_editExportedChatInvite.link = fb0Var.f38057e.link;
                                        tL_messages_editExportedChatInvite.revoked = false;
                                        tL_messages_editExportedChatInvite.peer = fb0Var.getMessagesController().getInputPeer(-j12);
                                        int selectedIndex4 = fb0Var.d.getSelectedIndex();
                                        if (selectedIndex4 < arrayList3.size()) {
                                            if (fb0Var.S != ((Integer) arrayList3.get(selectedIndex4)).intValue()) {
                                                tL_messages_editExportedChatInvite.flags |= 1;
                                                tL_messages_editExportedChatInvite.expire_date = fb0Var.getConnectionsManager().getCurrentTime() + ((Integer) arrayList3.get(selectedIndex4)).intValue();
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        } else if (fb0Var.S != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 1;
                                            tL_messages_editExportedChatInvite.expire_date = 0;
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        int selectedIndex5 = fb0Var.f38056c.getSelectedIndex();
                                        if (selectedIndex5 < arrayList2.size()) {
                                            int iIntValue = ((Integer) arrayList2.get(selectedIndex5)).intValue();
                                            if (fb0Var.f38057e.usage_limit != iIntValue) {
                                                tL_messages_editExportedChatInvite.flags |= 2;
                                                tL_messages_editExportedChatInvite.usage_limit = iIntValue;
                                                z11 = true;
                                            }
                                        } else if (fb0Var.f38057e.usage_limit != 0) {
                                            tL_messages_editExportedChatInvite.flags |= 2;
                                            tL_messages_editExportedChatInvite.usage_limit = 0;
                                            z11 = true;
                                        }
                                        boolean z13 = fb0Var.f38057e.request_needed;
                                        cb0 cb0Var3 = fb0Var.f38058f;
                                        if (z13 != (cb0Var3 != null && cb0Var3.f25003e.h)) {
                                            int i110 = tL_messages_editExportedChatInvite.flags;
                                            tL_messages_editExportedChatInvite.flags = i110 | 8;
                                            boolean z14 = cb0Var3 != null && cb0Var3.f25003e.h;
                                            tL_messages_editExportedChatInvite.request_needed = z14;
                                            if (z14) {
                                                tL_messages_editExportedChatInvite.flags = i110 | 10;
                                                tL_messages_editExportedChatInvite.usage_limit = 0;
                                            }
                                            z11 = true;
                                        }
                                        String string2 = fb0Var.G.getText().toString();
                                        if (!TextUtils.equals(fb0Var.f38057e.title, string2)) {
                                            tL_messages_editExportedChatInvite.title = string2;
                                            tL_messages_editExportedChatInvite.flags |= 16;
                                            z11 = true;
                                        }
                                        if (!z11) {
                                            fb0Var.finishFragment();
                                        } else {
                                            fb0Var.R = true;
                                            org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(fb0Var.getParentActivity(), 3, null);
                                            fb0Var.Q = b2Var4;
                                            b2Var4.q(500L);
                                            final int i111 = 1;
                                            fb0Var.getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                                                @Override
                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                    switch (i111) {
                                                        case 0:
                                                            final int i112 = 0;
                                                            final fb0 fb0Var2 = fb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    switch (i112) {
                                                                        case 0:
                                                                            fb0 fb0Var4 = fb0Var2;
                                                                            fb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                            if (b2Var5 != null) {
                                                                                b2Var5.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                            } else {
                                                                                eb0 eb0Var = fb0Var4.P;
                                                                                if (eb0Var != null) {
                                                                                    eb0Var.c(tLObject);
                                                                                }
                                                                                fb0Var4.finishFragment();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            fb0 fb0Var5 = fb0Var2;
                                                                            fb0Var5.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                            if (b2Var6 != null) {
                                                                                b2Var6.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                eb0 eb0Var2 = fb0Var5.P;
                                                                                if (eb0Var2 != null) {
                                                                                    eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                                }
                                                                                fb0Var5.finishFragment();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                        default:
                                                            final int i113 = 1;
                                                            final fb0 fb0Var3 = fb0Var;
                                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                                @Override
                                                                public final void run() {
                                                                    switch (i113) {
                                                                        case 0:
                                                                            fb0 fb0Var4 = fb0Var3;
                                                                            fb0Var4.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var5 = fb0Var4.Q;
                                                                            if (b2Var5 != null) {
                                                                                b2Var5.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            if (tL_error2 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var4, null, tL_error2.text, null);
                                                                            } else {
                                                                                eb0 eb0Var = fb0Var4.P;
                                                                                if (eb0Var != null) {
                                                                                    eb0Var.c(tLObject);
                                                                                }
                                                                                fb0Var4.finishFragment();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            fb0 fb0Var5 = fb0Var3;
                                                                            fb0Var5.R = false;
                                                                            org.telegram.ui.ActionBar.b2 b2Var6 = fb0Var5.Q;
                                                                            if (b2Var6 != null) {
                                                                                b2Var6.dismiss();
                                                                            }
                                                                            TLRPC.TL_error tL_error3 = tL_error;
                                                                            if (tL_error3 != null) {
                                                                                org.telegram.ui.Components.y4.u0(fb0Var5, null, tL_error3.text, null);
                                                                            } else {
                                                                                TLObject tLObject2 = tLObject;
                                                                                if (tLObject2 instanceof TLRPC.TL_messages_exportedChatInvite) {
                                                                                    fb0Var5.f38057e = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvite) tLObject2).invite;
                                                                                }
                                                                                eb0 eb0Var2 = fb0Var5.P;
                                                                                if (eb0Var2 != null) {
                                                                                    eb0Var2.b(fb0Var5.f38057e, tLObject2);
                                                                                }
                                                                                fb0Var5.finishFragment();
                                                                            }
                                                                            break;
                                                                    }
                                                                }
                                                            });
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            fb0 fb0Var2 = this.f44749b;
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb0Var2.getParentActivity());
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new va0(fb0Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            fb0Var2.showDialog(alertDialog$Builder.f22702a);
                            break;
                    }
                }
            });
            ab0Var.addView(this.E);
        }
        q4Var.addView(this.F, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.D = frameLayout;
        int i18 = org.telegram.ui.ActionBar.g6.f22999a7;
        frameLayout.setBackgroundColor(getThemedColor(i18));
        new lh.a4(q4Var, false, new cg.h(5));
        q4Var.addView(this.D, h7.z5.e(-1, -2, 80));
        this.f38063x.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f38062w.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.A.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.f38056c.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.B.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        this.G.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
        q4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        this.B.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.B.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.f38062w.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
        this.f38062w.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        this.B.setCursorVisible(false);
        Y(this.f38057e);
        q4Var.setClipChildren(false);
        this.F.setClipChildren(false);
        ab0Var.setClipChildren(false);
        return q4Var;
    }

    @Override
    public final void finishFragment() {
        this.F.getLayoutParams().height = this.F.getHeight();
        super.finishFragment();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        e eVar = new e(this, 20);
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38063x, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, i10));
        org.telegram.ui.Cells.j4 j4Var = this.f38063x;
        int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(j4Var, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38056c, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38062w, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 1, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.B6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38064y, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f23423y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f23269p7));
        return arrayList;
    }
}
