package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;

public class GroupCreateUserCell extends FrameLayout {
    private ValueAnimator animator;
    private AvatarDrawable avatarDrawable;
    private BackupImageView avatarImageView;
    private TL_account.RequirementToContact blockedOverridden;
    private CheckBox2 checkBox;
    private int checkBoxType;
    private float checkProgress;
    private int currentAccount;
    public boolean currentMiniapps;
    private CharSequence currentName;
    private Object currentObject;
    public boolean currentPremium;
    private CharSequence currentStatus;
    private boolean drawDivider;
    private boolean forceDarkTheme;
    private boolean isChecked;
    private TLRPC.FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private Paint lockBackgroundPaint;
    private Drawable lockDrawable;
    private SimpleTextView nameTextView;
    private int padding;
    private Paint paint;
    private boolean premiumBlocked;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    Theme.ResourcesProvider resourcesProvider;
    private boolean showPremiumBlocked;
    private boolean showSelfAsSaved;
    private final AnimatedFloat starsBlockedT;
    private long starsPriceBlocked;
    private SimpleTextView statusTextView;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    private void updatePremiumBlocked(boolean z) {
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
        if (!z) {
            this.premiumBlockedT.set(this.premiumBlocked, true);
        }
        invalidate();
    }

    public void overridePremiumBlocked(TL_account.RequirementToContact requirementToContact, boolean z) {
        this.showPremiumBlocked = true;
        this.blockedOverridden = requirementToContact;
        updatePremiumBlocked(z);
    }

    public GroupCreateUserCell(Context context, int i, int i2, boolean z) {
        this(context, i, i2, z, false, null);
    }

