package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q6 extends LinearLayout {
    public static final int f22778c = 0;
    public TLRPC.RequestPeerType f22779a;
    public ArrayList f22780b;

    public final void a(Boolean bool, int i10, int i11) {
        ArrayList arrayList = this.f22780b;
        if (bool != null) {
            if (bool.booleanValue()) {
                arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(i10))));
            } else {
                arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(i11))));
            }
        }
    }

    public void set(TLRPC.RequestPeerType requestPeerType) {
        int i10;
        String string;
        int i11;
        ArrayList arrayList = this.f22780b;
        if (this.f22779a != requestPeerType) {
            this.f22779a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, R.string.PeerRequirementPremiumTrue, R.string.PeerRequirementPremiumFalse);
            } else {
                boolean z10 = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z10) {
                    a(requestPeerType.has_username, R.string.PeerRequirementChannelPublicTrue, R.string.PeerRequirementChannelPublicFalse);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    a(requestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    a(requestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(r6.a(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    int i12 = R.string.PeerRequirementUserRights;
                    int i13 = R.string.PeerRequirementUserRight;
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i12));
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(i13));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            if (z10) {
                                string = LocaleController.getString(R.string.EditAdminChangeChannelInfo);
                            } else {
                                string = LocaleController.getString(R.string.EditAdminChangeGroupInfo);
                            }
                            t0.o(1, string, arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z10) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminPostMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z10) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminEditMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            if (z10) {
                                i10 = R.string.EditAdminDeleteMessages;
                            } else {
                                i10 = R.string.EditAdminGroupDeleteMessages;
                            }
                            t0.o(1, LocaleController.getString(i10), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z10) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminBanUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminAddUsers), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z10) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminPinMessages), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminAddAdmins), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z10) {
                            t0.o(1, LocaleController.getString(R.string.EditAdminSendAnonymously), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            t0.o(1, LocaleController.getString(R.string.StartVoipChatPermission), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z10) {
                            t0.o(1, LocaleController.getString(R.string.ManageTopicsPermission), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(r6.a(TextUtils.concat(replaceTags2, " ", ((r6) arrayList2.get(0)).f22948b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(replaceTags);
                            valueOf.append((CharSequence) " ");
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                if (i14 > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((r6) arrayList2.get(i14)).f22948b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(r6.a(valueOf));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                l4 l4Var = new l4(getContext(), 20);
                l4Var.setText(LocaleController.getString(R.string.PeerRequirements));
                int i15 = org.telegram.ui.ActionBar.h6.f20986d6;
                l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                addView(l4Var, w7.z5.n(-1, -2));
                Drawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                View s3Var = new s3(getContext(), 9, 1);
                s3Var.setBackground(colorDrawable);
                addView(s3Var, w7.z5.n(-1, -2));
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList.get(i16);
                    i16++;
                    r6 r6Var = (r6) obj;
                    Context context = getContext();
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    if (r6Var.f22947a <= 0) {
                        i11 = R.drawable.list_check;
                    } else {
                        i11 = R.drawable.list_circle;
                    }
                    imageView.setImageResource(i11);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L6, false), PorterDuff.Mode.MULTIPLY));
                    linearLayout.addView(imageView, w7.z5.p(20, 20, 0.0f, 51, (r6Var.f22947a * 16) + 17, -1, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21391z6, false));
                    textView.setSingleLine(false);
                    textView.setText(r6Var.f22948b);
                    linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 6, 4, 24, 4));
                    addView(linearLayout, w7.z5.n(-1, -2));
                }
                Drawable colorDrawable2 = new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                View s3Var2 = new s3(getContext(), 12, 1);
                s3Var2.setBackground(colorDrawable2);
                addView(s3Var2, w7.z5.n(-1, -2));
                Drawable W0 = org.telegram.ui.ActionBar.h6.W0(getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7);
                View s3Var3 = new s3(getContext(), 12, 1);
                s3Var3.setBackground(W0);
                addView(s3Var3, w7.z5.n(-1, -2));
            }
        }
    }
}
