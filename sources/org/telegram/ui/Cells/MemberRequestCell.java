package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC$TL_chatInviteImporter;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public class MemberRequestCell extends FrameLayout {
    private final AvatarDrawable avatarDrawable = new AvatarDrawable();
    private final BackupImageView avatarImageView;
    private TLRPC$TL_chatInviteImporter importer;
    private boolean isNeedDivider;
    private final SimpleTextView nameTextView;
    private final SimpleTextView statusTextView;

    public interface OnClickListener {
        void onAddClicked(TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter);

        void onDismissClicked(TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter);
    }

    public MemberRequestCell(Context context, final OnClickListener onClickListener, boolean z) {
        super(context);
        String str;
        int i;
        BackupImageView backupImageView = new BackupImageView(getContext());
        this.avatarImageView = backupImageView;
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.nameTextView = simpleTextView;
        SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
        this.statusTextView = simpleTextView2;
        backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
        int i2 = 5;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, LocaleController.isRTL ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setMaxLines(1);
        simpleTextView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        simpleTextView.setTextSize(17);
        simpleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        boolean z2 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, z2 ? 12.0f : 74.0f, 12.0f, z2 ? 74.0f : 12.0f, 0.0f));
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView2.setMaxLines(1);
        simpleTextView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        simpleTextView2.setTextSize(14);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, -2.0f, 48, z3 ? 12.0f : 74.0f, 36.0f, z3 ? 74.0f : 12.0f, 0.0f));
        int dp = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        int i3 = 0;
        textView.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 4.0f));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(dp, 0, dp, 0);
        if (z) {
            i = R.string.AddToChannel;
            str = "AddToChannel";
        } else {
            i = R.string.AddToGroup;
            str = "AddToGroup";
        }
        textView.setText(LocaleController.getString(str, i));
        textView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MemberRequestCell.this.lambda$new$0(onClickListener, view);
            }
        });
        boolean z4 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, 32.0f, z4 ? 5 : 3, z4 ? 0.0f : 73.0f, 62.0f, z4 ? 73.0f : 0.0f, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (dp * 2);
        TextView textView2 = new TextView(getContext());
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(4.0f), 0, Theme.getColor("listSelectorSDK21"), -16777216));
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(dp, 0, dp, 0);
        textView2.setText(LocaleController.getString("Dismiss", R.string.Dismiss));
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText"));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MemberRequestCell.this.lambda$new$1(onClickListener, view);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, AndroidUtilities.dp(32.0f), !LocaleController.isRTL ? 3 : i2);
        layoutParams.topMargin = AndroidUtilities.dp(62.0f);
        layoutParams.leftMargin = LocaleController.isRTL ? 0 : (int) (AndroidUtilities.dp(79.0f) + measureText);
        layoutParams.rightMargin = LocaleController.isRTL ? (int) (measureText + AndroidUtilities.dp(79.0f)) : i3;
        addView(textView2, layoutParams);
    }

    public void lambda$new$0(OnClickListener onClickListener, View view) {
        TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter;
        if (onClickListener != null && (tLRPC$TL_chatInviteImporter = this.importer) != null) {
            onClickListener.onAddClicked(tLRPC$TL_chatInviteImporter);
        }
    }

    public void lambda$new$1(OnClickListener onClickListener, View view) {
        TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter;
        if (onClickListener != null && (tLRPC$TL_chatInviteImporter = this.importer) != null) {
            onClickListener.onDismissClicked(tLRPC$TL_chatInviteImporter);
        }
    }

    public void setData(LongSparseArray<TLRPC$User> longSparseArray, TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, boolean z) {
        this.importer = tLRPC$TL_chatInviteImporter;
        this.isNeedDivider = z;
        setWillNotDraw(!z);
        TLRPC$User tLRPC$User = longSparseArray.get(tLRPC$TL_chatInviteImporter.user_id);
        this.avatarDrawable.setInfo(tLRPC$User);
        this.avatarImageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
        this.nameTextView.setText(UserObject.getUserName(tLRPC$User));
        String formatDateAudio = LocaleController.formatDateAudio(tLRPC$TL_chatInviteImporter.date, false);
        long j = tLRPC$TL_chatInviteImporter.approved_by;
        if (j == 0) {
            this.statusTextView.setText(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio));
            return;
        }
        TLRPC$User tLRPC$User2 = longSparseArray.get(j);
        if (tLRPC$User2 != null) {
            this.statusTextView.setText(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(tLRPC$User2), formatDateAudio));
        } else {
            this.statusTextView.setText("");
        }
    }

    public TLRPC$TL_chatInviteImporter getImporter() {
        return this.importer;
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public String getStatus() {
        return this.statusTextView.getText().toString();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isNeedDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }
}
