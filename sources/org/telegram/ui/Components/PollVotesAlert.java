package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

public final class PollVotesAlert extends BottomSheet {
    public static final ChatActivity.AnonymousClass5 USER_CELL_PROPERTY = new ChatActivity.AnonymousClass5("placeholderAlpha", 12);
    public final AnonymousClass7 actionBar;
    public AnimatorSet actionBarAnimation;
    public final View actionBarShadow;
    public float gradientWidth;
    public final Adapter listAdapter;
    public final AnonymousClass4 listView;
    public final HashSet loadingMore;
    public boolean loadingResults;
    public final TLRPC.TL_messageMediaPoll messageMediaPoll;
    public final MessageObject messageObject;
    public final TLRPC.InputPeer peer;
    public LinearGradient placeholderGradient;
    public Matrix placeholderMatrix;
    public final Paint placeholderPaint;
    public final TLRPC.Poll poll;
    public final ArrayList queries;
    public final RectF rect;
    public int scrollOffsetY;
    public final Drawable shadowDrawable;
    public final AnimatedEmojiSpan.TextViewEmojis titleTextView;
    public float totalTranslation;
    public final ArrayList voters;
    public final HashMap votesPercents;

    public final class Adapter extends RecyclerListView.SectionsAdapter {
        public final Context mContext;

        public final class AnonymousClass1 extends SectionCell {
            public AnonymousClass1(Context context) {
                super(context);
            }
        }

        public Adapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getCountForSection(int i) {
            int i2 = 1;
            if (i == 0) {
                return 1;
            }
            VotesList votesList = (VotesList) PollVotesAlert.this.voters.get(i - 1);
            int count = votesList.getCount() + 1;
            if (TextUtils.isEmpty(votesList.next_offset) && !votesList.collapsed) {
                i2 = 0;
            }
            return count + i2;
        }

