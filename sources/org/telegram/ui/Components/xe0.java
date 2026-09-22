package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xe0 {
    public final af0 f30313a;

    public xe0(af0 af0Var) {
        this.f30313a = af0Var;
    }

    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        String str;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        LinearLayout linearLayout;
        AndroidUtilities.VcardItem vcardItem;
        int i15;
        boolean z12;
        int i16;
        int i17;
        float f7;
        int i18;
        float f10;
        int i19;
        int i20;
        float f11;
        int i21;
        float f12;
        int i22;
        float f13;
        float f14;
        int i23;
        int i24;
        int i25;
        af0 af0Var = this.f30313a;
        ArrayList arrayList = af0Var.L;
        ArrayList arrayList2 = af0Var.M;
        if (i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f30642a = textView;
            int i26 = org.telegram.ui.ActionBar.j6.G6;
            int i27 = af0.O;
            int themedColor = af0Var.getThemedColor(i26);
            boolean z13 = af0Var.J;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView.setGravity(i16 | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i17 = 5;
            } else {
                i17 = 3;
            }
            int i28 = i17 | 48;
            if (z14) {
                if (z13) {
                    i25 = 17;
                } else {
                    i25 = 64;
                }
                f7 = i25;
            } else {
                f7 = 72.0f;
            }
            if (z14) {
                f10 = 72.0f;
            } else {
                if (z13) {
                    i18 = 17;
                } else {
                    i18 = 64;
                }
                f10 = i18;
            }
            frameLayout.addView(textView, w7.y5.d(-1, -1.0f, i28, f7, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f30643b = textView2;
            textView2.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19511z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            textView2.setGravity(i19);
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i20 = 5;
            } else {
                i20 = 3;
            }
            if (z15) {
                if (z13) {
                    i24 = 17;
                } else {
                    i24 = 64;
                }
                f11 = i24;
            } else {
                f11 = 72.0f;
            }
            if (z15) {
                f12 = 72.0f;
            } else {
                if (z13) {
                    i21 = 17;
                } else {
                    i21 = 64;
                }
                f12 = i21;
            }
            frameLayout.addView(textView2, w7.y5.d(-2, -2.0f, i20, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            frameLayout.f30644c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19274m6), PorterDuff.Mode.MULTIPLY));
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i22 = 5;
            } else {
                i22 = 3;
            }
            int i29 = i22 | 48;
            if (z16) {
                f13 = 0.0f;
            } else {
                f13 = 20.0f;
            }
            if (z16) {
                f14 = 20.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.addView(imageView, w7.y5.d(-2, -2.0f, i29, f13, 20.0f, f14, 0.0f));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i30 = org.telegram.ui.ActionBar.j6.M6;
                int i31 = org.telegram.ui.ActionBar.j6.N6;
                int i32 = org.telegram.ui.ActionBar.j6.f19109d6;
                r92.d(i30, i31, i32, i32);
                if (LocaleController.isRTL) {
                    i23 = 3;
                } else {
                    i23 = 5;
                }
                frameLayout.addView(r92, w7.y5.d(37, 40.0f, i23 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = af0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.f3) af0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                } else {
                    str = null;
                }
                z11 = true;
            }
            g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.f3) af0Var).currentAccount;
            g9Var.m(i12, tL_userContact_old2);
            v9 v9Var = new v9(context);
            v9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            v9Var.e(tL_userContact_old2, g9Var);
            linearLayout2.addView(v9Var, w7.y5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.rk.k(17.0f, 1, textView3);
            textView3.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19216j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            if (str != null) {
                i13 = 0;
            } else {
                i13 = 27;
            }
            linearLayout2.addView(textView3, w7.y5.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView f15 = org.telegram.messenger.l0.f(context, 1, 14.0f);
                f15.setTextColor(af0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19365r5));
                f15.setSingleLine(true);
                f15.setEllipsize(truncateAt);
                f15.setText(str);
                if (z11) {
                    i14 = 27;
                } else {
                    i14 = 11;
                }
                linearLayout2.addView(f15, w7.y5.t(-2, -2, 49, 10, 3, 10, i14));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            ye0 ye0Var = (ye0) linearLayout;
            int i33 = af0Var.F;
            if (i10 >= i33 && i10 < af0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i33);
                i15 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - af0Var.H);
                int i34 = vcardItem.type;
                if (i34 == 1) {
                    i15 = R.drawable.msg_mention;
                } else if (i34 == 2) {
                    i15 = R.drawable.msg_location;
                } else if (i34 == 3) {
                    i15 = R.drawable.msg_link;
                } else if (i34 == 4) {
                    i15 = R.drawable.msg_info;
                } else if (i34 == 5) {
                    i15 = R.drawable.msg_calendar2;
                } else if (i34 == 6) {
                    if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                        i15 = R.drawable.msg_work;
                    } else {
                        i15 = R.drawable.msg_jobtitle;
                    }
                } else if (i34 == 20) {
                    i15 = R.drawable.msg_info;
                } else {
                    i15 = R.drawable.msg_info;
                }
            }
            if (i10 != af0Var.E - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = ye0Var.f30644c;
            ye0Var.f30642a.setText(vcardItem.getValue(true));
            ye0Var.f30643b.setText(vcardItem.getType());
            Switch r82 = ye0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i15 != 0) {
                imageView2.setImageResource(i15);
            } else {
                imageView2.setImageDrawable(null);
            }
            ye0Var.e = z12;
            ye0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
