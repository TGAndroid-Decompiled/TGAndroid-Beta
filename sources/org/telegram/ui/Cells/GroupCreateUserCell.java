package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;

public final class GroupCreateUserCell extends FrameLayout {
    public static final int $r8$clinit = 0;
    public ValueAnimator animator;
    public final AvatarDrawable avatarDrawable;
    public final BackupImageView avatarImageView;
    public TL_account.requirementToContactPremium blockedOverridden;
    public final CheckBox2 checkBox;
    public final int checkBoxType;
    public float checkProgress;
    public final int currentAccount;
    public boolean currentMiniapps;
    public CharSequence currentName;
    public Object currentObject;
    public boolean currentPremium;
    public CharSequence currentStatus;
    public boolean drawDivider;
    public final boolean forceDarkTheme;
    public boolean isChecked;
    public String lastName;
    public int lastStatus;
    public Paint lockBackgroundPaint;
    public Drawable lockDrawable;
    public final UserCell2.AnonymousClass1 nameTextView;
    public final int padding;
    public final Paint paint;
    public boolean premiumBlocked;
    public final AnimatedFloat premiumBlockedT;
    public PremiumGradient.PremiumGradientTools premiumGradient;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean showPremiumBlocked;
    public final boolean showSelfAsSaved;
    public long starsPriceBlocked;
    public final SimpleTextView statusTextView;