    public GroupCreateUserCell(Context context, int i, int i2, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.starsBlockedT = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
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
        BackupImageView backupImageView2 = this.avatarImageView;
        boolean z3 = LocaleController.isRTL;
        addView(backupImageView2, LayoutHelper.createFrame(46, 46.0f, (z3 ? 5 : 3) | 48, z3 ? 0.0f : this.padding + 13, 6.0f, z3 ? this.padding + 13 : 0.0f, 0.0f));
        SimpleTextView simpleTextView = new SimpleTextView(context) {
            @Override
            public boolean setText(CharSequence charSequence, boolean z4) {
                return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), z4);
            }
        };
        this.nameTextView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        this.nameTextView.setTextColor(Theme.getColor(this.forceDarkTheme ? Theme.key_voipgroup_nameText : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.nameTextView.setTypeface(AndroidUtilities.bold());
        this.nameTextView.setTextSize(16);
        this.nameTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView2 = this.nameTextView;
        boolean z4 = LocaleController.isRTL;
        int i3 = (z4 ? 5 : 3) | 48;
        int i4 = z4 ? 28 : 72;
        int i5 = this.padding;
        addView(simpleTextView2, LayoutHelper.createFrame(-1, 20.0f, i3, i4 + i5, 10.0f, (z4 ? 72 : 28) + i5, 0.0f));
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.statusTextView = simpleTextView3;
        simpleTextView3.setTextSize(14);
        this.statusTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        SimpleTextView simpleTextView4 = this.statusTextView;
        boolean z5 = LocaleController.isRTL;
        int i6 = (z5 ? 5 : 3) | 48;
        int i7 = z5 ? 28 : 72;
        int i8 = this.padding;
        addView(simpleTextView4, LayoutHelper.createFrame(-1, 20.0f, i6, i7 + i8, 32.0f, (z5 ? 72 : 28) + i8, 0.0f));
        if (i == 1) {
            CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox3 = this.checkBox;
            boolean z6 = LocaleController.isRTL;
            addView(checkBox3, LayoutHelper.createFrame(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : this.padding + 40, 33.0f, z6 ? this.padding + 39 : 0.0f, 0.0f));
        } else if (i == 2) {
            Paint paint = new Paint(1);
            this.paint = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
        setWillNotDraw(false);
    }

    public void setObject(TLObject tLObject, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        setObject(tLObject, charSequence, charSequence2);
        this.drawDivider = z;
    }

    public void setObject(Object obj, CharSequence charSequence, CharSequence charSequence2) {
        this.currentObject = obj;
        this.currentStatus = charSequence2;
        this.currentName = charSequence;
        this.drawDivider = false;
        this.currentPremium = false;
        this.currentMiniapps = false;
        update(0);
    }

    public void setPremium() {
        this.currentPremium = true;
        this.currentObject = "premium";
        this.avatarImageView.setImageDrawable(makePremiumUsersDrawable(getContext(), false));
        this.nameTextView.setText(LocaleController.getString(R.string.PrivacyPremium));
        SimpleTextView simpleTextView = this.statusTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        simpleTextView.setTag(Integer.valueOf(i));
        SimpleTextView simpleTextView2 = this.statusTextView;
        if (this.forceDarkTheme) {
            i = Theme.key_voipgroup_lastSeenText;
        }
        simpleTextView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        SimpleTextView simpleTextView3 = this.statusTextView;
        simpleTextView3.setEmojiColor(simpleTextView3.getTextColor());
        this.statusTextView.setText(LocaleController.getString(R.string.PrivacyPremiumText));
    }

    public void setMiniapps() {
        this.currentMiniapps = true;
        this.currentObject = "miniapps";
        this.avatarImageView.setImageDrawable(makeMiniAppsDrawable(getContext(), false));
        this.nameTextView.setText(LocaleController.getString(R.string.PrivacyMiniapps));
        SimpleTextView simpleTextView = this.statusTextView;
        int i = Theme.key_windowBackgroundWhiteGrayText;
        simpleTextView.setTag(Integer.valueOf(i));
        SimpleTextView simpleTextView2 = this.statusTextView;
        if (this.forceDarkTheme) {
            i = Theme.key_voipgroup_lastSeenText;
        }
        simpleTextView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
        SimpleTextView simpleTextView3 = this.statusTextView;
        simpleTextView3.setEmojiColor(simpleTextView3.getTextColor());
        this.statusTextView.setText(LocaleController.getString(R.string.PrivacyMiniappsText));
    }

    public static Drawable makePremiumUsersDrawable(Context context, boolean z) {
        final PremiumGradient.PremiumGradientTools premiumGradientTools = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient2, Theme.key_premiumGradient1, -1, -1, -1, null);
        CombinedDrawable combinedDrawable = new CombinedDrawable(new Drawable() {
            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }

            @Override
            public void draw(Canvas canvas) {
                premiumGradientTools.gradientMatrix(getBounds());
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, premiumGradientTools.paint);
            }
        }, context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z) {
            combinedDrawable.setIconSize(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        }
        return combinedDrawable;
    }

    public static Drawable makeMiniAppsDrawable(Context context, boolean z) {
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setAvatarType(8);
        avatarDrawable.setScaleSize(z ? 0.8f : 1.1f);
        avatarDrawable.setColor(Theme.getColor(Theme.key_avatar_backgroundBlue), Theme.getColor(Theme.key_avatar_background2Blue));
        return avatarDrawable;
    }

    public void setForbiddenCheck(boolean z) {
        this.checkBox.setForbidden(z);
    }

    public CheckBox2 getCheckBox() {
        return this.checkBox;
    }

    public void setChecked(boolean z, boolean z2) {
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
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setChecked$1(valueAnimator2);
                }
            });
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GroupCreateUserCell.this.animator = null;
                }
            });
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.start();
        } else {
            this.avatarImageView.setScaleX(this.isChecked ? 0.82f : 1.0f);
            this.avatarImageView.setScaleY(this.isChecked ? 0.82f : 1.0f);
            this.checkProgress = this.isChecked ? 1.0f : 0.0f;
        }
        invalidate();
    }

    public void lambda$setChecked$1(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = 0.18f * fFloatValue;
        float f2 = this.isChecked ? 1.0f - f : 0.82f + f;
        this.avatarImageView.setScaleX(f2);
        this.avatarImageView.setScaleY(f2);
        if (!this.isChecked) {
            fFloatValue = 1.0f - fFloatValue;
        }
        this.checkProgress = fFloatValue;
        invalidate();
    }

    public void setCheckBoxEnabled(boolean z) {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            checkBox2.setEnabled(z);
        }
    }

    public boolean isChecked() {
        CheckBox2 checkBox2 = this.checkBox;
        if (checkBox2 != null) {
            return checkBox2.isChecked();
        }
        return this.isChecked;
    }

    public Object getObject() {
        return this.currentObject;
    }

    public void setDrawDivider(boolean z) {
        this.drawDivider = z;
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        Object obj = this.currentObject;
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj) || "miniapps".equalsIgnoreCase((String) this.currentObject)) ? 58.0f : 50.0f), 1073741824));
    }

    public void recycle() {
        this.avatarImageView.getImageReceiver().cancelLoadImage();
    }

    public void update(int i) {
        String str;
        String str2;
        TLRPC.FileLocation fileLocation;
        String userName;
        TLRPC.UserStatus userStatus;
        TLRPC.FileLocation fileLocation2;
        Object obj = this.currentObject;
        if (obj == null || this.currentPremium || this.currentMiniapps) {
            return;
        }
        TLRPC.Chat chat = null;
        if (obj instanceof String) {
            ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
            ViewGroup.LayoutParams layoutParams = this.avatarImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.avatarImageView.getLayoutParams();
            int iDp = AndroidUtilities.dp(38.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
                }
            }
            String str3 = (String) this.currentObject;
            str3.hashCode();
            switch (str3) {
                case "archived":
                    this.avatarDrawable.setAvatarType(11);
                    break;
                case "groups":
                    this.avatarDrawable.setAvatarType(6);
                    break;
                case "non_contacts":
                    this.avatarDrawable.setAvatarType(5);
                    break;
                case "contacts":
                    this.avatarDrawable.setAvatarType(4);
                    break;
                case "new_chats":
                    this.avatarDrawable.setAvatarType(24);
                    break;
                case "bots":
                    this.avatarDrawable.setAvatarType(8);
                    break;
                case "read":
                    this.avatarDrawable.setAvatarType(10);
                    break;
                case "muted":
                    this.avatarDrawable.setAvatarType(9);
                    break;
                case "existing_chats":
                    this.avatarDrawable.setAvatarType(23);
                    break;
                case "channels":
                    this.avatarDrawable.setAvatarType(7);
                    break;
            }
            this.lastName = null;
            this.nameTextView.setText(this.currentName, true);
            this.statusTextView.setText(null);
            this.avatarImageView.setImage(null, "50_50", this.avatarDrawable);
        } else {
            CharSequence charSequence = this.currentStatus;
            if (charSequence != null && TextUtils.isEmpty(charSequence)) {
                ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
            } else {
                ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(10.0f);
            }
            ViewGroup.LayoutParams layoutParams3 = this.avatarImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams4 = this.avatarImageView.getLayoutParams();
            int iDp2 = AndroidUtilities.dp(46.0f);
            layoutParams4.height = iDp2;
            layoutParams3.width = iDp2;
            CheckBox2 checkBox3 = this.checkBox;
            if (checkBox3 != null) {
                ((FrameLayout.LayoutParams) checkBox3.getLayoutParams()).topMargin = AndroidUtilities.dp(29.0f) + this.padding;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + this.padding;
                } else {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + this.padding;
                }
            }
            Object obj2 = this.currentObject;
            if (obj2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj2;
                if (this.showSelfAsSaved && UserObject.isUserSelf(user)) {
                    this.nameTextView.setText(LocaleController.getString(R.string.SavedMessages), true);
                    this.statusTextView.setText(null);
                    this.avatarDrawable.setAvatarType(1);
                    this.avatarImageView.setImage((ImageLocation) null, "50_50", this.avatarDrawable, user);
                    ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                TLRPC.FileLocation fileLocation3 = userProfilePhoto != null ? userProfilePhoto.photo_small : null;
                if (i != 0) {
                    boolean z = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation2 = this.lastAvatar) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || fileLocation3 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
                    if (this.currentStatus == null && !z && (MessagesController.UPDATE_MASK_STATUS & i) != 0) {
                        TLRPC.UserStatus userStatus2 = user.status;
                        if ((userStatus2 != null ? userStatus2.expires : 0) != this.lastStatus) {
                            z = true;
                        }
                    }
                    if (z || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        userName = null;
                    } else {
                        userName = UserObject.getUserName(user);
                        if (!userName.equals(this.lastName)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    userName = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, user);
                TLRPC.UserStatus userStatus3 = user.status;
                this.lastStatus = userStatus3 != null ? userStatus3.expires : 0;
                CharSequence charSequence2 = this.currentName;
                if (charSequence2 != null) {
                    this.lastName = null;
                    this.nameTextView.setText(charSequence2, true);
                } else {
                    if (userName == null) {
                        userName = UserObject.getUserName(user);
                    }
                    this.lastName = userName;
                    this.nameTextView.setText(userName);
                }
                if (this.currentStatus == null) {
                    if (user.bot) {
                        SimpleTextView simpleTextView = this.statusTextView;
                        int i2 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView.setTag(Integer.valueOf(i2));
                        SimpleTextView simpleTextView2 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i2 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.getString(R.string.Bot));
                    } else if (user.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(user.id)))) {
                        SimpleTextView simpleTextView3 = this.statusTextView;
                        int i3 = Theme.key_windowBackgroundWhiteBlueText;
                        simpleTextView3.setTag(Integer.valueOf(i3));
                        SimpleTextView simpleTextView4 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i3 = Theme.key_voipgroup_listeningText;
                        }
                        simpleTextView4.setTextColor(Theme.getColor(i3, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.getString(R.string.Online));
                    } else {
                        SimpleTextView simpleTextView5 = this.statusTextView;
                        int i4 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView5.setTag(Integer.valueOf(i4));
                        SimpleTextView simpleTextView6 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i4 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView6.setTextColor(Theme.getColor(i4, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.formatUserStatus(this.currentAccount, user));
                    }
                    SimpleTextView simpleTextView7 = this.statusTextView;
                    simpleTextView7.setEmojiColor(simpleTextView7.getTextColor());
                }
                this.avatarImageView.setForUserOrChat(user, this.avatarDrawable);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) obj2;
                TLRPC.ChatPhoto chatPhoto = chat2.photo;
                TLRPC.FileLocation fileLocation4 = chatPhoto != null ? chatPhoto.photo_small : null;
                if (i != 0) {
                    boolean z2 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((fileLocation = this.lastAvatar) != null && fileLocation4 == null) || ((fileLocation == null && fileLocation4 != null) || !(fileLocation == null || fileLocation4 == null || (fileLocation.volume_id == fileLocation4.volume_id && fileLocation.local_id == fileLocation4.local_id))));
                    if (z2 || this.currentName != null || (str2 = this.lastName) == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = chat2.title;
                        if (!str.equals(str2)) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                } else {
                    str = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, chat2);
                CharSequence charSequence3 = this.currentName;
                if (charSequence3 != null) {
                    this.lastName = null;
                    this.nameTextView.setText(charSequence3, true);
                } else {
                    if (str == null) {
                        str = chat2.title;
                    }
                    this.lastName = str;
                    this.nameTextView.setText(str);
                }
                if (this.currentStatus == null) {
                    SimpleTextView simpleTextView8 = this.statusTextView;
                    int i5 = Theme.key_windowBackgroundWhiteGrayText;
                    simpleTextView8.setTag(Integer.valueOf(i5));
                    SimpleTextView simpleTextView9 = this.statusTextView;
                    if (this.forceDarkTheme) {
                        i5 = Theme.key_voipgroup_lastSeenText;
                    }
                    simpleTextView9.setTextColor(Theme.getColor(i5));
                    SimpleTextView simpleTextView10 = this.statusTextView;
                    simpleTextView10.setEmojiColor(simpleTextView10.getTextColor());
                    if (chat2.participants_count != 0) {
                        if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                            this.statusTextView.setText(LocaleController.formatPluralString("Subscribers", chat2.participants_count, new Object[0]));
                        } else {
                            this.statusTextView.setText(LocaleController.formatPluralString("Members", chat2.participants_count, new Object[0]));
                        }
                    } else if (chat2.has_geo) {
                        this.statusTextView.setText(LocaleController.getString(R.string.MegaLocation));
                    } else if (!ChatObject.isPublic(chat2)) {
                        if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                            this.statusTextView.setText(LocaleController.getString(R.string.ChannelPrivate));
                        } else {
                            this.statusTextView.setText(LocaleController.getString(R.string.MegaPrivate));
                        }
                    } else if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                        this.statusTextView.setText(LocaleController.getString(R.string.ChannelPublic));
                    } else {
                        this.statusTextView.setText(LocaleController.getString(R.string.MegaPublic));
                    }
                }
                this.avatarImageView.setForUserOrChat(chat2, this.avatarDrawable);
                chat = chat2;
            }
        }
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((chat == null || !chat.forum) ? 24.0f : 14.0f));
        CharSequence charSequence4 = this.currentStatus;
        if (charSequence4 != null) {
            this.statusTextView.setText(charSequence4, true);
            SimpleTextView simpleTextView11 = this.statusTextView;
            int i6 = Theme.key_windowBackgroundWhiteGrayText;
            simpleTextView11.setTag(Integer.valueOf(i6));
            SimpleTextView simpleTextView12 = this.statusTextView;
            if (this.forceDarkTheme) {
                i6 = Theme.key_voipgroup_lastSeenText;
            }
            simpleTextView12.setTextColor(Theme.getColor(i6, this.resourcesProvider));
            SimpleTextView simpleTextView13 = this.statusTextView;
            simpleTextView13.setEmojiColor(simpleTextView13.getTextColor());
        }
        updatePremiumBlocked(false);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.premiumBlockedT.set(this.premiumBlocked) <= 0.0f && this.checkBoxType == 2 && (this.isChecked || this.checkProgress > 0.0f)) {
            this.paint.setColor(Theme.getColor(Theme.key_checkboxSquareBackground, this.resourcesProvider));
            canvas.drawCircle(this.avatarImageView.getLeft() + (this.avatarImageView.getMeasuredWidth() / 2), this.avatarImageView.getTop() + (this.avatarImageView.getMeasuredHeight() / 2), AndroidUtilities.dp(18.0f) + (AndroidUtilities.dp(4.0f) * this.checkProgress), this.paint);
        }
        if (this.drawDivider) {
            int iDp = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : this.padding + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? this.padding + 72 : 0.0f);
            if (this.forceDarkTheme) {
                Theme.dividerExtraPaint.setColor(Theme.getColor(Theme.key_voipgroup_actionBar, this.resourcesProvider));
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.dividerExtraPaint);
            } else {
                canvas.drawRect(iDp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.getThemePaint("paintDivider", this.resourcesProvider));
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Paint paint;
        super.dispatchDraw(canvas);
        float f = this.premiumBlockedT.set(this.premiumBlocked);
        if (f > 0.0f) {
            float y = this.avatarImageView.getY() + (this.avatarImageView.getHeight() / 2.0f) + AndroidUtilities.dp(18.0f);
            float x = this.avatarImageView.getX() + (this.avatarImageView.getWidth() / 2.0f) + AndroidUtilities.dp(18.0f);
            canvas.save();
            Theme.dialogs_onlineCirclePaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            canvas.drawCircle(x, y, AndroidUtilities.dp(11.33f) * f, Theme.dialogs_onlineCirclePaint);
            if (this.blockedOverridden == null) {
                if (this.premiumGradient == null) {
                    this.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, -1, this.resourcesProvider);
                }
                this.premiumGradient.gradientMatrix((int) (x - AndroidUtilities.dp(10.0f)), (int) (y - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + x), (int) (AndroidUtilities.dp(10.0f) + y), 0.0f, 0.0f);
                paint = this.premiumGradient.paint;
            } else {
                if (this.lockBackgroundPaint == null) {
                    this.lockBackgroundPaint = new Paint();
                }
                this.lockBackgroundPaint.setColor(Theme.getColor(Theme.key_avatar_backgroundGray, this.resourcesProvider));
                paint = this.lockBackgroundPaint;
            }
            canvas.drawCircle(x, y, AndroidUtilities.dp(10.0f) * f, paint);
            if (this.lockDrawable == null) {
                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            Drawable drawable = this.lockDrawable;
            drawable.setBounds((int) (x - (((drawable.getIntrinsicWidth() / 2.0f) * 0.875f) * f)), (int) (y - (((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f) * f)), (int) (x + ((this.lockDrawable.getIntrinsicWidth() / 2.0f) * 0.875f * f)), (int) (y + ((this.lockDrawable.getIntrinsicHeight() / 2.0f) * 0.875f * f)));
            this.lockDrawable.setAlpha((int) (f * 255.0f));
            this.lockDrawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (isChecked()) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
    }

    public SimpleTextView getStatusTextView() {
        return this.statusTextView;
    }
}
