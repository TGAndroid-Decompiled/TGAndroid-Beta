package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DotDividerSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MessageSeenCheckDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.StatusBadgeComponent;
import org.telegram.ui.Stories.StoriesUtilities;

public class ReactedUserHolderView extends FrameLayout {
    public static final MessageSeenCheckDrawable forwardDrawable;
    public static final MessageSeenCheckDrawable reactDrawable;
    public static final MessageSeenCheckDrawable repostDrawable;
    public static final MessageSeenCheckDrawable seenDrawable;
    public ValueAnimator alphaAnimator;
    public float alphaInternal;
    public final AvatarDrawable avatarDrawable;
    public final AnonymousClass2 avatarView;
    public final int currentAccount;
    public long dialogId;
    public boolean drawDivider;
    public final UserCell.AnonymousClass1 params;
    public final BackupImageView reactView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final StatusBadgeComponent statusBadgeComponent;
    public int storyId;
    public final BackupImageView storyPreviewView;
    public final int style;
    public final SimpleTextView subtitleView;
    public final UserCell2.AnonymousClass1 titleView;

    static {
        int i = R.drawable.msg_mini_checks;
        int i2 = Theme.key_windowBackgroundWhiteGrayText;
        seenDrawable = new MessageSeenCheckDrawable(i, i2);
        MessageSeenCheckDrawable messageSeenCheckDrawable = new MessageSeenCheckDrawable(R.drawable.msg_reactions, i2);
        messageSeenCheckDrawable.w = 16;
        messageSeenCheckDrawable.h = 16;
        reactDrawable = messageSeenCheckDrawable;
        int i3 = R.drawable.mini_repost_story;
        int i4 = Theme.key_stories_circle1;
        repostDrawable = new MessageSeenCheckDrawable(i3, i4);
        forwardDrawable = new MessageSeenCheckDrawable(R.drawable.mini_forward_story, i4);
    }

