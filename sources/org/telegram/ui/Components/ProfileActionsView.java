package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.billingclient.api.zzct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda7;

public final class ProfileActionsView extends View {
    public AnonymousClass1 accessibilityNodeProvider;
    public final ArrayList actions;
    public int activeCount;
    public final HashSet allAvailableActions;
    public ProfileActivity.AvatarImageView avatarView;
    public Action callAction;
    public final Path clipAvatarPath;
    public float clipHeight;
    public final Path clipPath;
    public int color;
    public float currentHeight;
    public long downTime;
    public float downX;
    public float downY;
    public Action firstAction;
    public boolean hasColorById;
    public Action hit;
    public boolean isApplying;
    public boolean isNotificationsEnabled;
    public boolean isOpeningLayout;
    public Action lastAction;
    public PorterDuffColorFilter lastColorFilter;
    public int lastColorFilterColor;
    public final Matrix matrix;
    public int mode;
    public OnActionClickListener onActionClickListener;
    public final Paint paint;
    public float parentExpanded;
    public RadialGradient radialGradient;
    public RenderNode renderNode;
    public float renderNodeScale;
    public float renderNodeTranslateY;
    public final Paint shaderPaint;
    public final int targetHeight;
    public final float top;
    public final float xpadding;
    public final float ypadding;

    public class AnonymousClass1 extends AccessibilityNodeProvider {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass1(ProfileActionsView profileActionsView) {
            this.this$0 = profileActionsView;
        }

