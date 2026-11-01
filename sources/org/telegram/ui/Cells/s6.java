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
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
public final class s6 extends LinearLayout {
    public static final int f23015c = 0;
    public TLRPC.RequestPeerType f23016a;
    public ArrayList f23017b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.f23017b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(i10, null))));
            } else {
                arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(i11, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i10;
        String L0;
        int i11;
        ArrayList arrayList = this.f23017b;
        if (this.f23016a != requestPeerType) {
            this.f23016a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747355, 2131747356);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747363, 2131747364);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(2131747366, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(2131747365, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747357, 2131747358);
                    a(requestPeerType.forum, 2131747361, 2131747362);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(2131747360, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(t6.a(org.telegram.messenger.i0.W2(dd.L0(2131747359, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.L0(2131747353, null));
                    SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(dd.L0(2131747354, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                L0 = dd.L0(2131751325, null);
                            } else {
                                L0 = dd.L0(2131751324, null);
                            }
                            f1.q(1, L0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            f1.q(1, dd.L0(2131751313, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            f1.q(1, dd.L0(2131751320, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i10 = 2131751322;
                            } else {
                                i10 = 2131751317;
                            }
                            f1.q(1, dd.L0(i10, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            f1.q(1, dd.L0(2131751329, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            f1.q(1, dd.L0(2131751331, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            f1.q(1, dd.L0(2131751314, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            f1.q(1, dd.L0(2131751332, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            f1.q(1, dd.L0(2131751304, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            f1.q(1, dd.L0(2131744919, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            f1.q(1, dd.L0(2131748707, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(t6.a(TextUtils.concat(W22, " ", ((t6) arrayList2.get(0)).f23092b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(W2);
                            valueOf.append((CharSequence) " ");
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (i12 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((t6) arrayList2.get(i12)).f23092b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(t6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                p4 p4Var = new p4(getContext(), 20);
                p4Var.setText(dd.L0(2131747352, null));
                int i13 = org.telegram.ui.ActionBar.t6.f20930d6;
                org.telegram.ui.ActionBar.a7.i(i13, p4Var, null);
                addView(p4Var, w7.b6.o(-1, -2));
                View x3Var = new x3(getContext(), 9, 1);
                x3Var.setBackground(null);
                org.telegram.ui.ActionBar.a7.i(i13, x3Var, null);
                addView(x3Var, w7.b6.o(-1, -2));
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    t6 t6Var = (t6) obj;
                    Context context = getContext();
                    jg.z2 z2Var = new jg.z2(context, 2);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, z2Var, null);
                    z2Var.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (t6Var.f23091a <= 0) {
                        i11 = 2131231623;
                    } else {
                        i11 = 2131231624;
                    }
                    imageView.setImageResource(i11);
                    org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.L6, null, PorterDuff.Mode.MULTIPLY);
                    z2Var.addView(imageView, w7.b6.q(20, 20, 0.0f, 51, (t6Var.f23091a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21331z6, null);
                    textView.setSingleLine(false);
                    textView.setText(t6Var.f23092b);
                    z2Var.addView(textView, w7.b6.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(z2Var, w7.b6.o(-1, -2));
                }
                int i15 = org.telegram.ui.ActionBar.t6.f20930d6;
                View x3Var2 = new x3(getContext(), 12, 1);
                x3Var2.setBackground(null);
                org.telegram.ui.ActionBar.a7.i(i15, x3Var2, null);
                addView(x3Var2, w7.b6.o(-1, -2));
                Drawable Y0 = org.telegram.ui.ActionBar.t6.Y0(getContext(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7);
                View x3Var3 = new x3(getContext(), 12, 1);
                x3Var3.setBackground(Y0);
                addView(x3Var3, w7.b6.o(-1, -2));
            }
        }
    }
}
