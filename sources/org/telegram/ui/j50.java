package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class j50 extends org.telegram.ui.ActionBar.j {
    public final Activity f38823a;
    public final g60 f38824b;

    public j50(g60 g60Var, Activity activity) {
        this.f38824b = g60Var;
        this.f38823a = activity;
    }

    @Override
    public final void b(int i10) {
        VoIPService sharedInstance;
        int i11;
        int x02;
        int i12;
        int i13;
        String str;
        g60 g60Var = this.f38824b;
        if (i10 == -1) {
            g60Var.onBackPressed();
        } else if (i10 == 1) {
            g60Var.f37787a1.call.join_muted = false;
            g60.G0(g60Var);
        } else if (i10 == 2) {
            g60Var.f37787a1.call.join_muted = true;
            g60.G0(g60Var);
        } else if (i10 == 3) {
            g60Var.k1(false);
        } else if (i10 == 12) {
            g60.H0(g60Var, true);
        } else if (i10 == 13) {
            g60.H0(g60Var, false);
        } else if (i10 == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g60Var.getContext());
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.VoipChannelEndAlertTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.VoipChannelEndAlertText);
            } else {
                alertDialog$Builder.f20374a.R = LocaleController.getString(R.string.VoipGroupEndAlertTitle);
                alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.VoipGroupEndAlertText);
            }
            alertDialog$Builder.f20374a.I = org.telegram.ui.ActionBar.i6.f21027pg;
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupEnd), new d50(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21120ug, false);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
            b2Var.i(x03);
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21137vg, false));
            }
            b2Var.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20878hg, false));
        } else if (i10 == 9) {
            g60Var.f37835m1.callOnClick();
        } else if (i10 == 5) {
            ChatObject.Call call = g60Var.f37787a1;
            if (call.recording) {
                boolean z10 = call.call.record_video_active;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g60Var.getContext());
                alertDialog$Builder2.f20374a.I = org.telegram.ui.ActionBar.i6.f21027pg;
                alertDialog$Builder2.f20374a.R = LocaleController.getString(R.string.VoipGroupStopRecordingTitle);
                if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                    alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.VoipChannelStopRecordingText);
                } else {
                    alertDialog$Builder2.f20374a.T = LocaleController.getString(R.string.VoipGroupStopRecordingText);
                }
                alertDialog$Builder2.k(LocaleController.getString(R.string.Stop), new ai.k(11, this, z10));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21120ug, false);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20374a;
                b2Var2.i(x04);
                b2Var2.show();
                b2Var2.o(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false));
                return;
            }
            f50 f50Var = new f50(this, g60Var.getContext(), g60Var.Z0, g60Var.I2);
            if (g60Var.s1()) {
                f50Var.p(2);
            } else {
                f50Var.show();
            }
        } else if (i10 == 7) {
            g60Var.f37832l0 = true;
            g60Var.f37870u1.setVisibility(0);
            g60Var.f37874v1.setVisibility(0);
            g60Var.f37840n1.setVisibility(8);
            g60Var.f37884x1.setVisibility(8);
            g60Var.f37889y1.setVisibility(8);
            g60Var.f37879w1.setVisibility(8);
            g60Var.f37857r1.setVisibility(8);
            g60Var.f37844o1.setVisibility(8);
            g60Var.f37862s1.setVisibility(8);
            g60Var.f37866t1.setVisibility(8);
            g60Var.f37828k0.setVisibility(8);
            g60Var.f37848p1.setVisibility(8);
            g60Var.f37852q1.setVisibility(8);
            org.telegram.ui.ActionBar.v0 v0Var = g60Var.f37829k1;
            org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
            if (n1Var != null && n1Var.isShowing()) {
                v0Var.f21579b.measure(org.telegram.messenger.bi.c(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                v0Var.O(true, true);
            }
        } else if (i10 == 6) {
            g60Var.f37878w0 = false;
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(g60Var.getContext());
            editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.T(g60Var.getContext()));
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g60Var.getContext());
            alertDialog$Builder3.f20374a.I = org.telegram.ui.ActionBar.i6.f21027pg;
            if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                alertDialog$Builder3.f20374a.R = LocaleController.getString(R.string.VoipChannelTitle);
            } else {
                alertDialog$Builder3.f20374a.R = LocaleController.getString(R.string.VoipGroupTitle);
            }
            alertDialog$Builder3.f20374a.f20443y0 = false;
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new wz(1, editTextBoldCursor));
            LinearLayout linearLayout = new LinearLayout(g60Var.getContext());
            linearLayout.setOrientation(1);
            alertDialog$Builder3.n(linearLayout);
            editTextBoldCursor.setTextSize(1, 16.0f);
            int i14 = org.telegram.ui.ActionBar.i6.f20990ng;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setLines(1);
            editTextBoldCursor.setInputType(16385);
            editTextBoldCursor.setGravity(51);
            editTextBoldCursor.setSingleLine(true);
            editTextBoldCursor.setImeOptions(6);
            TLRPC.Chat chat = g60Var.Z0;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            editTextBoldCursor.setHint(str);
            editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21008og, false));
            editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            editTextBoldCursor.setCursorWidth(1.5f);
            editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 6, 24, 0));
            editTextBoldCursor.setOnEditorActionListener(new xz(alertDialog$Builder3, 1));
            editTextBoldCursor.addTextChangedListener(new zz(1, editTextBoldCursor));
            if (!TextUtils.isEmpty(g60Var.f37787a1.call.title)) {
                editTextBoldCursor.setText(g60Var.f37787a1.call.title);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), new a7(this, editTextBoldCursor, alertDialog$Builder3, 15));
            int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20843fg, false);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20374a;
            b2Var3.i(x05);
            b2Var3.setOnShowListener(new e50(this, b2Var3, editTextBoldCursor, 0));
            b2Var3.setOnDismissListener(new yz(1, editTextBoldCursor));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
            editTextBoldCursor.requestFocus();
        } else if (i10 == 8) {
            org.telegram.ui.Components.y80.w(g60Var.getContext(), -g60Var.j1(), g60Var.d, null, 2, g60Var.A0, new d50(this));
        } else if (i10 == 11) {
            SharedConfig.toggleNoiseSupression();
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            if (sharedInstance2 != null) {
                sharedInstance2.setNoiseSupressionEnabled(SharedConfig.noiseSupression);
            }
        } else if (i10 == 10 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            arrayList.add(LocaleController.getString(R.string.VoipAudioRoutingSpeaker));
            arrayList2.add(Integer.valueOf(R.drawable.msg_voice_speaker));
            arrayList3.add(0);
            if (sharedInstance.hasEarpiece()) {
                if (sharedInstance.isHeadsetPlugged()) {
                    i12 = R.string.VoipAudioRoutingHeadset;
                } else {
                    i12 = R.string.VoipAudioRoutingPhone;
                }
                arrayList.add(LocaleController.getString(i12));
                if (sharedInstance.isHeadsetPlugged()) {
                    i13 = R.drawable.msg_voice_headphones;
                } else {
                    i13 = R.drawable.msg_voice_phone;
                }
                org.telegram.ui.Cells.c1.k(i13, 1, arrayList2, arrayList3);
            }
            if (sharedInstance.isBluetoothHeadsetConnected()) {
                String str2 = sharedInstance.currentBluetoothDeviceName;
                if (str2 == null) {
                    str2 = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                }
                arrayList.add(str2);
                org.telegram.ui.Cells.c1.k(R.drawable.msg_voice_bluetooth, 2, arrayList2, arrayList3);
            }
            int size = arrayList.size();
            CharSequence[] charSequenceArr = new CharSequence[size];
            int[] iArr = new int[size];
            for (int i15 = 0; i15 < size; i15++) {
                charSequenceArr[i15] = (CharSequence) arrayList.get(i15);
                iArr[i15] = ((Integer) arrayList2.get(i15)).intValue();
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) this.f38823a, (org.telegram.ui.ActionBar.e6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = LocaleController.getString(R.string.VoipSelectAudioOutput);
            f3Var.bigTitle = true;
            lg.j jVar = new lg.j(8, this, arrayList3);
            f3Var.items = charSequenceArr;
            f3Var.itemIcons = iArr;
            f3Var.onClickListener = jVar;
            int i16 = org.telegram.ui.ActionBar.i6.f20935kg;
            f3Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
            f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.x0(null, i16, false));
            if (sharedInstance.getCurrentAudioRoute() == 1) {
                i11 = 0;
            } else if (sharedInstance.getCurrentAudioRoute() == 0) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            f3Var.show();
            f3Var.setTitleColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false));
            for (int i17 = 0; i17 < f3Var.getItemViews().size(); i17++) {
                org.telegram.ui.ActionBar.y2 y2Var = f3Var.getItemViews().get(i17);
                if (i17 == i11) {
                    x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21027pg, false);
                    y2Var.f21722f = true;
                } else {
                    x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false);
                }
                y2Var.setTextColor(x02);
                y2Var.setIconColor(x02);
                y2Var.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20878hg, false), 12), 2, -1));
            }
        }
    }
}
