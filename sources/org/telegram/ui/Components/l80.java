package org.telegram.ui.Components;

import org.telegram.tgnet.tl.TL_iv;
public final class l80 extends c8.b1 {
    public int f35644a;
    public final TL_iv.PageBlock f35645b;
    public TL_iv.textConcat f35646c = new TL_iv.textConcat();

    public l80(TL_iv.PageBlock pageBlock) {
        this.f35645b = pageBlock;
    }

    public static TL_iv.RichText x(TL_iv.textConcat textconcat) {
        if (textconcat.texts.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (textconcat.texts.size() == 1) {
            return textconcat.texts.get(0);
        }
        return textconcat;
    }

    @Override
    public final void a(kf.b bVar) {
        int i7 = this.f35644a;
        if (i7 >= 64) {
            return;
        }
        this.f35644a = i7 + 1;
        try {
            v(bVar);
        } finally {
            this.f35644a--;
        }
    }

    @Override
    public final void b(kf.c cVar) {
        int i7 = this.f35644a;
        if (i7 >= 64) {
            return;
        }
        this.f35644a = i7 + 1;
        try {
            v(cVar);
        } finally {
            this.f35644a--;
        }
    }

    @Override
    public final void c(kf.d dVar) {
        TL_iv.textFixed textfixed = new TL_iv.textFixed();
        textfixed.text = o80.n(dVar.h);
        w(textfixed);
    }

    @Override
    public final void d(kf.e eVar) {
        if (eVar instanceof cf.a) {
            TL_iv.textStrike textstrike = new TL_iv.textStrike();
            textstrike.text = y(eVar);
            w(textstrike);
        } else if (eVar instanceof zc.d) {
            w(o80.c(((zc.d) eVar).f60046g));
        } else {
            v(eVar);
        }
    }

    @Override
    public final void e(kf.g gVar) {
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = y(gVar);
        w(textitalic);
    }

    @Override
    public final void i(kf.k kVar) {
        w(y(kVar));
    }

    @Override
    public final void k(kf.n nVar) {
        if (nVar instanceof zc.a) {
            if (!this.f35646c.texts.isEmpty()) {
                w(o80.n("\n"));
            }
            w(o80.c(((zc.a) nVar).f60041g));
            w(o80.n("\n"));
            return;
        }
        v(nVar);
    }

    @Override
    public final void l(kf.o oVar) {
        int i7 = this.f35644a;
        if (i7 >= 64) {
            return;
        }
        this.f35644a = i7 + 1;
        try {
            v(oVar);
        } finally {
            this.f35644a--;
        }
    }

    @Override
    public final void m(kf.q qVar) {
        int i7 = this.f35644a;
        if (i7 >= 64) {
            return;
        }
        this.f35644a = i7 + 1;
        try {
            v(qVar);
        } finally {
            this.f35644a--;
        }
    }

    @Override
    public final void n(kf.r rVar) {
        if (!this.f35646c.texts.isEmpty()) {
            w(o80.n("\n\n"));
        }
        v(rVar);
    }

    @Override
    public final void o(kf.s sVar) {
        w(o80.n(sVar.f17286g));
    }

    @Override
    public final void q(kf.d dVar) {
        w(o80.n(dVar.h));
    }

    @Override
    public final void r(kf.g gVar) {
        w(o80.n("\n"));
    }

    @Override
    public final void s(kf.k kVar) {
        String str = kVar.h;
        if (str == null) {
            str = "";
        }
        String trim = str.trim();
        if (trim.startsWith("mailto:")) {
            TL_iv.RichText textemail = new TL_iv.textEmail();
            textemail.text = y(kVar);
            textemail.email = trim.substring(7);
            w(textemail);
        } else if (trim.startsWith("tel:")) {
            TL_iv.textPhone textphone = new TL_iv.textPhone();
            textphone.text = y(kVar);
            textphone.phone = trim.substring(4);
            w(textphone);
        } else {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = y(kVar);
            texturl.url = trim;
            w(texturl);
        }
    }

    @Override
    public final void t(kf.g gVar) {
        String str;
        if (this.f35645b instanceof TL_iv.pageBlockBlockquote) {
            str = "\n";
        } else {
            str = " ";
        }
        w(o80.n(str));
    }

    @Override
    public final void u(kf.g gVar) {
        TL_iv.textBold textbold = new TL_iv.textBold();
        textbold.text = y(gVar);
        w(textbold);
    }

    public final void w(TL_iv.RichText richText) {
        this.f35646c.texts.add(richText);
    }

    public final TL_iv.RichText y(kf.p pVar) {
        TL_iv.textConcat textconcat = this.f35646c;
        this.f35646c = new TL_iv.textConcat();
        v(pVar);
        TL_iv.RichText x10 = x(this.f35646c);
        this.f35646c = textconcat;
        return x10;
    }
}
