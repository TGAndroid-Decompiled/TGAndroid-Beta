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
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$RequestPeerType;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeBroadcast;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeUser;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
public class RequestPeerRequirementsCell extends LinearLayout {
    private TLRPC$RequestPeerType requestPeerType;
    private ArrayList<Requirement> requirements;

    public RequestPeerRequirementsCell(Context context) {
        super(context);
        this.requirements = new ArrayList<>();
        setOrientation(1);
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
    }

    public void set(TLRPC$RequestPeerType tLRPC$RequestPeerType) {
        if (this.requestPeerType != tLRPC$RequestPeerType) {
            this.requestPeerType = tLRPC$RequestPeerType;
            removeAllViews();
            this.requirements.clear();
            if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeUser) {
                checkRequirement(((TLRPC$TL_requestPeerTypeUser) tLRPC$RequestPeerType).premium, R.string.PeerRequirementPremiumTrue, R.string.PeerRequirementPremiumFalse);
            } else {
                boolean z = tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeBroadcast;
                if (z) {
                    checkRequirement(tLRPC$RequestPeerType.has_username, R.string.PeerRequirementChannelPublicTrue, R.string.PeerRequirementChannelPublicFalse);
                    Boolean bool = tLRPC$RequestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelBotParticipant))));
                    }
                    Boolean bool2 = tLRPC$RequestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementChannelCreatorTrue))));
                    }
                } else {
                    checkRequirement(tLRPC$RequestPeerType.has_username, R.string.PeerRequirementGroupPublicTrue, R.string.PeerRequirementGroupPublicFalse);
                    checkRequirement(tLRPC$RequestPeerType.forum, R.string.PeerRequirementForumTrue, R.string.PeerRequirementForumFalse);
                    Boolean bool3 = tLRPC$RequestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupBotParticipant))));
                    }
                    Boolean bool4 = tLRPC$RequestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PeerRequirementGroupCreatorTrue))));
                    }
                }
                Boolean bool5 = tLRPC$RequestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    checkAdminRights(tLRPC$RequestPeerType.user_admin_rights, z, R.string.PeerRequirementUserRights, R.string.PeerRequirementUserRight);
                }
            }
            if (this.requirements.isEmpty()) {
                return;
            }
            HeaderCell headerCell = new HeaderCell(getContext(), 20);
            headerCell.setText(LocaleController.getString("PeerRequirements", R.string.PeerRequirements));
            int i = Theme.key_windowBackgroundWhite;
            headerCell.setBackgroundColor(Theme.getColor(i));
            addView(headerCell, LayoutHelper.createLinear(-1, -2));
            addView(emptyView(9, Theme.getColor(i)), LayoutHelper.createLinear(-1, -2));
            Iterator<Requirement> it = this.requirements.iterator();
            while (it.hasNext()) {
                addView(new RequirementCell(this, getContext(), it.next()), LayoutHelper.createLinear(-1, -2));
            }
            addView(emptyView(12, Theme.getColor(Theme.key_windowBackgroundWhite)), LayoutHelper.createLinear(-1, -2));
            addView(emptyView(12, Theme.getThemedDrawableByKey(getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)), LayoutHelper.createLinear(-1, -2));
        }
    }

    private View emptyView(int i, int i2) {
        return emptyView(i, new ColorDrawable(i2));
    }

    private View emptyView(final int i, Drawable drawable) {
        View view = new View(this, getContext()) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i), 1073741824));
            }
        };
        view.setBackground(drawable);
        return view;
    }

    private void checkRequirement(Boolean bool, int i, int i2) {
        if (bool != null) {
            if (bool.booleanValue()) {
                this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(i))));
            } else {
                this.requirements.add(Requirement.make(AndroidUtilities.replaceTags(LocaleController.getString(i2))));
            }
        }
    }

    public static CharSequence rightsToString(TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, boolean z) {
        int i;
        String str;
        String string;
        ArrayList arrayList = new ArrayList();
        if (tLRPC$TL_chatAdminRights.change_info) {
            if (z) {
                string = LocaleController.getString("EditAdminChangeChannelInfo", R.string.EditAdminChangeChannelInfo);
            } else {
                string = LocaleController.getString("EditAdminChangeGroupInfo", R.string.EditAdminChangeGroupInfo);
            }
            arrayList.add(Requirement.make(1, string));
        }
        if (tLRPC$TL_chatAdminRights.post_messages && z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminPostMessages", R.string.EditAdminPostMessages)));
        }
        if (tLRPC$TL_chatAdminRights.edit_messages && z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminEditMessages", R.string.EditAdminEditMessages)));
        }
        if (tLRPC$TL_chatAdminRights.delete_messages) {
            if (z) {
                i = R.string.EditAdminDeleteMessages;
                str = "EditAdminDeleteMessages";
            } else {
                i = R.string.EditAdminGroupDeleteMessages;
                str = "EditAdminGroupDeleteMessages";
            }
            arrayList.add(Requirement.make(1, LocaleController.getString(str, i)));
        }
        if (tLRPC$TL_chatAdminRights.ban_users && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminBanUsers", R.string.EditAdminBanUsers)));
        }
        if (tLRPC$TL_chatAdminRights.invite_users) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminAddUsers", R.string.EditAdminAddUsers)));
        }
        if (tLRPC$TL_chatAdminRights.pin_messages && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminPinMessages", R.string.EditAdminPinMessages)));
        }
        if (tLRPC$TL_chatAdminRights.add_admins) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminAddAdmins", R.string.EditAdminAddAdmins)));
        }
        if (tLRPC$TL_chatAdminRights.anonymous && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminSendAnonymously", R.string.EditAdminSendAnonymously)));
        }
        if (tLRPC$TL_chatAdminRights.manage_call) {
            arrayList.add(Requirement.make(1, LocaleController.getString("StartVoipChatPermission", R.string.StartVoipChatPermission)));
        }
        if (tLRPC$TL_chatAdminRights.manage_topics && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("ManageTopicsPermission", R.string.ManageTopicsPermission)));
        }
        if (arrayList.size() == 1) {
            return ((Requirement) arrayList.get(0)).text.toString().toLowerCase();
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i2 > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) ((Requirement) arrayList.get(i2)).text.toString().toLowerCase());
        }
        return spannableStringBuilder;
    }

    private void checkAdminRights(TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, boolean z, CharSequence charSequence, CharSequence charSequence2) {
        int i;
        String str;
        String string;
        if (tLRPC$TL_chatAdminRights == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (tLRPC$TL_chatAdminRights.change_info) {
            if (z) {
                string = LocaleController.getString("EditAdminChangeChannelInfo", R.string.EditAdminChangeChannelInfo);
            } else {
                string = LocaleController.getString("EditAdminChangeGroupInfo", R.string.EditAdminChangeGroupInfo);
            }
            arrayList.add(Requirement.make(1, string));
        }
        if (tLRPC$TL_chatAdminRights.post_messages && z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminPostMessages", R.string.EditAdminPostMessages)));
        }
        if (tLRPC$TL_chatAdminRights.edit_messages && z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminEditMessages", R.string.EditAdminEditMessages)));
        }
        if (tLRPC$TL_chatAdminRights.delete_messages) {
            if (z) {
                i = R.string.EditAdminDeleteMessages;
                str = "EditAdminDeleteMessages";
            } else {
                i = R.string.EditAdminGroupDeleteMessages;
                str = "EditAdminGroupDeleteMessages";
            }
            arrayList.add(Requirement.make(1, LocaleController.getString(str, i)));
        }
        if (tLRPC$TL_chatAdminRights.ban_users && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminBanUsers", R.string.EditAdminBanUsers)));
        }
        if (tLRPC$TL_chatAdminRights.invite_users) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminAddUsers", R.string.EditAdminAddUsers)));
        }
        if (tLRPC$TL_chatAdminRights.pin_messages && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminPinMessages", R.string.EditAdminPinMessages)));
        }
        if (tLRPC$TL_chatAdminRights.add_admins) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminAddAdmins", R.string.EditAdminAddAdmins)));
        }
        if (tLRPC$TL_chatAdminRights.anonymous && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("EditAdminSendAnonymously", R.string.EditAdminSendAnonymously)));
        }
        if (tLRPC$TL_chatAdminRights.manage_call) {
            arrayList.add(Requirement.make(1, LocaleController.getString("StartVoipChatPermission", R.string.StartVoipChatPermission)));
        }
        if (tLRPC$TL_chatAdminRights.manage_topics && !z) {
            arrayList.add(Requirement.make(1, LocaleController.getString("ManageTopicsPermission", R.string.ManageTopicsPermission)));
        }
        if (arrayList.size() == 1) {
            this.requirements.add(Requirement.make(TextUtils.concat(charSequence2, " ", ((Requirement) arrayList.get(0)).text)));
        } else if (!arrayList.isEmpty()) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.append((CharSequence) " ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    valueOf.append((CharSequence) ", ");
                }
                valueOf.append((CharSequence) ((Requirement) arrayList.get(i2)).text.toString().toLowerCase());
            }
            valueOf.append((CharSequence) ".");
            this.requirements.add(Requirement.make(valueOf));
        }
    }

    private void checkAdminRights(TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights, boolean z, int i, int i2) {
        checkAdminRights(tLRPC$TL_chatAdminRights, z, AndroidUtilities.replaceTags(LocaleController.getString(i)), AndroidUtilities.replaceTags(LocaleController.getString(i2)));
    }

    class RequirementCell extends LinearLayout {
        private ImageView imageView;
        private TextView textView;

        public RequirementCell(RequestPeerRequirementsCell requestPeerRequirementsCell, Context context, Requirement requirement) {
            super(context);
            setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            setOrientation(0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setImageResource(requirement.padding <= 0 ? R.drawable.list_check : R.drawable.list_circle);
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader), PorterDuff.Mode.MULTIPLY));
            addView(this.imageView, LayoutHelper.createLinear(20, 20, 0.0f, 51, (requirement.padding * 16) + 17, -1, 0, 0));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            this.textView.setSingleLine(false);
            this.textView.setText(requirement.text);
            addView(this.textView, LayoutHelper.createLinear(-1, -2, 1, 6, 4, 24, 4));
        }
    }
}
