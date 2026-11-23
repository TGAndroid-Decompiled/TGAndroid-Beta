package org.telegram.ui.Components;

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
public final class t implements View.OnClickListener {
    public final int f39739a;
    public final w f39740b;

    public t(w wVar, int i7) {
        this.f39739a = i7;
        this.f39740b = wVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39739a) {
            case 0:
                this.f39740b.dismiss();
                return;
            default:
                w wVar = this.f39740b;
                TL_aicompose.AiComposeTone aiComposeTone = wVar.T1;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    int i7 = wVar.d2 + 1;
                    wVar.d2 = i7;
                    TL_aicompose.aiComposeToneExample[] aicomposetoneexampleArr = wVar.f41606e2;
                    if (i7 >= aicomposetoneexampleArr.length) {
                        wVar.d2 = 0;
                    }
                    int i10 = wVar.d2;
                    if (aicomposetoneexampleArr[i10] == null) {
                        TL_aicompose.getToneExample gettoneexample = new TL_aicompose.getToneExample();
                        gettoneexample.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                        gettoneexample.num = i10;
                        ConnectionsManager.getInstance(wVar.f30173a).sendRequestTyped(gettoneexample, new d3.b(1), new u(wVar, i10, 0));
                    }
                    wVar.f41605c2.O(true);
                    return;
                }
                return;
        }
    }
}
