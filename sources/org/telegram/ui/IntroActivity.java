package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Looper;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraView$CameraGLThread$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.BottomPagesView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class IntroActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int ICON_HEIGHT_DP = 150;
    private static final int ICON_WIDTH_DP = 200;
    private BottomPagesView bottomPages;
    private final int currentAccount;
    private long currentDate;
    private int currentViewPagerPage;
    private RLottieDrawable darkThemeDrawable;
    private boolean destroyed;
    private boolean dragging;
    private EGLThread eglThread;
    private FrameLayout frameContainerView;
    private FrameLayout frameLayout2;
    private boolean isOnLogout;
    private boolean justCreated;
    private boolean justEndDragging;
    private int lastPage;
    private LocaleController.LocaleInfo localeInfo;
    private Drawable logoDrawable;
    private String[] messages;
    private final Object pagerHeaderTag;
    private final Object pagerMessageTag;
    private int startDragX;
    private TextView startMessagingButton;
    private GradientDrawable startMessagingButtonBackground;
    private boolean startPressed;
    private TextView switchLanguageTextView;
    private CharSequence[] titles;
    private ViewPager viewPager;

    public class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        public AnonymousClass2() {
        }

        public void lambda$onSurfaceTextureAvailable$0() {
            float fCurrentTimeMillis = (System.currentTimeMillis() - IntroActivity.this.currentDate) / 1000.0f;
            Intro.setPage(IntroActivity.this.currentViewPagerPage);
            Intro.setDate(fCurrentTimeMillis);
            Intro.onDrawFrame(0);
            if (IntroActivity.this.eglThread == null || !IntroActivity.this.eglThread.isAlive() || IntroActivity.this.eglThread.eglDisplay == null || IntroActivity.this.eglThread.eglSurface == null) {
                return;
            }
            try {
                IntroActivity.this.eglThread.egl10.eglSwapBuffers(IntroActivity.this.eglThread.eglDisplay, IntroActivity.this.eglThread.eglSurface);
            } catch (Exception unused) {
            }
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (IntroActivity.this.eglThread != null || surfaceTexture == null) {
                return;
            }
            IntroActivity.this.eglThread = IntroActivity.this.new EGLThread(surfaceTexture);
            IntroActivity.this.eglThread.setSurfaceTextureSize(i, i2);
            IntroActivity.this.eglThread.postRunnable(new ChatActivity$21$$ExternalSyntheticLambda4(this, 27));
            IntroActivity.this.eglThread.postRunnable(IntroActivity.this.eglThread.drawRunnable);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (IntroActivity.this.eglThread == null) {
                return true;
            }
            IntroActivity.this.eglThread.shutdown();
            IntroActivity.this.eglThread = null;
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (IntroActivity.this.eglThread != null) {
                IntroActivity.this.eglThread.setSurfaceTextureSize(i, i2);
            }
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class AnonymousClass5 implements NotificationCenter.NotificationCenterDelegate {
        final AlertDialog val$loaderDialog;

        public AnonymousClass5(AlertDialog alertDialog) {
            this.val$loaderDialog = alertDialog;
        }

        public void lambda$didReceivedNotification$0() {
            IntroActivity.this.presentFragment(new LoginActivity().setIntroView(IntroActivity.this.frameContainerView, IntroActivity.this.startMessagingButton), true);
            IntroActivity.this.destroyed = true;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.reloadInterface) {
                this.val$loaderDialog.dismiss();
                NotificationCenter.getGlobalInstance().removeObserver(this, i);
                AndroidUtilities.runOnUIThread(new ChatActivity$21$$ExternalSyntheticLambda4(this, 28), 100L);
            }
        }
    }

    public class EGLThread extends DispatchQueue {
        private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
        private static final int EGL_OPENGL_ES2_BIT = 4;
        private Runnable drawRunnable;
        private EGL10 egl10;
        private EGLConfig eglConfig;
        private EGLContext eglContext;
        private EGLDisplay eglDisplay;
        private EGLSurface eglSurface;
        private boolean initied;
        private long lastDrawFrame;
        private float maxRefreshRate;
        private SurfaceTexture surfaceTexture;
        private final GenericProvider<Void, Bitmap> telegramMaskProvider;
        private final int[] textures;

        public EGLThread(SurfaceTexture surfaceTexture) {
            super("EGLThread");
            this.textures = new int[24];
            this.telegramMaskProvider = new ChatActivity$$ExternalSyntheticLambda49(25);
            this.drawRunnable = new Runnable() {
                @Override
                public void run() {
                    if (EGLThread.this.initied) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if ((!EGLThread.this.eglContext.equals(EGLThread.this.egl10.eglGetCurrentContext()) || !EGLThread.this.eglSurface.equals(EGLThread.this.egl10.eglGetCurrentSurface(12377))) && !EGLThread.this.egl10.eglMakeCurrent(EGLThread.this.eglDisplay, EGLThread.this.eglSurface, EGLThread.this.eglSurface, EGLThread.this.eglContext)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("eglMakeCurrent failed " + GLUtils.getEGLErrorString(EGLThread.this.egl10.eglGetError()));
                                return;
                            }
                            return;
                        }
                        int iMin = (int) Math.min(jCurrentTimeMillis - EGLThread.this.lastDrawFrame, 16L);
                        float f = (jCurrentTimeMillis - IntroActivity.this.currentDate) / 1000.0f;
                        Intro.setPage(IntroActivity.this.currentViewPagerPage);
                        Intro.setDate(f);
                        Intro.onDrawFrame(iMin);
                        EGLThread.this.egl10.eglSwapBuffers(EGLThread.this.eglDisplay, EGLThread.this.eglSurface);
                        EGLThread.this.lastDrawFrame = jCurrentTimeMillis;
                        float f2 = 0.0f;
                        if (EGLThread.this.maxRefreshRate == 0.0f) {
                            for (float f3 : ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getSupportedRefreshRates()) {
                                if (f3 > f2) {
                                    f2 = f3;
                                }
                            }
                            EGLThread.this.maxRefreshRate = f2;
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        EGLThread eGLThread = EGLThread.this;
                        eGLThread.postRunnable(eGLThread.drawRunnable, Math.max(((long) (1000.0f / EGLThread.this.maxRefreshRate)) - jCurrentTimeMillis2, 0L));
                    }
                }
            };
            this.surfaceTexture = surfaceTexture;
        }

        private boolean initGL() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.egl10 = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.eglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglGetDisplay failed "));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglInitialize failed "));
                }
                finish();
                return false;
            }
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.egl10.eglChooseConfig(this.eglDisplay, EmuDetector.with(IntroActivity.this.getParentActivity()).detect() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 24, 12326, 0, 12338, 1, 12337, 2, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglChooseConfig failed "));
                }
                finish();
                return false;
            }
            if (iArr[0] <= 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("eglConfig not initialized");
                }
                finish();
                return false;
            }
            EGLConfig eGLConfig = eGLConfigArr[0];
            this.eglConfig = eGLConfig;
            EGLContext eGLContextEglCreateContext = this.egl10.eglCreateContext(this.eglDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
            this.eglContext = eGLContextEglCreateContext;
            if (eGLContextEglCreateContext == null) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglCreateContext failed "));
                }
                finish();
                return false;
            }
            SurfaceTexture surfaceTexture = this.surfaceTexture;
            if (surfaceTexture == null) {
                finish();
                return false;
            }
            EGLSurface eGLSurfaceEglCreateWindowSurface = this.egl10.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, surfaceTexture, null);
            this.eglSurface = eGLSurfaceEglCreateWindowSurface;
            if (eGLSurfaceEglCreateWindowSurface == null || eGLSurfaceEglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("createWindowSurface failed "));
                }
                finish();
                return false;
            }
            if (!this.egl10.eglMakeCurrent(this.eglDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, this.eglContext)) {
                if (BuildVars.LOGS_ENABLED) {
                    CameraView$CameraGLThread$$ExternalSyntheticOutline0.m(this.egl10, new StringBuilder("eglMakeCurrent failed "));
                }
                finish();
                return false;
            }
            GLES20.glGenTextures(23, this.textures, 0);
            loadTexture(R.drawable.intro_fast_arrow_shadow, 0);
            loadTexture(R.drawable.intro_fast_arrow, 1);
            loadTexture(R.drawable.intro_fast_body, 2);
            loadTexture(R.drawable.intro_fast_spiral, 3);
            loadTexture(R.drawable.intro_ic_bubble_dot, 4);
            loadTexture(R.drawable.intro_ic_bubble, 5);
            loadTexture(R.drawable.intro_ic_cam_lens, 6);
            loadTexture(R.drawable.intro_ic_cam, 7);
            loadTexture(R.drawable.intro_ic_pencil, 8);
            loadTexture(R.drawable.intro_ic_pin, 9);
            loadTexture(R.drawable.intro_ic_smile_eye, 10);
            loadTexture(R.drawable.intro_ic_smile, 11);
            loadTexture(R.drawable.intro_ic_videocam, 12);
            loadTexture(R.drawable.intro_knot_down, 13);
            loadTexture(R.drawable.intro_knot_up, 14);
            loadTexture(R.drawable.intro_powerful_infinity_white, 15);
            loadTexture(R.drawable.intro_powerful_infinity, 16);
            loadTexture(R.drawable.intro_powerful_mask, 17, Theme.getColor(null, Theme.key_windowBackgroundWhite, false), false);
            loadTexture(R.drawable.intro_powerful_star, 18);
            loadTexture(R.drawable.intro_private_door, 19);
            loadTexture(R.drawable.intro_private_screw, 20);
            loadTexture(R.drawable.intro_tg_plane, 21);
            loadTexture(new ChatActivity$$ExternalSyntheticLambda49(26), 22);
            loadTexture(this.telegramMaskProvider, 23);
            updateTelegramTextures();
            updatePowerfulTextures();
            int[] iArr2 = this.textures;
            Intro.setPrivateTextures(iArr2[19], iArr2[20]);
            int[] iArr3 = this.textures;
            Intro.setFreeTextures(iArr3[14], iArr3[13]);
            int[] iArr4 = this.textures;
            Intro.setFastTextures(iArr4[2], iArr4[3], iArr4[1], iArr4[0]);
            int[] iArr5 = this.textures;
            Intro.setIcTextures(iArr5[4], iArr5[5], iArr5[6], iArr5[7], iArr5[8], iArr5[9], iArr5[10], iArr5[11], iArr5[12]);
            Intro.onSurfaceCreated();
            IntroActivity.this.currentDate = System.currentTimeMillis() - 1000;
            return true;
        }

        public static Bitmap lambda$initGL$1(Void r4) {
            Paint paint = new Paint(1);
            paint.setColor(-14509328);
            int iDp = AndroidUtilities.dp(150.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
            float f = iDp / 2.0f;
            new Canvas(bitmapCreateBitmap).drawCircle(f, f, f, paint);
            return bitmapCreateBitmap;
        }

        public static Bitmap lambda$new$0(Void r6) {
            int iDp = AndroidUtilities.dp(150.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), iDp, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas.drawCircle(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f, iDp / 2.0f, paint);
            return bitmapCreateBitmap;
        }

        public void lambda$shutdown$2() {
            finish();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                looperMyLooper.quit();
            }
        }

        private void loadTexture(GenericProvider<Void, Bitmap> genericProvider, int i) {
            loadTexture(genericProvider, i, false);
        }

        public void finish() {
            if (this.eglSurface != null) {
                EGL10 egl10 = this.egl10;
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                this.egl10.eglDestroySurface(this.eglDisplay, this.eglSurface);
                this.eglSurface = null;
            }
            EGLContext eGLContext = this.eglContext;
            if (eGLContext != null) {
                this.egl10.eglDestroyContext(this.eglDisplay, eGLContext);
                this.eglContext = null;
            }
            EGLDisplay eGLDisplay2 = this.eglDisplay;
            if (eGLDisplay2 != null) {
                this.egl10.eglTerminate(eGLDisplay2);
                this.eglDisplay = null;
            }
        }

        @Override
        public void run() {
            this.initied = initGL();
            super.run();
        }

        public void setSurfaceTextureSize(int i, int i2) {
            Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
        }

        public void shutdown() {
            postRunnable(new IntroActivity$$ExternalSyntheticLambda5(this, 29));
        }

        public void updatePowerfulTextures() {
            int[] iArr = this.textures;
            Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
        }

        public void updateTelegramTextures() {
            int[] iArr = this.textures;
            Intro.setTelegramTextures(iArr[22], iArr[21], iArr[23]);
        }

        public void loadTexture(GenericProvider<Void, Bitmap> genericProvider, int i, boolean z) {
            if (z) {
                GLES20.glDeleteTextures(1, this.textures, i);
                GLES20.glGenTextures(1, this.textures, i);
            }
            Bitmap bitmapProvide = genericProvider.provide(null);
            GLES20.glBindTexture(3553, this.textures[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmapProvide, 0);
            bitmapProvide.recycle();
        }

        private void loadTexture(int i, int i2) {
            loadTexture(i, i2, 0, false);
        }

        public void loadTexture(int i, int i2, int i3, boolean z) {
            Drawable drawable = IntroActivity.this.getParentActivity().getResources().getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                if (z) {
                    GLES20.glDeleteTextures(1, this.textures, i2);
                    GLES20.glGenTextures(1, this.textures, i2);
                }
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                GLES20.glBindTexture(3553, this.textures[i2]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                if (i3 != 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint(5);
                    paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    GLUtils.texImage2D(3553, 0, bitmapCreateBitmap, 0);
                    bitmapCreateBitmap.recycle();
                    return;
                }
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
        }
    }

    public class IntroAdapter extends PagerAdapter {
        private IntroAdapter() {
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override
        public int getCount() {
            return IntroActivity.this.titles.length;
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            final TextView textView = new TextView(viewGroup.getContext());
            textView.setTag(IntroActivity.this.pagerHeaderTag);
            final TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setTag(IntroActivity.this.pagerMessageTag);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext()) {
                @Override
                public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                    int iDp = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + OKLCH.m$2(275.0f, ((i5 - i3) / 4) * 3, 2);
                    int iDp2 = AndroidUtilities.dp(18.0f);
                    TextView textView3 = textView;
                    textView3.layout(iDp2, iDp, textView3.getMeasuredWidth() + iDp2, textView.getMeasuredHeight() + iDp);
                    int iDp3 = AndroidUtilities.dp(18.0f) + iDp + ((int) textView.getTextSize());
                    int iDp4 = AndroidUtilities.dp(16.0f);
                    TextView textView4 = textView2;
                    textView4.layout(iDp4, iDp3, textView4.getMeasuredWidth() + iDp4, textView2.getMeasuredHeight() + iDp3);
                }
            };
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i2, false));
            textView.setTextSize(1, 26.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
            textView2.setTextColor(Theme.getColor(null, i2, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
            viewGroup.addView(frameLayout, 0);
            textView.setText(IntroActivity.this.titles[i]);
            textView2.setText(AndroidUtilities.replaceTags(IntroActivity.this.messages[i]));
            return frameLayout;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view.equals(obj);
        }

        @Override
        public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        }

        @Override
        public Parcelable saveState() {
            return null;
        }

        @Override
        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            super.setPrimaryItem(viewGroup, i, obj);
            IntroActivity.this.bottomPages.setCurrentPage(i);
            IntroActivity.this.currentViewPagerPage = i;
        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (dataSetObserver != null) {
                super.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public IntroActivity() {
        super(null);
        this.pagerHeaderTag = new Object();
        this.pagerMessageTag = new Object();
        this.currentAccount = UserConfig.selectedAccount;
        this.lastPage = 0;
        this.justCreated = false;
        this.startPressed = false;
    }

    private void checkContinueText() {
        LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        String language = MessagesController.getInstance(this.currentAccount).suggestedLangCode;
        if ((language == null || (language.equals("en") && LocaleController.getInstance().getSystemDefaultLocale().getLanguage() != null && !LocaleController.getInstance().getSystemDefaultLocale().getLanguage().equals("en"))) && (language = LocaleController.getInstance().getSystemDefaultLocale().getLanguage()) == null) {
            language = "en";
        }
        String str = language.contains("-") ? language.split("-")[0] : language;
        String localeAlias = LocaleController.getLocaleAlias(str);
        LocaleController.LocaleInfo localeInfo = null;
        LocaleController.LocaleInfo localeInfo2 = null;
        for (int i = 0; i < LocaleController.getInstance().languages.size(); i++) {
            LocaleController.LocaleInfo localeInfo3 = LocaleController.getInstance().languages.get(i);
            if (localeInfo3.shortName.equals("en")) {
                localeInfo = localeInfo3;
            }
            if (localeInfo3.shortName.replace("_", "-").equals(language) || localeInfo3.shortName.equals(str) || localeInfo3.shortName.equals(localeAlias)) {
                localeInfo2 = localeInfo3;
            }
            if (localeInfo != null && localeInfo2 != null) {
                break;
            }
        }
        if (localeInfo == null || localeInfo2 == null || localeInfo == localeInfo2) {
            return;
        }
        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
        if (localeInfo2 != currentLocaleInfo) {
            tL_langpack_getStrings.lang_code = localeInfo2.getLangCode();
            this.localeInfo = localeInfo2;
        } else {
            tL_langpack_getStrings.lang_code = localeInfo.getLangCode();
            this.localeInfo = localeInfo;
        }
        tL_langpack_getStrings.keys.add("ContinueOnThisLanguage");
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getStrings, new IntroActivity$$ExternalSyntheticLambda6(0, this, language), 8);
    }

    public void lambda$checkContinueText$3(TLRPC.LangPackString langPackString, String str) {
        if (this.destroyed) {
            return;
        }
        this.switchLanguageTextView.setText(langPackString.value);
        MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str.toLowerCase()).apply();
    }

    public void lambda$checkContinueText$4(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
            if (langPackString instanceof TLRPC.TL_langPackString) {
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda30(this, (TLRPC.TL_langPackString) langPackString, str, 22));
            }
        }
    }

    public void lambda$createView$0(RLottieImageView rLottieImageView, View view) {
        if (DialogsActivity.switchingTheme) {
            return;
        }
        DialogsActivity.switchingTheme = true;
        boolean zIsDark = Theme.currentTheme.isDark();
        boolean z = !zIsDark;
        Theme.ThemeInfo themeInfo = !zIsDark ? (Theme.ThemeInfo) Theme.themesDict.get("Night") : (Theme.ThemeInfo) Theme.themesDict.get("Blue");
        Theme.selectedAutoNightType = 0;
        Theme.saveAutoNightThemeConfig();
        Theme.cancelAutoNightThemeCallbacks();
        RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
        rLottieDrawable.setCustomEndFrame(!zIsDark ? rLottieDrawable.getFramesCount() - 1 : 0);
        rLottieImageView.playAnimation();
        int[] iArr = {(rLottieImageView.getMeasuredWidth() / 2) + i, (rLottieImageView.getMeasuredHeight() / 2) + i};
        rLottieImageView.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), rLottieImageView);
        rLottieImageView.setContentDescription(LocaleController.getString(!zIsDark ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
    }

    public void lambda$createView$1(View view) {
        if (this.startPressed) {
            return;
        }
        this.startPressed = true;
        presentFragment(new LoginActivity().setIntroView(this.frameContainerView, this.startMessagingButton), true);
        this.destroyed = true;
    }

    public void lambda$createView$2(View view) {
        if (this.startPressed || this.localeInfo == null) {
            return;
        }
        this.startPressed = true;
        AlertDialog alertDialog = new AlertDialog(view.getContext(), 3, null);
        alertDialog.canCacnel = false;
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 1000L);
        NotificationCenter.getGlobalInstance().addObserver(new AnonymousClass5(alertDialog), NotificationCenter.reloadInterface);
        LocaleController.getInstance().applyLanguage(this.localeInfo, true, false, this.currentAccount);
    }

    public void lambda$getThemeDescriptions$5() {
        updateColors(true);
    }

    public void lambda$updateColors$6() {
        EGLThread eGLThread = this.eglThread;
        int i = R.drawable.intro_powerful_mask;
        int i2 = Theme.key_windowBackgroundWhite;
        eGLThread.loadTexture(i, 17, Theme.getColor(null, i2, false), true);
        this.eglThread.updatePowerfulTextures();
        EGLThread eGLThread2 = this.eglThread;
        eGLThread2.loadTexture(eGLThread2.telegramMaskProvider, 23, true);
        this.eglThread.updateTelegramTextures();
        Intro.setBackgroundColor(Theme.getColor(null, i2, false));
    }

    private void updateColors(boolean z) {
        GradientDrawable gradientDrawable = this.startMessagingButtonBackground;
        int i = Theme.key_featuredStickers_addButton;
        gradientDrawable.setColors(new int[]{getThemedColor(i), getThemedColor(Theme.key_featuredStickers_addButton2)});
        this.logoDrawable.setColorFilter(Theme.multAlpha(0.9f, getThemedColor(Theme.key_actionBarDefaultTitle)), PorterDuff.Mode.MULTIPLY);
        View view = this.fragmentView;
        int i2 = Theme.key_windowBackgroundWhite;
        view.setBackgroundColor(Theme.getColor(null, i2, false));
        this.switchLanguageTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
        this.startMessagingButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        TextView textView = this.startMessagingButton;
        int iDp = AndroidUtilities.dp(24.0f);
        int color = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
        textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, color, color));
        this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
        this.bottomPages.invalidate();
        if (!z) {
            Intro.setBackgroundColor(Theme.getColor(null, i2, false));
            return;
        }
        EGLThread eGLThread = this.eglThread;
        if (eGLThread != null) {
            eGLThread.postRunnable(new IntroActivity$$ExternalSyntheticLambda5(this, 0));
        }
        for (int i3 = 0; i3 < this.viewPager.getChildCount(); i3++) {
            View childAt = this.viewPager.getChildAt(i3);
            TextView textView2 = (TextView) childAt.findViewWithTag(this.pagerHeaderTag);
            int i4 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(null, i4, false));
            ((TextView) childAt.findViewWithTag(this.pagerMessageTag)).setTextColor(Theme.getColor(null, i4, false));
        }
    }

    @Override
    public View createView(Context context) {
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.telegram_logo).mutate();
        this.logoDrawable = drawableMutate;
        drawableMutate.setBounds(0, AndroidUtilities.dp(8.666f), AndroidUtilities.dp(115.0f), AndroidUtilities.dp(35.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Page1Title));
        spannableStringBuilder.setSpan(new ImageSpan(this.logoDrawable), 0, spannableStringBuilder.length(), 33);
        this.titles[0] = spannableStringBuilder;
        this.actionBar.setAddToContainer(false);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setFillViewport(true);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        final FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(rLottieImageView, LayoutHelper.createFrame(28, 28, 17));
        final int i = 4;
        FrameLayout frameLayout2 = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
                super.onLayout(z, i2, i3, i4, i5);
                int i6 = (i5 - i3) / 4;
                int i7 = i6 * 3;
                int iM$2 = OKLCH.m$2(275.0f, i7, 2);
                IntroActivity.this.frameLayout2.layout(0, iM$2, IntroActivity.this.frameLayout2.getMeasuredWidth(), IntroActivity.this.frameLayout2.getMeasuredHeight() + iM$2);
                int iDp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + iM$2;
                int measuredWidth = (getMeasuredWidth() - IntroActivity.this.bottomPages.getMeasuredWidth()) / 2;
                IntroActivity.this.bottomPages.layout(measuredWidth, iDp, IntroActivity.this.bottomPages.getMeasuredWidth() + measuredWidth, IntroActivity.this.bottomPages.getMeasuredHeight() + iDp);
                IntroActivity.this.viewPager.layout(0, 0, IntroActivity.this.viewPager.getMeasuredWidth(), IntroActivity.this.viewPager.getMeasuredHeight());
                int measuredHeight = ((i6 - IntroActivity.this.startMessagingButton.getMeasuredHeight()) / 2) + i7;
                int measuredWidth2 = (getMeasuredWidth() - IntroActivity.this.startMessagingButton.getMeasuredWidth()) / 2;
                IntroActivity.this.startMessagingButton.layout(measuredWidth2, measuredHeight, IntroActivity.this.startMessagingButton.getMeasuredWidth() + measuredWidth2, IntroActivity.this.startMessagingButton.getMeasuredHeight() + measuredHeight);
                int iDp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - IntroActivity.this.switchLanguageTextView.getMeasuredWidth()) / 2;
                IntroActivity.this.switchLanguageTextView.layout(measuredWidth3, iDp2 - IntroActivity.this.switchLanguageTextView.getMeasuredHeight(), IntroActivity.this.switchLanguageTextView.getMeasuredWidth() + measuredWidth3, iDp2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                int iDp3 = AndroidUtilities.dp(i) + (AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
                if (marginLayoutParams.topMargin != iDp3) {
                    marginLayoutParams.topMargin = iDp3;
                    frameLayout.requestLayout();
                }
            }
        };
        this.frameContainerView = frameLayout2;
        scrollView.addView(frameLayout2, LayoutHelper.createScroll(-1, -2, 51));
        int i2 = R.raw.sun;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.darkThemeDrawable = rLottieDrawable;
        rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
        this.darkThemeDrawable.beginApplyLayerColors();
        this.darkThemeDrawable.commitApplyLayerColors();
        RLottieDrawable rLottieDrawable2 = this.darkThemeDrawable;
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        if (themeInfo == null) {
            themeInfo = Theme.defaultTheme;
        }
        rLottieDrawable2.setCustomEndFrame(themeInfo.isDark() ? this.darkThemeDrawable.getFramesCount() - 1 : 0);
        RLottieDrawable rLottieDrawable3 = this.darkThemeDrawable;
        Theme.ThemeInfo themeInfo2 = Theme.currentDayTheme;
        if (themeInfo2 == null) {
            themeInfo2 = Theme.defaultTheme;
        }
        rLottieDrawable3.setCurrentFrame(themeInfo2.isDark() ? this.darkThemeDrawable.getFramesCount() - 1 : 0, false);
        Theme.ThemeInfo themeInfo3 = Theme.currentDayTheme;
        if (themeInfo3 == null) {
            themeInfo3 = Theme.defaultTheme;
        }
        rLottieImageView.setContentDescription(LocaleController.getString(themeInfo3.isDark() ? R.string.AccDescrSwitchToDayTheme : R.string.AccDescrSwitchToNightTheme));
        rLottieImageView.setAnimation(this.darkThemeDrawable);
        frameLayout.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(5, this, rLottieImageView));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.frameLayout2 = frameLayout3;
        this.frameContainerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 78.0f, 0.0f, 0.0f));
        TextureView textureView = new TextureView(context);
        this.frameLayout2.addView(textureView, LayoutHelper.createFrame(200, 150, 17));
        textureView.setSurfaceTextureListener(new AnonymousClass2());
        ViewPager viewPager = new ViewPager(context);
        this.viewPager = viewPager;
        viewPager.setAdapter(new IntroAdapter());
        this.viewPager.setPageMargin(0);
        this.viewPager.setOffscreenPageLimit(1);
        this.frameContainerView.addView(this.viewPager, LayoutHelper.createFrame(-1, -1.0f));
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrollStateChanged(int i3) {
                if (i3 == 1) {
                    IntroActivity.this.dragging = true;
                    IntroActivity introActivity = IntroActivity.this;
                    introActivity.startDragX = IntroActivity.this.viewPager.getMeasuredWidth() * introActivity.viewPager.getCurrentItem();
                    return;
                }
                if (i3 == 0 || i3 == 2) {
                    if (IntroActivity.this.dragging) {
                        IntroActivity.this.justEndDragging = true;
                        IntroActivity.this.dragging = false;
                    }
                    if (IntroActivity.this.lastPage != IntroActivity.this.viewPager.getCurrentItem()) {
                        IntroActivity introActivity2 = IntroActivity.this;
                        introActivity2.lastPage = introActivity2.viewPager.getCurrentItem();
                    }
                }
            }

            @Override
            public void onPageScrolled(int i3, float f, int i4) {
                IntroActivity.this.bottomPages.setPageOffset(i3, f);
                float measuredWidth = IntroActivity.this.viewPager.getMeasuredWidth();
                if (measuredWidth == 0.0f) {
                    return;
                }
                Intro.setScrollOffset((((i3 * measuredWidth) + i4) - (IntroActivity.this.currentViewPagerPage * measuredWidth)) / measuredWidth);
            }

            @Override
            public void onPageSelected(int i3) {
                IntroActivity.this.currentViewPagerPage = i3;
            }
        });
        this.startMessagingButtonBackground = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, null);
        TextView textView = new TextView(context) {
            private final CellFlickerDrawable cellFlickerDrawable;

            {
                CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
                this.cellFlickerDrawable = cellFlickerDrawable;
                cellFlickerDrawable.drawFrame = false;
                cellFlickerDrawable.repeatProgress = 2.0f;
            }

            @Override
            public void draw(Canvas canvas) {
                IntroActivity.this.startMessagingButtonBackground.draw(canvas);
                super.draw(canvas);
            }

            @Override
            public void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                this.cellFlickerDrawable.draw(null, canvas, rectF, getMeasuredHeight() / 2.0f);
                invalidate();
            }

            @Override
            public void onMeasure(int i3, int i4) {
                if (View.MeasureSpec.getSize(i3) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i4);
                } else {
                    super.onMeasure(i3, i4);
                }
            }

            @Override
            public void onSizeChanged(int i3, int i4, int i5, int i6) {
                super.onSizeChanged(i3, i4, i5, i6);
                IntroActivity.this.startMessagingButtonBackground.setBounds(0, 0, i3, i4);
                IntroActivity.this.startMessagingButtonBackground.setCornerRadius(Math.min(i3, i4) / 2.0f);
                this.cellFlickerDrawable.parentWidth = i3;
            }
        };
        this.startMessagingButton = textView;
        ScaleStateListAnimator.apply(textView, 0.02f, 1.2f);
        this.startMessagingButton.setText(LocaleController.getString(R.string.StartMessaging));
        this.startMessagingButton.setGravity(17);
        this.startMessagingButton.setTypeface(AndroidUtilities.bold());
        this.startMessagingButton.setTextSize(1, 15.0f);
        this.startMessagingButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.frameContainerView.addView(this.startMessagingButton, LayoutHelper.createFrame(-1, 48.0f, 81, 16.0f, 0.0f, 16.0f, 76.0f));
        final int i3 = 0;
        this.startMessagingButton.setOnClickListener(new View.OnClickListener(this) {
            public final IntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$createView$1(view);
                        break;
                    default:
                        this.f$0.lambda$createView$2(view);
                        break;
                }
            }
        });
        BottomPagesView bottomPagesView = new BottomPagesView(context, this.viewPager, 6);
        this.bottomPages = bottomPagesView;
        this.frameContainerView.addView(bottomPagesView, LayoutHelper.createFrame(66, 5.0f, 49, 0.0f, 350.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.switchLanguageTextView = textView2;
        textView2.setGravity(17);
        this.switchLanguageTextView.setTextSize(1, 16.0f);
        this.frameContainerView.addView(this.switchLanguageTextView, LayoutHelper.createFrame(-2, 30.0f, 81, 0.0f, 0.0f, 0.0f, 20.0f));
        final int i4 = 1;
        this.switchLanguageTextView.setOnClickListener(new View.OnClickListener(this) {
            public final IntroActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        this.f$0.lambda$createView$1(view);
                        break;
                    default:
                        this.f$0.lambda$createView$2(view);
                        break;
                }
            }
        });
        float f = 4;
        this.frameContainerView.addView(frameLayout, LayoutHelper.createFrame(64, 64.0f, 53, 0.0f, f, f, 0.0f));
        this.fragmentView = scrollView;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.configLoaded);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        checkContinueText();
        this.justCreated = true;
        updateColors(false);
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.suggestedLangpack || i == NotificationCenter.configLoaded) {
            checkContinueText();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 0), Theme.key_windowBackgroundWhite, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_chats_actionBackground, Theme.key_chats_actionPressedBackground, Theme.key_featuredStickers_buttonText, Theme.key_windowBackgroundWhiteBlackText);
    }

    @Override
    public boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public AnimatorSet onCustomTransitionAnimation(boolean z, Runnable runnable) {
        if (!this.isOnLogout) {
            return null;
        }
        AnimatorSet duration = new AnimatorSet().setDuration(50L);
        duration.playTogether(ValueAnimator.ofFloat(new float[0]));
        return duration;
    }

    @Override
    public boolean onFragmentCreate() {
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", System.currentTimeMillis()).apply();
        this.titles = new CharSequence[]{null, LocaleController.getString(R.string.Page2Title), LocaleController.getString(R.string.Page3Title), LocaleController.getString(R.string.Page5Title), LocaleController.getString(R.string.Page4Title), LocaleController.getString(R.string.Page6Title)};
        this.messages = new String[]{LocaleController.getString(R.string.Page1Message), LocaleController.getString(R.string.Page2Message), LocaleController.getString(R.string.Page3Message), LocaleController.getString(R.string.Page5Message), LocaleController.getString(R.string.Page4Message), LocaleController.getString(R.string.Page6Message)};
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.destroyed = true;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.configLoaded);
        MessagesController.getGlobalMainSettings().edit().putLong("intro_crashed_time", 0L).apply();
    }

    @Override
    public void onPause() {
        super.onPause();
        AndroidUtilities.unlockOrientation(getParentActivity());
    }

    @Override
    public void onResume() {
        super.onResume();
        if (this.justCreated) {
            if (LocaleController.isRTL) {
                this.viewPager.setCurrentItem(6);
                this.lastPage = 6;
            } else {
                this.viewPager.setCurrentItem(0);
                this.lastPage = 0;
            }
            this.justCreated = false;
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
    }

    public IntroActivity setOnLogout() {
        this.isOnLogout = true;
        return this;
    }
}
