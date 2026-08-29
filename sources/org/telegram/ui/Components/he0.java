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
public final class he0 {
    public final ke0 f29172a;

    public he0(ke0 ke0Var) {
        this.f29172a = ke0Var;
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
        float f9;
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
        ke0 ke0Var = this.f29172a;
        ArrayList arrayList = ke0Var.H;
        ArrayList arrayList2 = ke0Var.I;
        if (i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f29380a = textView;
            int i26 = org.telegram.ui.ActionBar.g6.G6;
            int i27 = ke0.K;
            int themedColor = ke0Var.getThemedColor(i26);
            boolean z13 = ke0Var.F;
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
                f9 = i25;
            } else {
                f9 = 72.0f;
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
            frameLayout.addView(textView, i7.f6.d(-1, -1.0f, i28, f9, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f29381b = textView2;
            textView2.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23450z6));
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
            frameLayout.addView(textView2, i7.f6.d(-2, -2.0f, i20, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            frameLayout.f29382c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23223m6), PorterDuff.Mode.MULTIPLY));
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
            frameLayout.addView(imageView, i7.f6.d(-2, -2.0f, i29, f13, 20.0f, f14, 0.0f));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r9 = new Switch(context, null);
                frameLayout.d = r9;
                int i30 = org.telegram.ui.ActionBar.g6.M6;
                int i31 = org.telegram.ui.ActionBar.g6.N6;
                int i32 = org.telegram.ui.ActionBar.g6.f23062d6;
                r9.d(i30, i31, i32, i32);
                if (LocaleController.isRTL) {
                    i23 = 3;
                } else {
                    i23 = 5;
                }
                frameLayout.addView(r9, i7.f6.d(37, 40.0f, i23 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = ke0Var.J;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.f3) ke0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                } else {
                    str = null;
                }
                z11 = true;
            }
            e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
            e9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.f3) ke0Var).currentAccount;
            e9Var.m(i12, tL_userContact_old2);
            t9 t9Var = new t9(context);
            t9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            t9Var.e(tL_userContact_old2, e9Var);
            linearLayout2.addView(t9Var, i7.f6.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.ui.b.g(17.0f, 1, textView3);
            textView3.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            if (str != null) {
                i13 = 0;
            } else {
                i13 = 27;
            }
            linearLayout2.addView(textView3, i7.f6.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView h = org.telegram.messenger.x3.h(context, 1, 14.0f);
                h.setTextColor(ke0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23310r5));
                h.setSingleLine(true);
                h.setEllipsize(truncateAt);
                h.setText(str);
                if (z11) {
                    i14 = 27;
                } else {
                    i14 = 11;
                }
                linearLayout2.addView(h, i7.f6.t(-2, -2, 49, 10, 3, 10, i14));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            ie0 ie0Var = (ie0) linearLayout;
            int i33 = ke0Var.B;
            if (i10 >= i33 && i10 < ke0Var.C) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i33);
                i15 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - ke0Var.D);
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
            if (i10 != ke0Var.A - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = ie0Var.f29382c;
            ie0Var.f29380a.setText(vcardItem.getValue(true));
            ie0Var.f29381b.setText(vcardItem.getType());
            Switch r82 = ie0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i15 != 0) {
                imageView2.setImageResource(i15);
            } else {
                imageView2.setImageDrawable(null);
            }
            ie0Var.f29383e = z12;
            ie0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
