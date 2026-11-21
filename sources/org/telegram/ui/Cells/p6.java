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
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
public final class p6 extends LinearLayout {
    public static final int f31247c = 0;
    public TLRPC.RequestPeerType f31248a;
    public ArrayList f31249b;

    public final void a(Boolean bool, int i7, int i10) {
        ArrayList arrayList = this.f31249b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(i7, null))));
            } else {
                arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(i10, null))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i7;
        String N0;
        int i10;
        ArrayList arrayList = this.f31249b;
        if (this.f31248a != requestPeerType) {
            this.f31248a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747145, 2131747146);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, 2131747153, 2131747154);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(2131747156, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(2131747155, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747147, 2131747148);
                    a(requestPeerType.forum, 2131747151, 2131747152);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(2131747150, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(q6.a(org.telegram.messenger.g0.W2(gd.N0(2131747149, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.N0(2131747143, null));
                    SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(gd.N0(2131747144, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                N0 = gd.N0(2131751312, null);
                            } else {
                                N0 = gd.N0(2131751311, null);
                            }
                            c0.r(1, N0, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            c0.r(1, gd.N0(2131751300, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            c0.r(1, gd.N0(2131751307, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i7 = 2131751309;
                            } else {
                                i7 = 2131751304;
                            }
                            c0.r(1, gd.N0(i7, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            c0.r(1, gd.N0(2131751316, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            c0.r(1, gd.N0(2131751318, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            c0.r(1, gd.N0(2131751301, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            c0.r(1, gd.N0(2131751319, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            c0.r(1, gd.N0(2131751291, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            c0.r(1, gd.N0(2131744660, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            c0.r(1, gd.N0(2131748499, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(q6.a(TextUtils.concat(W22, " ", ((q6) arrayList2.get(0)).f31318b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(W2);
                            valueOf.append((CharSequence) " ");
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                if (i11 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((q6) arrayList2.get(i11)).f31318b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(q6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                o4 o4Var = new o4(getContext(), 20);
                o4Var.setText(gd.N0(2131747142, null));
                int i12 = org.telegram.ui.ActionBar.m6.f29378d6;
                org.telegram.ui.ActionBar.t6.h(i12, o4Var, null);
                addView(o4Var, c8.ma.o(-1, -2));
                View w3Var = new w3(getContext(), 9, 1);
                w3Var.setBackground(null);
                org.telegram.ui.ActionBar.t6.h(i12, w3Var, null);
                addView(w3Var, c8.ma.o(-1, -2));
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    q6 q6Var = (q6) obj;
                    Context context = getContext();
                    ai.t2 t2Var = new ai.t2(context, 3);
                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, t2Var, null);
                    t2Var.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (q6Var.f31317a <= 0) {
                        i10 = 2131231623;
                    } else {
                        i10 = 2131231624;
                    }
                    imageView.setImageResource(i10);
                    org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.L6, null, PorterDuff.Mode.MULTIPLY);
                    t2Var.addView(imageView, c8.ma.q(20, 20, 0.0f, 51, (q6Var.f31317a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29789z6, null);
                    textView.setSingleLine(false);
                    textView.setText(q6Var.f31318b);
                    t2Var.addView(textView, c8.ma.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(t2Var, c8.ma.o(-1, -2));
                }
                int i14 = org.telegram.ui.ActionBar.m6.f29378d6;
                View w3Var2 = new w3(getContext(), 12, 1);
                w3Var2.setBackground(null);
                org.telegram.ui.ActionBar.t6.h(i14, w3Var2, null);
                addView(w3Var2, c8.ma.o(-1, -2));
                Drawable Y0 = org.telegram.ui.ActionBar.m6.Y0(getContext(), 2131231230, org.telegram.ui.ActionBar.m6.f29342b7);
                View w3Var3 = new w3(getContext(), 12, 1);
                w3Var3.setBackground(Y0);
                addView(w3Var3, c8.ma.o(-1, -2));
            }
        }
    }
}
