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
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$UserStatus;
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
    private CheckBox2 checkBox;
    private int checkBoxType;
    private float checkProgress;
    private int currentAccount;
    private CharSequence currentName;
    private Object currentObject;
    public boolean currentPremium;
    private CharSequence currentStatus;
    private boolean drawDivider;
    private boolean forceDarkTheme;
    private boolean isChecked;
    private TLRPC$FileLocation lastAvatar;
    private String lastName;
    private int lastStatus;
    private Paint lockBackgroundPaint;
    private Drawable lockDrawable;
    private SimpleTextView nameTextView;
    private int padding;
    private Paint paint;
    private boolean premiumBlocked;
    private Boolean premiumBlockedOverriden;
    private final AnimatedFloat premiumBlockedT;
    private PremiumGradient.PremiumGradientTools premiumGradient;
    Theme.ResourcesProvider resourcesProvider;
    private boolean showPremiumBlocked;
    private boolean showSelfAsSaved;
    private SimpleTextView statusTextView;

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isBlocked() {
        return this.premiumBlocked;
    }

    private void updatePremiumBlocked(boolean z) {
        Boolean bool;
        boolean z2 = this.premiumBlocked;
        boolean z3 = this.showPremiumBlocked && ((bool = this.premiumBlockedOverriden) == null ? (this.currentObject instanceof TLRPC$User) && MessagesController.getInstance(this.currentAccount).isUserPremiumBlocked(((TLRPC$User) this.currentObject).id) : bool.booleanValue());
        this.premiumBlocked = z3;
        if (z2 != z3) {
            if (!z) {
                this.premiumBlockedT.set(z3, true);
            }
            invalidate();
        }
    }

    public void overridePremiumBlocked(boolean z, boolean z2) {
        this.showPremiumBlocked = true;
        this.premiumBlockedOverriden = Boolean.valueOf(z);
        updatePremiumBlocked(z2);
    }

    public GroupCreateUserCell(Context context, int i, int i2, boolean z) {
        this(context, i, i2, z, false, null);
    }

    public GroupCreateUserCell(Context context, int i, int i2, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = UserConfig.selectedAccount;
        this.premiumBlockedT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
        SimpleTextView simpleTextView = new SimpleTextView(this, context) {
            @Override
            public boolean setText(CharSequence charSequence, boolean z4) {
                return super.setText(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), AndroidUtilities.dp(14.0f), false), z4);
            }
        };
        this.nameTextView = simpleTextView;
        NotificationCenter.listenEmojiLoading(simpleTextView);
        this.nameTextView.setTextColor(Theme.getColor(this.forceDarkTheme ? Theme.key_voipgroup_nameText : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.nameTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
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
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBox = checkBox2;
            checkBox2.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
            this.checkBox.setDrawUnchecked(false);
            this.checkBox.setDrawBackgroundAsArc(3);
            CheckBox2 checkBox22 = this.checkBox;
            boolean z6 = LocaleController.isRTL;
            addView(checkBox22, LayoutHelper.createFrame(24, 24.0f, (z6 ? 5 : 3) | 48, z6 ? 0.0f : this.padding + 40, 33.0f, z6 ? this.padding + 39 : 0.0f, 0.0f));
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
        this.statusTextView.setText(LocaleController.getString(R.string.PrivacyPremiumText));
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
                PremiumGradient.PremiumGradientTools.this.gradientMatrix(getBounds());
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, PremiumGradient.PremiumGradientTools.this.paint);
            }
        }, context.getResources().getDrawable(R.drawable.msg_settings_premium), 0, 0);
        if (z) {
            combinedDrawable.setIconSize(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
        }
        return combinedDrawable;
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
        } else if (this.checkBoxType != 2 || this.isChecked == z) {
        } else {
            this.isChecked = z;
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (z2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        GroupCreateUserCell.this.lambda$setChecked$1(valueAnimator2);
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
    }

    public void lambda$setChecked$1(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.isChecked ? 1.0f - (0.18f * floatValue) : 0.82f + (0.18f * floatValue);
        this.avatarImageView.setScaleX(f);
        this.avatarImageView.setScaleY(f);
        if (!this.isChecked) {
            floatValue = 1.0f - floatValue;
        }
        this.checkProgress = floatValue;
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        Object obj = this.currentObject;
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp((!(obj instanceof String) || "premium".equalsIgnoreCase((String) obj)) ? 58.0f : 50.0f), 1073741824));
    }

    public void recycle() {
        this.avatarImageView.getImageReceiver().cancelLoadImage();
    }

    public void update(int i) {
        String str;
        String str2;
        TLRPC$FileLocation tLRPC$FileLocation;
        String str3;
        TLRPC$UserStatus tLRPC$UserStatus;
        TLRPC$FileLocation tLRPC$FileLocation2;
        Object obj = this.currentObject;
        if (obj == null || this.currentPremium) {
            return;
        }
        TLRPC$Chat tLRPC$Chat = null;
        if (obj instanceof String) {
            ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(15.0f);
            ViewGroup.LayoutParams layoutParams = this.avatarImageView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.avatarImageView.getLayoutParams();
            int dp = AndroidUtilities.dp(38.0f);
            layoutParams2.height = dp;
            layoutParams.width = dp;
            CheckBox2 checkBox2 = this.checkBox;
            if (checkBox2 != null) {
                ((FrameLayout.LayoutParams) checkBox2.getLayoutParams()).topMargin = AndroidUtilities.dp(25.0f);
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).rightMargin = AndroidUtilities.dp(31.0f);
                } else {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).leftMargin = AndroidUtilities.dp(32.0f);
                }
            }
            String str4 = (String) this.currentObject;
            str4.hashCode();
            char c = 65535;
            switch (str4.hashCode()) {
                case -1716307998:
                    if (str4.equals("archived")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1237460524:
                    if (str4.equals("groups")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1197490811:
                    if (str4.equals("non_contacts")) {
                        c = 2;
                        break;
                    }
                    break;
                case -567451565:
                    if (str4.equals("contacts")) {
                        c = 3;
                        break;
                    }
                    break;
                case -268161860:
                    if (str4.equals("new_chats")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3029900:
                    if (str4.equals("bots")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3496342:
                    if (str4.equals("read")) {
                        c = 6;
                        break;
                    }
                    break;
                case 104264043:
                    if (str4.equals("muted")) {
                        c = 7;
                        break;
                    }
                    break;
                case 151051367:
                    if (str4.equals("existing_chats")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1432626128:
                    if (str4.equals("channels")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.avatarDrawable.setAvatarType(11);
                    break;
                case 1:
                    this.avatarDrawable.setAvatarType(6);
                    break;
                case 2:
                    this.avatarDrawable.setAvatarType(5);
                    break;
                case 3:
                    this.avatarDrawable.setAvatarType(4);
                    break;
                case 4:
                    this.avatarDrawable.setAvatarType(24);
                    break;
                case 5:
                    this.avatarDrawable.setAvatarType(8);
                    break;
                case 6:
                    this.avatarDrawable.setAvatarType(10);
                    break;
                case 7:
                    this.avatarDrawable.setAvatarType(9);
                    break;
                case '\b':
                    this.avatarDrawable.setAvatarType(23);
                    break;
                case '\t':
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
            int dp2 = AndroidUtilities.dp(46.0f);
            layoutParams4.height = dp2;
            layoutParams3.width = dp2;
            CheckBox2 checkBox22 = this.checkBox;
            if (checkBox22 != null) {
                ((FrameLayout.LayoutParams) checkBox22.getLayoutParams()).topMargin = AndroidUtilities.dp(29.0f) + this.padding;
                if (LocaleController.isRTL) {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + this.padding;
                } else {
                    ((FrameLayout.LayoutParams) this.checkBox.getLayoutParams()).leftMargin = AndroidUtilities.dp(40.0f) + this.padding;
                }
            }
            Object obj2 = this.currentObject;
            if (obj2 instanceof TLRPC$User) {
                TLRPC$User tLRPC$User = (TLRPC$User) obj2;
                if (this.showSelfAsSaved && UserObject.isUserSelf(tLRPC$User)) {
                    this.nameTextView.setText(LocaleController.getString("SavedMessages", R.string.SavedMessages), true);
                    this.statusTextView.setText(null);
                    this.avatarDrawable.setAvatarType(1);
                    this.avatarImageView.setImage((ImageLocation) null, "50_50", this.avatarDrawable, tLRPC$User);
                    ((FrameLayout.LayoutParams) this.nameTextView.getLayoutParams()).topMargin = AndroidUtilities.dp(19.0f);
                    return;
                }
                TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto = tLRPC$User.photo;
                TLRPC$FileLocation tLRPC$FileLocation3 = tLRPC$UserProfilePhoto != null ? tLRPC$UserProfilePhoto.photo_small : null;
                if (i != 0) {
                    boolean z = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((tLRPC$FileLocation2 = this.lastAvatar) != null && tLRPC$FileLocation3 == null) || ((tLRPC$FileLocation2 == null && tLRPC$FileLocation3 != null) || !(tLRPC$FileLocation2 == null || tLRPC$FileLocation3 == null || (tLRPC$FileLocation2.volume_id == tLRPC$FileLocation3.volume_id && tLRPC$FileLocation2.local_id == tLRPC$FileLocation3.local_id))));
                    if (this.currentStatus == null && !z && (MessagesController.UPDATE_MASK_STATUS & i) != 0) {
                        TLRPC$UserStatus tLRPC$UserStatus2 = tLRPC$User.status;
                        if ((tLRPC$UserStatus2 != null ? tLRPC$UserStatus2.expires : 0) != this.lastStatus) {
                            z = true;
                        }
                    }
                    if (z || this.currentName != null || this.lastName == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str3 = null;
                    } else {
                        str3 = UserObject.getUserName(tLRPC$User);
                        if (!str3.equals(this.lastName)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        return;
                    }
                } else {
                    str3 = null;
                }
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$User);
                TLRPC$UserStatus tLRPC$UserStatus3 = tLRPC$User.status;
                this.lastStatus = tLRPC$UserStatus3 != null ? tLRPC$UserStatus3.expires : 0;
                CharSequence charSequence2 = this.currentName;
                if (charSequence2 != null) {
                    this.lastName = null;
                    this.nameTextView.setText(charSequence2, true);
                } else {
                    if (str3 == null) {
                        str3 = UserObject.getUserName(tLRPC$User);
                    }
                    this.lastName = str3;
                    this.nameTextView.setText(str3);
                }
                if (this.currentStatus == null) {
                    if (tLRPC$User.bot) {
                        SimpleTextView simpleTextView = this.statusTextView;
                        int i2 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView.setTag(Integer.valueOf(i2));
                        SimpleTextView simpleTextView2 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i2 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.getString("Bot", R.string.Bot));
                    } else if (tLRPC$User.id == UserConfig.getInstance(this.currentAccount).getClientUserId() || (((tLRPC$UserStatus = tLRPC$User.status) != null && tLRPC$UserStatus.expires > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) || MessagesController.getInstance(this.currentAccount).onlinePrivacy.containsKey(Long.valueOf(tLRPC$User.id)))) {
                        SimpleTextView simpleTextView3 = this.statusTextView;
                        int i3 = Theme.key_windowBackgroundWhiteBlueText;
                        simpleTextView3.setTag(Integer.valueOf(i3));
                        SimpleTextView simpleTextView4 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i3 = Theme.key_voipgroup_listeningText;
                        }
                        simpleTextView4.setTextColor(Theme.getColor(i3, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.getString("Online", R.string.Online));
                    } else {
                        SimpleTextView simpleTextView5 = this.statusTextView;
                        int i4 = Theme.key_windowBackgroundWhiteGrayText;
                        simpleTextView5.setTag(Integer.valueOf(i4));
                        SimpleTextView simpleTextView6 = this.statusTextView;
                        if (this.forceDarkTheme) {
                            i4 = Theme.key_voipgroup_lastSeenText;
                        }
                        simpleTextView6.setTextColor(Theme.getColor(i4, this.resourcesProvider));
                        this.statusTextView.setText(LocaleController.formatUserStatus(this.currentAccount, tLRPC$User));
                    }
                }
                this.avatarImageView.setForUserOrChat(tLRPC$User, this.avatarDrawable);
            } else {
                TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) obj2;
                TLRPC$ChatPhoto tLRPC$ChatPhoto = tLRPC$Chat2.photo;
                TLRPC$FileLocation tLRPC$FileLocation4 = tLRPC$ChatPhoto != null ? tLRPC$ChatPhoto.photo_small : null;
                if (i != 0) {
                    boolean z2 = (MessagesController.UPDATE_MASK_AVATAR & i) != 0 && (((tLRPC$FileLocation = this.lastAvatar) != null && tLRPC$FileLocation4 == null) || ((tLRPC$FileLocation == null && tLRPC$FileLocation4 != null) || !(tLRPC$FileLocation == null || tLRPC$FileLocation4 == null || (tLRPC$FileLocation.volume_id == tLRPC$FileLocation4.volume_id && tLRPC$FileLocation.local_id == tLRPC$FileLocation4.local_id))));
                    if (z2 || this.currentName != null || (str2 = this.lastName) == null || (i & MessagesController.UPDATE_MASK_NAME) == 0) {
                        str = null;
                    } else {
                        str = tLRPC$Chat2.title;
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
                this.avatarDrawable.setInfo(this.currentAccount, tLRPC$Chat2);
                CharSequence charSequence3 = this.currentName;
                if (charSequence3 != null) {
                    this.lastName = null;
                    this.nameTextView.setText(charSequence3, true);
                } else {
                    if (str == null) {
                        str = tLRPC$Chat2.title;
                    }
                    this.lastName = str;
                    this.nameTextView.setText(str);
                }
                if (this.currentStatus == null) {
                    SimpleTextView simpleTextView7 = this.statusTextView;
                    int i5 = Theme.key_windowBackgroundWhiteGrayText;
                    simpleTextView7.setTag(Integer.valueOf(i5));
                    SimpleTextView simpleTextView8 = this.statusTextView;
                    if (this.forceDarkTheme) {
                        i5 = Theme.key_voipgroup_lastSeenText;
                    }
                    simpleTextView8.setTextColor(Theme.getColor(i5));
                    if (tLRPC$Chat2.participants_count != 0) {
                        if (ChatObject.isChannel(tLRPC$Chat2) && !tLRPC$Chat2.megagroup) {
                            this.statusTextView.setText(LocaleController.formatPluralString("Subscribers", tLRPC$Chat2.participants_count, new Object[0]));
                        } else {
                            this.statusTextView.setText(LocaleController.formatPluralString("Members", tLRPC$Chat2.participants_count, new Object[0]));
                        }
                    } else if (tLRPC$Chat2.has_geo) {
                        this.statusTextView.setText(LocaleController.getString("MegaLocation", R.string.MegaLocation));
                    } else if (!ChatObject.isPublic(tLRPC$Chat2)) {
                        if (ChatObject.isChannel(tLRPC$Chat2) && !tLRPC$Chat2.megagroup) {
                            this.statusTextView.setText(LocaleController.getString("ChannelPrivate", R.string.ChannelPrivate));
                        } else {
                            this.statusTextView.setText(LocaleController.getString("MegaPrivate", R.string.MegaPrivate));
                        }
                    } else if (ChatObject.isChannel(tLRPC$Chat2) && !tLRPC$Chat2.megagroup) {
                        this.statusTextView.setText(LocaleController.getString("ChannelPublic", R.string.ChannelPublic));
                    } else {
                        this.statusTextView.setText(LocaleController.getString("MegaPublic", R.string.MegaPublic));
                    }
                }
                this.avatarImageView.setForUserOrChat(tLRPC$Chat2, this.avatarDrawable);
                tLRPC$Chat = tLRPC$Chat2;
            }
        }
        this.avatarImageView.setRoundRadius(AndroidUtilities.dp((tLRPC$Chat == null || !tLRPC$Chat.forum) ? 24.0f : 14.0f));
        CharSequence charSequence4 = this.currentStatus;
        if (charSequence4 != null) {
            this.statusTextView.setText(charSequence4, true);
            SimpleTextView simpleTextView9 = this.statusTextView;
            int i6 = Theme.key_windowBackgroundWhiteGrayText;
            simpleTextView9.setTag(Integer.valueOf(i6));
            SimpleTextView simpleTextView10 = this.statusTextView;
            if (this.forceDarkTheme) {
                i6 = Theme.key_voipgroup_lastSeenText;
            }
            simpleTextView10.setTextColor(Theme.getColor(i6, this.resourcesProvider));
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
            int dp = AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : this.padding + 72);
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? this.padding + 72 : 0.0f);
            if (this.forceDarkTheme) {
                Theme.dividerExtraPaint.setColor(Theme.getColor(Theme.key_voipgroup_actionBar, this.resourcesProvider));
                canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.dividerExtraPaint);
                return;
            }
            canvas.drawRect(dp, getMeasuredHeight() - 1, measuredWidth, getMeasuredHeight(), Theme.dividerPaint);
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
            if (this.premiumBlockedOverriden == null) {
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
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.lockDrawable = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