    public ReactedUserHolderView(final int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        this.alphaInternal = 1.0f;
        this.style = i;
        this.currentAccount = i2;
        this.resourcesProvider = resourcesProvider;
        this.params = new UserCell.AnonymousClass1(this, resourcesProvider);
        setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(50.0f)));
        int i3 = i == 1 ? 48 : 34;
        ?? r7 = new BackupImageView(context) {
            @Override
            public final void onDraw(Canvas canvas) {
                MessageSeenCheckDrawable messageSeenCheckDrawable = ReactedUserHolderView.seenDrawable;
                if (i != 1) {
                    super.onDraw(canvas);
                    return;
                }
                ReactedUserHolderView reactedUserHolderView = ReactedUserHolderView.this;
                reactedUserHolderView.params.originalAvatarRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                StoriesUtilities.drawAvatarWithStory(reactedUserHolderView.dialogId, canvas, getImageReceiver(), reactedUserHolderView.params);
            }

            @Override
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return ReactedUserHolderView.this.params.checkOnTouchEvent(motionEvent, this);
            }
        };
        this.avatarView = r7;
        float f = i3;
        r7.setRoundRadius(AndroidUtilities.dp(f));
        addView((View) r7, LayoutHelper.createFrameRelatively(f, f, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i == 1) {
            setClipChildren(false);
        }
        UserCell2.AnonymousClass1 anonymousClass1 = new UserCell2.AnonymousClass1(context, 2);
        this.titleView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        anonymousClass1.setTextSize(16);
        anonymousClass1.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        anonymousClass1.setEllipsizeByGradient(true);
        anonymousClass1.setImportantForAccessibility(2);
        anonymousClass1.setRightPadding(AndroidUtilities.dp(30.0f));
        anonymousClass1.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        anonymousClass1.setRightDrawableOutside(true);
        float f2 = i == 1 ? 7.66f : 5.33f;
        float f3 = i == 1 ? 73.0f : 55.0f;
        addView(anonymousClass1, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 55, f3, f2, 12.0f, 0.0f));
        StatusBadgeComponent statusBadgeComponent = new StatusBadgeComponent(18, this);
        this.statusBadgeComponent = statusBadgeComponent;
        anonymousClass1.setDrawablePadding(AndroidUtilities.dp(3.0f));
        anonymousClass1.setRightDrawable(statusBadgeComponent.statusDrawable);
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.subtitleView = simpleTextView;
        simpleTextView.setTextSize(13);
        simpleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        simpleTextView.setEllipsizeByGradient(true);
        simpleTextView.setImportantForAccessibility(2);
        simpleTextView.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        addView(simpleTextView, LayoutHelper.createFrameRelatively(-1.0f, -2.0f, 55, f3, i == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z2) {
            BackupImageView backupImageView = new BackupImageView(context);
            this.reactView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.storyPreviewView = backupImageView2;
            addView(backupImageView2, LayoutHelper.createFrameRelatively(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z) {
            View view = new View(context);
            view.setBackground(Theme.getSelectorDrawable(false));
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
        }
    }

    public final void animateAlpha(float f, boolean z) {
        ValueAnimator valueAnimator = this.alphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.alphaAnimator = null;
        }
        if (!z) {
            this.alphaInternal = f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.alphaInternal, f);
        this.alphaAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 9));
        this.alphaAnimator.addListener(new SlideIntChooseView.AnonymousClass3(this, f, 3));
        this.alphaAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.alphaAnimator.setDuration(420L);
        this.alphaAnimator.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        if (this.alphaInternal < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.alphaInternal * 255.0f), 31);
            z = true;
        } else {
            z = false;
        }
        super.dispatchDraw(canvas);
        if (this.drawDivider) {
            float fDp = AndroidUtilities.dp(this.style == 1 ? 73.0f : 55.0f);
            boolean z2 = LocaleController.isRTL;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            if (z2) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - fDp, getMeasuredHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            } else {
                canvas.drawLine(fDp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.getThemePaint("paintDivider", resourcesProvider));
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.alphaInternal;
    }

    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.statusBadgeComponent.statusDrawable.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.statusBadgeComponent.statusDrawable.detach();
        this.params.reset();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.style == 0 ? 50 : 58), 1073741824));
    }

    public void openStory(long j) {
    }

    public final void setUserReaction(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z, long j, TL_stories.StoryItem storyItem, boolean z2, boolean z3, boolean z4) {
        TLRPC.ChatPhoto chatPhoto;
        BitmapDrawable bitmapDrawable;
        Drawable drawable;
        String string;
        boolean z5;
        boolean z6;
        long j2;
        SimpleTextView simpleTextView;
        float fDp;
        float f;
        float fDp2;
        float f2;
        MessageSeenCheckDrawable messageSeenCheckDrawable;
        SpannableStringBuilder spannableStringBuilder;
        float f3;
        TL_stories.StoryFwdHeader storyFwdHeader;
        float fDp3;
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLObject tLObject = user == null ? chat : user;
        if (tLObject == null) {
            return;
        }
        int i = this.style == 1 ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_chats_verifiedBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.statusBadgeComponent.updateDrawable(user, chat, Theme.getColor(i, resourcesProvider), false);
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        int i2 = this.currentAccount;
        avatarDrawable.setInfo(i2, tLObject);
        UserCell2.AnonymousClass1 anonymousClass1 = this.titleView;
        if (user != null) {
            this.dialogId = user.id;
            anonymousClass1.setText(UserObject.getUserName(user));
        } else {
            this.dialogId = -chat.id;
            anonymousClass1.setText(chat.title);
        }
        if (user == null ? !((chatPhoto = chat.photo) == null || (bitmapDrawable = chatPhoto.strippedBitmap) == null) : !((userProfilePhoto = user.photo) == null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null)) {
            drawable = avatarDrawable;
            drawable = avatarDrawable;
            drawable = avatarDrawable;
            drawable = avatarDrawable;
            drawable = bitmapDrawable;
        }
        drawable = avatarDrawable;
        drawable = avatarDrawable;
        drawable = avatarDrawable;
        drawable = avatarDrawable;
        drawable = avatarDrawable;
        drawable = avatarDrawable;
        setImage(ImageLocation.getForUserOrChat(i2, tLObject, 1), "50_50", drawable, tLObject);
        BackupImageView backupImageView = this.reactView;
        if (z) {
            if (backupImageView != null) {
                backupImageView.setAnimatedEmojiDrawable(null);
            }
            Drawable drawableMutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            backupImageView.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            backupImageView.setImageDrawable(drawableMutate);
            string = LocaleController.formatString("AccDescrLike", R.string.AccDescrLike, new Object[0]);
            z5 = true;
        } else if (reaction != null) {
            ReactionsLayoutInBubble.VisibleReaction visibleReactionFromTL = ReactionsLayoutInBubble.VisibleReaction.fromTL(reaction);
            if (visibleReactionFromTL.emojicon != null) {
                if (backupImageView != null) {
                    backupImageView.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i2).getReactionsMap().get(visibleReactionFromTL.emojicon);
                if (backupImageView != null) {
                    if (tL_availableReaction != null) {
                        backupImageView.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, null, DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, Theme.key_windowBackgroundGray, 1.0f), "webp", 0, tL_availableReaction);
                        z6 = true;
                    } else {
                        backupImageView.setImageDrawable(null);
                        z6 = false;
                    }
                    backupImageView.setColorFilter(null);
                } else {
                    z6 = false;
                }
            } else {
                AnimatedEmojiDrawable animatedEmojiDrawable = new AnimatedEmojiDrawable(0, i2, visibleReactionFromTL.documentId);
                animatedEmojiDrawable.setColorFilter(resourcesProvider != null ? resourcesProvider.getAnimatedEmojiColorFilter() : Theme.chat_animatedEmojiTextColorFilter);
                if (backupImageView != null) {
                    backupImageView.setAnimatedEmojiDrawable(animatedEmojiDrawable);
                }
                z6 = true;
            }
            int i3 = R.string.AccDescrReactedWith;
            CharSequence text = anonymousClass1.getText();
            Object obj = visibleReactionFromTL.emojicon;
            if (obj == null) {
                obj = reaction;
            }
            string = LocaleController.formatString("AccDescrReactedWith", i3, text, obj);
            z5 = z6;
        } else {
            if (backupImageView != null) {
                backupImageView.setAnimatedEmojiDrawable(null);
                backupImageView.setImageDrawable(null);
            }
            string = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, anonymousClass1.getText());
            z5 = false;
        }
        BackupImageView backupImageView2 = this.storyPreviewView;
        if (storyItem != null) {
            this.storyId = storyItem.id;
            if (backupImageView2 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia != null && (photo = messageMedia.photo) != null) {
                    backupImageView2.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, null, null, -1, storyItem);
                } else if (messageMedia != null && (document = messageMedia.document) != null) {
                    backupImageView2.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, null, null, -1, storyItem);
                }
                backupImageView2.setRoundRadius(AndroidUtilities.dp(3.33f));
            }
            if (j <= 0) {
                j2 = storyItem.date;
            }
            if (j2 != 0) {
                StringBuilder sbM = Log.m(string, " ");
                sbM.append(LocaleController.formatSeenDate(j2));
                string = sbM.toString();
            }
            setContentDescription(string);
            simpleTextView = this.subtitleView;
            fDp = 0.0f;
            if (j2 != 0) {
                simpleTextView.setVisibility(0);
                if (storyItem != null) {
                    if (z2) {
                        messageSeenCheckDrawable = forwardDrawable;
                    } else {
                        messageSeenCheckDrawable = repostDrawable;
                    }
                } else if (z3) {
                    messageSeenCheckDrawable = seenDrawable;
                } else {
                    messageSeenCheckDrawable = reactDrawable;
                }
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) messageSeenCheckDrawable.getSpanned(getContext(), resourcesProvider));
                spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j2));
                if (!z2 || storyItem == null) {
                    f3 = 5.0f;
                } else {
                    f3 = 5.0f;
                    if (!TextUtils.isEmpty(storyItem.caption)) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        DotDividerSpan dotDividerSpan = new DotDividerSpan();
                        dotDividerSpan.size = 2.33333f;
                        dotDividerSpan.topPadding = AndroidUtilities.dp(5.0f);
                        spannableStringBuilder.setSpan(dotDividerSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryRepostCommented));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                    }
                    simpleTextView.setText(spannableStringBuilder, false);
                    if (z3) {
                        fDp3 = 0.0f;
                    } else {
                        fDp3 = AndroidUtilities.dp(-1.0f);
                    }
                    simpleTextView.setTranslationY(fDp3);
                    anonymousClass1.setTranslationY(0.0f);
                    if (z4) {
                        anonymousClass1.setTranslationY(AndroidUtilities.dp(9.0f));
                        anonymousClass1.animate().translationY(0.0f);
                        simpleTextView.setAlpha(0.0f);
                        simpleTextView.animate().alpha(1.0f);
                    }
                }
                if (!z2 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    DotDividerSpan dotDividerSpan2 = new DotDividerSpan();
                    dotDividerSpan2.size = 2.33333f;
                    dotDividerSpan2.topPadding = AndroidUtilities.dp(f3);
                    spannableStringBuilder.setSpan(dotDividerSpan2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                }
                simpleTextView.setText(spannableStringBuilder, false);
                if (z3) {
                    fDp3 = AndroidUtilities.dp(-1.0f);
                } else {
                    fDp3 = 0.0f;
                }
                simpleTextView.setTranslationY(fDp3);
                anonymousClass1.setTranslationY(0.0f);
                if (z4) {
                    anonymousClass1.setTranslationY(AndroidUtilities.dp(9.0f));
                    anonymousClass1.animate().translationY(0.0f);
                    simpleTextView.setAlpha(0.0f);
                    simpleTextView.animate().alpha(1.0f);
                }
            } else {
                simpleTextView.setVisibility(8);
                anonymousClass1.setTranslationY(AndroidUtilities.dp(9.0f));
            }
            if (z5) {
                f = 30.0f;
            } else {
                f = 0.0f;
            }
            anonymousClass1.setRightPadding(AndroidUtilities.dp(f));
            if (z5 || !LocaleController.isRTL) {
                fDp2 = 0.0f;
            } else {
                fDp2 = AndroidUtilities.dp(30.0f);
            }
            anonymousClass1.setTranslationX(fDp2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) simpleTextView.getLayoutParams();
            if (z5 || LocaleController.isRTL) {
                f2 = 12.0f;
            } else {
                f2 = 36.0f;
            }
            marginLayoutParams.rightMargin = AndroidUtilities.dp(f2);
            if (z5 && LocaleController.isRTL) {
                fDp = AndroidUtilities.dp(30.0f);
            }
            simpleTextView.setTranslationX(fDp);
        }
        this.storyId = -1;
        if (backupImageView2 != null) {
            backupImageView2.setImageDrawable(null);
        }
        j2 = j;
        if (j2 != 0) {
            StringBuilder sbM2 = Log.m(string, " ");
            sbM2.append(LocaleController.formatSeenDate(j2));
            string = sbM2.toString();
        }
        setContentDescription(string);
        simpleTextView = this.subtitleView;
        fDp = 0.0f;
        if (j2 != 0) {
            simpleTextView.setVisibility(0);
            if (storyItem != null) {
                if (z2) {
                    messageSeenCheckDrawable = forwardDrawable;
                } else {
                    messageSeenCheckDrawable = repostDrawable;
                }
            } else if (z3) {
                messageSeenCheckDrawable = seenDrawable;
            } else {
                messageSeenCheckDrawable = reactDrawable;
            }
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) messageSeenCheckDrawable.getSpanned(getContext(), resourcesProvider));
            spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j2));
            if (z2) {
                f3 = 5.0f;
                if (!z2) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    DotDividerSpan dotDividerSpan3 = new DotDividerSpan();
                    dotDividerSpan3.size = 2.33333f;
                    dotDividerSpan3.topPadding = AndroidUtilities.dp(f3);
                    spannableStringBuilder.setSpan(dotDividerSpan3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length3, spannableStringBuilder.length(), 33);
                }
            } else {
                f3 = 5.0f;
                if (!z2) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    DotDividerSpan dotDividerSpan4 = new DotDividerSpan();
                    dotDividerSpan4.size = 2.33333f;
                    dotDividerSpan4.topPadding = AndroidUtilities.dp(f3);
                    spannableStringBuilder.setSpan(dotDividerSpan4, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length4, spannableStringBuilder.length(), 33);
                }
            }
            simpleTextView.setText(spannableStringBuilder, false);
            if (z3) {
                fDp3 = AndroidUtilities.dp(-1.0f);
            } else {
                fDp3 = 0.0f;
            }
            simpleTextView.setTranslationY(fDp3);
            anonymousClass1.setTranslationY(0.0f);
            if (z4) {
                anonymousClass1.setTranslationY(AndroidUtilities.dp(9.0f));
                anonymousClass1.animate().translationY(0.0f);
                simpleTextView.setAlpha(0.0f);
                simpleTextView.animate().alpha(1.0f);
            }
        } else {
            simpleTextView.setVisibility(8);
            anonymousClass1.setTranslationY(AndroidUtilities.dp(9.0f));
        }
        if (z5) {
            f = 30.0f;
        } else {
            f = 0.0f;
        }
        anonymousClass1.setRightPadding(AndroidUtilities.dp(f));
        if (z5) {
            fDp2 = 0.0f;
        } else {
            fDp2 = 0.0f;
        }
        anonymousClass1.setTranslationX(fDp2);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) simpleTextView.getLayoutParams();
        if (z5) {
            f2 = 12.0f;
        } else {
            f2 = 12.0f;
        }
        marginLayoutParams2.rightMargin = AndroidUtilities.dp(f2);
        if (z5) {
            fDp = AndroidUtilities.dp(30.0f);
        }
        simpleTextView.setTranslationX(fDp);
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i = this.currentAccount;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i).getUser(Long.valueOf(peerId));
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(-peerId));
            user = null;
            chat = chat2;
        }
        setUserReaction(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }
}