        @Override
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            Action action;
            switch (this.$r8$classId) {
                case 0:
                    int[] iArr = {0, 0};
                    ProfileActionsView profileActionsView = (ProfileActionsView) this.this$0;
                    profileActionsView.getLocationOnScreen(iArr);
                    ArrayList arrayList = profileActionsView.actions;
                    if (i == -1) {
                        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(profileActionsView);
                        profileActionsView.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                        accessibilityNodeInfoObtain.setEnabled(true);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            accessibilityNodeInfoObtain.addChild(profileActionsView, ((Action) arrayList.get(i2)).key);
                        }
                        return accessibilityNodeInfoObtain;
                    }
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            action = null;
                        } else if (((Action) arrayList.get(i3)).key == i) {
                            action = (Action) arrayList.get(i3);
                        } else {
                            i3++;
                        }
                    }
                    if (action != null) {
                        RectF rectF = action.rect;
                        if (!rectF.isEmpty()) {
                            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                            accessibilityNodeInfoObtain2.setSource(profileActionsView, i);
                            accessibilityNodeInfoObtain2.setParent(profileActionsView);
                            accessibilityNodeInfoObtain2.setPackageName(profileActionsView.getContext().getPackageName());
                            accessibilityNodeInfoObtain2.addAction(16);
                            accessibilityNodeInfoObtain2.addAction(64);
                            accessibilityNodeInfoObtain2.setClickable(true);
                            accessibilityNodeInfoObtain2.setFocusable(true);
                            accessibilityNodeInfoObtain2.setEnabled(true);
                            accessibilityNodeInfoObtain2.setVisibleToUser(true);
                            accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
                            accessibilityNodeInfoObtain2.setText(action.text.getText());
                            Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                            rect.offset(iArr[0], iArr[1]);
                            accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
                            return accessibilityNodeInfoObtain2;
                        }
                    }
                    return null;
                default:
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateAccessibilityNodeInfo = ((zzct) this.this$0).createAccessibilityNodeInfo(i);
                    if (accessibilityNodeInfoCompatCreateAccessibilityNodeInfo == null) {
                        return null;
                    }
                    return accessibilityNodeInfoCompatCreateAccessibilityNodeInfo.mInfo;
            }
        }

        @Override
        public List findAccessibilityNodeInfosByText(String str, int i) {
            switch (this.$r8$classId) {
                case 1:
                    ((zzct) this.this$0).getClass();
                    return null;
                default:
                    return super.findAccessibilityNodeInfosByText(str, i);
            }
        }

        @Override
        public AccessibilityNodeInfo findFocus(int i) {
            switch (this.$r8$classId) {
                case 1:
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatFindFocus = ((zzct) this.this$0).findFocus(i);
                    if (accessibilityNodeInfoCompatFindFocus == null) {
                        return null;
                    }
                    return accessibilityNodeInfoCompatFindFocus.mInfo;
                default:
                    return super.findFocus(i);
            }
        }

        @Override
        public final boolean performAction(int i, int i2, Bundle bundle) {
            Action action;
            switch (this.$r8$classId) {
                case 0:
                    ProfileActionsView profileActionsView = (ProfileActionsView) this.this$0;
                    if (i == -1) {
                        return profileActionsView.performAccessibilityAction(i2, bundle);
                    }
                    int i3 = 0;
                    while (true) {
                        ArrayList arrayList = profileActionsView.actions;
                        if (i3 >= arrayList.size()) {
                            action = null;
                        } else if (((Action) arrayList.get(i3)).key == i) {
                            action = (Action) arrayList.get(i3);
                        } else {
                            i3++;
                        }
                    }
                    if (action != null) {
                        if (i2 == 64) {
                            if (((AccessibilityManager) profileActionsView.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32768);
                                accessibilityEventObtain.setPackageName(profileActionsView.getContext().getPackageName());
                                accessibilityEventObtain.setSource(profileActionsView, i);
                                if (profileActionsView.getParent() != null) {
                                    profileActionsView.getParent().requestSendAccessibilityEvent(profileActionsView, accessibilityEventObtain);
                                }
                            }
                        } else if (i2 == 16) {
                            OnActionClickListener onActionClickListener = profileActionsView.onActionClickListener;
                            if (onActionClickListener != null) {
                                ((ProfileActivity$$ExternalSyntheticLambda7) onActionClickListener).f$0.lambda$createView$17(0.0f, 0.0f, i);
                            }
                        }
                        return true;
                    }
                    return false;
                default:
                    return ((zzct) this.this$0).performAction(i, i2, bundle);
            }
        }

        public AnonymousClass1(zzct zzctVar) {
            this.this$0 = zzctVar;
        }
    }

    public final class ActionButton {
        public static final ActionButton[] $VALUES;
        public static final ActionButton CALL;
        public static final ActionButton DISCUSS;
        public static final ActionButton EDIT_INFO;
        public static final ActionButton GIFT;
        public static final ActionButton JOIN;
        public static final ActionButton LEAVE;
        public static final ActionButton MESSAGE;
        public static final ActionButton NOTIFICATION_MUTE;
        public static final ActionButton NOTIFICATION_UNMUTE;
        public static final ActionButton REPORT;
        public static final ActionButton SETTINGS;
        public static final ActionButton SET_PHOTO;
        public static final ActionButton SHARE;
        public static final ActionButton STOP;
        public static final ActionButton STORY;
        public static final ActionButton STREAM;
        public static final ActionButton VIDEO;
        public static final ActionButton VOICE_CHAT;
        public final int filledIcon;
        public final int outlineIcon;
        public final int title;

        static {
            int i = R.string.ProfileActionsMessage;
            int i2 = R.drawable.filled_profile_message_24;
            int i3 = R.drawable.outline_profile_message_24;
            ActionButton actionButton = new ActionButton("MESSAGE", 0, i, i2, i3);
            MESSAGE = actionButton;
            ActionButton actionButton2 = new ActionButton("NOTIFICATION_MUTE", 1, R.string.ProfileButtonMute, R.drawable.filled_profile_mute_24, R.drawable.outline_profile_mute_24);
            NOTIFICATION_MUTE = actionButton2;
            ActionButton actionButton3 = new ActionButton("NOTIFICATION_UNMUTE", 2, R.string.ProfileButtonUnmute, R.drawable.filled_profile_unmute_24, R.drawable.outline_profile_unmute_24);
            NOTIFICATION_UNMUTE = actionButton3;
            ActionButton actionButton4 = new ActionButton("DISCUSS", 3, R.string.ProfileActionsDiscuss, i2, i3);
            DISCUSS = actionButton4;
            ActionButton actionButton5 = new ActionButton("GIFT", 4, R.string.ProfileActionsGift, R.drawable.gift, R.drawable.input_gift_s);
            GIFT = actionButton5;
            ActionButton actionButton6 = new ActionButton("SHARE", 5, R.string.ProfileActionsShare, R.drawable.action_share, R.drawable.msg_share);
            SHARE = actionButton6;
            ActionButton actionButton7 = new ActionButton("CALL", 6, R.string.ProfileActionsCall, R.drawable.filled_profile_call_24, R.drawable.outline_profile_call_24);
            CALL = actionButton7;
            ActionButton actionButton8 = new ActionButton("VIDEO", 7, R.string.ProfileActionsVideo, R.drawable.filled_profile_video_24, R.drawable.outline_profile_video_24);
            VIDEO = actionButton8;
            ActionButton actionButton9 = new ActionButton("JOIN", 8, R.string.ProfileActionsJoin, R.drawable.filled_profile_member_24, R.drawable.outline_profile_member_24);
            JOIN = actionButton9;
            ActionButton actionButton10 = new ActionButton("REPORT", 9, R.string.ProfileActionsReport, R.drawable.report, R.drawable.msg_report);
            REPORT = actionButton10;
            int i4 = R.string.ProfileActionsLeave;
            int i5 = R.drawable.leave;
            ActionButton actionButton11 = new ActionButton("LEAVE", 10, i4, i5, i5);
            LEAVE = actionButton11;
            int i6 = R.string.ProfileActionsVoiceChat;
            int i7 = R.drawable.live_stream;
            ActionButton actionButton12 = new ActionButton("VOICE_CHAT", 11, i6, i7, i7);
            VOICE_CHAT = actionButton12;
            ActionButton actionButton13 = new ActionButton("STREAM", 12, R.string.ProfileActionsLiveStream, i7, i7);
            STREAM = actionButton13;
            ActionButton actionButton14 = new ActionButton("STORY", 13, R.string.ProfileActionsAddStory, R.drawable.filled_profile_story, R.drawable.outline_profile_story);
            STORY = actionButton14;
            ActionButton actionButton15 = new ActionButton("STOP", 14, R.string.ProfileActionsStop, R.drawable.filled_profile_stop_24, R.drawable.outline_profile_stop_24);
            STOP = actionButton15;
            ActionButton actionButton16 = new ActionButton("SET_PHOTO", 15, R.string.ProfileActionsEditPhoto2, R.drawable.filled_profile_photo, R.drawable.outline_profile_photo);
            SET_PHOTO = actionButton16;
            int i8 = R.string.ProfileActionsEditUsername;
            int i9 = R.drawable.filled_profile_edit_24;
            int i10 = R.drawable.outline_profile_edit_24;
            ActionButton actionButton17 = new ActionButton("EDIT_USERNAME", 16, i8, i9, i10);
            ActionButton actionButton18 = new ActionButton("EDIT_INFO", 17, R.string.ProfileActionsEditInfo, i9, i10);
            EDIT_INFO = actionButton18;
            ActionButton actionButton19 = new ActionButton("SETTINGS", 18, R.string.Settings, R.drawable.filled_profile_settings, R.drawable.outline_profile_settings);
            SETTINGS = actionButton19;
            $VALUES = new ActionButton[]{actionButton, actionButton2, actionButton3, actionButton4, actionButton5, actionButton6, actionButton7, actionButton8, actionButton9, actionButton10, actionButton11, actionButton12, actionButton13, actionButton14, actionButton15, actionButton16, actionButton17, actionButton18, actionButton19};
        }

        public ActionButton(String str, int i, int i2, int i3, int i4) {
            super(str, i);
            this.title = i2;
            this.filledIcon = i3;
            this.outlineIcon = i4;
        }

        public static ActionButton valueOf(String str) {
            return (ActionButton) Enum.valueOf(ActionButton.class, str);
        }

        public static ActionButton[] values() {
            return (ActionButton[]) $VALUES.clone();
        }
    }

    public interface OnActionClickListener {
    }

    public ProfileActionsView(Context context, int i) {
        super(context);
        this.actions = new ArrayList();
        Paint paint = new Paint();
        this.paint = paint;
        this.shaderPaint = new Paint();
        this.isOpeningLayout = true;
        this.clipHeight = -1.0f;
        this.clipAvatarPath = new Path();
        this.clipPath = new Path();
        this.activeCount = 0;
        this.currentHeight = 0.0f;
        this.onActionClickListener = null;
        this.allAvailableActions = new HashSet();
        this.mode = 6;
        this.callAction = null;
        this.color = 0;
        this.matrix = new Matrix();
        this.hit = null;
        paint.setColor(-16777216);
        paint.setAlpha(40);
        this.xpadding = AndroidUtilities.dpf2(14.0f);
        float fDpf2 = AndroidUtilities.dpf2(12.0f);
        this.ypadding = fDpf2;
        float fDpf3 = AndroidUtilities.dpf2(8.0f);
        this.top = fDpf3;
        AndroidUtilities.dpf2(4.0f);
        this.targetHeight = (int) ((i - fDpf2) - fDpf3);
        setBackgroundColor(0);
        setImportantForAccessibility(1);
    }

    public static Action find(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Action action = (Action) arrayList.get(i2);
            if (!action.isDeleting && action.key == i) {
                return action;
            }
        }
        return null;
    }

    private float getItemWidth() {
        int measuredWidth = getMeasuredWidth();
        float f = this.xpadding;
        int i = this.activeCount;
        return ((measuredWidth - ((f / 2.0f) * (i - 1))) - (f * 2.0f)) / i;
    }

    public final void addCameraAction() {
        Action action = new Action(ActionButton.SET_PHOTO);
        action.key = 14;
        this.actions.add(action);
    }

    public final void addEditInfo() {
        Action action = new Action(ActionButton.EDIT_INFO);
        action.key = 16;
        this.actions.add(action);
    }

    public final void addSettings() {
        Action action = new Action(ActionButton.SETTINGS);
        action.key = 17;
        this.actions.add(action);
    }

    public final void applyVisibleActions() {
        if (this.isApplying) {
            return;
        }
        if (this.mode == 6) {
            this.activeCount = this.actions.size();
            invalidate();
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.allAvailableActions;
        boolean z = hashSet.contains(7) && !hashSet.contains(9);
        int i = this.mode;
        if (i == 0) {
            insertIfAvailable(0, arrayList);
            insertIfAvailable(1, arrayList);
            insertIfAvailable(5, arrayList);
            insertIfAvailable(6, arrayList);
            insertIfNotAvailable(3, 6, arrayList);
        } else if (i == 1) {
            if (z) {
                insertIfAvailable(7, arrayList);
            } else {
                insertIfAvailable(10, arrayList);
                insertIfNotAvailable(11, 10, arrayList);
            }
            insertIfAvailable(1, arrayList);
            if (!z) {
                insertIfAvailable(2, arrayList);
                if (hashSet.contains(3) && !hashSet.contains(2) && !hashSet.contains(12)) {
                    arrayList.add(getOrCreate(3));
                }
            }
            insertIfNotAvailable(4, 12, arrayList);
            if (z) {
                arrayList.add(getOrCreate(8));
            } else {
                insertIfAvailable(12, arrayList);
                insertIfNotAvailable(9, 12, arrayList);
            }
        } else if (i == 2) {
            insertIfAvailable(0, arrayList);
            insertIfAvailable(1, arrayList);
            insertIfAvailable(4, arrayList);
            arrayList.add(getOrCreate(13));
        } else if (i == 3 || i == 4) {
            if (z) {
                insertIfAvailable(7, arrayList);
            } else {
                insertIfAvailable(0, arrayList);
            }
            insertIfAvailable(1, arrayList);
            if (z) {
                arrayList.add(getOrCreate(8));
            } else {
                insertIfAvailable(10, arrayList);
                insertIfNotAvailable(11, 10, arrayList);
                insertIfAvailable(12, arrayList);
                insertIfAvailable(9, arrayList);
            }
        } else if (i == 5) {
            insertIfAvailable(0, arrayList);
            insertIfAvailable(1, arrayList);
        }
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(1, this, arrayList));
    }

    public final void beginApplyingActions() {
        this.isApplying = true;
    }

    public final boolean canHaveJoinAction() {
        int i = this.mode;
        return i == 1 || i == 3;
    }

    public final void createColorShader() {
        int i = this.color;
        if (i == 0) {
            return;
        }
        if (!this.hasColorById) {
            this.paint.setColor(i);
            return;
        }
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        float f = this.xpadding;
        float fMax = ((measuredWidth - ((f / 2.0f) * Math.max(0, this.activeCount - 1))) - (f * 2.0f)) / Math.max(1, this.activeCount);
        RadialGradient radialGradient = new RadialGradient(fMax / 2.0f, this.targetHeight / 2.0f, this.hasColorById ? fMax * 0.65f : 1.0f, Theme.multAlpha(0.8f, this.color), this.color, Shader.TileMode.CLAMP);
        this.radialGradient = radialGradient;
        this.shaderPaint.setShader(radialGradient);
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.accessibilityNodeProvider == null) {
            this.accessibilityNodeProvider = new AnonymousClass1(this);
        }
        return this.accessibilityNodeProvider;
    }

    public final Action getOrCreate(int i) {
        Action actionFind = find(i, this.actions);
        if (actionFind != null) {
            if (i == 1) {
                updateNotification(actionFind, false);
            }
            return actionFind;
        }
        switch (i) {
            case 0:
                actionFind = new Action(ActionButton.MESSAGE);
                break;
            case 1:
                actionFind = new Action();
                updateNotification(actionFind, false);
                break;
            case 2:
                actionFind = new Action(ActionButton.DISCUSS);
                break;
            case 3:
                actionFind = new Action(ActionButton.GIFT);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 200;
                break;
            case 4:
                actionFind = new Action(ActionButton.SHARE);
                break;
            case 5:
                actionFind = new Action(ActionButton.CALL);
                this.callAction = actionFind;
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 6:
                actionFind = new Action(ActionButton.VIDEO);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 7:
                actionFind = new Action(ActionButton.JOIN);
                actionFind.supportsLoading = true;
                actionFind.callDelay = 300;
                break;
            case 8:
                actionFind = new Action(ActionButton.REPORT);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 500;
                break;
            case 9:
                actionFind = new Action(ActionButton.LEAVE);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_leave;
                actionFind.stopDelay = 300;
                break;
            case 10:
                actionFind = new Action(ActionButton.VOICE_CHAT);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_voicechat;
                actionFind.stopDelay = 500;
                break;
            case 11:
                actionFind = new Action(ActionButton.STREAM);
                actionFind.supportsLoading = true;
                actionFind.supportsAnimate = R.raw.profile_voicechat;
                actionFind.stopDelay = 500;
                break;
            case 12:
                actionFind = new Action(ActionButton.STORY);
                break;
            case 13:
                actionFind = new Action(ActionButton.STOP);
                actionFind.supportsLoading = true;
                actionFind.stopDelay = 300;
                break;
        }
        if (actionFind != null) {
            actionFind.key = i;
        }
        return actionFind;
    }

    public float getRoundRadius() {
        return AndroidUtilities.dp(16.0f);
    }

    public final boolean hasCall() {
        return this.allAvailableActions.contains(5) && this.callAction != null;
    }

    public final void insertIfAvailable(int i, ArrayList arrayList) {
        if (this.allAvailableActions.contains(Integer.valueOf(i))) {
            arrayList.add(getOrCreate(i));
        }
    }

    public final void insertIfNotAvailable(int i, int i2, ArrayList arrayList) {
        HashSet hashSet = this.allAvailableActions;
        if (!hashSet.contains(Integer.valueOf(i)) || hashSet.contains(Integer.valueOf(i2))) {
            return;
        }
        arrayList.add(getOrCreate(i));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Action action;
        float f8;
        boolean z;
        boolean z2;
        int i2;
        Action action2;
        Action action3;
        float f9 = this.clipHeight;
        if (f9 >= 0.0f) {
            float y = f9 - getY();
            if (y <= 0.0f) {
                return;
            } else {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), y);
            }
        }
        float f10 = this.currentHeight - this.ypadding;
        float f11 = this.top;
        float fMax = Math.max(0.0f, f10 - f11);
        if (fMax <= 0.0f) {
            return;
        }
        float f12 = this.xpadding;
        float f13 = f12 / 2.0f;
        float itemWidth = getItemWidth();
        float roundRadius = getRoundRadius();
        RenderNode renderNode = this.renderNode;
        Path path = this.clipPath;
        if (renderNode != null) {
            path.rewind();
        }
        ArrayList arrayList = this.actions;
        int size = arrayList.size();
        Action action4 = null;
        Action action5 = null;
        int i3 = 0;
        float f14 = 2.0f;
        while (i3 < size) {
            Action action6 = (Action) arrayList.get(i3);
            if (action6.isDeleted) {
                f3 = fMax;
                f4 = f11;
                f6 = f13;
                f7 = itemWidth;
                i3 = i3;
            } else {
                boolean z3 = action6.isDeleting;
                f3 = fMax;
                RectF rectF = action6.rect;
                if (!z3) {
                    rectF.set(f12, f11, f12 + itemWidth, f11 + f3);
                    f12 += itemWidth + f13;
                    if (action4 == null) {
                        action4 = action6;
                    }
                    action5 = action6;
                }
                if (action6.isDeleting) {
                    action6.animatePosition();
                    f4 = f11;
                    f5 = f12;
                    f6 = f13;
                    f7 = itemWidth;
                } else {
                    ProfileActionsView profileActionsView = ProfileActionsView.this;
                    f4 = f11;
                    boolean z4 = profileActionsView.isOpeningLayout;
                    RectF rectF2 = action6.prevRect;
                    f5 = f12;
                    RectF rectF3 = action6.to;
                    f6 = f13;
                    RectF rectF4 = action6.from;
                    f7 = itemWidth;
                    AnimatedFloat animatedFloat = action6.positionFraction;
                    if (z4) {
                        action6.isOpening = false;
                        rectF2.set(rectF);
                        rectF4.set(rectF);
                        rectF3.set(rectF);
                        animatedFloat.set(1.0f, true);
                    } else {
                        i3 = i3;
                        if (rectF3.isEmpty()) {
                            action6.isOpening = true;
                            rectF3.set(rectF);
                            rectF4.set(rectF);
                            float f15 = rectF.left - 1.0f;
                            float f16 = profileActionsView.xpadding;
                            boolean z5 = f15 <= f16;
                            boolean z6 = rectF.right + 1.0f >= ((float) profileActionsView.getMeasuredWidth()) - f16;
                            if (z5 && z6) {
                                action = action4;
                            } else {
                                z2 = z6;
                                Action action7 = profileActionsView.firstAction;
                                if (action7 != null) {
                                    action = action4;
                                    if (action7.key != action6.key) {
                                    }
                                    i2 = action6.key;
                                    if (((i2 != 5 || i2 == 6) && profileActionsView.mode == 0) || ((i2 == 3 || i2 == 2) && profileActionsView.mode == 1)) {
                                        z5 = true;
                                        z2 = false;
                                    } else if (z5 && (action3 = profileActionsView.firstAction) != null && !action3.isDeleting) {
                                        z5 = false;
                                        z2 = true;
                                    } else if (z2 && (action2 = profileActionsView.lastAction) != null && !action2.isDeleting) {
                                        z5 = true;
                                        z2 = false;
                                    }
                                    if (z5) {
                                        rectF4.left = rectF4.right;
                                    } else if (z2) {
                                        rectF4.right = rectF4.left;
                                    } else {
                                        float fCenterX = rectF3.centerX();
                                        rectF4.right = fCenterX;
                                        rectF4.left = fCenterX;
                                    }
                                    f8 = 0.0f;
                                    z = true;
                                    animatedFloat.set(0.0f, true);
                                } else {
                                    action = action4;
                                }
                                Action action8 = profileActionsView.lastAction;
                                if (action8 != null && action8.key == action6.key) {
                                }
                                i2 = action6.key;
                                if (i2 != 5) {
                                }
                                z5 = true;
                                z2 = false;
                                if (z5) {
                                    rectF4.left = rectF4.right;
                                } else if (z2) {
                                    rectF4.right = rectF4.left;
                                } else {
                                    float fCenterX2 = rectF3.centerX();
                                    rectF4.right = fCenterX2;
                                    rectF4.left = fCenterX2;
                                }
                                f8 = 0.0f;
                                z = true;
                                animatedFloat.set(0.0f, true);
                            }
                            z5 = false;
                            z2 = false;
                            i2 = action6.key;
                            if (i2 != 5) {
                            }
                            z5 = true;
                            z2 = false;
                            if (z5) {
                                rectF4.left = rectF4.right;
                            } else if (z2) {
                                rectF4.right = rectF4.left;
                            } else {
                                float fCenterX3 = rectF3.centerX();
                                rectF4.right = fCenterX3;
                                rectF4.left = fCenterX3;
                            }
                            f8 = 0.0f;
                            z = true;
                            animatedFloat.set(0.0f, true);
                        } else {
                            action = action4;
                            f8 = 0.0f;
                            z = true;
                        }
                        if (!rectF.equals(rectF3)) {
                            rectF4.set(rectF2);
                            rectF3.set(rectF);
                            animatedFloat.set(f8, z);
                        }
                        action6.animatePosition();
                        rectF2.set(rectF);
                    }
                    if (this.renderNode != null) {
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(rectF);
                        float fWidth = rectF.width() / 2.0f;
                        ButtonBounce buttonBounce = action6.bounce;
                        rectF5.inset((1.0f - buttonBounce.getScale(0.04f)) * fWidth, (1.0f - buttonBounce.getScale(0.04f)) * (rectF.height() / 2.0f));
                        rectF5.inset(-1.0f, -1.0f);
                        path.addRoundRect(rectF5, roundRadius, roundRadius, Path.Direction.CCW);
                    }
                    f12 = f5;
                    action4 = action;
                }
                action = action4;
                if (this.renderNode != null) {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(rectF);
                    float fWidth2 = rectF.width() / 2.0f;
                    ButtonBounce buttonBounce2 = action6.bounce;
                    rectF6.inset((1.0f - buttonBounce2.getScale(0.04f)) * fWidth2, (1.0f - buttonBounce2.getScale(0.04f)) * (rectF.height() / 2.0f));
                    rectF6.inset(-1.0f, -1.0f);
                    path.addRoundRect(rectF6, roundRadius, roundRadius, Path.Direction.CCW);
                }
                f12 = f5;
                action4 = action;
            }
            i3++;
            fMax = f3;
            f11 = f4;
            f13 = f6;
            itemWidth = f7;
        }
        this.firstAction = action4;
        this.lastAction = action5;
        int i4 = this.targetHeight;
        float fClamp01 = Utilities.clamp01(fMax / i4);
        float fClamp02 = Utilities.clamp01((fClamp01 - 0.2f) / 0.8f);
        if (fClamp02 <= 0.0f) {
            return;
        }
        int i5 = 0;
        while (i5 < size) {
            Action action9 = (Action) arrayList.get(i5);
            if (action9.isDeleted) {
                fClamp02 = fClamp02;
                i5 = i5;
            } else {
                RectF rectF7 = AndroidUtilities.rectTmp;
                RectF rectF8 = action9.rect;
                rectF7.set(rectF8);
                float fWidth3 = rectF8.width() / 2.0f;
                ButtonBounce buttonBounce3 = action9.bounce;
                rectF7.inset((1.0f - buttonBounce3.getScale(0.04f)) * fWidth3, (1.0f - buttonBounce3.getScale(0.04f)) * (rectF8.height() / 2.0f));
                Paint paint = this.paint;
                int alpha = paint.getAlpha();
                float alpha2 = (int) (action9.getAlpha() * fClamp02 * alpha);
                paint.setAlpha((int) ((this.radialGradient != null ? 0.1f : 1.0f) * alpha2));
                if (!SharedConfig.shadowsInSections || AndroidUtilities.computePerceivedBrightness(this.color) <= 0.72f || this.parentExpanded >= 0.5f) {
                    paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                } else {
                    paint.setShadowLayer(AndroidUtilities.dpf2(1.5f), 0.0f, 0.0f, Theme.multAlpha((alpha2 / 255.0f) * (this.radialGradient != null ? 0.1f : 1.0f), 536870912));
                }
                canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint);
                if (this.radialGradient != null) {
                    Paint paint2 = this.shaderPaint;
                    int alpha3 = paint2.getAlpha();
                    paint2.setAlpha((int) (action9.getAlpha() * fClamp02 * alpha3));
                    Matrix matrix = this.matrix;
                    matrix.setTranslate(rectF7.left, rectF7.top);
                    this.radialGradient.setLocalMatrix(matrix);
                    canvas.drawRoundRect(rectF7, roundRadius, roundRadius, paint2);
                    paint2.setAlpha(alpha3);
                }
                paint.setAlpha(alpha);
            }
            i5++;
            fClamp02 = fClamp02;
        }
        RenderNode renderNode2 = this.renderNode;
        if (renderNode2 != null && Build.VERSION.SDK_INT >= 29 && renderNode2.hasDisplayList() && canvas.isHardwareAccelerated()) {
            canvas.save();
            ProfileActivity.AvatarImageView avatarImageView = this.avatarView;
            if (avatarImageView != null) {
                View view = (View) avatarImageView.getParent();
                float x = view.getX();
                float y2 = view.getY() - getTranslationY();
                float scaleX = view.getScaleX() * view.getWidth();
                float scaleY = view.getScaleY() * view.getHeight();
                Path path2 = this.clipAvatarPath;
                path2.rewind();
                path2.addRoundRect(x, y2, x + scaleX, y2 + scaleY, view.getScaleX() * this.avatarView.getRoundRadiusForExpand(), view.getScaleY() * this.avatarView.getRoundRadiusForExpand(), Path.Direction.CCW);
                canvas.clipPath(path2);
            }
            canvas.clipPath(path);
            canvas.translate(0.0f, this.renderNodeTranslateY);
            float f17 = this.renderNodeScale;
            canvas.scale(f17, f17);
            canvas.drawRenderNode(this.renderNode);
            canvas.restore();
        }
        float fClamp03 = Utilities.clamp01((fClamp01 - 0.4f) / 0.6f);
        if (fClamp03 > 0.0f) {
            int i6 = 0;
            while (i6 < size) {
                Action action10 = (Action) arrayList.get(i6);
                if (action10 == null || action10.isDeleted) {
                    i = i4;
                    f = fClamp01;
                } else {
                    boolean z7 = AndroidUtilities.computePerceivedBrightness(this.color) > 0.72f;
                    float fClamp = (!z7 || Build.VERSION.SDK_INT >= 31) ? !z7 ? 1.0f : MathUtils.clamp((this.parentExpanded - 0.75f) / 0.25f, 0.0f, 1.0f) : 0.0f;
                    int iBlendARGB = ColorUtils.blendARGB(fClamp, -16777216, -1);
                    if (this.lastColorFilter == null || this.lastColorFilterColor != iBlendARGB) {
                        this.lastColorFilterColor = iBlendARGB;
                        this.lastColorFilter = new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN);
                    }
                    canvas.save();
                    float alpha4 = action10.getAlpha() * fClamp03;
                    RectF rectF9 = action10.rect;
                    float fCenterX4 = rectF9.centerX();
                    float fCenterY = rectF9.centerY();
                    f = fClamp01;
                    float scale = action10.bounce.getScale(0.04f) * f;
                    canvas.scale(scale, scale, fCenterX4, fCenterY);
                    canvas.clipRect(rectF9);
                    float fCenterX5 = rectF9.centerX();
                    rectF9.centerY();
                    float fDp = AndroidUtilities.dp(24.0f);
                    float f18 = fDp * 0.5f;
                    Text text = action10.text;
                    text.maxWidth = rectF9.width() - AndroidUtilities.dp(f14);
                    text.setText(text.layout.getText());
                    if (action10.text.layout.getLineCount() >= 3) {
                        f2 = 0.75f;
                    } else {
                        f2 = action10.text.layout.getLineCount() >= 2 ? 0.85f : 1.0f;
                    }
                    action10.textScale = f2;
                    float fMax2 = Math.max(0.0f, AndroidUtilities.dpf2(1.33f) + SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(action10.text.layout.getHeight(), action10.textScale, i4, 3.0f));
                    int i7 = (int) (fMax2 + fDp);
                    Rect rect = action10.bounds;
                    rect.set((int) (fCenterX5 - f18), (int) fMax2, (int) (fCenterX5 + f18), i7);
                    RLottieDrawable rLottieDrawable = action10.drawableAnimated;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setBounds(rect);
                    }
                    Drawable drawable = action10.drawableFilled;
                    if (drawable != null) {
                        drawable.setBounds(rect);
                    }
                    Drawable drawable2 = action10.drawableOutline;
                    if (drawable2 != null) {
                        drawable2.setBounds(rect);
                    }
                    float height = ((rect.bottom + rect.top) - ((action10.text.layout.getHeight() * action10.textScale) / f14)) - AndroidUtilities.dp(4.66f);
                    canvas.save();
                    float f19 = action10.textScale;
                    i = i4;
                    canvas.scale(f19, f19, fCenterX4, Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(action10.text.layout.getHeight(), action10.textScale, 2.0f, height));
                    Text text2 = action10.text;
                    text2.draw(fCenterX4 - (text2.getWidth() / 2.0f), height, alpha4, iBlendARGB, canvas);
                    canvas.restore();
                    float f20 = action10.iconScale;
                    if (f20 != 1.0f) {
                        canvas.scale(f20, f20, rect.centerX(), rect.centerY());
                    }
                    float f21 = (1.0f - fClamp) * alpha4;
                    float f22 = fClamp * alpha4;
                    RLottieDrawable rLottieDrawable2 = action10.drawableAnimated;
                    if (rLottieDrawable2 == null) {
                        Drawable drawable3 = action10.drawableOutline;
                        if (drawable3 != null) {
                            drawable3.setColorFilter(this.lastColorFilter);
                            drawable3.setAlpha((int) (f21 * 255.0f));
                            drawable3.draw(canvas);
                        }
                        Drawable drawable4 = action10.drawableFilled;
                        if (drawable4 != null) {
                            drawable4.setColorFilter(this.lastColorFilter);
                            drawable4.setAlpha((int) (f22 * 255.0f));
                            drawable4.draw(canvas);
                        }
                    } else if (action10.key == 1) {
                        Drawable drawable5 = action10.drawableOutline;
                        if (drawable5 != null) {
                            drawable5.setColorFilter(this.lastColorFilter);
                            drawable5.setAlpha((int) (f21 * 255.0f));
                            drawable5.draw(canvas);
                        }
                        RLottieDrawable rLottieDrawable3 = action10.drawableAnimated;
                        if (rLottieDrawable3 != null) {
                            rLottieDrawable3.setColorFilter(this.lastColorFilter);
                            rLottieDrawable3.setAlpha((int) (f22 * 255.0f));
                            rLottieDrawable3.draw(canvas);
                        }
                    } else {
                        rLottieDrawable2.setColorFilter(this.lastColorFilter);
                        rLottieDrawable2.setAlpha((int) (alpha4 * 255.0f));
                        rLottieDrawable2.draw(canvas);
                    }
                    canvas.restore();
                    if (action10.stopDelay > 0 && System.currentTimeMillis() > ((long) action10.stopDelay) + action10.startTime) {
                        action10.isLoading = false;
                    }
                    if (action10.isLoading) {
                        LoadingDrawable loadingDrawable = action10.loadingDrawable;
                        if (loadingDrawable == null) {
                            LoadingDrawable loadingDrawable2 = new LoadingDrawable();
                            action10.loadingDrawable = loadingDrawable2;
                            loadingDrawable2.setCallback(this);
                            action10.loadingDrawable.setColors(Theme.multAlpha(0.1f, -1), Theme.multAlpha(0.3f, -1), Theme.multAlpha(0.35f, -1), Theme.multAlpha(0.8f, -1));
                            LoadingDrawable loadingDrawable3 = action10.loadingDrawable;
                            loadingDrawable3.appearByGradient = true;
                            loadingDrawable3.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                        } else if (loadingDrawable.isDisappeared() || action10.loadingDrawable.isDisappearing()) {
                            LoadingDrawable loadingDrawable4 = action10.loadingDrawable;
                            loadingDrawable4.start = -1L;
                            loadingDrawable4.disappearStart = -1L;
                        }
                    } else {
                        LoadingDrawable loadingDrawable5 = action10.loadingDrawable;
                        if (loadingDrawable5 != null && !loadingDrawable5.isDisappearing() && !action10.loadingDrawable.isDisappeared()) {
                            action10.loadingDrawable.disappear();
                        }
                    }
                    LoadingDrawable loadingDrawable6 = action10.loadingDrawable;
                    if (loadingDrawable6 != null) {
                        loadingDrawable6.setBounds(rectF9);
                        action10.loadingDrawable.setRadii(getRoundRadius());
                        action10.loadingDrawable.setAlpha((int) (alpha4 * 255.0f));
                        action10.loadingDrawable.draw(canvas);
                    }
                }
                i6++;
                i4 = i;
                fClamp01 = f;
                f14 = 2.0f;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.makeMeasureSpec((int) (this.targetHeight + this.top + this.ypadding), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Action action;
        if (this.currentHeight >= AndroidUtilities.dp(8.0f)) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                this.hit = null;
                ArrayList arrayList = this.actions;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Action action3 = (Action) arrayList.get(i);
                    if (!action3.isDeleting && action3.rect.contains(x, y)) {
                        this.hit = action3;
                        this.downX = x;
                        this.downY = y;
                        this.downTime = System.currentTimeMillis();
                        this.hit.bounce.setPressed(true);
                        break;
                    }
                }
            } else if (action2 == 2) {
                if (this.hit != null && (Math.abs(x - this.downX) > 20.0f || Math.abs(y - this.downY) > 20.0f)) {
                    this.hit.bounce.setPressed(false);
                    this.hit = null;
                }
            } else if ((action2 == 1 || action2 == 3) && (action = this.hit) != null) {
                action.bounce.setPressed(false);
                if (action2 == 1 && this.hit.rect.contains(x, y)) {
                    if (System.currentTimeMillis() - this.downTime > 250) {
                        try {
                            performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                    Action action4 = this.hit;
                    if (action4.supportsLoading && !action4.isLoading) {
                        action4.isLoading = true;
                        invalidate();
                    }
                    Action action5 = this.hit;
                    int i2 = action5.supportsAnimate;
                    if (i2 != 0) {
                        action5.updateDrawable(i2, 0, 0);
                    }
                    this.hit.startTime = System.currentTimeMillis();
                    Action action6 = this.hit;
                    OnActionClickListener onActionClickListener = this.onActionClickListener;
                    if (onActionClickListener != null) {
                        int i3 = action6.callDelay;
                        if (i3 == 0) {
                            int i4 = action6.key;
                            RectF rectF = action6.rect;
                            ((ProfileActivity$$ExternalSyntheticLambda7) onActionClickListener).f$0.lambda$createView$17(rectF.left, rectF.top, i4);
                        } else {
                            postDelayed(new ShareAlert$$ExternalSyntheticLambda29(2, this, action6), i3);
                        }
                    }
                }
                this.hit = null;
                return true;
            }
            if (this.hit != null) {
                return true;
            }
        }
        return false;
    }

    public final void set(int i, boolean z) {
        HashSet hashSet = this.allAvailableActions;
        if (z ? hashSet.add(Integer.valueOf(i)) : hashSet.remove(Integer.valueOf(i))) {
            applyVisibleActions();
        }
    }

    public void setNotifications(boolean z) {
        boolean z2 = this.isNotificationsEnabled != z;
        this.isNotificationsEnabled = z;
        Action actionFind = find(1, this.actions);
        if (actionFind != null) {
            updateNotification(actionFind, z2);
            invalidate();
        } else {
            this.allAvailableActions.add(1);
            applyVisibleActions();
        }
    }

    public void setOnActionClickListener(OnActionClickListener onActionClickListener) {
        this.onActionClickListener = onActionClickListener;
    }

    public void setParentExpanded(float f) {
        if (this.parentExpanded != f) {
            this.parentExpanded = f;
            invalidate();
        }
    }

    public final void updateNotification(Action action, boolean z) {
        if (!z) {
            ActionButton actionButton = this.isNotificationsEnabled ? ActionButton.NOTIFICATION_MUTE : ActionButton.NOTIFICATION_UNMUTE;
            action.updateDrawable(0, actionButton.filledIcon, actionButton.outlineIcon);
            action.setText(LocaleController.getString(actionButton.title));
        } else if (this.isNotificationsEnabled) {
            ActionButton actionButton2 = ActionButton.NOTIFICATION_MUTE;
            action.setText(LocaleController.getString(actionButton2.title));
            action.updateDrawable(R.raw.profile_unmuting, actionButton2.filledIcon, actionButton2.outlineIcon);
        } else {
            ActionButton actionButton3 = ActionButton.NOTIFICATION_UNMUTE;
            action.setText(LocaleController.getString(actionButton3.title));
            action.updateDrawable(R.raw.profile_muting, actionButton3.filledIcon, actionButton3.outlineIcon);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || (drawable instanceof LoadingDrawable);
    }

    public final class Action {
        public final ButtonBounce bounce;
        public RLottieDrawable drawableAnimated;
        public Drawable drawableFilled;
        public Drawable drawableOutline;
        public boolean isLoading;
        public int key;
        public LoadingDrawable loadingDrawable;
        public final AnimatedFloat positionFraction;
        public long startTime;
        public int stopDelay;
        public int supportsAnimate;
        public boolean supportsLoading;
        public Text text;
        public final RectF prevRect = new RectF();
        public final RectF rect = new RectF();
        public final RectF to = new RectF();
        public final RectF from = new RectF();
        public final Rect bounds = new Rect();
        public float textScale = 1.0f;
        public boolean isOpening = false;
        public boolean isDeleting = false;
        public boolean isDeleted = false;
        public final float iconScale = 1.0f;
        public int callDelay = 0;

        public Action() {
            this.bounce = new ButtonBounce(ProfileActionsView.this, 1.0f, 5.0f);
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
        }

        public final void animatePosition() {
            float f = this.positionFraction.set(1.0f, false);
            if (f == 1.0f) {
                this.isOpening = false;
                if (this.isDeleting) {
                    this.isDeleted = true;
                    return;
                }
                return;
            }
            RectF rectF = this.from;
            float f2 = rectF.left;
            RectF rectF2 = this.to;
            float fLerp = AndroidUtilities.lerp(f2, rectF2.left, f);
            RectF rectF3 = this.rect;
            rectF3.left = fLerp;
            rectF3.right = AndroidUtilities.lerp(rectF.right, rectF2.right, f);
        }

        public final float getAlpha() {
            boolean z = this.isDeleting;
            AnimatedFloat animatedFloat = this.positionFraction;
            if (z) {
                return 1.0f - animatedFloat.set(1.0f, false);
            }
            if (this.isOpening) {
                return animatedFloat.set(1.0f, false);
            }
            return 1.0f;
        }

        public final void setText(String str) {
            Text text = new Text(str, 11.0f, AndroidUtilities.bold());
            text.maxLines = 3;
            text.setText(text.layout.getText());
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            text.align();
            this.text = text;
        }

        public final void updateDrawable(int i, int i2, int i3) {
            ProfileActionsView profileActionsView = ProfileActionsView.this;
            if (i != 0) {
                RLottieDrawable rLottieDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), false, null);
                rLottieDrawable.masterParent = profileActionsView;
                rLottieDrawable.start();
                this.drawableAnimated = rLottieDrawable;
            } else {
                this.drawableAnimated = null;
            }
            this.drawableFilled = i2 != 0 ? profileActionsView.getResources().getDrawable(i2).mutate() : null;
            this.drawableOutline = i3 != 0 ? profileActionsView.getResources().getDrawable(i3).mutate() : null;
            RLottieDrawable rLottieDrawable2 = this.drawableAnimated;
            Rect rect = this.bounds;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.setBounds(rect);
            }
            Drawable drawable = this.drawableFilled;
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            Drawable drawable2 = this.drawableOutline;
            if (drawable2 != null) {
                drawable2.setBounds(rect);
            }
        }

        public Action(ActionButton actionButton) {
            this.bounce = new ButtonBounce(ProfileActionsView.this, 1.0f, 5.0f);
            this.positionFraction = new AnimatedFloat(ProfileActionsView.this, 0L, 250L, CubicBezierInterpolator.DEFAULT);
            updateDrawable(0, actionButton.filledIcon, actionButton.outlineIcon);
            setText(LocaleController.getString(actionButton.title));
        }
    }
}
