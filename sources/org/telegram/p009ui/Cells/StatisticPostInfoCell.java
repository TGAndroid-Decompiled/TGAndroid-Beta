package org.telegram.p009ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.StatisticActivity;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$PhotoSize;

public class StatisticPostInfoCell extends FrameLayout {
    private AvatarDrawable avatarDrawable = new AvatarDrawable();
    private final TLRPC$ChatFull chat;
    private TextView date;
    private BackupImageView imageView;
    private TextView message;
    private TextView shares;
    private TextView views;

    public StatisticPostInfoCell(Context context, TLRPC$ChatFull tLRPC$ChatFull) {
        super(context);
        this.chat = tLRPC$ChatFull;
        BackupImageView backupImageView = new BackupImageView(context);
        this.imageView = backupImageView;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, 8388627, 12.0f, 0.0f, 16.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        TextView textView = new TextView(context);
        this.message = textView;
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.message.setTextSize(1, 15.0f);
        this.message.setTextColor(-16777216);
        this.message.setLines(1);
        this.message.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView2 = new TextView(context);
        this.views = textView2;
        textView2.setTextSize(1, 15.0f);
        this.views.setTextColor(-16777216);
        linearLayout2.addView(this.message, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 16, 0));
        linearLayout2.addView(this.views, LayoutHelper.createLinear(-2, -2));
        linearLayout.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 8.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.date = textView3;
        textView3.setTextSize(1, 13.0f);
        this.date.setTextColor(-16777216);
        this.date.setLines(1);
        this.date.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView4 = new TextView(context);
        this.shares = textView4;
        textView4.setTextSize(1, 13.0f);
        this.shares.setTextColor(-16777216);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.addView(this.date, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 8, 0));
        linearLayout3.addView(this.shares, LayoutHelper.createLinear(-2, -2));
        linearLayout.addView(linearLayout3, LayoutHelper.createFrame(-1, -2.0f, 8388659, 0.0f, 2.0f, 0.0f, 8.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 0, 72.0f, 0.0f, 12.0f, 0.0f));
        this.message.setTextColor(Theme.getColor("dialogTextBlack"));
        this.views.setTextColor(Theme.getColor("dialogTextBlack"));
        this.date.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
        this.shares.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
    }

    public void setData(StatisticActivity.RecentPostInfo recentPostInfo) {
        String str;
        MessageObject messageObject = recentPostInfo.message;
        ArrayList<TLRPC$PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            this.imageView.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, messageObject);
            this.imageView.setRoundRadius(AndroidUtilities.m34dp(4.0f));
        } else if (this.chat.chat_photo.sizes.size() > 0) {
            this.imageView.setImage(ImageLocation.getForPhoto(this.chat.chat_photo.sizes.get(0), this.chat.chat_photo), "50_50", (String) null, (Drawable) null, this.chat);
            this.imageView.setRoundRadius(AndroidUtilities.m34dp(46.0f) >> 1);
        }
        if (messageObject.isMusic()) {
            str = String.format("%s, %s", messageObject.getMusicTitle().trim(), messageObject.getMusicAuthor().trim());
        } else {
            CharSequence charSequence = messageObject.caption;
            if (charSequence == null) {
                charSequence = messageObject.messageText;
            }
            str = charSequence.toString();
        }
        this.message.setText(str.replace("\n", " ").trim());
        this.views.setText(String.format(LocaleController.getPluralString("Views", recentPostInfo.counters.views), AndroidUtilities.formatCount(recentPostInfo.counters.views)));
        this.date.setText(LocaleController.formatDateAudio(recentPostInfo.message.messageOwner.date, false));
        this.shares.setText(String.format(LocaleController.getPluralString("Shares", recentPostInfo.counters.forwards), AndroidUtilities.formatCount(recentPostInfo.counters.forwards)));
    }

    public void setData(StatisticActivity.MemberData memberData) {
        this.avatarDrawable.setInfo(memberData.user);
        this.imageView.setForUserOrChat(memberData.user, this.avatarDrawable);
        this.imageView.setRoundRadius(AndroidUtilities.m34dp(46.0f) >> 1);
        this.message.setText(memberData.user.first_name);
        this.date.setText(memberData.description);
        this.views.setVisibility(8);
        this.shares.setVisibility(8);
    }
}
