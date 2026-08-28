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
public final class td0 {
    public final wd0 f32686a;

    public td0(wd0 wd0Var) {
        this.f32686a = wd0Var;
    }

    public final ViewGroup a(Context context, int i9) {
        boolean z10;
        String str;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        LinearLayout linearLayout;
        AndroidUtilities.VcardItem vcardItem;
        int i14;
        boolean z12;
        int i15;
        int i16;
        float f10;
        int i17;
        float f11;
        int i18;
        int i19;
        float f12;
        int i20;
        float f13;
        int i21;
        float f14;
        float f15;
        int i22;
        int i23;
        int i24;
        wd0 wd0Var = this.f32686a;
        ArrayList arrayList = wd0Var.H;
        ArrayList arrayList2 = wd0Var.I;
        if (i9 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f32988a = textView;
            int i25 = org.telegram.ui.ActionBar.f6.G6;
            int i26 = wd0.K;
            int themedColor = wd0Var.getThemedColor(i25);
            boolean z13 = wd0Var.F;
            textView.setTextColor(themedColor);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15 | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i27 = i16 | 48;
            if (z14) {
                if (z13) {
                    i24 = 17;
                } else {
                    i24 = 64;
                }
                f10 = i24;
            } else {
                f10 = 72.0f;
            }
            if (z14) {
                f11 = 72.0f;
            } else {
                if (z13) {
                    i17 = 17;
                } else {
                    i17 = 64;
                }
                f11 = i17;
            }
            frameLayout.addView(textView, g7.e6.d(-1, -1.0f, i27, f10, 10.0f, f11, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f32989b = textView2;
            textView2.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23386z6));
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView2.setGravity(i18);
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            if (z15) {
                if (z13) {
                    i23 = 17;
                } else {
                    i23 = 64;
                }
                f12 = i23;
            } else {
                f12 = 72.0f;
            }
            if (z15) {
                f13 = 72.0f;
            } else {
                if (z13) {
                    i20 = 17;
                } else {
                    i20 = 64;
                }
                f13 = i20;
            }
            frameLayout.addView(textView2, g7.e6.d(-2, -2.0f, i19, f12, 35.0f, f13, 0.0f));
            ImageView imageView = new ImageView(context);
            frameLayout.f32990c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23162m6), PorterDuff.Mode.MULTIPLY));
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i28 = i21 | 48;
            if (z16) {
                f14 = 0.0f;
            } else {
                f14 = 20.0f;
            }
            if (z16) {
                f15 = 20.0f;
            } else {
                f15 = 0.0f;
            }
            frameLayout.addView(imageView, g7.e6.d(-2, -2.0f, i28, f14, 20.0f, f15, 0.0f));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i29 = org.telegram.ui.ActionBar.f6.M6;
                int i30 = org.telegram.ui.ActionBar.f6.N6;
                int i31 = org.telegram.ui.ActionBar.f6.f23001d6;
                r92.d(i29, i30, i31, i31);
                if (LocaleController.isRTL) {
                    i22 = 3;
                } else {
                    i22 = 5;
                }
                frameLayout.addView(r92, g7.e6.d(37, 40.0f, i22 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = wd0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i10 = ((org.telegram.ui.ActionBar.f3) wd0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i10, tL_userContact_old2);
                } else {
                    str = null;
                }
                z11 = true;
            }
            z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.u(AndroidUtilities.dp(30.0f));
            i11 = ((org.telegram.ui.ActionBar.f3) wd0Var).currentAccount;
            z8Var.m(i11, tL_userContact_old2);
            o9 o9Var = new o9(context);
            o9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            o9Var.e(tL_userContact_old2, z8Var);
            linearLayout2.addView(o9Var, g7.e6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.ll.k(17.0f, 1, textView3);
            textView3.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            if (str != null) {
                i12 = 0;
            } else {
                i12 = 27;
            }
            linearLayout2.addView(textView3, g7.e6.t(-2, -2, 49, 10, 10, 10, i12));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView g10 = org.telegram.messenger.l0.g(context, 1, 14.0f);
                g10.setTextColor(wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23247r5));
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                if (z11) {
                    i13 = 27;
                } else {
                    i13 = 11;
                }
                linearLayout2.addView(g10, g7.e6.t(-2, -2, 49, 10, 3, 10, i13));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            ud0 ud0Var = (ud0) linearLayout;
            int i32 = wd0Var.B;
            if (i9 >= i32 && i9 < wd0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i9 - i32);
                i14 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i9 - wd0Var.D);
                int i33 = vcardItem.type;
                if (i33 == 1) {
                    i14 = R.drawable.msg_mention;
                } else if (i33 == 2) {
                    i14 = R.drawable.msg_location;
                } else if (i33 == 3) {
                    i14 = R.drawable.msg_link;
                } else if (i33 == 4) {
                    i14 = R.drawable.msg_info;
                } else if (i33 == 5) {
                    i14 = R.drawable.msg_calendar2;
                } else if (i33 == 6) {
                    if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                        i14 = R.drawable.msg_work;
                    } else {
                        i14 = R.drawable.msg_jobtitle;
                    }
                } else if (i33 == 20) {
                    i14 = R.drawable.msg_info;
                } else {
                    i14 = R.drawable.msg_info;
                }
            }
            if (i9 != wd0Var.A - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = ud0Var.f32990c;
            ud0Var.f32988a.setText(vcardItem.getValue(true));
            ud0Var.f32989b.setText(vcardItem.getType());
            Switch r82 = ud0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i14 != 0) {
                imageView2.setImageResource(i14);
            } else {
                imageView2.setImageDrawable(null);
            }
            ud0Var.f32991e = z12;
            ud0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