        @Override
        public final Object getItem(int i, int i2) {
            int i3;
            if (i == 0) {
                return 293145;
            }
            int i4 = i - 1;
            if (i2 == 0) {
                return -928312;
            }
            if (i4 >= 0) {
                PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                if (i4 < pollVotesAlert.voters.size() && (i3 = i2 - 1) < ((VotesList) pollVotesAlert.voters.get(i4)).getCount()) {
                    return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((VotesList) pollVotesAlert.voters.get(i4)).votes.get(i3)).peer))));
                }
            }
            return -182734;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            if (i2 == 0) {
                return 2;
            }
            return i2 + (-1) < ((VotesList) PollVotesAlert.this.voters.get(i + (-1))).getCount() ? 0 : 3;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            return PollVotesAlert.this.voters.size() + 1;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            TLRPC.Message message;
            if (view == null) {
                view = new AnonymousClass1(this.mContext);
            }
            SectionCell sectionCell = (SectionCell) view;
            if (i == 0) {
                sectionCell.setAlpha(0.0f);
                return view;
            }
            view.setAlpha(1.0f);
            PollVotesAlert pollVotesAlert = PollVotesAlert.this;
            VotesList votesList = (VotesList) pollVotesAlert.voters.get(i - 1);
            int size = pollVotesAlert.poll.answers.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.PollAnswer pollAnswer = pollVotesAlert.poll.answers.get(i2);
                if (Arrays.equals(pollAnswer.option, votesList.option) && ((Button) pollVotesAlert.votesPercents.get(votesList)) != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    MessageObject messageObject = pollVotesAlert.messageObject;
                    if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                        for (int i3 = 0; i3 < pollVotesAlert.messageObject.messageOwner.translatedPoll.answers.size(); i3++) {
                            TLRPC.PollAnswer pollAnswer2 = pollVotesAlert.messageObject.messageOwner.translatedPoll.answers.get(i3);
                            if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                tL_textWithEntities = pollAnswer2.text;
                                break;
                            }
                        }
                    }
                    String str = tL_textWithEntities == null ? "" : tL_textWithEntities.text;
                    ArrayList<TLRPC.MessageEntity> arrayList = tL_textWithEntities == null ? null : tL_textWithEntities.entities;
                    int iCalcPercent = pollVotesAlert.calcPercent(votesList.option);
                    sectionCell.setText(str, arrayList, iCalcPercent, votesList.count, votesList.votes.size() > 15 ? votesList.collapsed ? 1 : 2 : 0, false);
                    sectionCell.setTag(R.id.object_tag, votesList);
                    return view;
                }
            }
            return view;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (i == 0 || i2 == 0) {
                return false;
            }
            ArrayList arrayList = PollVotesAlert.this.queries;
            return arrayList == null || arrayList.isEmpty();
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            TLRPC.Message message;
            int i3 = viewHolder.mItemViewType;
            PollVotesAlert pollVotesAlert = PollVotesAlert.this;
            View view = viewHolder.itemView;
            if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                VotesList votesList = (VotesList) pollVotesAlert.voters.get(i - 1);
                ((TextCell) view).setTextAndIcon(R.drawable.arrow_more, (CharSequence) LocaleController.formatPluralString("ShowVotes", votesList.count - votesList.getCount(), new Object[0]), false);
                return;
            }
            SectionCell sectionCell = (SectionCell) view;
            VotesList votesList2 = (VotesList) pollVotesAlert.voters.get(i - 1);
            TLRPC.Poll poll = pollVotesAlert.poll;
            int size = poll.answers.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC.PollAnswer pollAnswer = poll.answers.get(i4);
                byte[] bArr = pollAnswer.option;
                byte[] bArr2 = votesList2.option;
                if (Arrays.equals(bArr, bArr2) && ((Button) pollVotesAlert.votesPercents.get(votesList2)) != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    MessageObject messageObject = pollVotesAlert.messageObject;
                    if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                        for (int i5 = 0; i5 < messageObject.messageOwner.translatedPoll.answers.size(); i5++) {
                            TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i5);
                            if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                tL_textWithEntities = pollAnswer2.text;
                                break;
                            }
                        }
                    }
                    sectionCell.setText(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, pollVotesAlert.calcPercent(bArr2), votesList2.count, votesList2.votes.size() <= 15 ? 0 : votesList2.collapsed ? 1 : 2, false);
                    sectionCell.setTag(R.id.object_tag, votesList2);
                    return;
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis;
            Context context = this.mContext;
            PollVotesAlert pollVotesAlert = PollVotesAlert.this;
            if (i == 0) {
                userCell = pollVotesAlert.new UserCell(context);
            } else if (i == 1) {
                ViewParent parent = pollVotesAlert.titleTextView.getParent();
                textViewEmojis = pollVotesAlert.titleTextView;
                if (parent != null) {
                    userCell = textViewEmojis;
                    ((ViewGroup) textViewEmojis.getParent()).removeView(textViewEmojis);
                    userCell = textViewEmojis;
                }
            } else if (i != 2) {
                TextCell textCell = new TextCell(23, this.mContext, null, true, false);
                textCell.setOffsetFromImage(65);
                textCell.setBackgroundColor(pollVotesAlert.getThemedColor(Theme.key_dialogBackground));
                textCell.setColors(Theme.key_switchTrackChecked, Theme.key_windowBackgroundWhiteBlueText4);
                userCell = textCell;
            } else {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
                anonymousClass1.setTag(-33024);
                userCell = anonymousClass1;
            }
            userCell = textViewEmojis;
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 0) {
                int adapterPosition = viewHolder.getAdapterPosition();
                int sectionForPosition = getSectionForPosition(adapterPosition);
                int positionInSectionForPosition = getPositionInSectionForPosition(adapterPosition) - 1;
                UserCell userCell = (UserCell) viewHolder.itemView;
                PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                VotesList votesList = (VotesList) pollVotesAlert.voters.get(sectionForPosition - 1);
                TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) votesList.votes.get(positionInSectionForPosition);
                TLObject userOrChat = pollVotesAlert.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(messagePeerVote.peer));
                int i = messagePeerVote.date;
                boolean z = (positionInSectionForPosition == votesList.getCount() - 1 && TextUtils.isEmpty(votesList.next_offset) && !votesList.collapsed) ? false : true;
                userCell.getClass();
                if (userOrChat instanceof TLRPC.User) {
                    userCell.currentUser = (TLRPC.User) userOrChat;
                    userCell.currentChat = null;
                } else if (userOrChat instanceof TLRPC.Chat) {
                    userCell.currentChat = (TLRPC.Chat) userOrChat;
                    userCell.currentUser = null;
                } else {
                    userCell.currentUser = null;
                    userCell.currentChat = null;
                }
                long j = i;
                userCell.timeTextView.setText(LocaleController.getInstance().getFormatterDay().format(1000 * j));
                userCell.dateTextView.setText(LocaleController.formatDate(j, true));
                userCell.needDivider = z;
                userCell.drawPlaceholder = userOrChat == null;
                userCell.placeholderNum = positionInSectionForPosition;
                BackupImageView backupImageView = userCell.avatarImageView;
                SimpleTextView simpleTextView = userCell.nameTextView;
                if (userOrChat == null) {
                    simpleTextView.setText("", false);
                    backupImageView.setImageDrawable(null);
                } else {
                    TLRPC.User user = userCell.currentUser;
                    if (user != null) {
                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                    }
                    AvatarDrawable avatarDrawable = userCell.avatarDrawable;
                    int i2 = userCell.currentAccount;
                    if (user != null) {
                        avatarDrawable.setInfo(i2, user);
                        TLRPC.UserStatus userStatus = userCell.currentUser.status;
                    } else {
                        TLRPC.Chat chat = userCell.currentChat;
                        if (chat != null) {
                            avatarDrawable.setInfo(i2, chat);
                        }
                    }
                    TLRPC.User user2 = userCell.currentUser;
                    if (user2 != null) {
                        String userName = UserObject.getUserName(user2);
                        userCell.lastName = userName;
                        userCell.lastName = Emoji.replaceEmoji(userName, simpleTextView.getPaint().getFontMetricsInt(), false);
                    } else {
                        TLRPC.Chat chat2 = userCell.currentChat;
                        if (chat2 != null) {
                            String str = chat2.title;
                            userCell.lastName = str;
                            userCell.lastName = Emoji.replaceEmoji(str, simpleTextView.getPaint().getFontMetricsInt(), false);
                        } else {
                            userCell.lastName = "";
                        }
                    }
                    simpleTextView.setText(userCell.lastName, false);
                    simpleTextView.setRightDrawable(userCell.statusBadgeComponent.updateDrawable(userCell.currentUser, userCell.currentChat, Theme.getColor(Theme.key_chats_verifiedBackground, ((BottomSheet) PollVotesAlert.this).resourcesProvider), false));
                    TLRPC.Chat chat3 = userCell.currentChat;
                    if (chat3 != null) {
                        backupImageView.imageReceiver.setForUserOrChat(chat3, avatarDrawable);
                        backupImageView.onNewImageSet();
                    } else {
                        TLRPC.User user3 = userCell.currentUser;
                        if (user3 != null) {
                            backupImageView.imageReceiver.setForUserOrChat(user3, avatarDrawable);
                            backupImageView.onNewImageSet();
                        } else {
                            backupImageView.setImageDrawable(avatarDrawable);
                        }
                    }
                }
                ArrayList arrayList = userCell.animators;
                if (arrayList == null) {
                    if (userCell.drawPlaceholder) {
                        return;
                    }
                    userCell.placeholderAlpha = 0.0f;
                } else {
                    Property property = View.ALPHA;
                    arrayList.add(ObjectAnimator.ofFloat(backupImageView, (Property<BackupImageView, Float>) property, 0.0f, 1.0f));
                    userCell.animators.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) property, 0.0f, 1.0f));
                    userCell.animators.add(ObjectAnimator.ofFloat(userCell, PollVotesAlert.USER_CELL_PROPERTY, 1.0f, 0.0f));
                }
            }
        }
    }

    public final class Button {
        public float decimal;
    }

    public abstract class SectionCell extends FrameLayout {
        public final TextView middleTextView;
        public final CheckBoxCell.AnonymousClass1 righTextView;
        public final AnimatedEmojiSpan.TextViewEmojis textView;

        public SectionCell(Context context) {
            super(context);
            setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackgroundGray, false));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(getContext());
            this.textView = textViewEmojis;
            textViewEmojis.setTextSize(1, 14.0f);
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            int i = Theme.key_graySectionText;
            textViewEmojis.setTextColor(Theme.getColor(null, i, false));
            textViewEmojis.setSingleLine(true);
            textViewEmojis.setEllipsize(TextUtils.TruncateAt.END);
            textViewEmojis.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView = new TextView(getContext());
            this.middleTextView = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            CheckBoxCell.AnonymousClass1 anonymousClass1 = new CheckBoxCell.AnonymousClass1((Adapter.AnonymousClass1) this, getContext(), 1);
            this.righTextView = anonymousClass1;
            anonymousClass1.setTextSize(AndroidUtilities.dp(14.0f));
            anonymousClass1.setTextColor(Theme.getColor(null, i, false));
            anonymousClass1.setGravity(LocaleController.isRTL ? 3 : 5);
            anonymousClass1.setOnClickListener(new SearchField$$ExternalSyntheticLambda0((Adapter.AnonymousClass1) this, 15));
            boolean z = LocaleController.isRTL;
            addView(textViewEmojis, LayoutHelper.createFrame(-2, -1.0f, (z ? 5 : 3) | 48, z ? 0 : 16, 0.0f, z ? 16 : 0, 0.0f));
            addView(textView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(anonymousClass1, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            boolean z2 = LocaleController.isRTL;
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            TextView textView = this.middleTextView;
            if (z2) {
                int left = textViewEmojis.getLeft() - textView.getMeasuredWidth();
                textView.layout(left, textView.getTop(), textView.getMeasuredWidth() + left, textView.getBottom());
            } else {
                int right = textViewEmojis.getRight();
                textView.layout(right, textView.getTop(), textView.getMeasuredWidth() + right, textView.getBottom());
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
            TextView textView = this.middleTextView;
            measureChildWithMargins(textView, i, 0, iMakeMeasureSpec, 0);
            measureChildWithMargins(this.righTextView, i, 0, iMakeMeasureSpec, 0);
            measureChildWithMargins(this.textView, i, AndroidUtilities.dp(32.0f) + this.righTextView.getMeasuredWidth() + textView.getMeasuredWidth(), iMakeMeasureSpec, 0);
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(32.0f));
        }

        public final void setText(String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
            if (arrayList != null) {
                NotificationCenter.listenEmojiLoading(textViewEmojis);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, str, spannableStringBuilder);
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textViewEmojis.getPaint().getFontMetricsInt(), false);
                MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, textViewEmojis.getPaint().getFontMetricsInt());
                textViewEmojis.setText(charSequenceReplaceEmoji);
            } else {
                textViewEmojis.setText(Emoji.replaceEmoji(str, textViewEmojis.getPaint().getFontMetricsInt(), false));
            }
            String str2 = String.format("%d", Integer.valueOf(i));
            SpannableStringBuilder spannableStringBuilder2 = LocaleController.isRTL ? new SpannableStringBuilder(RendererCapabilities.CC.m(i, "% – ")) : new SpannableStringBuilder(SurfaceContainer$$ExternalSyntheticOutline0.m(i, " – ", "%"));
            spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 3, str2.length() + 3, 33);
            this.middleTextView.setText(spannableStringBuilder2);
            CheckBoxCell.AnonymousClass1 anonymousClass1 = this.righTextView;
            if (i3 == 0) {
                if (PollVotesAlert.this.poll.quiz) {
                    anonymousClass1.setText(LocaleController.formatPluralString("Answer", i2, new Object[0]), z, true);
                    return;
                } else {
                    anonymousClass1.setText(LocaleController.formatPluralString("Vote", i2, new Object[0]), z, true);
                    return;
                }
            }
            if (i3 == 1) {
                anonymousClass1.setText(LocaleController.getString(R.string.PollExpand), z, true);
            } else {
                anonymousClass1.setText(LocaleController.getString(R.string.PollCollapse), z, true);
            }
        }
    }

    public final class UserCell extends LinearLayout {
        public ArrayList animators;
        public final AvatarDrawable avatarDrawable;
        public final BackupImageView avatarImageView;
        public final int currentAccount;
        public TLRPC.Chat currentChat;
        public TLRPC.User currentUser;
        public final TextView dateTextView;
        public boolean drawPlaceholder;
        public CharSequence lastName;
        public final SimpleTextView nameTextView;
        public boolean needDivider;
        public float placeholderAlpha;
        public int placeholderNum;
        public final StatusBadgeComponent statusBadgeComponent;
        public final TextView timeTextView;

        public UserCell(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            this.placeholderAlpha = 1.0f;
            setOrientation(0);
            setLayoutDirection(3);
            setWillNotDraw(false);
            setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
            addView(backupImageView, LayoutHelper.createLinear(34, 34, 16, 0, 0, 11, 0));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.nameTextView = simpleTextView;
            int i = Theme.key_dialogTextBlack;
            simpleTextView.setTextColor(Theme.getColor(null, i, false));
            simpleTextView.setTypeface(AndroidUtilities.bold());
            simpleTextView.setTextSize(16);
            simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            addView(simpleTextView, LayoutHelper.createLinear(0, 24, 1.0f, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            this.dateTextView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray3, false));
            textView.setTextSize(1, 13.0f);
            addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 21, 4, 0, 2, 0));
            TextView textView2 = new TextView(context);
            this.timeTextView = textView2;
            textView2.setTextColor(Theme.getColor(null, i, false));
            textView2.setTextSize(1, 13.0f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 21, 2, 0, 4, 0));
            this.statusBadgeComponent = new StatusBadgeComponent(20, simpleTextView);
        }

        public float getPlaceholderAlpha() {
            return this.placeholderAlpha;
        }

        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.statusBadgeComponent.statusDrawable.attach();
        }

        @Override
        public final void onDetachedFromWindow() {
            this.statusBadgeComponent.statusDrawable.detach();
            super.onDetachedFromWindow();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            int iDp3;
            int iDp4;
            if (this.drawPlaceholder || this.placeholderAlpha != 0.0f) {
                PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                pollVotesAlert.placeholderPaint.setAlpha((int) (this.placeholderAlpha * 255.0f));
                BackupImageView backupImageView = this.avatarImageView;
                int measuredWidth = (backupImageView.getMeasuredWidth() / 2) + backupImageView.getLeft();
                int measuredHeight = (backupImageView.getMeasuredHeight() / 2) + backupImageView.getTop();
                canvas.drawCircle(measuredWidth, measuredHeight, backupImageView.getMeasuredWidth() / 2, pollVotesAlert.placeholderPaint);
                if (this.placeholderNum % 2 == 0) {
                    iDp = AndroidUtilities.dp(65.0f);
                    iDp2 = AndroidUtilities.dp(48.0f);
                } else {
                    iDp = AndroidUtilities.dp(65.0f);
                    iDp2 = AndroidUtilities.dp(60.0f);
                }
                if (LocaleController.isRTL) {
                    iDp = (getMeasuredWidth() - iDp) - iDp2;
                }
                pollVotesAlert.rect.set(iDp, measuredHeight - AndroidUtilities.dp(4.0f), iDp + iDp2, AndroidUtilities.dp(4.0f) + measuredHeight);
                canvas.drawRoundRect(pollVotesAlert.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pollVotesAlert.placeholderPaint);
                if (this.placeholderNum % 2 == 0) {
                    iDp3 = AndroidUtilities.dp(119.0f);
                    iDp4 = AndroidUtilities.dp(60.0f);
                } else {
                    iDp3 = AndroidUtilities.dp(131.0f);
                    iDp4 = AndroidUtilities.dp(80.0f);
                }
                if (LocaleController.isRTL) {
                    iDp3 = (getMeasuredWidth() - iDp3) - iDp4;
                }
                pollVotesAlert.rect.set(iDp3, measuredHeight - AndroidUtilities.dp(4.0f), iDp3 + iDp4, AndroidUtilities.dp(4.0f) + measuredHeight);
                canvas.drawRoundRect(pollVotesAlert.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), pollVotesAlert.placeholderPaint);
            }
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        public void setPlaceholderAlpha(float f) {
            this.placeholderAlpha = f;
            invalidate();
        }
    }

    public final class VotesList {
        public boolean collapsed;
        public int collapsedCount = 10;
        public int count;
        public String next_offset;
        public final byte[] option;
        public ArrayList votes;

        public VotesList(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
            this.count = tL_messages_votesList.count;
            this.votes = tL_messages_votesList.votes;
            this.next_offset = tL_messages_votesList.next_offset;
            this.option = bArr;
        }

        public final int getCount() {
            return this.collapsed ? Math.min(this.collapsedCount, this.votes.size()) : this.votes.size();
        }
    }

    public PollVotesAlert(Context context, int i, MessageObject messageObject, Theme.ResourcesProvider resourcesProvider) {
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        super(context, resourcesProvider, true, false);
        boolean z = false;
        this.loadingMore = new HashSet();
        this.votesPercents = new HashMap();
        this.voters = new ArrayList();
        this.queries = new ArrayList();
        this.placeholderPaint = new Paint(1);
        this.loadingResults = true;
        this.rect = new RectF();
        this.currentAccount = i;
        this.occupyNavigationBar = true;
        fixNavigationBar();
        this.messageObject = messageObject;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.messageMediaPoll = tL_messageMediaPoll;
        this.poll = tL_messageMediaPoll.poll;
        this.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageObject.getDialogId());
        ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        Integer[] numArr = new Integer[size];
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i2);
            if (pollAnswerVoters.voters != 0) {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i3 = pollAnswerVoters.voters;
                i3 = i3 > 15 ? 10 : i3;
                for (int i4 = 0; i4 < i3; i4++) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                }
                int i5 = pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i3 < i5 ? "empty" : null;
                tL_messages_votesList.count = i5;
                this.voters.add(new VotesList(tL_messages_votesList, pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.peer;
                tL_messages_getPollVotes.id = this.messageObject.getId();
                tL_messages_getPollVotes.limit = pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= 1;
                tL_messages_getPollVotes.option = pollAnswerVoters.option;
                Integer numValueOf = Integer.valueOf(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new GroupCallSheet$$ExternalSyntheticLambda0(this, numArr, i2, arrayList, pollAnswerVoters, 6)));
                numArr[i2] = numValueOf;
                this.queries.add(numValueOf);
            }
            i2++;
        }
        updateButtons$1();
        Collections.sort(this.voters, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                VotesList votesList = (VotesList) obj;
                VotesList votesList2 = (VotesList) obj2;
                PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                int size2 = pollVotesAlert.poll.answers.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        i6 = 0;
                        break;
                    }
                    if (Arrays.equals(pollVotesAlert.poll.answers.get(i6).option, votesList.option)) {
                        break;
                    }
                    i6++;
                }
                int size3 = pollVotesAlert.poll.answers.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size3) {
                        i7 = 0;
                        break;
                    }
                    if (Arrays.equals(pollVotesAlert.poll.answers.get(i7).option, votesList2.option)) {
                        break;
                    }
                    i7++;
                }
                if (i6 > i7) {
                    return 1;
                }
                return i6 < i7 ? -1 : 0;
            }
        });
        updatePlaceholder();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackgroundGray, false), PorterDuff.Mode.MULTIPLY));
        DialogsActivity.AnonymousClass52 anonymousClass52 = new DialogsActivity.AnonymousClass52(this, context);
        this.containerView = anonymousClass52;
        anonymousClass52.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i6 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i6, 0, i6, 0);
        ?? r2 = new RecyclerListView(context) {
            public final GradientProtectionDrawable gradientProtectionDrawable = new GradientProtectionDrawable(8);
            public long lastUpdateTime;

            @Override
            public final boolean allowSelectChildAtPosition(float f) {
                return f >= ((float) (PollVotesAlert.this.scrollOffsetY + AndroidUtilities.statusBarHeight));
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                float f;
                PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                if (pollVotesAlert.loadingResults) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jAbs = Math.abs(this.lastUpdateTime - jElapsedRealtime);
                    if (jAbs > 17) {
                        jAbs = 16;
                    }
                    this.lastUpdateTime = jElapsedRealtime;
                    pollVotesAlert.totalTranslation += (jAbs * pollVotesAlert.gradientWidth) / 1800.0f;
                    while (true) {
                        f = pollVotesAlert.totalTranslation;
                        float f2 = pollVotesAlert.gradientWidth * 2.0f;
                        if (f < f2) {
                            break;
                        } else {
                            pollVotesAlert.totalTranslation = f - f2;
                        }
                    }
                    pollVotesAlert.placeholderMatrix.setTranslate(f, 0.0f);
                    pollVotesAlert.placeholderGradient.setLocalMatrix(pollVotesAlert.placeholderMatrix);
                    invalidateViews();
                    invalidate();
                }
                super.dispatchDraw(canvas);
                int measuredHeight = getMeasuredHeight() - AndroidUtilities.navigationBarHeight;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawable;
                gradientProtectionDrawable.setBounds(0, measuredHeight, measuredWidth, measuredHeight2);
                gradientProtectionDrawable.setColor(Theme.getColor(Theme.key_dialogBackgroundGray, this.resourcesProvider));
                gradientProtectionDrawable.draw(canvas);
            }
        };
        this.listView = r2;
        r2.setSections(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mAddDuration = 150L;
        defaultItemAnimator.mMoveDuration = 350L;
        defaultItemAnimator.mChangeAddDuration = 0L;
        defaultItemAnimator.mChangeRemoveDuration = 0L;
        defaultItemAnimator.mRemoveDuration = 0L;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mMoveInterpolator = new OvershootInterpolator(1.1f);
        defaultItemAnimator.translationInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        r2.setItemAnimator(defaultItemAnimator);
        r2.setClipToPadding(false);
        getContext();
        r2.setLayoutManager(new PhotoViewer.AnonymousClass36(1, 8, z));
        r2.setHorizontalScrollBarEnabled(false);
        r2.setVerticalScrollBarEnabled(false);
        r2.setSectionsType(2);
        this.containerView.addView((View) r2, LayoutHelper.createFrame(-1, -1, 51));
        Adapter adapter = new Adapter(context);
        this.listAdapter = adapter;
        r2.setAdapter(adapter);
        r2.setGlowColor(Theme.getColor(null, Theme.key_dialogScrollGlow, false));
        r2.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(10, this, context));
        r2.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 29));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        this.titleTextView = textViewEmojis;
        textViewEmojis.setTextSize(1, 18.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        int i7 = Theme.key_dialogTextBlack;
        textViewEmojis.setTextColor(Theme.getColor(null, i7, false));
        textViewEmojis.setTag(-33024);
        textViewEmojis.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.poll.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.messageObject;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(textViewEmojis);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textViewEmojis.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, tL_textWithEntities2.entities, textViewEmojis.getPaint().getFontMetricsInt());
            textViewEmojis.setText(charSequenceReplaceEmoji);
        }
        ?? r3 = new ActionBar(context) {
            @Override
            public final void setAlpha(float f) {
                super.setAlpha(f);
                ((BottomSheet) PollVotesAlert.this).containerView.invalidate();
            }
        };
        this.actionBar = r3;
        r3.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        r3.setBackButtonImage(R.drawable.ic_ab_back);
        r3.setItemsColor(Theme.getColor(null, i7, false), false);
        r3.setItemsBackgroundColor(Theme.getColor(null, Theme.key_dialogButtonSelector, false), false);
        r3.setTitleColor(Theme.getColor(null, i7, false));
        r3.setSubtitleColor(Theme.getColor(null, Theme.key_player_actionBarSubtitle, false));
        r3.setOccupyStatusBar(false);
        r3.setAlpha(0.0f);
        r3.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.poll.quiz) {
            r3.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            r3.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView((View) r3, LayoutHelper.createFrame(-2.0f, -1));
        r3.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 3));
        View view = new View(context);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(Theme.getColor(null, Theme.key_dialogShadowLine, false));
        this.containerView.addView(view, LayoutHelper.createFrame(1.0f, -1));
    }

    public static void access$1500(PollVotesAlert pollVotesAlert) {
        int childCount = pollVotesAlert.listView.getChildCount();
        AnonymousClass4 anonymousClass4 = pollVotesAlert.listView;
        if (childCount <= 0) {
            int paddingTop = anonymousClass4.getPaddingTop();
            pollVotesAlert.scrollOffsetY = paddingTop;
            anonymousClass4.setTopGlowOffset(paddingTop);
            pollVotesAlert.containerView.invalidate();
            return;
        }
        View childAt = anonymousClass4.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass4.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        boolean z = top <= AndroidUtilities.dp(12.0f);
        AnonymousClass7 anonymousClass7 = pollVotesAlert.actionBar;
        if ((z && anonymousClass7.getTag() == null) || (!z && anonymousClass7.getTag() != null)) {
            anonymousClass7.setTag(z ? 1 : null);
            AnimatorSet animatorSet = pollVotesAlert.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                pollVotesAlert.actionBarAnimation = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            pollVotesAlert.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = pollVotesAlert.actionBarAnimation;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, z ? 1.0f : 0.0f), ObjectAnimator.ofFloat(pollVotesAlert.actionBarShadow, (Property<View, Float>) property, z ? 1.0f : 0.0f));
            pollVotesAlert.actionBarAnimation.addListener(new ItemOptions.AnonymousClass3(pollVotesAlert, 15));
            pollVotesAlert.actionBarAnimation.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) anonymousClass4.getLayoutParams();
        int iM = zzlb.m(layoutParams.topMargin, 11.0f, top);
        if (pollVotesAlert.scrollOffsetY != iM) {
            pollVotesAlert.scrollOffsetY = iM;
            anonymousClass4.setTopGlowOffset(iM - layoutParams.topMargin);
            pollVotesAlert.containerView.invalidate();
        }
    }

    public final void animateSectionUpdates(Adapter.AnonymousClass1 anonymousClass1) {
        AnonymousClass4 anonymousClass4;
        TLRPC.Message message;
        int i = -2;
        while (true) {
            anonymousClass4 = this.listView;
            if (i >= anonymousClass4.getChildCount()) {
                break;
            }
            View pinnedHeader = i == -2 ? anonymousClass1 : i == -1 ? anonymousClass4.getPinnedHeader() : anonymousClass4.getChildAt(i);
            if (pinnedHeader instanceof SectionCell) {
                int i2 = R.id.object_tag;
                if (pinnedHeader.getTag(i2) instanceof VotesList) {
                    SectionCell sectionCell = (SectionCell) pinnedHeader;
                    VotesList votesList = (VotesList) pinnedHeader.getTag(i2);
                    TLRPC.Poll poll = this.poll;
                    int size = poll.answers.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.PollAnswer pollAnswer = poll.answers.get(i3);
                        if (Arrays.equals(pollAnswer.option, votesList.option) && ((Button) this.votesPercents.get(votesList)) != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                            MessageObject messageObject = this.messageObject;
                            if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                                for (int i4 = 0; i4 < messageObject.messageOwner.translatedPoll.answers.size(); i4++) {
                                    TLRPC.PollAnswer pollAnswer2 = messageObject.messageOwner.translatedPoll.answers.get(i4);
                                    if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                        tL_textWithEntities = pollAnswer2.text;
                                        break;
                                    }
                                }
                            }
                            sectionCell.setText(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, calcPercent(votesList.option), votesList.count, votesList.votes.size() <= 15 ? 0 : votesList.collapsed ? 1 : 2, true);
                            sectionCell.setTag(R.id.object_tag, votesList);
                            break;
                        }
                    }
                }
            }
            i++;
        }
        View view = anonymousClass4.pinnedHeader;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(anonymousClass4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(anonymousClass4.getMeasuredHeight(), 0));
            View view2 = anonymousClass4.pinnedHeader;
            view2.layout(0, 0, view2.getMeasuredWidth(), anonymousClass4.pinnedHeader.getMeasuredHeight());
            anonymousClass4.invalidate();
        }
        anonymousClass4.invalidate();
    }

    public final int calcPercent(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.voters;
            if (i >= arrayList.size()) {
                break;
            }
            VotesList votesList = (VotesList) arrayList.get(i);
            if (votesList != null) {
                i2 += votesList.count;
                if (Arrays.equals(votesList.option, bArr)) {
                    i3 += votesList.count;
                }
            }
            i++;
        }
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = this.messageMediaPoll;
        if (tL_messageMediaPoll.poll.multiple_choice) {
            i2 = tL_messageMediaPoll.results.total_voters;
        }
        if (i2 <= 0) {
            return 0;
        }
        return Math.round((i3 / i2) * 100.0f);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final void dismissInternal() {
        ArrayList arrayList = this.queries;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(((Integer) arrayList.get(i)).intValue(), true);
        }
        super.dismissInternal();
    }

    public final MessagesController getMessagesController() {
        return MessagesController.getInstance(this.currentAccount);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 18);
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(viewGroup, 0, null, null, drawableArr, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        int i2 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 1024, null, null, null, null, Theme.key_player_actionBarSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.titleTextView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBarShadow, 1, null, null, null, null, Theme.key_dialogShadowLine));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, null, null, -1, chatActivity$$ExternalSyntheticLambda94, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, null, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_dialogBackgroundGray));
        int i3 = Theme.key_graySectionText;
        arrayList.add(new ThemeDescription(this.listView, 524288, new Class[]{SectionCell.class}, new String[]{"textView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 524288, new Class[]{SectionCell.class}, new String[]{"middleTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 524288, new Class[]{SectionCell.class}, new String[]{"righTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 524304, new Class[]{SectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_switchTrackChecked));
        return arrayList;
    }

    public final void lambda$new$0(Integer[] numArr, int i, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        ArrayList arrayList2 = this.queries;
        arrayList2.remove(numArr[i]);
        if (tLObject == null) {
            lambda$showGiftOfferSheet$15();
            return;
        }
        TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
        MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_votesList.users, false);
        if (!tL_messages_votesList.votes.isEmpty()) {
            arrayList.add(new VotesList(tL_messages_votesList, pollAnswerVoters.option));
        }
        if (arrayList2.isEmpty()) {
            int size = arrayList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                VotesList votesList = (VotesList) arrayList.get(i2);
                ArrayList arrayList3 = this.voters;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    VotesList votesList2 = (VotesList) arrayList3.get(i3);
                    if (Arrays.equals(votesList.option, votesList2.option)) {
                        votesList2.next_offset = votesList.next_offset;
                        if (votesList2.count != votesList.count || votesList2.votes.size() != votesList.votes.size()) {
                            z = true;
                        }
                        votesList2.count = votesList.count;
                        votesList2.votes = votesList.votes;
                        break;
                    }
                }
            }
            this.loadingResults = false;
            AnonymousClass4 anonymousClass4 = this.listView;
            if (anonymousClass4 != null) {
                int i4 = this.currentSheetAnimationType;
                Adapter adapter = this.listAdapter;
                if (i4 != 0 || this.startAnimationRunnable != null || z) {
                    if (z) {
                        updateButtons$1();
                    }
                    adapter.update(false);
                    return;
                }
                int childCount = anonymousClass4.getChildCount();
                ArrayList arrayList4 = new ArrayList();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = anonymousClass4.getChildAt(i5);
                    if ((childAt instanceof UserCell) && (viewHolderFindContainingViewHolder = anonymousClass4.findContainingViewHolder(childAt)) != null) {
                        UserCell userCell = (UserCell) childAt;
                        userCell.animators = arrayList4;
                        userCell.setEnabled(true);
                        adapter.onViewAttachedToWindow(viewHolderFindContainingViewHolder);
                        userCell.animators = null;
                    }
                }
                if (!arrayList4.isEmpty()) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList4);
                    animatorSet.setDuration(180L);
                    animatorSet.start();
                }
                this.loadingResults = false;
            }
        }
    }

    public final void lambda$new$2(VotesList votesList, TLObject tLObject) {
        if (isShowing()) {
            this.loadingMore.remove(votesList);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(tL_messages_votesList.users, false);
                votesList.votes.addAll(tL_messages_votesList.votes);
                votesList.next_offset = tL_messages_votesList.next_offset;
                animateSectionUpdates(null);
                this.listAdapter.update(true);
            }
        }
    }

    public final void lambda$new$4(Context context, View view, int i) {
        if (AndroidUtilities.isContextSafe(context)) {
            ArrayList arrayList = this.queries;
            if (arrayList == null || arrayList.isEmpty()) {
                int i2 = 0;
                if (!(view instanceof TextCell)) {
                    if (view instanceof UserCell) {
                        UserCell userCell = (UserCell) view;
                        if (userCell.currentUser == null && userCell.currentChat == null) {
                            return;
                        }
                        Bundle bundle = new Bundle();
                        TLRPC.User user = userCell.currentUser;
                        if (user != null) {
                            bundle.putLong("user_id", user.id);
                        } else {
                            bundle.putLong("chat_id", userCell.currentChat.id);
                        }
                        lambda$showGiftOfferSheet$15();
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment == null) {
                            return;
                        }
                        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                        if (safeLastFragment instanceof ChatActivity) {
                            if (userCell.currentUser != null) {
                                TLRPC.User currentUser = ((ChatActivity) safeLastFragment).getCurrentUser();
                                if (currentUser != null && currentUser.id == userCell.currentUser.id) {
                                    i2 = 1;
                                }
                                profileActivity.setPlayProfileAnimation(i2);
                            } else {
                                TLRPC.Chat chat = ((ChatActivity) safeLastFragment).currentChat;
                                if (chat != null && chat.id == userCell.currentChat.id) {
                                    i2 = 1;
                                }
                                profileActivity.setPlayProfileAnimation(i2);
                            }
                        }
                        safeLastFragment.presentFragment(profileActivity);
                        return;
                    }
                    return;
                }
                Adapter adapter = this.listAdapter;
                int sectionForPosition = adapter.getSectionForPosition(i) - 1;
                int positionInSectionForPosition = adapter.getPositionInSectionForPosition(i) - 1;
                if (positionInSectionForPosition <= 0 || sectionForPosition < 0) {
                    return;
                }
                VotesList votesList = (VotesList) this.voters.get(sectionForPosition);
                if (positionInSectionForPosition == votesList.getCount()) {
                    HashSet hashSet = this.loadingMore;
                    if (hashSet.contains(votesList)) {
                        return;
                    }
                    if (votesList.collapsed && votesList.collapsedCount < votesList.votes.size()) {
                        int iMin = Math.min(votesList.collapsedCount + 50, votesList.votes.size());
                        votesList.collapsedCount = iMin;
                        if (iMin == votesList.votes.size()) {
                            votesList.collapsed = false;
                        }
                        animateSectionUpdates(null);
                        adapter.update(true);
                        return;
                    }
                    hashSet.add(votesList);
                    TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                    tL_messages_getPollVotes.peer = this.peer;
                    tL_messages_getPollVotes.id = this.messageObject.getId();
                    tL_messages_getPollVotes.limit = 50;
                    int i3 = tL_messages_getPollVotes.flags;
                    tL_messages_getPollVotes.option = votesList.option;
                    tL_messages_getPollVotes.flags = i3 | 3;
                    tL_messages_getPollVotes.offset = votesList.next_offset;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getPollVotes, new LinkManager$$ExternalSyntheticLambda8(4, this, votesList));
                }
            }
        }
    }

    public final void updateButtons$1() {
        HashMap map;
        HashMap map2 = this.votesPercents;
        map2.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.messageObject.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.voters;
        int size = arrayList2.size();
        int i = 100;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int iMax = 0;
        while (i2 < size) {
            VotesList votesList = (VotesList) arrayList2.get(i2);
            Button button = new Button();
            arrayList.add(button);
            map2.put(votesList, button);
            if (tL_messageMediaPoll.results.results.isEmpty()) {
                map = map2;
                break;
                break;
            }
            int size2 = tL_messageMediaPoll.results.results.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    map = map2;
                    break;
                }
                TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
                map = map2;
                if (Arrays.equals(votesList.option, pollAnswerVoters.option)) {
                    float f = (pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                    int i5 = (int) f;
                    button.decimal = f - i5;
                    if (i3 == 0) {
                        i3 = i5;
                    } else if (i5 != 0 && i3 != i5) {
                        z = true;
                    }
                    i -= i5;
                    iMax = Math.max(i5, iMax);
                    break;
                }
                i4++;
                map2 = map;
            }
            i2++;
            map2 = map;
        }
        if (!z || i == 0) {
            return;
        }
        Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(16));
        int iMin = Math.min(i, arrayList.size());
        for (int i6 = 0; i6 < iMin; i6++) {
            ((Button) arrayList.get(i6)).getClass();
        }
    }

    public final void updatePlaceholder() {
        Paint paint = this.placeholderPaint;
        if (paint == null) {
            return;
        }
        int color = Theme.getColor(null, Theme.key_dialogBackground, false);
        int color2 = Theme.getColor(null, Theme.key_dialogBackgroundGray, false);
        int averageColor = AndroidUtilities.getAverageColor(color2, color);
        paint.setColor(color2);
        float fDp = AndroidUtilities.dp(500.0f);
        this.gradientWidth = fDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{color2, averageColor, color2}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.placeholderGradient = linearGradient;
        paint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.placeholderMatrix = matrix;
        this.placeholderGradient.setLocalMatrix(matrix);
    }
}
