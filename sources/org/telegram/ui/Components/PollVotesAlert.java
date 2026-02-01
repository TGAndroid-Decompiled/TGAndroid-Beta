package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.PollVotesAlert;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.ProfileActivity;

public class PollVotesAlert extends BottomSheet {
    public static final Property USER_CELL_PROPERTY = new AnimationProperties.FloatProperty("placeholderAlpha") {
        @Override
        public void setValue(UserCell userCell, float f) {
            userCell.setPlaceholderAlpha(f);
        }

        @Override
        public Float get(UserCell userCell) {
            return Float.valueOf(userCell.getPlaceholderAlpha());
        }
    };
    private ActionBar actionBar;
    private AnimatorSet actionBarAnimation;
    private View actionBarShadow;
    private ChatActivity chatActivity;
    private float gradientWidth;
    private Adapter listAdapter;
    private RecyclerListView listView;
    private HashSet loadingMore;
    private boolean loadingResults;
    private MessageObject messageObject;
    private TLRPC.InputPeer peer;
    private LinearGradient placeholderGradient;
    private Matrix placeholderMatrix;
    private Paint placeholderPaint;
    private TLRPC.Poll poll;
    private ArrayList queries;
    private RectF rect;
    private int scrollOffsetY;
    private Drawable shadowDrawable;
    private AnimatedEmojiSpan.TextViewEmojis titleTextView;
    private float totalTranslation;
    private ArrayList voters;
    private HashMap votesPercents;

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    static float access$3116(PollVotesAlert pollVotesAlert, float f) {
        float f2 = pollVotesAlert.totalTranslation + f;
        pollVotesAlert.totalTranslation = f2;
        return f2;
    }

    static float access$3124(PollVotesAlert pollVotesAlert, float f) {
        float f2 = pollVotesAlert.totalTranslation - f;
        pollVotesAlert.totalTranslation = f2;
        return f2;
    }

    static class VotesList {
        public boolean collapsed;
        public int collapsedCount = 10;
        public int count;
        public String next_offset;
        public byte[] option;
        public ArrayList users;
        public ArrayList votes;

        public VotesList(TLRPC.TL_messages_votesList tL_messages_votesList, byte[] bArr) {
            this.count = tL_messages_votesList.count;
            this.votes = tL_messages_votesList.votes;
            this.users = tL_messages_votesList.users;
            this.next_offset = tL_messages_votesList.next_offset;
            this.option = bArr;
        }

        public int getCount() {
            if (this.collapsed) {
                return Math.min(this.collapsedCount, this.votes.size());
            }
            return this.votes.size();
        }

        public int getCollapsed() {
            if (this.votes.size() <= 15) {
                return 0;
            }
            return this.collapsed ? 1 : 2;
        }
    }

    public class SectionCell extends FrameLayout {
        private TextView middleTextView;
        private AnimatedTextView righTextView;
        private AnimatedEmojiSpan.TextViewEmojis textView;

        protected abstract void onCollapseClick();