    public GroupCreateUserCell(int i, int i2, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.resourcesProvider = resourcesProvider;
        this.checkBoxType = i;
        this.forceDarkTheme = z2;
        this.drawDivider = false;
        this.padding = i2;
        this.showSelfAsSaved = z;
        this.avatarDrawable = new AvatarDrawable();
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z3 = LocaleController.isRTL;
        addView(backupImageView, LayoutHelper.createFrame(46, 46.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : i2 + 13, 6.0f, z3 ? i2 + 13 : 0.0f, 0.0f));
        UserCell2.AnonymousClass1 anonymousClass1 = new UserCell2.AnonymousClass1(context, 1);
        this.nameTextView = anonymousClass1;
        NotificationCenter.listenEmojiLoading(anonymousClass1);
        anonymousClass1.setTextColor(Theme.getColor(z2 ? Theme.key_voipgroup_nameText : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        anonymousClass1.setTypeface(AndroidUtilities.bold());
        anonymousClass1.setTextSize(16);
        anonymousClass1.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z4 = LocaleController.isRTL;
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 20.0f, (z4 ? 5 : 3) | 48, (z4 ? 28 : 72) + i2, 10.0f, (z4 ? 72 : 28) + i2, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.statusTextView = simpleTextView;
        simpleTextView.setTextSize(14);
        simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z5 = LocaleController.isRTL;
        addView(simpleTextView, LayoutHelper.createFrame(-1, 20.0f, (z5 ? 5 : 3) | 48, (z5 ? 28 : 72) + i2, 32.0f, (z5 ? 72 : 28) + i2, 0.0f));
        if (i == 1) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(false);
            checkBox2.setDrawBackgroundAsArc(3);
            boolean z6 = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : i2 + 40, 33.0f, z6 ? i2 + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float f = this.premiumBlockedT.set(this.premiumBlocked);
        if (f > 0.0f) {
            BackupImageView backupImageView = this.avatarImageView;
            float height = (backupImageView.getHeight() / 2.0f) + backupImageView.getY() + AndroidUtilities.dp(18.0f);
            float width = (backupImageView.getWidth() / 2.0f) + backupImageView.getX() + AndroidUtilities.dp(18.0f);
            canvas.save();
            Paint paint2 = Theme.dialogs_onlineCirclePaint;
            int i = Theme.key_windowBackgroundWhite;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            paint2.setColor(Theme.getColor(i, resourcesProvider));
            canvas.drawCircle(width, height, AndroidUtilities.dp(11.33f) * f, Theme.dialogs_onlineCirclePaint);
            if (this.blockedOverridden == null) {
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, this.resourcesProvider);
                }
                this.premiumGradient.gradientMatrix((int) (width - AndroidUtilities.dp(10.0f)), (int) (height - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + width), (int) (AndroidUtilities.dp(10.0f) + height), 0.0f, 0.0f);
                paint = this.premiumGradient.paint;
            } else {
                if (this.lockBackgroundPaint == null) {
                    this.lockBackgroundPaint = new Paint();
                }
                this.lockBackgroundPaint.setColor(Theme.getColor(Theme.key_avatar_backgroundGray, resourcesProvider));
                paint = this.lockBackgroundPaint;
            }
            canvas.drawCircle(width, height, AndroidUtilities.dp(10.0f) * f, paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.lockDrawable;
            drawable.setBounds((int) (width - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f)), (int) (height - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f)), (int) (((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f) + width), (int) (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f) + height));
            this.lockDrawable.setAlpha((int) (f * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
        }
    }

    public CheckBox2 getCheckBox() {
        return this.checkBox;
    }

    public Object getObject() {
        return this.currentObject;
    }

    public SimpleTextView getStatusTextView() {
        return this.statusTextView;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.premiumBlockedT.set(this.premiumBlocked);
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (f <= 0.0f && this.checkBoxType == 2 && (this.isChecked || this.checkProgress > 0.0f)) {
            Paint paint = this.paint;
            paint.setColor(Theme.getColor(Theme.key_checkboxSquareBackground, resourcesProvider));
            BackupImageView backupImageView = this.avatarImageView;
            canvas.drawCircle((backupImageView.getMeasuredWidth() / 2) + backupImageView.getLeft(), (backupImageView.getMeasuredHeight() / 2) + backupImageView.getTop(), (AndroidUtilities.dp(4.0f) * this.checkProgress) + AndroidUtilities.dp(18.0f), paint);
        }
        if (this.drawDivider) {
            boolean z = LocaleController.isRTL;
            int i = this.padding;
            int iDp = AndroidUtilities.dp(z ? 0.0f : i + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? i + 72 : 0.0f);
            if (!this.forceDarkTheme) {
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.getThemePaint("paintDivider", resourcesProvider));
            } else {
                Theme.dividerExtraPaint.setColor(Theme.getColor(Theme.key_voipgroup_actionBar, resourcesProvider));
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.dividerExtraPaint);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null ? checkBox2.isChecked() : this.isChecked) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        Object obj = this.currentObject;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.currentObject)) ? 58.0f : 50.0f), 1073741824));
    }

    public void setCheckBoxEnabled(boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setEnabled(z);
        }
    }

    public final void setChecked(boolean z, boolean z2) {
        int i = 4;
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setChecked(z, z2);
            return;
        }
        if (this.checkBoxType != 2 || this.isChecked == z) {
            return;
        }
        this.isChecked = z;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, i));
            this.animator.addListener(new BotButton.AnonymousClass1(this, i));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.start();
        } else {
            BackupImageView backupImageView = this.avatarImageView;
            backupImageView.setScaleX(this.isChecked ? 0.82f : 1.0f);
            backupImageView.setScaleY(this.isChecked ? 0.82f : 1.0f);
            this.checkProgress = this.isChecked ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void setDrawDivider(boolean z) {
        this.drawDivider = z;
        invalidate();
    }

    public void setForbiddenCheck(boolean z) {
        this.checkBox.setForbidden(z);
    }

    public final void setObject(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.currentObject = obj;
        this.currentStatus = charSequence2;
        this.currentName = charSequence;
        this.drawDivider = false;
        this.currentPremium = false;
        this.currentMiniapps = false;
        update(0);
    }

    public final void update(int i) {
        String str;
        TLRPC.Chat chat;
        String str2;
        String userName;
        TLRPC.UserStatus userStatus;
        float f;
        CharSequence charSequence;
        int i2;
        Object obj = this.currentObject;
        if (obj == null || this.currentPremium || this.currentMiniapps) {
            return;
        }
        boolean z = obj instanceof String;
        CheckBox2 checkBox2 = this.checkBox;
        BackupImageView backupImageView = this.avatarImageView;
        AvatarDrawable avatarDrawable = this.avatarDrawable;
        SimpleTextView simpleTextView = this.statusTextView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean z2 = this.forceDarkTheme;
        UserCell2.AnonymousClass1 anonymousClass1 = this.nameTextView;
        if (!z) {
            CharSequence charSequence2 = this.currentStatus;
            if (charSequence2 == null || !TextUtils.isEmpty(charSequence2)) {
                ((FrameLayout.LayoutParams) anonymousClass1.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            } else {
                ((FrameLayout.LayoutParams) anonymousClass1.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            }
            ViewGroup.LayoutParams layoutParams = backupImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = backupImageView.getLayoutParams();
            int iDp = AndroidUtilities.dp(46.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            if (checkBox2 != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) checkBox2.getLayoutParams();
                int iDp2 = AndroidUtilities.dp(29.0f);
                int i3 = this.padding;
                layoutParams3.topMargin = iDp2 + i3;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + i3;
                } else {
                    ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + i3;
                }
            }
            Object obj2 = this.currentObject;
            boolean z3 = obj2 instanceof TLRPC.User;
            int i4 = this.currentAccount;
            if (z3) {
                TLRPC.User user = (TLRPC.User) obj2;
                if (this.showSelfAsSaved && UserObject.isUserSelf(user)) {
                    anonymousClass1.setText(LocaleController.getString(R.string.SavedMessages), true);
                    simpleTextView.setText(null);
                    avatarDrawable.setAvatarType(1);
                    backupImageView.setImage((ImageLocation) null, "50_50", avatarDrawable, user);
                    ((FrameLayout.LayoutParams) anonymousClass1.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                TLRPC.FileLocation fileLocation = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
                if (i != 0) {
                    boolean z4 = ((i & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation == null) ? false : true;
                    if (this.currentStatus == null && !z4 && (i & MessagesController.UPDATE_MASK_STATUS) != 0) {
                        TLRPC.UserStatus userStatus2 = user.status;
                        if ((userStatus2 != null ? userStatus2.expires : 0) != this.lastStatus) {
                            z4 = true;
                        }
                    }
                    if (z4 || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        userName = null;
                    } else {
                        userName = UserObject.getUserName(user);
                        if (!userName.equals(this.lastName)) {
                            z4 = true;
                        }
                    }
                    if (!z4) {
                        return;
                    }
                } else {
                    userName = null;
                }
                avatarDrawable.setInfo(i4, user);
                TLRPC.UserStatus userStatus3 = user.status;
                this.lastStatus = userStatus3 != null ? userStatus3.expires : 0;
                CharSequence charSequence3 = this.currentName;
                if (charSequence3 != null) {
                    this.lastName = null;
                    anonymousClass1.setText(charSequence3, true);
                } else {
                    if (userName == null) {
                        userName = UserObject.getUserName(user);
                    }
                    this.lastName = userName;
                    anonymousClass1.setText(userName);
                }
                if (this.currentStatus == null) {
                    if (user.bot) {
                        int i5 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView.setTag(Integer.valueOf(i5));
                        if (z2) {
                            i5 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView.setTextColor(Theme.getColor(i5, resourcesProvider));
                        simpleTextView.setText(LocaleController.getString(R.string.Bot));
                    } else if (user.id == UserConfig.getInstance(i4).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i4).getCurrentTime()) || MessagesController.getInstance(i4).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                        int i6 = Theme.key_windowBackgroundWhiteBlueText;
                        simpleTextView.setTag(Integer.valueOf(i6));
                        if (z2) {
                            i6 = Theme.key_voipgroup_listeningText;
                        }
                        simpleTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
                        simpleTextView.setText(LocaleController.getString(R.string.Online));
                    } else {
                        int i7 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView.setTag(Integer.valueOf(i7));
                        if (z2) {
                            i7 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView.setTextColor(Theme.getColor(i7, resourcesProvider));
                        simpleTextView.setText(LocaleController.formatUserStatus(i4, user));
                    }
                    simpleTextView.setEmojiColor(simpleTextView.getTextColor());
                }
                backupImageView.setForUserOrChat(user, avatarDrawable);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation2 = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    boolean z5 = ((i & MessagesController.UPDATE_MASK_AVATAR) == 0 || fileLocation2 == null) ? false : true;
                    if (z5 || this.currentName != null || (str2 = this.lastName) == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z5 = true;
                        }
                    }
                    if (!z5) {
                        return;
                    }
                } else {
                    str = null;
                }
                avatarDrawable.setInfo(i4, chat2);
                CharSequence charSequence4 = this.currentName;
                if (charSequence4 != null) {
                    this.lastName = null;
                    anonymousClass1.setText(charSequence4, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.lastName = str;
                    anonymousClass1.setText(str);
                }
                if (this.currentStatus == null) {
                    int i8 = Theme.key_windowBackgroundWhiteGrayText;
                    simpleTextView.setTag(Integer.valueOf(i8));
                    if (z2) {
                        i8 = Theme.key_voipgroup_lastSeenText;
                    }
                    simpleTextView.setTextColor(Theme.getColor(null, i8, false));
                    simpleTextView.setEmojiColor(simpleTextView.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            simpleTextView.setText(LocaleController.formatPluralString("Members", chat2.participants_count, new Object[0]));
                        } else {
                            simpleTextView.setText(LocaleController.formatPluralString("Subscribers", chat2.participants_count, new Object[0]));
                        }
                    } else if (chat2.has_geo) {
                        simpleTextView.setText(LocaleController.getString(R.string.MegaLocation));
                    } else if (ChatObject.isPublic(chat2)) {
                        if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                            simpleTextView.setText(LocaleController.getString(R.string.MegaPublic));
                        } else {
                            simpleTextView.setText(LocaleController.getString(R.string.ChannelPublic));
                        }
                    } else if (!ChatObject.isChannel(chat2) || chat2.megagroup) {
                        simpleTextView.setText(LocaleController.getString(R.string.MegaPrivate));
                    } else {
                        simpleTextView.setText(LocaleController.getString(R.string.ChannelPrivate));
                    }
                }
                backupImageView.setForUserOrChat(chat2, avatarDrawable);
                chat = chat2;
            }
            if (chat == null && chat.forum) {
                f = 14.0f;
            } else {
                f = 24.0f;
            }
            backupImageView.setRoundRadius(AndroidUtilities.dp(f));
            charSequence = this.currentStatus;
            if (charSequence != null) {
                simpleTextView.setText(charSequence, true);
                i2 = Theme.key_windowBackgroundWhiteGrayText;
                simpleTextView.setTag(Integer.valueOf(i2));
                if (z2) {
                    i2 = Theme.key_voipgroup_lastSeenText;
                }
                simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
                simpleTextView.setEmojiColor(simpleTextView.getTextColor());
            }
            updatePremiumBlocked();
        }
        ((FrameLayout.LayoutParams) anonymousClass1.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
        ViewGroup.LayoutParams layoutParams4 = backupImageView.getLayoutParams();
        ViewGroup.LayoutParams layoutParams5 = backupImageView.getLayoutParams();
        int iDp3 = AndroidUtilities.dp(38.0f);
        layoutParams5.height = iDp3;
        layoutParams4.width = iDp3;
        if (checkBox2 != null) {
            ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
            if (LocaleController.isRTL) {
                ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
            } else {
                ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
            }
        }
        String str3 = (String) this.currentObject;
        str3.getClass();
        switch (str3) {
            case "archived":
                avatarDrawable.setAvatarType(11);
                break;
            case "groups":
                avatarDrawable.setAvatarType(6);
                break;
            case "non_contacts":
                avatarDrawable.setAvatarType(5);
                break;
            case "contacts":
                avatarDrawable.setAvatarType(4);
                break;
            case "new_chats":
                avatarDrawable.setAvatarType(24);
                break;
            case "bots":
                avatarDrawable.setAvatarType(8);
                break;
            case "read":
                avatarDrawable.setAvatarType(10);
                break;
            case "muted":
                avatarDrawable.setAvatarType(9);
                break;
            case "existing_chats":
                avatarDrawable.setAvatarType(23);
                break;
            case "channels":
                avatarDrawable.setAvatarType(7);
                break;
        }
        this.lastName = null;
        anonymousClass1.setText(this.currentName, true);
        simpleTextView.setText(null);
        backupImageView.setImage(null, "50_50", avatarDrawable);
        chat = null;
        if (chat == null) {
            f = 24.0f;
        } else {
            f = 24.0f;
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp(f));
        charSequence = this.currentStatus;
        if (charSequence != null) {
            simpleTextView.setText(charSequence, true);
            i2 = Theme.key_windowBackgroundWhiteGrayText;
            simpleTextView.setTag(Integer.valueOf(i2));
            if (z2) {
                i2 = Theme.key_voipgroup_lastSeenText;
            }
            simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
            simpleTextView.setEmojiColor(simpleTextView.getTextColor());
        }
        updatePremiumBlocked();
    }

    public final void updatePremiumBlocked() {
        TL_account.RequirementToContact requirementToContactIsUserContactBlocked;
        if (this.showPremiumBlocked) {
            requirementToContactIsUserContactBlocked = this.blockedOverridden;
            if (requirementToContactIsUserContactBlocked == null) {
                if (this.currentObject instanceof TLRPC.User) {
                    requirementToContactIsUserContactBlocked = MessagesController.getInstance(this.currentAccount).isUserContactBlocked(((TLRPC.User) this.currentObject).id);
                } else {
                    requirementToContactIsUserContactBlocked = null;
                }
            }
        } else {
            requirementToContactIsUserContactBlocked = null;
        }
        if (this.premiumBlocked == DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked) && this.starsPriceBlocked == DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked)) {
            return;
        }
        this.premiumBlocked = DialogObject.isPremiumBlocked(requirementToContactIsUserContactBlocked);
        this.starsPriceBlocked = DialogObject.getMessagesStarsPrice(requirementToContactIsUserContactBlocked);
        this.premiumBlockedT.set(this.premiumBlocked, true);
        invalidate();
    }
}
