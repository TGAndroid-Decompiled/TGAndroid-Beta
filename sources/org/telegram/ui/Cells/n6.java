package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
public final class n6 extends LinearLayout {
    public static final int f30737c = 0;
    public TLRPC.RequestPeerType f30738a;
    public ArrayList f30739b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.f30739b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(i7, null))));
            } else {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(i10, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i7;
        String M0;
        int i10;
        ArrayList arrayList = this.f30739b;
        if (this.f30738a != requestPeerType) {
            this.f30738a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747339, 2131747340);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747347, 2131747348);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747350, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747349, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747341, 2131747342);
                    a(requestPeerType.forum, 2131747345, 2131747346);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747344, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(hd.M0(2131747343, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(2131747337, null));
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(hd.M0(2131747338, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                M0 = hd.M0(2131751324, null);
                            } else {
                                M0 = hd.M0(2131751323, null);
                            }
                            y0.o(1, M0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            y0.o(1, hd.M0(2131751312, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            y0.o(1, hd.M0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i7 = 2131751321;
                            } else {
                                i7 = 2131751316;
                            }
                            y0.o(1, hd.M0(i7, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            y0.o(1, hd.M0(2131751328, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            y0.o(1, hd.M0(2131751330, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            y0.o(1, hd.M0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            y0.o(1, hd.M0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            y0.o(1, hd.M0(2131751303, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            y0.o(1, hd.M0(2131744901, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            y0.o(1, hd.M0(2131748692, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(o6.a(TextUtils.concat(X22, " ", ((o6) arrayList2.get(0)).f30810b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X2);
                            valueOf.append((CharSequence) " ");
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (i11 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((o6) arrayList2.get(i11)).f30810b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(o6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                n4 n4Var = new n4(getContext(), 20);
                n4Var.setText(hd.M0(2131747336, null));
                int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
                org.telegram.ui.ActionBar.q6.h(i12, n4Var, null);
                addView(n4Var, c8.ja.o(-1, -2));
                View v3Var = new v3(getContext(), 9, 1);
                v3Var.setBackground(null);
                org.telegram.ui.ActionBar.q6.h(i12, v3Var, null);
                addView(v3Var, c8.ja.o(-1, -2));
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    o6 o6Var = (o6) obj;
                    Context context = getContext();
                    ai.r2 r2Var = new ai.r2(context, 3);
                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, r2Var, null);
                    r2Var.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (o6Var.f30809a <= 0) {
                        i10 = 2131231622;
                    } else {
                        i10 = 2131231623;
                    }
                    imageView.setImageResource(i10);
                    org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.L6, null, PorterDuff.Mode.MULTIPLY);
                    r2Var.addView(imageView, c8.ja.q(20, 20, 0.0f, 51, (o6Var.f30809a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29260z6, null);
                    textView.setSingleLine(false);
                    textView.setText(o6Var.f30810b);
                    r2Var.addView(textView, c8.ja.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(r2Var, c8.ja.o(-1, -2));
                }
                int i14 = org.telegram.ui.ActionBar.j6.f28849d6;
                View v3Var2 = new v3(getContext(), 12, 1);
                v3Var2.setBackground(null);
                org.telegram.ui.ActionBar.q6.h(i14, v3Var2, null);
                addView(v3Var2, c8.ja.o(-1, -2));
                Drawable Y0 = org.telegram.ui.ActionBar.j6.Y0(getContext(), 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
                View v3Var3 = new v3(getContext(), 12, 1);
                v3Var3.setBackground(Y0);
                addView(v3Var3, c8.ja.o(-1, -2));
            }
        }
    }
}
