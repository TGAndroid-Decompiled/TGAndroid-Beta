package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class yd0 {

    public final be0 f34884a;

    public yd0(be0 be0Var) {
        this.f34884a = be0Var;
    }

    public final ViewGroup a(Context context, int i10) {
        String userStatus;
        boolean z10;
        ViewGroup viewGroup;
        AndroidUtilities.VcardItem vcardItem;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        be0 be0Var = this.f34884a;
        ArrayList arrayList = be0Var.H;
        ArrayList arrayList2 = be0Var.I;
        boolean z11 = i10 != 0;
        if (z11) {
            zd0 zd0Var = new zd0(context);
            TextView textView = new TextView(context);
            zd0Var.f35225a = textView;
            int i12 = org.telegram.ui.ActionBar.g6.G6;
            int i13 = be0.K;
            int themedColor = be0Var.getThemedColor(i12);
            boolean z12 = be0Var.F;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z13 = LocaleController.isRTL;
            int i14 = (z13 ? 5 : 3) | 48;
            if (z13) {
                f10 = z12 ? 17 : 64;
            } else {
                f10 = 72.0f;
            }
            if (z13) {
                f11 = 72.0f;
            } else {
                f11 = z12 ? 17 : 64;
            }
            zd0Var.addView(textView, h7.z5.d(-1, -1.0f, i14, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            zd0Var.f35226b = textView2;
            textView2.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23441z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z14 = LocaleController.isRTL;
            int i15 = z14 ? 5 : 3;
            if (z14) {
                f12 = z12 ? 17 : 64;
            } else {
                f12 = 72.0f;
            }
            if (z14) {
                f13 = 72.0f;
            } else {
                f13 = z12 ? 17 : 64;
            }
            zd0Var.addView(textView2, h7.z5.d(-2, -2.0f, i15, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            zd0Var.f35227c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23215m6), PorterDuff.Mode.MULTIPLY));
            boolean z15 = LocaleController.isRTL;
            zd0Var.addView(imageView, h7.z5.d(-2, -2.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 20.0f, 20.0f, z15 ? 20.0f : 0.0f, 0.0f));
            viewGroup = zd0Var;
            if (!z12) {
                Switch r10 = new Switch(context, null);
                zd0Var.d = r10;
                int i16 = org.telegram.ui.ActionBar.g6.M6;
                int i17 = org.telegram.ui.ActionBar.g6.N6;
                int i18 = org.telegram.ui.ActionBar.g6.f23053d6;
                r10.d(i16, i17, i18, i18);
                zd0Var.addView(r10, h7.z5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                viewGroup = zd0Var;
            }
        } else {
            ae0 ae0Var = new ae0(context);
            ae0Var.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = be0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                userStatus = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z10 = false;
            } else {
                TLRPC.UserStatus userStatus2 = tL_userContact_old2.status;
                userStatus = (userStatus2 == null || userStatus2.expires == 0) ? null : LocaleController.formatUserStatus(((org.telegram.ui.ActionBar.e3) be0Var).currentAccount, tL_userContact_old2);
                z10 = true;
            }
            y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.u(AndroidUtilities.dp(30.0f));
            y8Var.m(((org.telegram.ui.ActionBar.e3) be0Var).currentAccount, tL_userContact_old2);
            n9 n9Var = new n9(context);
            n9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            n9Var.e(tL_userContact_old2, y8Var);
            ae0Var.addView(n9Var, h7.z5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.rl.h(17.0f, 1, textView3);
            textView3.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            ae0Var.addView(textView3, h7.z5.t(-2, -2, 49, 10, 10, 10, userStatus != null ? 0 : 27));
            viewGroup = ae0Var;
            if (userStatus != null) {
                TextView textViewH = org.telegram.messenger.y1.h(context, 1, 14.0f);
                textViewH.setTextColor(be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23300r5));
                textViewH.setSingleLine(true);
                textViewH.setEllipsize(truncateAt);
                textViewH.setText(userStatus);
                ae0Var.addView(textViewH, h7.z5.t(-2, -2, 49, 10, 3, 10, z10 ? 27 : 11));
                viewGroup = ae0Var;
            }
        }
        if (z11) {
            zd0 zd0Var2 = (zd0) viewGroup;
            int i19 = be0Var.B;
            if (i10 < i19 || i10 >= be0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - be0Var.D);
                int i20 = vcardItem.type;
                if (i20 == 1) {
                    i11 = R.drawable.msg_mention;
                } else if (i20 == 2) {
                    i11 = R.drawable.msg_location;
                } else if (i20 == 3) {
                    i11 = R.drawable.msg_link;
                } else if (i20 == 4) {
                    i11 = R.drawable.msg_info;
                } else if (i20 == 5) {
                    i11 = R.drawable.msg_calendar2;
                } else if (i20 == 6) {
                    i11 = "ORG".equalsIgnoreCase(vcardItem.getRawType(true)) ? R.drawable.msg_work : R.drawable.msg_jobtitle;
                } else {
                    i11 = i20 == 20 ? R.drawable.msg_info : R.drawable.msg_info;
                }
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i19);
                i11 = R.drawable.msg_calls;
            }
            boolean z16 = i10 != be0Var.A - 1;
            ImageView imageView2 = zd0Var2.f35227c;
            zd0Var2.f35225a.setText(vcardItem.getValue(true));
            zd0Var2.f35226b.setText(vcardItem.getType());
            Switch r11 = zd0Var2.d;
            if (r11 != null) {
                r11.c(vcardItem.checked, false);
            }
            if (i11 != 0) {
                imageView2.setImageResource(i11);
            } else {
                imageView2.setImageDrawable(null);
            }
            zd0Var2.f35228e = z16;
            zd0Var2.setWillNotDraw(!z16);
        }
        return viewGroup;
    }
}