        public SectionCell(Context context) {
            super(context);
            setBackgroundColor(Theme.getColor(Theme.key_graySection));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(getContext());
            this.textView = textViewEmojis;
            textViewEmojis.setTextSize(1, 14.0f);
            this.textView.setTypeface(AndroidUtilities.bold());
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis2 = this.textView;
            int i = Theme.key_graySectionText;
            textViewEmojis2.setTextColor(Theme.getColor(i));
            this.textView.setSingleLine(true);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            TextView textView = new TextView(getContext());
            this.middleTextView = textView;
            textView.setTextSize(1, 14.0f);
            this.middleTextView.setTextColor(Theme.getColor(i));
            this.middleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext()) {
                @Override
                public boolean post(Runnable runnable) {
                    return ((BottomSheet) PollVotesAlert.this).containerView.post(runnable);
                }

                @Override
                public boolean postDelayed(Runnable runnable, long j) {
                    return ((BottomSheet) PollVotesAlert.this).containerView.postDelayed(runnable, j);
                }

                @Override
                public void invalidate() {
                    super.invalidate();
                    SectionCell sectionCell = SectionCell.this;
                    if (sectionCell == PollVotesAlert.this.listView.getPinnedHeader()) {
                        PollVotesAlert.this.listView.invalidate();
                    }
                }
            };
            this.righTextView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.righTextView.setTextColor(Theme.getColor(i));
            this.righTextView.setGravity(LocaleController.isRTL ? 3 : 5);
            this.righTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$0(view);
                }
            });
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis3 = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textViewEmojis3, LayoutHelper.createFrame(-2, -1.0f, (z ? 5 : 3) | 48, z ? 0 : 16, 0.0f, z ? 16 : 0, 0.0f));
            addView(this.middleTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(this.righTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 16.0f, 0.0f, 16.0f, 0.0f));
        }

        public void lambda$new$0(View view) {
            onCollapseClick();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824);
            measureChildWithMargins(this.middleTextView, i, 0, iMakeMeasureSpec, 0);
            measureChildWithMargins(this.righTextView, i, 0, iMakeMeasureSpec, 0);
            measureChildWithMargins(this.textView, i, this.middleTextView.getMeasuredWidth() + this.righTextView.getMeasuredWidth() + AndroidUtilities.dp(32.0f), iMakeMeasureSpec, 0);
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(32.0f));
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (LocaleController.isRTL) {
                int left = this.textView.getLeft() - this.middleTextView.getMeasuredWidth();
                TextView textView = this.middleTextView;
                textView.layout(left, textView.getTop(), this.middleTextView.getMeasuredWidth() + left, this.middleTextView.getBottom());
            } else {
                int right = this.textView.getRight();
                TextView textView2 = this.middleTextView;
                textView2.layout(right, textView2.getTop(), this.middleTextView.getMeasuredWidth() + right, this.middleTextView.getBottom());
            }
        }

        public void setText(CharSequence charSequence, ArrayList arrayList, int i, int i2, int i3, boolean z) {
            SpannableStringBuilder spannableStringBuilder;
            if (arrayList != null) {
                NotificationCenter.listenEmojiLoading(this.textView);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, charSequence, spannableStringBuilder2);
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder2, this.textView.getPaint().getFontMetricsInt(), false);
                MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, this.textView.getPaint().getFontMetricsInt());
                this.textView.setText(charSequenceReplaceEmoji);
            } else {
                AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.textView;
                textViewEmojis.setText(Emoji.replaceEmoji(charSequence, textViewEmojis.getPaint().getFontMetricsInt(), false));
            }
            String str = String.format("%d", Integer.valueOf(i));
            if (LocaleController.isRTL) {
                spannableStringBuilder = new SpannableStringBuilder(String.format("%s%% – ", Integer.valueOf(i)));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(String.format(" – %s%%", Integer.valueOf(i)));
            }
            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 3, str.length() + 3, 33);
            this.middleTextView.setText(spannableStringBuilder);
            if (i3 == 0) {
                if (PollVotesAlert.this.poll.quiz) {
                    this.righTextView.setText(LocaleController.formatPluralString("Answer", i2, new Object[0]), z);
                    return;
                } else {
                    this.righTextView.setText(LocaleController.formatPluralString("Vote", i2, new Object[0]), z);
                    return;
                }
            }
            if (i3 == 1) {
                this.righTextView.setText(LocaleController.getString(R.string.PollExpand), z);
            } else {
                this.righTextView.setText(LocaleController.getString(R.string.PollCollapse), z);
            }
        }
    }

    public class UserCell extends FrameLayout {
        private ArrayList animators;
        private AvatarDrawable avatarDrawable;
        private BackupImageView avatarImageView;
        private int currentAccount;
        private TLRPC.Chat currentChat;
        private TLRPC.User currentUser;
        private boolean drawPlaceholder;
        private TLRPC.FileLocation lastAvatar;
        private CharSequence lastName;
        private int lastStatus;
        private SimpleTextView nameTextView;
        private boolean needDivider;
        private float placeholderAlpha;
        private int placeholderNum;
        private StatusBadgeComponent statusBadgeComponent;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public UserCell(Context context) {
            super(context);
            this.currentAccount = UserConfig.selectedAccount;
            this.placeholderAlpha = 1.0f;
            setWillNotDraw(false);
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(18.0f));
            BackupImageView backupImageView2 = this.avatarImageView;
            boolean z = LocaleController.isRTL;
            addView(backupImageView2, LayoutHelper.createFrame(36, 36.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 6.0f, z ? 14.0f : 0.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.nameTextView = simpleTextView;
            simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            this.nameTextView.setTypeface(AndroidUtilities.bold());
            this.nameTextView.setTextSize(16);
            this.nameTextView.setGravity(16 | (LocaleController.isRTL ? 5 : 3));
            SimpleTextView simpleTextView2 = this.nameTextView;
            boolean z2 = LocaleController.isRTL;
            addView(simpleTextView2, LayoutHelper.createFrame(-1, 24.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 65.0f, 12.0f, z2 ? 65.0f : 28.0f, 0.0f));
            this.statusBadgeComponent = new StatusBadgeComponent(this.nameTextView, 20);
        }

        public void setData(TLObject tLObject, int i, boolean z) {
            if (tLObject instanceof TLRPC.User) {
                this.currentUser = (TLRPC.User) tLObject;
                this.currentChat = null;
            } else if (tLObject instanceof TLRPC.Chat) {
                this.currentChat = (TLRPC.Chat) tLObject;
                this.currentUser = null;
            } else {
                this.currentUser = null;
                this.currentChat = null;
            }
            this.needDivider = z;
            this.drawPlaceholder = tLObject == null;
            this.placeholderNum = i;
            if (tLObject == null) {
                this.nameTextView.setText("");
                this.avatarImageView.setImageDrawable(null);
            } else {
                update(0);
            }
            ArrayList arrayList = this.animators;
            if (arrayList != null) {
                BackupImageView backupImageView = this.avatarImageView;
                Property property = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(backupImageView, (Property<BackupImageView, Float>) property, 0.0f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this.nameTextView, (Property<SimpleTextView, Float>) property, 0.0f, 1.0f));
                this.animators.add(ObjectAnimator.ofFloat(this, (Property<UserCell, Float>) PollVotesAlert.USER_CELL_PROPERTY, 1.0f, 0.0f));
                return;
            }
            if (this.drawPlaceholder) {
                return;
            }
            this.placeholderAlpha = 0.0f;
        }

        public void setPlaceholderAlpha(float f) {
            this.placeholderAlpha = f;
            invalidate();
        }

        public float getPlaceholderAlpha() {
            return this.placeholderAlpha;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f) + (this.needDivider ? 1 : 0), 1073741824));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.statusBadgeComponent.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            this.statusBadgeComponent.onDetachedFromWindow();
            super.onDetachedFromWindow();
        }

        public void update(int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PollVotesAlert.UserCell.update(int):void");
        }

        @Override
        protected void onDraw(Canvas canvas) {
            int iDp;
            int iDp2;
            int iDp3;
            int iDp4;
            if (this.drawPlaceholder || this.placeholderAlpha != 0.0f) {
                PollVotesAlert.this.placeholderPaint.setAlpha((int) (this.placeholderAlpha * 255.0f));
                canvas.drawCircle(this.avatarImageView.getLeft() + (this.avatarImageView.getMeasuredWidth() / 2), this.avatarImageView.getTop() + (this.avatarImageView.getMeasuredHeight() / 2), this.avatarImageView.getMeasuredWidth() / 2, PollVotesAlert.this.placeholderPaint);
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
                PollVotesAlert.this.rect.set(iDp, r2 - AndroidUtilities.dp(4.0f), iDp + iDp2, AndroidUtilities.dp(4.0f) + r2);
                canvas.drawRoundRect(PollVotesAlert.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), PollVotesAlert.this.placeholderPaint);
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
                PollVotesAlert.this.rect.set(iDp3, r2 - AndroidUtilities.dp(4.0f), iDp3 + iDp4, r2 + AndroidUtilities.dp(4.0f));
                canvas.drawRoundRect(PollVotesAlert.this.rect, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), PollVotesAlert.this.placeholderPaint);
            }
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    public static void showForPoll(ChatActivity chatActivity, MessageObject messageObject) {
        if (chatActivity == null || chatActivity.getParentActivity() == null) {
            return;
        }
        chatActivity.showDialog(new PollVotesAlert(chatActivity, messageObject));
    }

    static class Button {
        private float decimal;
        private int percent;
        private int votesCount;

        private Button() {
        }

        static float access$4024(Button button, float f) {
            float f2 = button.decimal - f;
            button.decimal = f2;
            return f2;
        }

        static int access$4112(Button button, int i) {
            int i2 = button.percent + i;
            button.percent = i2;
            return i2;
        }
    }

    public PollVotesAlert(final ChatActivity chatActivity, MessageObject messageObject) {
        TLRPC.Message message;
        TranslateController.PollText pollText;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i;
        int i2;
        super(chatActivity.getParentActivity(), true);
        int i3 = 1;
        this.loadingMore = new HashSet();
        this.votesPercents = new HashMap();
        this.voters = new ArrayList();
        this.queries = new ArrayList();
        this.placeholderPaint = new Paint(1);
        this.loadingResults = true;
        this.rect = new RectF();
        fixNavigationBar();
        this.messageObject = messageObject;
        this.chatActivity = chatActivity;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        this.poll = tL_messageMediaPoll.poll;
        Activity parentActivity = chatActivity.getParentActivity();
        this.peer = chatActivity.getMessagesController().getInputPeer(messageObject.getDialogId());
        final ArrayList arrayList = new ArrayList();
        int size = tL_messageMediaPoll.results.results.size();
        final Integer[] numArr = new Integer[size];
        int i4 = 0;
        while (i4 < size) {
            final TLRPC.TL_pollAnswerVoters tL_pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
            if (tL_pollAnswerVoters.voters == 0) {
                i2 = i4;
                i = size;
            } else {
                TLRPC.TL_messages_votesList tL_messages_votesList = new TLRPC.TL_messages_votesList();
                int i5 = tL_pollAnswerVoters.voters;
                i5 = i5 > 15 ? 10 : i5;
                for (int i6 = 0; i6 < i5; i6++) {
                    tL_messages_votesList.votes.add(new TLRPC.TL_messagePeerVoteInputOption());
                }
                int i7 = tL_pollAnswerVoters.voters;
                tL_messages_votesList.next_offset = i5 < i7 ? "empty" : null;
                tL_messages_votesList.count = i7;
                this.voters.add(new VotesList(tL_messages_votesList, tL_pollAnswerVoters.option));
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.peer;
                tL_messages_getPollVotes.id = this.messageObject.getId();
                tL_messages_getPollVotes.limit = tL_pollAnswerVoters.voters <= 15 ? 15 : 10;
                tL_messages_getPollVotes.flags |= i3;
                tL_messages_getPollVotes.option = tL_pollAnswerVoters.option;
                final int i8 = i4;
                i = size;
                i2 = i4;
                Integer numValueOf = Integer.valueOf(chatActivity.getConnectionsManager().sendRequest(tL_messages_getPollVotes, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$new$1(numArr, i8, chatActivity, arrayList, tL_pollAnswerVoters, tLObject, tL_error);
                    }
                }));
                numArr[i2] = numValueOf;
                this.queries.add(numValueOf);
            }
            i4 = i2 + 1;
            size = i;
            i3 = 1;
        }
        updateButtons();
        Collections.sort(this.voters, new Comparator() {
            private int getIndex(VotesList votesList) {
                int size2 = PollVotesAlert.this.poll.answers.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    if (Arrays.equals(PollVotesAlert.this.poll.answers.get(i9).option, votesList.option)) {
                        return i9;
                    }
                }
                return 0;
            }

            @Override
            public int compare(VotesList votesList, VotesList votesList2) {
                int index = getIndex(votesList);
                int index2 = getIndex(votesList2);
                if (index > index2) {
                    return 1;
                }
                return index < index2 ? -1 : 0;
            }
        });
        updatePlaceholder();
        Drawable drawableMutate = parentActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int i9 = Theme.key_dialogBackground;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i9), PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = new FrameLayout(parentActivity) {
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();

            @Override
            protected void onMeasure(int i10, int i11) {
                int size2 = View.MeasureSpec.getSize(i11);
                if (!((BottomSheet) PollVotesAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size2 - getPaddingTop();
                ((FrameLayout.LayoutParams) PollVotesAlert.this.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) PollVotesAlert.this.actionBarShadow.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight();
                int iDp = ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + AndroidUtilities.statusBarHeight;
                int sectionCount = PollVotesAlert.this.listAdapter.getSectionCount();
                for (int i12 = 0; i12 < sectionCount; i12++) {
                    if (i12 == 0) {
                        PollVotesAlert.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft * 2)), 1073741824), i11);
                        iDp += PollVotesAlert.this.titleTextView.getMeasuredHeight();
                    } else {
                        iDp += AndroidUtilities.dp(32.0f) + (AndroidUtilities.dp(50.0f) * (PollVotesAlert.this.listAdapter.getCountForSection(i12) - 1));
                    }
                }
                int iDp2 = (iDp < paddingTop ? paddingTop - iDp : paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
                if (PollVotesAlert.this.listView.getPaddingTop() != iDp2) {
                    this.ignoreLayout = true;
                    PollVotesAlert.this.listView.setPinnedSectionOffsetY(-iDp2);
                    PollVotesAlert.this.listView.setPadding(0, iDp2, 0, 0);
                    this.ignoreLayout = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            @Override
            protected void onLayout(boolean z, int i10, int i11, int i12, int i13) {
                super.onLayout(z, i10, i11, i12, i13);
                PollVotesAlert.this.updateLayout(false);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && PollVotesAlert.this.scrollOffsetY != 0 && motionEvent.getY() < PollVotesAlert.this.scrollOffsetY + AndroidUtilities.dp(12.0f) && PollVotesAlert.this.actionBar.getAlpha() == 0.0f) {
                    PollVotesAlert.this.lambda$new$0();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !PollVotesAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                int iDp = AndroidUtilities.dp(13.0f);
                int translationY = (PollVotesAlert.this.scrollOffsetY - ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop) - iDp;
                if (((BottomSheet) PollVotesAlert.this).currentSheetAnimationType == 1) {
                    translationY = (int) (translationY + PollVotesAlert.this.listView.getTranslationY());
                }
                int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(15.0f) + ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop;
                if (((BottomSheet) PollVotesAlert.this).backgroundPaddingTop + translationY < ActionBar.getCurrentActionBarHeight()) {
                    float fDp = iDp + AndroidUtilities.dp(4.0f);
                    float fMin = Math.min(1.0f, ((ActionBar.getCurrentActionBarHeight() - translationY) - ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop) / fDp);
                    int currentActionBarHeight = (int) ((ActionBar.getCurrentActionBarHeight() - fDp) * fMin);
                    translationY -= currentActionBarHeight;
                    iDp2 -= currentActionBarHeight;
                    measuredHeight += currentActionBarHeight;
                    f = 1.0f - fMin;
                } else {
                    f = 1.0f;
                }
                int i10 = AndroidUtilities.statusBarHeight;
                int i11 = iDp2 + i10;
                PollVotesAlert.this.shadowDrawable.setBounds(0, translationY + i10, getMeasuredWidth(), measuredHeight);
                PollVotesAlert.this.shadowDrawable.draw(canvas);
                if (f != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_dialogBackground));
                    this.rect.set(((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop + r1, getMeasuredWidth() - ((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop + r1 + AndroidUtilities.dp(24.0f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                }
                if (f != 0.0f) {
                    int iDp3 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp3) / 2, i11, (getMeasuredWidth() + iDp3) / 2, i11 + AndroidUtilities.dp(4.0f));
                    int color = Theme.getColor(Theme.key_sheet_scrollUp);
                    int iAlpha = Color.alpha(color);
                    Theme.dialogs_onlineCirclePaint.setColor(color);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * 1.0f * f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                int color2 = Theme.getColor(Theme.key_dialogBackground);
                Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (PollVotesAlert.this.actionBar.getAlpha() * 255.0f), (int) (Color.red(color2) * 0.8f), (int) (Color.green(color2) * 0.8f), (int) (Color.blue(color2) * 0.8f)));
                canvas.drawRect(((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) PollVotesAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i10, 0, i10, 0);
        this.listView = new RecyclerListView(parentActivity) {
            long lastUpdateTime;

            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (PollVotesAlert.this.scrollOffsetY + AndroidUtilities.statusBarHeight));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (PollVotesAlert.this.loadingResults) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jAbs = Math.abs(this.lastUpdateTime - jElapsedRealtime);
                    if (jAbs > 17) {
                        jAbs = 16;
                    }
                    this.lastUpdateTime = jElapsedRealtime;
                    PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                    PollVotesAlert.access$3116(pollVotesAlert, (jAbs * pollVotesAlert.gradientWidth) / 1800.0f);
                    while (PollVotesAlert.this.totalTranslation >= PollVotesAlert.this.gradientWidth * 2.0f) {
                        PollVotesAlert pollVotesAlert2 = PollVotesAlert.this;
                        PollVotesAlert.access$3124(pollVotesAlert2, pollVotesAlert2.gradientWidth * 2.0f);
                    }
                    PollVotesAlert.this.placeholderMatrix.setTranslate(PollVotesAlert.this.totalTranslation, 0.0f);
                    PollVotesAlert.this.placeholderGradient.setLocalMatrix(PollVotesAlert.this.placeholderMatrix);
                    invalidateViews();
                    invalidate();
                }
                super.dispatchDraw(canvas);
            }
        };
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(350L);
        defaultItemAnimator.setChangeDuration(0L);
        defaultItemAnimator.setRemoveDuration(0L);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setMoveInterpolator(new OvershootInterpolator(1.1f));
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setClipToPadding(false);
        this.listView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false) {
            @Override
            protected int getExtraLayoutSpace(RecyclerView.State state) {
                return AndroidUtilities.dp(4000.0f);
            }
        });
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setSectionsType(2);
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView = this.listView;
        Adapter adapter = new Adapter(parentActivity);
        this.listAdapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.listView.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i11) throws NumberFormatException {
                this.f$0.lambda$new$4(chatActivity, view, i11);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                if (PollVotesAlert.this.listView.getChildCount() <= 0) {
                    return;
                }
                PollVotesAlert.this.updateLayout(true);
            }

            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                if (i11 == 0) {
                    if (((PollVotesAlert.this.scrollOffsetY - ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + ((BottomSheet) PollVotesAlert.this).backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || !PollVotesAlert.this.listView.canScrollVertically(1)) {
                        return;
                    }
                    PollVotesAlert.this.listView.getChildAt(0);
                    RecyclerListView.Holder holder = (RecyclerListView.Holder) PollVotesAlert.this.listView.findViewHolderForAdapterPosition(0);
                    if (holder == null || holder.itemView.getTop() <= AndroidUtilities.dp(7.0f)) {
                        return;
                    }
                    PollVotesAlert.this.listView.smoothScrollBy(0, holder.itemView.getTop() - AndroidUtilities.dp(7.0f));
                }
            }
        });
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(parentActivity);
        this.titleTextView = textViewEmojis;
        textViewEmojis.setTextSize(1, 18.0f);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        this.titleTextView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(21.0f));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis2 = this.titleTextView;
        int i11 = Theme.key_dialogTextBlack;
        textViewEmojis2.setTextColor(Theme.getColor(i11));
        this.titleTextView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        TLRPC.TL_textWithEntities tL_textWithEntities2 = this.poll.question;
        if (tL_textWithEntities2 != null) {
            MessageObject messageObject2 = this.messageObject;
            if (messageObject2 != null && messageObject2.translated && (message = messageObject2.messageOwner) != null && (pollText = message.translatedPoll) != null && (tL_textWithEntities = pollText.question) != null) {
                tL_textWithEntities2 = tL_textWithEntities;
            }
            NotificationCenter.listenEmojiLoading(this.titleTextView);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities2.text);
            MediaDataController.addTextStyleRuns(tL_textWithEntities2.entities, tL_textWithEntities2.text, spannableStringBuilder);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, this.titleTextView.getPaint().getFontMetricsInt(), false);
            MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, tL_textWithEntities2.entities, this.titleTextView.getPaint().getFontMetricsInt());
            this.titleTextView.setText(charSequenceReplaceEmoji);
        }
        ActionBar actionBar = new ActionBar(parentActivity) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ((BottomSheet) PollVotesAlert.this).containerView.invalidate();
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(Theme.getColor(i9));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setItemsColor(Theme.getColor(i11), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_dialogButtonSelector), false);
        this.actionBar.setTitleColor(Theme.getColor(i11));
        this.actionBar.setSubtitleColor(Theme.getColor(Theme.key_player_actionBarSubtitle));
        this.actionBar.setOccupyStatusBar(false);
        this.actionBar.setAlpha(0.0f);
        this.actionBar.setTitle(LocaleController.getString(R.string.PollResults));
        if (this.poll.quiz) {
            this.actionBar.setSubtitle(LocaleController.formatPluralString("Answer", tL_messageMediaPoll.results.total_voters, new Object[0]));
        } else {
            this.actionBar.setSubtitle(LocaleController.formatPluralString("Vote", tL_messageMediaPoll.results.total_voters, new Object[0]));
        }
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i12) {
                if (i12 == -1) {
                    PollVotesAlert.this.lambda$new$0();
                }
            }
        });
        View view = new View(parentActivity);
        this.actionBarShadow = view;
        view.setAlpha(0.0f);
        this.actionBarShadow.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        this.containerView.addView(this.actionBarShadow, LayoutHelper.createFrame(-1, 1.0f));
    }

    public void lambda$new$1(final Integer[] numArr, final int i, final ChatActivity chatActivity, final ArrayList arrayList, final TLRPC.TL_pollAnswerVoters tL_pollAnswerVoters, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0(numArr, i, tLObject, chatActivity, arrayList, tL_pollAnswerVoters);
            }
        });
    }

    public void lambda$new$0(Integer[] numArr, int i, TLObject tLObject, ChatActivity chatActivity, ArrayList arrayList, TLRPC.TL_pollAnswerVoters tL_pollAnswerVoters) {
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        this.queries.remove(numArr[i]);
        if (tLObject != null) {
            TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
            chatActivity.getMessagesController().putUsers(tL_messages_votesList.users, false);
            if (!tL_messages_votesList.votes.isEmpty()) {
                arrayList.add(new VotesList(tL_messages_votesList, tL_pollAnswerVoters.option));
            }
            if (this.queries.isEmpty()) {
                int size = arrayList.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    VotesList votesList = (VotesList) arrayList.get(i2);
                    int size2 = this.voters.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            VotesList votesList2 = (VotesList) this.voters.get(i3);
                            if (Arrays.equals(votesList.option, votesList2.option)) {
                                votesList2.next_offset = votesList.next_offset;
                                if (votesList2.count != votesList.count || votesList2.votes.size() != votesList.votes.size()) {
                                    z = true;
                                }
                                votesList2.count = votesList.count;
                                votesList2.users = votesList.users;
                                votesList2.votes = votesList.votes;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                this.loadingResults = false;
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView != null) {
                    if (this.currentSheetAnimationType != 0 || this.startAnimationRunnable != null || z) {
                        if (z) {
                            updateButtons();
                        }
                        this.listAdapter.notifyDataSetChanged();
                        return;
                    }
                    int childCount = recyclerListView.getChildCount();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.listView.getChildAt(i4);
                        if ((childAt instanceof UserCell) && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null) {
                            UserCell userCell = (UserCell) childAt;
                            userCell.animators = arrayList2;
                            userCell.setEnabled(true);
                            this.listAdapter.onViewAttachedToWindow(viewHolderFindContainingViewHolder);
                            userCell.animators = null;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(arrayList2);
                        animatorSet.setDuration(180L);
                        animatorSet.start();
                    }
                    this.loadingResults = false;
                    return;
                }
                return;
            }
            return;
        }
        lambda$new$0();
    }

    public void lambda$new$4(final ChatActivity chatActivity, View view, int i) throws NumberFormatException {
        if (chatActivity == null || chatActivity.getParentActivity() == null) {
            return;
        }
        ArrayList arrayList = this.queries;
        if (arrayList == null || arrayList.isEmpty()) {
            int i2 = 0;
            if (view instanceof TextCell) {
                int sectionForPosition = this.listAdapter.getSectionForPosition(i) - 1;
                int positionInSectionForPosition = this.listAdapter.getPositionInSectionForPosition(i) - 1;
                if (positionInSectionForPosition <= 0 || sectionForPosition < 0) {
                    return;
                }
                final VotesList votesList = (VotesList) this.voters.get(sectionForPosition);
                if (positionInSectionForPosition != votesList.getCount() || this.loadingMore.contains(votesList)) {
                    return;
                }
                if (votesList.collapsed && votesList.collapsedCount < votesList.votes.size()) {
                    int iMin = Math.min(votesList.collapsedCount + 50, votesList.votes.size());
                    votesList.collapsedCount = iMin;
                    if (iMin == votesList.votes.size()) {
                        votesList.collapsed = false;
                    }
                    animateSectionUpdates(null);
                    this.listAdapter.update(true);
                    return;
                }
                this.loadingMore.add(votesList);
                TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
                tL_messages_getPollVotes.peer = this.peer;
                tL_messages_getPollVotes.id = this.messageObject.getId();
                tL_messages_getPollVotes.limit = 50;
                int i3 = tL_messages_getPollVotes.flags;
                tL_messages_getPollVotes.option = votesList.option;
                tL_messages_getPollVotes.flags = i3 | 3;
                tL_messages_getPollVotes.offset = votesList.next_offset;
                this.chatActivity.getConnectionsManager().sendRequest(tL_messages_getPollVotes, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$new$3(votesList, chatActivity, tLObject, tL_error);
                    }
                });
                return;
            }
            if (view instanceof UserCell) {
                UserCell userCell = (UserCell) view;
                if (userCell.currentUser == null && userCell.currentChat == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (userCell.currentUser != null) {
                    bundle.putLong("user_id", userCell.currentUser.id);
                } else {
                    bundle.putLong("chat_id", userCell.currentChat.id);
                }
                lambda$new$0();
                ProfileActivity profileActivity = new ProfileActivity(bundle);
                if (userCell.currentUser != null) {
                    TLRPC.User currentUser = chatActivity.getCurrentUser();
                    if (currentUser != null && currentUser.id == userCell.currentUser.id) {
                        i2 = 1;
                    }
                    profileActivity.setPlayProfileAnimation(i2);
                } else {
                    TLRPC.Chat currentChat = chatActivity.getCurrentChat();
                    if (currentChat != null && currentChat.id == userCell.currentChat.id) {
                        i2 = 1;
                    }
                    profileActivity.setPlayProfileAnimation(i2);
                }
                chatActivity.presentFragment(profileActivity);
            }
        }
    }

    public void lambda$new$3(final VotesList votesList, final ChatActivity chatActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$2(votesList, tLObject, chatActivity);
            }
        });
    }

    public void lambda$new$2(VotesList votesList, TLObject tLObject, ChatActivity chatActivity) {
        if (isShowing()) {
            this.loadingMore.remove(votesList);
            if (tLObject != null) {
                TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject;
                chatActivity.getMessagesController().putUsers(tL_messages_votesList.users, false);
                votesList.votes.addAll(tL_messages_votesList.votes);
                votesList.next_offset = tL_messages_votesList.next_offset;
                animateSectionUpdates(null);
                this.listAdapter.update(true);
            }
        }
    }

    private void updateButtons() {
        this.votesPercents.clear();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) this.messageObject.messageOwner.media;
        ArrayList arrayList = new ArrayList();
        int size = this.voters.size();
        int i = 100;
        boolean z = false;
        int i2 = 0;
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            VotesList votesList = (VotesList) this.voters.get(i3);
            Button button = new Button();
            arrayList.add(button);
            this.votesPercents.put(votesList, button);
            if (!tL_messageMediaPoll.results.results.isEmpty()) {
                int size2 = tL_messageMediaPoll.results.results.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        TLRPC.TL_pollAnswerVoters tL_pollAnswerVoters = tL_messageMediaPoll.results.results.get(i4);
                        if (Arrays.equals(votesList.option, tL_pollAnswerVoters.option)) {
                            button.votesCount = tL_pollAnswerVoters.voters;
                            button.decimal = (tL_pollAnswerVoters.voters / tL_messageMediaPoll.results.total_voters) * 100.0f;
                            button.percent = (int) button.decimal;
                            Button.access$4024(button, button.percent);
                            if (i2 == 0) {
                                i2 = button.percent;
                            } else if (button.percent != 0 && i2 != button.percent) {
                                z = true;
                            }
                            i -= button.percent;
                            iMax = Math.max(button.percent, iMax);
                        } else {
                            i4++;
                        }
                    }
                }
            }
        }
        if (!z || i == 0) {
            return;
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return PollVotesAlert.lambda$updateButtons$5((PollVotesAlert.Button) obj, (PollVotesAlert.Button) obj2);
            }
        });
        int iMin = Math.min(i, arrayList.size());
        for (int i5 = 0; i5 < iMin; i5++) {
            Button.access$4112((Button) arrayList.get(i5), 1);
        }
    }

    public static int lambda$updateButtons$5(Button button, Button button2) {
        if (button.decimal > button2.decimal) {
            return -1;
        }
        return button.decimal < button2.decimal ? 1 : 0;
    }

    @Override
    public void dismissInternal() {
        int size = this.queries.size();
        for (int i = 0; i < size; i++) {
            this.chatActivity.getConnectionsManager().cancelRequest(((Integer) this.queries.get(i)).intValue(), true);
        }
        super.dismissInternal();
    }

    public void updateLayout(boolean z) {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.containerView.invalidate();
            return;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder == null || holder.getAdapterPosition() != 0) {
            top = iDp;
        }
        boolean z2 = top <= AndroidUtilities.dp(12.0f);
        if ((z2 && this.actionBar.getTag() == null) || (!z2 && this.actionBar.getTag() != null)) {
            this.actionBar.setTag(z2 ? 1 : null);
            AnimatorSet animatorSet = this.actionBarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.actionBarAnimation = null;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionBarAnimation = animatorSet2;
            animatorSet2.setDuration(180L);
            AnimatorSet animatorSet3 = this.actionBarAnimation;
            ActionBar actionBar = this.actionBar;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(actionBar, (Property<ActionBar, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.actionBarShadow, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
            this.actionBarAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    PollVotesAlert.this.actionBarAnimation = null;
                }
            });
            this.actionBarAnimation.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
        int iDp2 = top + (layoutParams.topMargin - AndroidUtilities.dp(11.0f));
        if (this.scrollOffsetY != iDp2) {
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = iDp2;
            recyclerListView2.setTopGlowOffset(iDp2 - layoutParams.topMargin);
            this.containerView.invalidate();
        }
    }

    public void updatePlaceholder() {
        if (this.placeholderPaint == null) {
            return;
        }
        int color = Theme.getColor(Theme.key_dialogBackground);
        int color2 = Theme.getColor(Theme.key_dialogBackgroundGray);
        int averageColor = AndroidUtilities.getAverageColor(color2, color);
        this.placeholderPaint.setColor(color2);
        float fDp = AndroidUtilities.dp(500.0f);
        this.gradientWidth = fDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, fDp, 0.0f, new int[]{color2, averageColor, color2}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
        this.placeholderGradient = linearGradient;
        this.placeholderPaint.setShader(linearGradient);
        Matrix matrix = new Matrix();
        this.placeholderMatrix = matrix;
        this.placeholderGradient.setLocalMatrix(matrix);
    }

    public class Adapter extends RecyclerListView.SectionsAdapter {
        private int currentAccount = UserConfig.selectedAccount;
        private Context mContext;

        @Override
        public String getLetter(int i) {
            return null;
        }

        public Adapter(Context context) {
            this.mContext = context;
        }

        @Override
        public Object getItem(int i, int i2) {
            int i3;
            if (i == 0) {
                return 293145;
            }
            int i4 = i - 1;
            if (i2 != 0) {
                if (i4 < 0 || i4 >= PollVotesAlert.this.voters.size() || (i3 = i2 - 1) >= ((VotesList) PollVotesAlert.this.voters.get(i4)).getCount()) {
                    return -182734;
                }
                return Integer.valueOf(Objects.hash(Long.valueOf(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) ((VotesList) PollVotesAlert.this.voters.get(i4)).votes.get(i3)).peer))));
            }
            return -928312;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (i == 0 || i2 == 0) {
                return false;
            }
            return PollVotesAlert.this.queries == null || PollVotesAlert.this.queries.isEmpty();
        }

        @Override
        public int getSectionCount() {
            return PollVotesAlert.this.voters.size() + 1;
        }

        @Override
        public int getCountForSection(int i) {
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

        private SectionCell createSectionCell() {
            return new SectionCell(this.mContext) {
                {
                    PollVotesAlert pollVotesAlert = PollVotesAlert.this;
                }

                @Override
                protected void onCollapseClick() {
                    VotesList votesList = (VotesList) getTag(R.id.object_tag);
                    if (votesList.votes.size() <= 15) {
                        return;
                    }
                    boolean z = votesList.collapsed;
                    votesList.collapsed = !z;
                    if (!z) {
                        votesList.collapsedCount = 10;
                    }
                    PollVotesAlert.this.animateSectionUpdates(this);
                    PollVotesAlert.this.listAdapter.update(true);
                }
            };
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = createSectionCell();
            }
            SectionCell sectionCell = (SectionCell) view;
            if (i == 0) {
                sectionCell.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
                VotesList votesList = (VotesList) PollVotesAlert.this.voters.get(i - 1);
                int size = PollVotesAlert.this.poll.answers.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    TLRPC.PollAnswer pollAnswer = PollVotesAlert.this.poll.answers.get(i3);
                    if (!Arrays.equals(pollAnswer.option, votesList.option) || ((Button) PollVotesAlert.this.votesPercents.get(votesList)) == null) {
                        i3++;
                    } else {
                        TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                        if (PollVotesAlert.this.messageObject != null && PollVotesAlert.this.messageObject.translated && PollVotesAlert.this.messageObject.messageOwner != null && PollVotesAlert.this.messageObject.messageOwner.translatedPoll != null) {
                            while (true) {
                                if (i2 >= PollVotesAlert.this.messageObject.messageOwner.translatedPoll.answers.size()) {
                                    break;
                                }
                                TLRPC.PollAnswer pollAnswer2 = PollVotesAlert.this.messageObject.messageOwner.translatedPoll.answers.get(i2);
                                if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                    tL_textWithEntities = pollAnswer2.text;
                                    break;
                                }
                                i2++;
                            }
                        }
                        sectionCell.setText(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, PollVotesAlert.this.calcPercent(votesList.option), votesList.count, votesList.getCollapsed(), false);
                        sectionCell.setTag(R.id.object_tag, votesList);
                    }
                }
            }
            return view;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i == 0) {
                userCell = PollVotesAlert.this.new UserCell(this.mContext);
            } else if (i == 1) {
                if (PollVotesAlert.this.titleTextView.getParent() != null) {
                    ((ViewGroup) PollVotesAlert.this.titleTextView.getParent()).removeView(PollVotesAlert.this.titleTextView);
                }
                userCell = PollVotesAlert.this.titleTextView;
            } else if (i == 2) {
                userCell = createSectionCell();
            } else {
                TextCell textCell = new TextCell(this.mContext, 23, true);
                textCell.setOffsetFromImage(65);
                textCell.setBackgroundColor(PollVotesAlert.this.getThemedColor(Theme.key_dialogBackground));
                textCell.setColors(Theme.key_switchTrackChecked, Theme.key_windowBackgroundWhiteBlueText4);
                userCell = textCell;
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            int i3 = 0;
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    return;
                }
                TextCell textCell = (TextCell) viewHolder.itemView;
                VotesList votesList = (VotesList) PollVotesAlert.this.voters.get(i - 1);
                textCell.setTextAndIcon((CharSequence) LocaleController.formatPluralString("ShowVotes", votesList.count - votesList.getCount(), new Object[0]), R.drawable.arrow_more, false);
                return;
            }
            SectionCell sectionCell = (SectionCell) viewHolder.itemView;
            VotesList votesList2 = (VotesList) PollVotesAlert.this.voters.get(i - 1);
            int size = PollVotesAlert.this.poll.answers.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC.PollAnswer pollAnswer = PollVotesAlert.this.poll.answers.get(i4);
                if (Arrays.equals(pollAnswer.option, votesList2.option) && ((Button) PollVotesAlert.this.votesPercents.get(votesList2)) != null) {
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    if (PollVotesAlert.this.messageObject != null && PollVotesAlert.this.messageObject.translated && PollVotesAlert.this.messageObject.messageOwner != null && PollVotesAlert.this.messageObject.messageOwner.translatedPoll != null) {
                        while (true) {
                            if (i3 >= PollVotesAlert.this.messageObject.messageOwner.translatedPoll.answers.size()) {
                                break;
                            }
                            TLRPC.PollAnswer pollAnswer2 = PollVotesAlert.this.messageObject.messageOwner.translatedPoll.answers.get(i3);
                            if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                tL_textWithEntities = pollAnswer2.text;
                                break;
                            }
                            i3++;
                        }
                    }
                    sectionCell.setText(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, PollVotesAlert.this.calcPercent(votesList2.option), votesList2.count, votesList2.getCollapsed(), false);
                    sectionCell.setTag(R.id.object_tag, votesList2);
                    return;
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 0) {
                int adapterPosition = viewHolder.getAdapterPosition();
                int sectionForPosition = getSectionForPosition(adapterPosition);
                int positionInSectionForPosition = getPositionInSectionForPosition(adapterPosition) - 1;
                UserCell userCell = (UserCell) viewHolder.itemView;
                VotesList votesList = (VotesList) PollVotesAlert.this.voters.get(sectionForPosition - 1);
                TLObject userOrChat = PollVotesAlert.this.chatActivity.getMessagesController().getUserOrChat(DialogObject.getPeerDialogId(((TLRPC.MessagePeerVote) votesList.votes.get(positionInSectionForPosition)).peer));
                boolean z = true;
                if (positionInSectionForPosition == votesList.getCount() - 1 && TextUtils.isEmpty(votesList.next_offset) && !votesList.collapsed) {
                    z = false;
                }
                userCell.setData(userOrChat, positionInSectionForPosition, z);
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (i == 0) {
                return 1;
            }
            if (i2 == 0) {
                return 2;
            }
            return i2 + (-1) < ((VotesList) PollVotesAlert.this.voters.get(i + (-1))).getCount() ? 0 : 3;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    public int calcPercent(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.voters.size(); i3++) {
            VotesList votesList = (VotesList) this.voters.get(i3);
            if (votesList != null) {
                i += votesList.count;
                if (Arrays.equals(votesList.option, bArr)) {
                    i2 += votesList.count;
                }
            }
        }
        if (i <= 0) {
            return 0;
        }
        return Math.round((i2 / i) * 100.0f);
    }

    public void animateSectionUpdates(View view) {
        View pinnedHeader;
        TLRPC.Message message;
        int i = -2;
        while (i < this.listView.getChildCount()) {
            if (i == -2) {
                pinnedHeader = view;
            } else {
                pinnedHeader = i == -1 ? this.listView.getPinnedHeader() : this.listView.getChildAt(i);
            }
            if (pinnedHeader instanceof SectionCell) {
                int i2 = R.id.object_tag;
                if (pinnedHeader.getTag(i2) instanceof VotesList) {
                    SectionCell sectionCell = (SectionCell) pinnedHeader;
                    VotesList votesList = (VotesList) pinnedHeader.getTag(i2);
                    int size = this.poll.answers.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            TLRPC.PollAnswer pollAnswer = this.poll.answers.get(i4);
                            if (!Arrays.equals(pollAnswer.option, votesList.option) || ((Button) this.votesPercents.get(votesList)) == null) {
                                i4++;
                            } else {
                                TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                                MessageObject messageObject = this.messageObject;
                                if (messageObject != null && messageObject.translated && (message = messageObject.messageOwner) != null && message.translatedPoll != null) {
                                    while (true) {
                                        if (i3 >= this.messageObject.messageOwner.translatedPoll.answers.size()) {
                                            break;
                                        }
                                        TLRPC.PollAnswer pollAnswer2 = this.messageObject.messageOwner.translatedPoll.answers.get(i3);
                                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                                            tL_textWithEntities = pollAnswer2.text;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                sectionCell.setText(tL_textWithEntities == null ? "" : tL_textWithEntities.text, tL_textWithEntities == null ? null : tL_textWithEntities.entities, calcPercent(votesList.option), votesList.count, votesList.getCollapsed(), true);
                                sectionCell.setTag(R.id.object_tag, votesList);
                            }
                        }
                    }
                }
            }
            i++;
        }
        this.listView.relayoutPinnedHeader();
        this.listView.invalidate();
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.updatePlaceholder();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.containerView, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        ViewGroup viewGroup = this.containerView;
        Drawable[] drawableArr = {this.shadowDrawable};
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(viewGroup, 0, null, null, drawableArr, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        ActionBar actionBar = this.actionBar;
        int i2 = ThemeDescription.FLAG_AB_ITEMSCOLOR;
        int i3 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBTITLECOLOR, null, null, null, null, Theme.key_player_actionBarSubtitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBarShadow, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_dialogShadowLine));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, (String[]) null, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_dialogBackgroundGray));
        int i4 = Theme.key_graySectionText;
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SectionCell.class}, new String[]{"middleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SectionCell.class}, new String[]{"righTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{SectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        return arrayList;
    }
}
