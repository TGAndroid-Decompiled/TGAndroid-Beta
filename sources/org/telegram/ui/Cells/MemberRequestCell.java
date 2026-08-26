package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.LayoutHelper;

public final class MemberRequestCell extends FrameLayout {
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public TLRPC.TL_chatInviteImporter importer;
    public boolean isNeedDivider;
    public final SimpleTextView nameTextView;
    public final SimpleTextView statusTextView;

    public interface OnClickListener {
        void onAddClicked(TLRPC.TL_chatInviteImporter tL_chatInviteImporter);

        void onDismissClicked(TLRPC.TL_chatInviteImporter tL_chatInviteImporter);
    }

    public MemberRequestCell(Context context, final OnClickListener onClickListener, boolean z) {
        super(context);
        final int i = 0;
        final int i2 = 1;
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(getContext());
        this.avatarImageView = backupImageView;
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.nameTextView = simpleTextView;
        SimpleTextView simpleTextView2 = new SimpleTextView(getContext());
        this.statusTextView = simpleTextView2;
        backupImageView.setRoundRadius(AndroidUtilities.dp(23.0f));
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, LocaleController.isRTL ? 5 : 3, 12.0f, 8.0f, 12.0f, 0.0f));
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setMaxLines(1);
        simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        simpleTextView.setTextSize(17);
        simpleTextView.setTypeface(AndroidUtilities.bold());
        boolean z2 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 48, z2 ? 12.0f : 74.0f, 12.0f, z2 ? 74.0f : 12.0f, 0.0f));
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView2.setMaxLines(1);
        simpleTextView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        simpleTextView2.setTextSize(14);
        boolean z3 = LocaleController.isRTL;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, -2.0f, 48, z3 ? 12.0f : 74.0f, 36.0f, z3 ? 74.0f : 12.0f, 0.0f));
        int iDp = AndroidUtilities.dp(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{16.0f}, Theme.key_featuredStickers_addButton));
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setMaxLines(1);
        textView.setPadding(iDp, 0, iDp, 0);
        textView.setText(LocaleController.getString(z ? R.string.AddToChannel : R.string.AddToGroup));
        textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        textView.setTextSize(14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final MemberRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        MemberRequestCell memberRequestCell = this.f$0;
                        MemberRequestCell.OnClickListener onClickListener2 = onClickListener;
                        if (onClickListener2 == null) {
                            memberRequestCell.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = memberRequestCell.importer;
                            if (tL_chatInviteImporter != null) {
                                onClickListener2.onAddClicked(tL_chatInviteImporter);
                            }
                        }
                        break;
                    default:
                        MemberRequestCell memberRequestCell2 = this.f$0;
                        MemberRequestCell.OnClickListener onClickListener3 = onClickListener;
                        if (onClickListener3 == null) {
                            memberRequestCell2.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = memberRequestCell2.importer;
                            if (tL_chatInviteImporter2 != null) {
                                onClickListener3.onDismissClicked(tL_chatInviteImporter2);
                            }
                        }
                        break;
                }
            }
        });
        boolean z4 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, 32.0f, z4 ? 5 : 3, z4 ? 0.0f : 73.0f, 62.0f, z4 ? 73.0f : 0.0f, 0.0f));
        float fMeasureText = textView.getPaint().measureText(textView.getText().toString()) + (iDp * 2);
        TextView textView2 = new TextView(getContext());
        int iDp2 = AndroidUtilities.dp(16.0f);
        textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, Theme.getColor(null, Theme.key_listSelector, false), -16777216));
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(iDp, 0, iDp, 0);
        textView2.setText(LocaleController.getString(R.string.Dismiss));
        textView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false));
        textView2.setTextSize(14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final MemberRequestCell f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        MemberRequestCell memberRequestCell = this.f$0;
                        MemberRequestCell.OnClickListener onClickListener2 = onClickListener;
                        if (onClickListener2 == null) {
                            memberRequestCell.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = memberRequestCell.importer;
                            if (tL_chatInviteImporter != null) {
                                onClickListener2.onAddClicked(tL_chatInviteImporter);
                            }
                        }
                        break;
                    default:
                        MemberRequestCell memberRequestCell2 = this.f$0;
                        MemberRequestCell.OnClickListener onClickListener3 = onClickListener;
                        if (onClickListener3 == null) {
                            memberRequestCell2.getClass();
                        } else {
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = memberRequestCell2.importer;
                            if (tL_chatInviteImporter2 != null) {
                                onClickListener3.onDismissClicked(tL_chatInviteImporter2);
                            }
                        }
                        break;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, AndroidUtilities.dp(32.0f), LocaleController.isRTL ? 5 : 3);
        layoutParams.topMargin = AndroidUtilities.dp(62.0f);
        layoutParams.leftMargin = LocaleController.isRTL ? 0 : (int) (AndroidUtilities.dp(79.0f) + fMeasureText);
        layoutParams.rightMargin = LocaleController.isRTL ? (int) (fMeasureText + AndroidUtilities.dp(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public BackupImageView getAvatarImageView() {
        return this.avatarImageView;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.importer;
    }

    public String getStatus() {
        return this.statusTextView.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isNeedDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(72.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(107.0f), 1073741824));
    }
}
