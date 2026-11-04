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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
public final class n6 extends LinearLayout {
    public static final int f29676c = 0;
    public TLRPC.RequestPeerType f29677a;
    public ArrayList f29678b;

    public final void a(Boolean bool, int i3, int i10) {
        ArrayList arrayList = this.f29678b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(i3, null))));
            } else {
                arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(i10, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i3;
        String M0;
        int i10;
        ArrayList arrayList = this.f29678b;
        if (this.f29677a != requestPeerType) {
            this.f29677a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747347, 2131747348);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747355, 2131747356);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747358, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747357, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747349, 2131747350);
                    a(requestPeerType.forum, 2131747353, 2131747354);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747352, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(o6.a(org.telegram.messenger.g0.X2(bd.M0(2131747351, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(2131747345, null));
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(bd.M0(2131747346, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                M0 = bd.M0(2131751325, null);
                            } else {
                                M0 = bd.M0(2131751324, null);
                            }
                            f1.t(1, M0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            f1.t(1, bd.M0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            f1.t(1, bd.M0(2131751320, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i3 = 2131751322;
                            } else {
                                i3 = 2131751317;
                            }
                            f1.t(1, bd.M0(i3, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            f1.t(1, bd.M0(2131751329, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            f1.t(1, bd.M0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            f1.t(1, bd.M0(2131751314, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            f1.t(1, bd.M0(2131751332, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            f1.t(1, bd.M0(2131751304, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            f1.t(1, bd.M0(2131744911, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            f1.t(1, bd.M0(2131748700, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(o6.a(TextUtils.concat(X22, " ", ((o6) arrayList2.get(0)).f29749b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(X2);
                            valueOf.append((CharSequence) " ");
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (i11 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((o6) arrayList2.get(i11)).f29749b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(o6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                n4 n4Var = new n4(getContext(), 20);
                n4Var.setText(bd.M0(2131747344, null));
                int i12 = org.telegram.ui.ActionBar.k6.f27878d6;
                org.telegram.ui.ActionBar.r6.i(i12, n4Var, null);
                addView(n4Var, mf.o(-1, -2));
                View v3Var = new v3(getContext(), 9, 1);
                v3Var.setBackground(null);
                org.telegram.ui.ActionBar.r6.i(i12, v3Var, null);
                addView(v3Var, mf.o(-1, -2));
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    o6 o6Var = (o6) obj;
                    Context context = getContext();
                    ci.q qVar = new ci.q(context, 2);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, qVar, null);
                    qVar.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (o6Var.f29748a <= 0) {
                        i10 = 2131231622;
                    } else {
                        i10 = 2131231623;
                    }
                    imageView.setImageResource(i10);
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.L6, null, PorterDuff.Mode.MULTIPLY);
                    qVar.addView(imageView, mf.q(20, 20, 0.0f, 51, (o6Var.f29748a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28290z6, null);
                    textView.setSingleLine(false);
                    textView.setText(o6Var.f29749b);
                    qVar.addView(textView, mf.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(qVar, mf.o(-1, -2));
                }
                int i14 = org.telegram.ui.ActionBar.k6.f27878d6;
                View v3Var2 = new v3(getContext(), 12, 1);
                v3Var2.setBackground(null);
                org.telegram.ui.ActionBar.r6.i(i14, v3Var2, null);
                addView(v3Var2, mf.o(-1, -2));
                Drawable Y0 = org.telegram.ui.ActionBar.k6.Y0(getContext(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                View v3Var3 = new v3(getContext(), 12, 1);
                v3Var3.setBackground(Y0);
                addView(v3Var3, mf.o(-1, -2));
            }
        }
    }
}
